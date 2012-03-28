/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Notifications;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandujith
 */
public class NotificationsModel {

    public void insert(Notifications notifications) {
        try {
            String sql = "INSERT INTO Notifications (EmployeeId, Date, Time, Success, chequeId) VALUES "
                    + "('" + notifications.getEmployeeId() + "', '" + notifications.getDate() + "','"
                    + notifications.getTime() + "','" + (notifications.isSentSuccess() ? 1 : 0) + "'"
                    + ",'" + notifications.getChequeId() + "')";
            Connection con = DBConnection.initConnection();
            con.createStatement().executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Notifications> getFromTo(Date from, Date to) {
        ArrayList<Notifications> notificationses = new ArrayList<Notifications>();
        try {
            String sql = "SELECT * FROM Notifications WHERE date BETWEEN '" + from + "' AND '" + to + "'";
            Connection con = DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                Notifications notifications = new Notifications();
                notifications.setEmployeeId(rs.getInt("EmployeeId"));
                notifications.setDate(rs.getDate("Date"));
                notifications.setTime(rs.getTime("Time"));
                notifications.setSentSuccess((rs.getInt("Success") == 1));
                notifications.setChequeId(rs.getInt("ChequeId"));
                notificationses.add(notifications);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return notificationses;
    }

    public ArrayList<Notifications> getAll() {
        ArrayList<Notifications> notificationses = new ArrayList<Notifications>();
        try {
            String sql = "SELECT * FROM Notifications";
            Connection con = DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                Notifications notifications = new Notifications();
                notifications.setEmployeeId(rs.getInt("EmployeeId"));
                notifications.setDate(rs.getDate("Date"));
                notifications.setTime(rs.getTime("Time"));
                notifications.setSentSuccess((rs.getInt("Success") == 1));
                notifications.setChequeId(rs.getInt("ChequeId"));
                notificationses.add(notifications);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return notificationses;
    }

    public Notifications getAll(int id) {
        Notifications notifications = null;
        try {
            String sql = "SELECT * FROM Notifications WHERE ChequeId = '" + id + "'";
            Connection con = DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);

            if (rs.next()) {
                notifications = new Notifications();
                notifications.setEmployeeId(rs.getInt("EmployeeId"));
                notifications.setDate(rs.getDate("Date"));
                notifications.setTime(rs.getTime("Time"));
                notifications.setSentSuccess((rs.getInt("Success") == 1));
                notifications.setChequeId(rs.getInt("ChequeId"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return notifications;
    }

    public void update(Notifications n) {
        try {
            String sql = "UPDATE Notifications SET success = '" + (n.isSentSuccess() ? 1 : 0) + "' WHERE "
                    + "chequeId = '" + n.getChequeId() + "' && employeeId = '" + n.getEmployeeId() + "'";
            Connection con = DBConnection.initConnection();
            con.createStatement().executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
