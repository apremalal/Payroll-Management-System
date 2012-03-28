package Controller;

import Entity.Administrator;
import GUI.Main;
import Model.AdministratorModel;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SplashController {

    Connection con;
    Statement statement;
    PreparedStatement search;
    String username;

    public SplashController() {
        try {
            con = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost/Pay",
                    "root",
                    "123");

        } catch (Exception e) {
            System.out.println("Connection Error");
        }
    }

    public boolean validateLogin(String username, String password) {
        boolean accept = false;
        try {
            search = con.prepareStatement("select * from login where UserName = ?");
            search.setString(1, username);
            ResultSet rs1 = search.executeQuery();

//            search = con.prepareStatement("select * from login where PassWord = ?");
//            search.setString(1, password);
//            ResultSet rs2 = search.executeQuery();
            if (rs1.next()) {
                if (rs1.getString("password").equals(password)) {
                    this.username = rs1.getString("username");
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return accept;
    }

    public void runMain() {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    Main m = new Main();

                    m.setVisible(true);

                    ResultSet rs = new AdministratorModel().searchByUsername(username);
                    if (rs.next()) {
                        
                        m.getjButtonAdd().setEnabled(false);
                        m.getjButtonDeleteEmployee().setEnabled(false);
                        m.getjButtonNewEmployee().setEnabled(false);
                        m.getjTabbedPane1().setEnabledAt(5, rs.getInt("add_edit_emp") == 1);
                        m.getjButtonAdd().setEnabled(rs.getInt("add_edit_emp") == 1);
                        m.getjButtonDeleteEmployee().setEnabled(rs.getInt("add_edit_emp") == 1);
                        m.getjButtonNewEmployee().setEnabled(rs.getInt("add_edit_emp") == 1);

                        m.getjTabbedPane1().setEnabledAt(5, rs.getInt("view_emp") == 1);
                        m.getjButtonView().setEnabled(rs.getInt("view_emp") == 1);
                        m.getBtnHomeEmployee().setEnabled(rs.getInt("view_emp") == 1);
                        
                        m.getjTabbedPane1().setEnabledAt(4, rs.getInt("add_cheque") == 1);
                        m.getjButton12().setEnabled(rs.getInt("add_cheque") == 1);
                        m.getBtnAddCheque().setEnabled(rs.getInt("add_cheque") == 1);
                        m.getBtnNewCheque().setEnabled(rs.getInt("add_cheque") == 1);
                        m.getBtnDeletecheque().setEnabled(rs.getInt("add_cheque") == 1);

                        m.getjTabbedPane1().setEnabledAt(3, rs.getInt("handle_salary") == 1);
                        m.getjButtonSalary().setEnabled(rs.getInt("handle_salary") == 1);

                        m.getjTabbedPane1().setEnabledAt(1, rs.getInt("view_notification") == 1);
                        m.getBtnHomeNotifications().setEnabled(rs.getInt("view_notification") == 1);

                        m.getBtnHomeAdministrator().setEnabled(false);
                        m.getBtnHomeAdministrator().setEnabled(rs.getString("username").equals("admin"));
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                    }


                } catch (SQLException ex) {
                    Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }
}
