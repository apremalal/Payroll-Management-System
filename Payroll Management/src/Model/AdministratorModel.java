package Model;

import Entity.Administrator;
import GUI.Bursar;
import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdministratorModel {

    Connection con;
    Statement statement;
    PreparedStatement pstatement;
    PreparedStatement search;

    public void addAdministrator(Administrator admin) {
        con = DBConnection.initConnection();
        try {
            search = con.prepareStatement("select * from login where employee_id = ?");
            search.setString(1, admin.getEmployeeid());
            ResultSet rs1 = search.executeQuery();
            //update the current user profile
            if (rs1.next()) {

                statement = con.createStatement();
                int confirm = new JOptionPane().showConfirmDialog(null, "Already registered! Do u want to change settings?");
                if (confirm == 0) {
                    statement.executeUpdate("update login set username = '" + admin.getUsername() + "',password = '" + admin.getPassword() + "',add_edit_emp = '" + admin.getadd_edit_employee() + "',view_emp ='" + admin.getview_employee() + "',add_cheque ='" + admin.getadd_cheque() + "',handle_salary ='" + admin.gethandle_salary() + "',view_notification ='" + admin.getview_notifications() + "' where employee_id= '" + admin.getEmployeeid() + "'");
                }
                System.out.println("query excuted!");
            } else {
                int confirm = new JOptionPane().showConfirmDialog(null, "No valid Employee Found on this In the Database. Do u want to add him to Addminitrative staff");


                //Create a new user profile interface table
                if (confirm == 0) {
                    statement = con.createStatement();
                    statement.executeUpdate("INSERT INTO login (employee_id,username ,password ,add_edit_emp ,view_emp ,add_cheque,handle_salary ,view_notification )" + "VALUES" + "('"
                            + admin.getEmployeeid() + "', '"
                            + admin.getUsername() + "', '"
                            + admin.getPassword() + "', '"
                            + (admin.getadd_edit_employee() ? 1 : 0) + "', '"
                            + (admin.getview_employee() ? 1 : 0) + "', '"
                            + (admin.getadd_cheque() ? 1 : 0) + "', '"
                            + (admin.gethandle_salary() ? 1 : 0) + "', '"
                            + (admin.getview_notifications() ? 1 : 0) + "')");
                    JOptionPane.showMessageDialog(null, " New User added successfully");
                }


            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public ResultSet searchByUsername(String username) {

        con = DBConnection.initConnection();
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            statement.executeQuery("select * from login WHERE username = '" + username + "'");
            rs = statement.getResultSet();
            System.out.println(rs + " rs is ok");
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet searchall() {

        con = DBConnection.initConnection();
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            statement.executeQuery("select employee_id,username from login");
            rs = statement.getResultSet();

        } catch (SQLException ex) {
            Logger.getLogger(AdministratorModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(rs);
        return rs;
    }

    public ResultSet searchByEmployeeID(int employeeID) {

        con = DBConnection.initConnection();
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            statement.executeQuery("select employee_id,username, add_edit_emp,view_emp, add_cheque,handle_salary ,view_notification from login WHERE employee_id REGEXP '(" + employeeID + ")'");
            rs = statement.getResultSet();

        } catch (SQLException ex) {
            Logger.getLogger(AdministratorModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void remove(int employeeID) {
        try {
            con = DBConnection.initConnection();
            statement = con.createStatement();
            statement.execute("DELETE FROM login WHERE employee_id='" + employeeID + "'");
            JOptionPane.showMessageDialog(null, "Successfully removed!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error", null, JOptionPane.ERROR_MESSAGE);
        }

    }
}
