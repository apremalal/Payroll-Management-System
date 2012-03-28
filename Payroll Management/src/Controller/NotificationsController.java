/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Notifications;
import GUI.Main;
import Model.ChequesModel;
import Model.EmployeeModel;
import Model.NotificationsModel;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anuruddha
 */
public class NotificationsController {

    public Main view;
    private NotificationsModel notificationsModel;

    public NotificationsController() {

        notificationsModel = new NotificationsModel();

    }

    public void initialize() {
        Calendar from = Calendar.getInstance();
        view.getDateTo().setDate(from.getTime());
        from.setTimeInMillis(from.getTimeInMillis() - (24 * 60 * 60 * 1000));
        view.getDateFrom().setDate(from.getTime());

    }

    public void show() {
        Date from = new Date(view.getDateFrom().getDate().getTime());
        Date to = new Date(view.getDateTo().getDate().getTime());

        ArrayList<Notifications> notificationses = notificationsModel.getFromTo(from, to);
        DefaultTableModel dtm = (DefaultTableModel) view.getTableNotifications().getModel();
        dtm.setRowCount(0);

        if (notificationses.size() > 0) {
            for (int i = 0; i < notificationses.size(); i++) {
                Object o[] = new Object[5];
                String empId = "" + notificationses.get(i).getEmployeeId();
                o[0] = new EmployeeModel().getEmployee(empId).getName();
                o[1] = notificationses.get(i).getDate();
                o[2] = notificationses.get(i).getTime();
                int chequeId = notificationses.get(i).getChequeId();
                System.out.println(""+chequeId);
                o[3] = new ChequesModel().getCheque(chequeId).getChequeNo();
                o[4] = notificationses.get(i).isSentSuccess();
                dtm.addRow(o);
            }
        }
    }

    public void viewCheque() {
        int row = view.getTableNotifications().getSelectedRow();
        String chequeNo = view.getTableNotifications().getValueAt(row, 3) + "";
        view.chequeController.viewCheque(chequeNo);

        view.getjTabbedPane1().setSelectedIndex(4);
    }
}
