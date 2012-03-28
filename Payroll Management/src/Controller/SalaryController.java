/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.AdjustmentDetails;
import Entity.Adjustments;
import Entity.Employee;
import Entity.Salary;
import GUI.Main;
import Model.AdjustmentDetailsModel;
import Model.AdjustmentsModel;
import Model.EmployeeModel;
import Model.SalaryModel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import uomfd.emial.SendNotifictaion;

/**
 *
 * @author Anuruddha
 */
public class SalaryController {

    public Main view;
    private SalaryModel salaryModel;
    private AdjustmentDetailsModel adjustmentDetailsModel;
    private AdjustmentsModel adjustmentsModel;
    DecimalFormat df = new DecimalFormat("####0.00");
    int salaryId;

    public SalaryController() {

        salaryModel = new SalaryModel();
        adjustmentDetailsModel = new AdjustmentDetailsModel();
        adjustmentsModel = new AdjustmentsModel();
    }

    public void viewSalary() {
        Employee person;
        int row = -1;
        row = view.getjTableSearch().getSelectedRow();
        if (row > -1) {
            String employeeid = view.getjTableSearch().getModel().getValueAt(row, 0) + "";
            person = new EmployeeModel().getEmployee(employeeid);
            view.getTextEmployeeIdSalary().setText(person.getEmployeeId());
            view.getTextBasicSalarySalary().setText(person.getBasicsalary());
            view.getTextTaxesSalary().setText(df.format(0.0));
            view.getjTextField30().setText(df.format(0.0));
            view.getTxtAmount().setText(df.format(0.0));
            view.getTxtNetAmount().setText(df.format(0.0));

            fillAdjustments();
            monthSelected();
        } else {
        }
    }

