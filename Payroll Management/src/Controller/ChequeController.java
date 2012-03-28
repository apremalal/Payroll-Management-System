/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Cheques;
import Entity.Employee;
import Entity.Notifications;
import GUI.Main;
import Model.ChequesModel;
import Model.EmployeeModel;
import Model.NotificationsModel;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uomfd.emial.SendNotifictaion;

/**
 *
 * @author Anuruddha
 */
public class ChequeController {

    public Main view;
    private ChequesModel chequeModel;
    private NotificationsModel notificationsModel;
    Cheques justAddedCheque = new Cheques();

    public ChequeController() {
        notificationsModel = new NotificationsModel();
        chequeModel = new ChequesModel();
    }

    public void viewCheque() {
        ArrayList columnNames = new ArrayList();
        ArrayList<ArrayList> data = new ArrayList();
        int rows = -1;
        rows = view.getjTableCheque().getSelectedRow();
        if (rows != -1) {
            String employeeid = view.getjTableSearch().getModel().getValueAt(rows, 0) + "";
            ResultSet rs = new ChequesModel().getCheques(employeeid);



//            view.getjTextFieldEmployeeIDCheque().setText(employeeid);
//            view.getjTextFieldEmployeeIDCheque().setEditable(false);
//            if (rs == null) {
//                return;
//            }
//
//            try {
//
//                ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
//                int columns = md.getColumnCount();
//                for (int i = 1; i <= columns; i++) {
//                    columnNames.add(md.getColumnName(i));
//                }
//                while (rs.next()) {
//                    ArrayList row = new ArrayList(columns);
//                    for (int i = 1; i <= columns; i++) {
//                        row.add(rs.getObject(i));
//                    }
//                    data.add(row);
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e.getMessage());
//            }
//            fillChequeDetails(data);
        } else {
        }
    }

    private void fillChequeDetails(ArrayList<ArrayList> arr) {

        view.getjTabbedPane1().setSelectedIndex(4);
        DefaultTableModel dft = new DefaultTableModel();
        view.getjTableCheque().setModel(dft);
        String s[] = {"EmployeeID", "ChequeNo", "Amount", "Expiration Date"};
        dft.setColumnIdentifiers(s);
        if (arr != null) {
            for (int i = 0; i < arr.size(); i++) {
                Object tmp[] = arr.get(i).toArray();
                Object tmp2[] = {tmp[1], tmp[2], tmp[3], tmp[4]};
                dft.addRow(tmp2);
            }
        }
    }

    public void addCheque() {
        int y = 0;
        int m = 0;
        int d = 0;
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            String tmp[] = dateFormat.format(date).split("/");
            y = Integer.parseInt(tmp[0]);
            m = Integer.parseInt(tmp[1]);
            d = Integer.parseInt(tmp[2]);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid date");
            return;
        }
        if (view.getjTextFieldAmountCheque().getText().equals("") || view.getjTextFieldBankAccountNUmber().getText().equals("") || view.getjTextFieldBranch().getText().equals("") || view.getjTextFieldDuration().getText().equals("") || view.getjTextFieldChequeNumber().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the required data");
            return;
        }

        try {
            Cheques cheque = new Cheques();
            cheque.setEmployeeId(Integer.parseInt(view.getjTextFieldEmployeeIDCheque().getText()));
            cheque.setAmount(Double.parseDouble(view.getjTextFieldAmountCheque().getText()));
            cheque.setBankAccNo(view.getjTextFieldBankAccountNUmber().getText());
            cheque.setBranch(view.getjTextFieldBranch().getText());
            cheque.setChequeNo(view.getjTextFieldChequeNumber().getText());
            cheque.setDate(new java.sql.Date(y - 1900, m, d));
            cheque.setExpirationDuration(Integer.parseInt(view.getjTextFieldDuration().getText()));
            cheque.setBank(view.getjTextFieldBank().getText());
            ResultSet rs1 = chequeModel.getCheque(cheque.getChequeNo());
            if (rs1.next() && rs1.getInt("EmployeeId") == cheque.getEmployeeId()) {
                throw new Exception("Cheque Number already available");
            } else {
                chequeModel.addCheque(cheque);
                view.getBtnNotifyCheque().setEnabled(true);
                view.getBtnDeletecheque().setEnabled(true);
                justAddedCheque = cheque;
//        fillTable(cheque.getEmployeeId());
//        viewCheque();
                fillTable(cheque.getEmployeeId());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void fillTable(int employeeId) {
        try {
            ResultSet chequeses = chequeModel.getCheques(employeeId + "");
            DefaultTableModel dtm = (DefaultTableModel) view.getjTableCheque().getModel();
            dtm.setRowCount(0);

            while (chequeses.next()) {
                Object o[] = new Object[4];
                o[0] = chequeses.getInt("employeeid");
                o[1] = chequeses.getString("chequeNo");
                o[2] = chequeses.getDouble("amount");
                ResultSet ch = chequeModel.getCheque(chequeses.getString("chequeNo"));
                if (ch.next()) {
                    o[3] = chequeses.getDate("Date");
//                    o[3] = new NotificationsModel().getAll(ch.getInt("chequeId")).isSentSuccess();
                }
                dtm.addRow(o);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ChequeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sendNotification() {
        try {
            Cheques cheques = justAddedCheque;
            boolean success = false;
            Employee employee = new EmployeeModel().getEmployee("" + cheques.getEmployeeId());
            if (!employee.getEmail().equals("")) {
                String emails[] = {employee.getEmail()};
                view.getLblNotification().setText("Sending Notification, Please wait...");
                Thread.sleep(200);
                success = SendNotifictaion.sendSalaryMessage(emails, "Dear Sir/Madame,\n\n"
                        + "You got a cheque received. Please collect it from Finance Division."
                        + "\nRecieved Date : " + justAddedCheque.getDate()
                        + "\nAmount = Rs." + cheques.getAmount() + "");

            }
            if (success) {
                JOptionPane.showMessageDialog(null, "Sent notification successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Sending failed!!!");
            }
            view.getLblNotification().setText("");
            Notifications notifications = new Notifications();
            ResultSet rs = chequeModel.getCheque(cheques.getChequeNo());
            int chequeId = 1;

            if (rs.next()) {
                chequeId = rs.getInt("ChequeId");
            }
            notifications.setChequeId(chequeId);
            notifications.setDate(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
            notifications.setTime(new Time(Calendar.getInstance().getTimeInMillis()));
            notifications.setEmployeeId(cheques.getEmployeeId());
            notifications.setSentSuccess(success);
            if (notificationsModel.getAll(chequeId) != null) {
                notificationsModel.update(notifications);
            } else {
                notificationsModel.insert(notifications);
            }
            view.getBtnDeletecheque().setEnabled(!success);
            view.getBtnNotifyCheque().setEnabled(!success);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void newCheque() {
        view.getjTextFieldAmountCheque().setText("");
        view.getjTextFieldBranch().setText("");
        view.getjTextFieldBankAccountNUmber().setText("");
        view.getjTextFieldChequeNumber().setText("");
        view.getjTextFieldDuration().setText("");
        view.getjTextFieldBank().setText("");
    }

    public void deleteCheque() {
        try {
            ResultSet rs = chequeModel.getCheque(view.getjTextFieldChequeNumber().getText());
            if (rs.next()) {
                if (rs.getDate("Date").before(new Date(Calendar.getInstance().getTimeInMillis()))) {
                    throw new Exception("Cannot delete a cheque added before today.");
                } else {
                    Cheques e = new Cheques();
                    e.setChequeNo(view.getjTextFieldChequeNumber().getText());
                    chequeModel.deletecheque(e);

                    newCheque();
//        viewCheque();
                    fillTable(Integer.parseInt(view.getjTextFieldEmployeeIDCheque().getText()));
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void viewChequeEntry() {
        ArrayList columnNames = new ArrayList();
        ArrayList<ArrayList> data = new ArrayList();
        int rows = -1;
        rows = view.getjTableCheque().getSelectedRow();
        if (rows != -1) {
            String chequenumber = view.getjTableCheque().getModel().getValueAt(rows, 1) + "";
            ResultSet rs = new ChequesModel().getCheque(chequenumber);

            if (rs == null) {
                return;
            }

            try {

                ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
                int columns = md.getColumnCount();
                if (rs.next()) {
                    ArrayList row = new ArrayList(columns);
                    for (int i = 1; i <= columns; i++) {
                        row.add(rs.getObject(i));
                    }
                    Object rowdata[] = row.toArray();

                    view.getjTextFieldChequeNumber().setText("" + rowdata[2]);
                    view.getjTextFieldAmountCheque().setText("" + rowdata[3]);
                    view.getjTextFieldDuration().setText("" + rowdata[5]);
                    view.getjTextFieldBankAccountNUmber().setText("" + rowdata[6]);
                    view.getjTextFieldBranch().setText("" + rowdata[7]);
                    view.getjTextFieldBank().setText("" + rowdata[8]);
                    ResultSet rs1 = chequeModel.getCheque("" + rowdata[2]);
                    int chequeId = 0;
                    if (rs1.next()) {
                        chequeId = rs1.getInt("chequeId");
                        Notifications notifications = new NotificationsModel().getAll(chequeId);
                        if (notifications != null) {
                            view.getBtnNotifyCheque().setEnabled(!notifications.isSentSuccess());
                            view.getBtnDeletecheque().setEnabled(false);
                        } else {
                            view.getBtnNotifyCheque().setEnabled(true);
                            view.getBtnDeletecheque().setEnabled(true);
                        }
                    } else {
                        view.getBtnNotifyCheque().setEnabled(false);
                        view.getBtnDeletecheque().setEnabled(false);
                    }

                    justAddedCheque = chequeModel.getCheque(rs.getInt("chequeId"));
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public void viewCheque(String chequeNo) {


        ResultSet rs = new ChequesModel().getCheque(chequeNo);

        try {

            if (rs != null) {
                if (rs.next()) {

                    view.getjTextFieldEmployeeIDCheque().setText(rs.getInt("employeeId") + "");
                    view.getjTextFieldChequeNumber().setText("" + rs.getString("chequeNo"));
                    view.getjTextFieldAmountCheque().setText("" + rs.getDouble("amount"));
                    view.getjTextFieldDuration().setText("" + rs.getString("Duration"));
                    view.getjTextFieldBankAccountNUmber().setText("" + rs.getString("AccountNumber"));
                    view.getjTextFieldBranch().setText("" + rs.getString("Branch"));
                    view.getjTextFieldBank().setText("" + rs.getString("Bank"));
                }
                fillTable(rs.getInt("employeeId"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void fillData() {

        int employeeid = Integer.parseInt("" + view.getjTableSearch().getValueAt(view.getjTableSearch().getSelectedRow(), 0));
        Employee employee = new EmployeeModel().getEmployee(employeeid + "");
        //        view.getjTextFieldBankAccountNUmber().setText(employee.getAccountNumber());
        view.getjTextFieldEmployeeIDCheque().setText("" + employeeid);
        fillTable(employeeid);

    }
}