    public void monthSelected() {
        try {
            if (view != null && !view.getTextEmployeeIdSalary().getText().equals("")) {
                int year = view.getjYearChooser().getYear();
                int month = view.getjMonthChooser().getMonth();
                int empId = Integer.parseInt(view.getTextEmployeeIdSalary().getText());
                Salary salary = salaryModel.getSalary(empId, year, month);

                if (salary != null) {
                    salaryId = salary.getSalaryId();
                    fillTable();
                } else {
                    if (salaryModel.getLastSalary() != null) {
                        salaryId = salaryModel.getLastSalary().getSalaryId() + 1;
                    } else {
                        salaryId = 0;
                    }
                    fillTable();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillAdjustments() {
        view.getjTabbedPane1().setSelectedIndex(3);
        ArrayList<AdjustmentDetails> adjustmentDetailses = new AdjustmentDetailsModel().getAll();
        view.getCmbAdjustments().removeAllItems();

        if (!adjustmentDetailses.isEmpty()) {
            for (int i = 0; i < adjustmentDetailses.size(); i++) {
                view.getCmbAdjustments().addItem(adjustmentDetailses.get(i).getCode() + " " + adjustmentDetailses.get(i).getDescription());
            }
        }
        Salary s = salaryModel.getLastSalary();
        if (s != null) {
            salaryId = s.getSalaryId() + 1;
        } else {
            salaryId = 1;
        }
    }

    public void addAdjustment() {
        Adjustments adjustments = new Adjustments();
        String code = view.getCmbAdjustments().getSelectedItem().toString().split(" ")[0];
        try {
            if (view.getTxtAmount().getText().equals("")
                    || Integer.parseInt(view.getTxtAmount().getText()) == 0) {
                throw new Exception("Empty Amount??");
            }
            adjustments.setCode(code);
            adjustments.setAmount(Double.parseDouble(view.getTxtAmount().getText()));
            adjustments.setSalaryId(salaryId);
            Adjustments a = adjustmentsModel.getAdjustment(salaryId, code);
            int status = 1;
            if (a != null) {
                status = JOptionPane.showConfirmDialog(null, "Adjustment already available!!!"
                        + " \nDo you want to update it?", "Adjustments", JOptionPane.YES_NO_OPTION);
                if (status == 0) {
                    adjustmentsModel.update(adjustments);
                    view.getTxtAmount().setText("0.00");
                }
            } else {
                adjustmentsModel.insert(adjustments);
                view.getTxtAmount().setText("0.00");
            }
            fillTable();


        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Invalid Number",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Adjustments",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public void fillTable() {

        ArrayList<Adjustments> adjustments = adjustmentsModel.getAllForSalary(salaryId);
        DefaultTableModel dtm = (DefaultTableModel) view.getjTableSalary().getModel();
        dtm.setRowCount(0);
        double adjTotal = 0.0;
        try {
            if (!adjustments.isEmpty()) {

                for (int i = 0; i < adjustments.size(); i++) {
                    Object o[] = new Object[3];
                    o[0] = adjustments.get(i).getCode();
                    o[1] = adjustmentDetailsModel.get("" + o[0]).getDescription();
                    o[2] = df.format(adjustments.get(i).getAmount());
                    dtm.addRow(o);
                    adjTotal += Double.parseDouble(o[2] + "");
                }

            }
            view.getTxtNetAmount().setText(df.format(adjTotal));
            double tax = Double.parseDouble(view.getTextTaxesSalary().getText());
            double basic = Double.parseDouble(view.getTextBasicSalarySalary().getText());
            double total = adjTotal + basic - tax;
            view.getjTextField30().setText(df.format(total));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Adjustments",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteAdjustment() {
        if (view.getjTableSalary().getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Please select an adjustment to delete!!!");
        } else {
            String code = "" + view.getjTableSalary().getValueAt(view.getjTableSalary().getSelectedRow(), 0);
            if (salaryModel.getLastSalary().getSalaryId() < salaryId) {
                adjustmentsModel.delete(salaryId, code);
                view.getTxtAmount().setText("" + df.format(0.0));
                fillTable();
            } else {
                JOptionPane.showMessageDialog(null, "Cannot delete a past record!!!");
            }
        }

    }

    public void showValues() {
        int row = view.getjTableSalary().getSelectedRow();
        view.getCmbAdjustments().setSelectedItem(view.getjTableSalary().getValueAt(row, 0)
                + " " + view.getjTableSalary().getValueAt(row, 1));
        view.getTxtAmount().setText("" + view.getjTableSalary().getValueAt(row, 2));
    }

    public void paySalary() {
        Salary salary = new Salary();
        try {
            if (!"".equals(view.getjTextField30().getText())) {
                salary.setEmployeeId(Integer.parseInt(view.getTextEmployeeIdSalary().getText()));
                salary.setMonth(view.getjMonthChooser().getMonth());
                salary.setYear(view.getjYearChooser().getYear());
                salary.setSalaryId(salaryId);
                salary.setTax(Double.parseDouble(view.getjTextField24().getText()));
                salary.setAmount(Double.parseDouble(view.getjTextField30().getText()));
                salaryModel.insert(salary);
                JOptionPane.showMessageDialog(null, "Salary successfully paid!!", "Salary",
                        JOptionPane.INFORMATION_MESSAGE);
                notifySalary();
//                printPaySlip(salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Salary",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

//    public void printPaySlip(Salary salary) {
//
//        DefaultTableModel dtmPrint = (DefaultTableModel) new JTable().getModel();
//        dtmPrint.setColumnCount(3);
//        dtmPrint.setRowCount(0);
//        for (int i = 0; i < view.getjTableSalary().getRowCount(); i++) {
//            Object o[] = new Object[3];
//            o[0] = "" + view.getjTableSalary().getValueAt(i, 1);
//            String code = "" + view.getjTableSalary().getValueAt(i, 0);
//            if (code.toCharArray()[0] == 'A') {
//                o[1] = "Addition";
//
//            } else {
//                o[1] = "Deduction";
//            }
//            o[2] = "" + view.getjTableSalary().getValueAt(i, 2);
//            dtmPrint.addRow(o);
//        }
//        try {
//            Map<String, Object> params = new HashMap<String, Object>();
//
//            params.put("EmployeeId", "" + salary.getEmployeeId());
//            Employee employee = new EmployeeModel().getEmployee(salary.getEmployeeId() + "");
//            params.put("EmployeeName", "" + employee.getName());
//
//            params.put("NetAmount", "" + df.format(Double.parseDouble(view.getTxtNetAmount().getText())));
//            params.put("Taxes", "" + df.format(salary.getTax()));
//            params.put("TotalAmount", "" + df.format(salary.getAmount()));
//            System.out.println("1");
//            Calendar c = Calendar.getInstance();
//            params.put("Date", "" + c.get(Calendar.DATE) + "/"
//                    + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
//
//            printTbl(dtmPrint, params);
////            printInvoiceCopy();
//
//        } catch (NullPointerException ex) {
//            ex.printStackTrace();
//        }
//
//    }
//
//    public void printTbl(DefaultTableModel getTable, Map<String, Object> params) {
//        try {
//            System.out.println("OK");
//            String reportSource = "report/payslip.jrxml";
////            
//            //JasperReport jasperReport
//            JasperCompileManager.compileReportToFile(reportSource, "report/payslip.jasper");
//            JRTableModelDataSource df = new JRTableModelDataSource(getTable);
//            JasperPrint jasperPrint = JasperFillManager.fillReport("report/payslip.jasper", params, df);
//            JasperViewer.viewReport(jasperPrint, false);
//        } catch (JRException ex) {
//            ex.printStackTrace();
//        }
//    }
    public void lostFocus(JTextField txt) {
        try {
            if (txt.getText().equals("") || Double.parseDouble(txt.getText()) == 0.0) {
                txt.setText(df.format(0.0));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Salary",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void notifySalary() {
        String str = "Your salary is ready for this month!!!\nSalary details.\n\n"
                + "Basic Salary = " + view.getTextBasicSalarySalary().getText() + "\n";
        for (int i = 0; i < view.getjTableSalary().getRowCount(); i++) {
            str = str + view.getjTableSalary().getValueAt(i, 1)
                    + " - " + view.getjTableSalary().getValueAt(i, 2) + "\n";
        }
        str = str + "\nTotal Salary = " + view.getjTextField30().getText();

        Employee e = new EmployeeModel().getEmployee(view.getTextEmployeeIdSalary().getText());
        String email[] = {e.getEmail()};
        boolean success = SendNotifictaion.sendSalaryMessage(email, str);
        if (success) {
            JOptionPane.showMessageDialog(null, "Notification Sent Successfully!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Sending Failed!!!");
        }
    }
}
