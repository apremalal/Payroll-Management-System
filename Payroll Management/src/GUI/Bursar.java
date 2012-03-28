/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Bursar.java
 *
 * Created on Nov 3, 2011, 6:13:58 PM
 */

package GUI;
import Controller.AdministratorController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.image.*;

/**
 *
 * @author work
 */
public class Bursar extends javax.swing.JFrame {

    public AdministratorController controller;
    /** Creates new form Bursar */
    public Bursar() {
        initComponents();
            }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Home = new javax.swing.JTabbedPane();
        jPanel_home = new javax.swing.JPanel();
        addUser = new javax.swing.JButton();
        SearchHome = new javax.swing.JButton();
        jPanel_search = new javax.swing.JPanel();
        employee_id = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        jLabel_Employee_ID = new javax.swing.JLabel();
        jLabel_userName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        edit_profile = new javax.swing.JButton();
        jButton_serch_all = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel_add_modify_user = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        user_Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AddUser = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jButton_clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox_add_edit_employee = new javax.swing.JCheckBox();
        jCheckBox3_view_employee = new javax.swing.JCheckBox();
        jCheckBox_add_cheque = new javax.swing.JCheckBox();
        jCheckBox_handle_salary = new javax.swing.JCheckBox();
        jCheckBox_view_notifications = new javax.swing.JCheckBox();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administarion Window");

        Home.setName("Adminstration Window"); // NOI18N

        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        SearchHome.setText("Search");
        SearchHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_homeLayout = new javax.swing.GroupLayout(jPanel_home);
        jPanel_home.setLayout(jPanel_homeLayout);
        jPanel_homeLayout.setHorizontalGroup(
            jPanel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_homeLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(jPanel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(SearchHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(171, 171, 171))
        );
        jPanel_homeLayout.setVerticalGroup(
            jPanel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_homeLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(SearchHome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        Home.addTab("Home", jPanel_home);

        employee_id.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                employee_idCaretPositionChanged(evt);
            }
        });

        jLabel_Employee_ID.setText("Employee ID");

        jLabel_userName.setText("UserName");

        jLabel6.setText("Search By :");

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel7.setText("OR");

        edit_profile.setText("edit profile");
        edit_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_profileActionPerformed(evt);
            }
        });

        jButton_serch_all.setText("search all");
        jButton_serch_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_serch_allActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "UserName"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel_searchLayout = new javax.swing.GroupLayout(jPanel_search);
        jPanel_search.setLayout(jPanel_searchLayout);
        jPanel_searchLayout.setHorizontalGroup(
            jPanel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edit_profile)
                    .addGroup(jPanel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addGroup(jPanel_searchLayout.createSequentialGroup()
                            .addComponent(jLabel_Employee_ID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel_userName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton_serch_all))
                        .addComponent(jScrollPane1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel_searchLayout.setVerticalGroup(
            jPanel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_searchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Employee_ID)
                    .addComponent(employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_userName)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search)
                    .addComponent(jButton_serch_all))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit_profile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Home.addTab("Search", jPanel_search);

        jLabel1.setText("UserName");

        jLabel2.setText("Password");

        user_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_IdActionPerformed(evt);
            }
        });

        jLabel3.setText("Employee ID");

        AddUser.setText("Add ");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton_clear.setText("Clear");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Accessibility"));

        jCheckBox_add_edit_employee.setText("Add/Edit Employee");

        jCheckBox3_view_employee.setText("View Employee");

        jCheckBox_add_cheque.setText("Add Cheque");

        jCheckBox_handle_salary.setText("Handle Salary");

        jCheckBox_view_notifications.setText("View Notifications");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_add_cheque)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_add_edit_employee)
                            .addComponent(jCheckBox3_view_employee))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_view_notifications)
                            .addComponent(jCheckBox_handle_salary))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_add_edit_employee)
                    .addComponent(jCheckBox_handle_salary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3_view_employee)
                    .addComponent(jCheckBox_view_notifications))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_add_cheque)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_add_modify_userLayout = new javax.swing.GroupLayout(jPanel_add_modify_user);
        jPanel_add_modify_user.setLayout(jPanel_add_modify_userLayout);
        jPanel_add_modify_userLayout.setHorizontalGroup(
            jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_modify_userLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_add_modify_userLayout.createSequentialGroup()
                        .addGroup(jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(UserName)
                            .addComponent(user_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(265, Short.MAX_VALUE))
                    .addGroup(jPanel_add_modify_userLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        jPanel_add_modify_userLayout.setVerticalGroup(
            jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_add_modify_userLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(user_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_add_modify_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_add_modify_userLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(AddUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_clear)
                .addGap(24, 24, 24))
        );

        Home.addTab("Add/Modify User", jPanel_add_modify_user);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Home.getAccessibleContext().setAccessibleName("Add User");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        // TODO add your handling code here:
        controller.clearWindow();
}//GEN-LAST:event_jButton_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        controller.remove();
    }//GEN-LAST:event_deleteActionPerformed

    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed
        // TODO add your handling code here:
        controller.add();
}//GEN-LAST:event_AddUserActionPerformed

    private void user_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_IdActionPerformed

    private void jButton_serch_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_serch_allActionPerformed
        // TODO add your handling code here:
        controller.searchAll();
}//GEN-LAST:event_jButton_serch_allActionPerformed

    private void edit_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_profileActionPerformed
        try {
            // TODO add your handling code here:
            Home.setSelectedComponent(jPanel_add_modify_user);
            ResultSet rs = controller.edit_profile();
            while(rs.next()){
                user_Id.setText(""+rs.getObject("employee_id") );
                UserName.setText(""+rs.getObject("username"));
                password.setText(null);

                jCheckBox_add_edit_employee.setSelected(getboolean((String)rs.getObject("add_edit_emp")));
                jCheckBox3_view_employee.setSelected(getboolean((String)rs.getObject("view_emp")));
                jCheckBox_add_cheque.setSelected(getboolean((String)rs.getObject("add_cheque")));
                jCheckBox_handle_salary.setSelected(getboolean((String)rs.getObject("handle_salary")));
                jCheckBox_view_notifications.setSelected(getboolean((String)rs.getObject("view_notification")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bursar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edit_profileActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        if(!employee_id.getText().equals("")&& userName.getText().equals("")){

            controller.searchByEmployeeID(Integer.parseInt(employee_id.getText()));

        } else if (employee_id.getText().equals("")&& !userName.getText().equals("")){

            controller.searchByUsername(userName.getText());
        }

        else if(!employee_id.getText().equals("")&& !userName.getText().equals("")){

            controller.searchByEmployeeID(Integer.parseInt(employee_id.getText()));
        }

        else
            JOptionPane.showMessageDialog(null,"Please enter \"User Name\" or \"Employee Id\"");
}//GEN-LAST:event_SearchActionPerformed

    private void employee_idCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_employee_idCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_employee_idCaretPositionChanged

    private void SearchHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchHomeActionPerformed
        // TODO add your handling code here:
        Home.setSelectedComponent(jPanel_search);
}//GEN-LAST:event_SearchHomeActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
        Home.setSelectedComponent(jPanel_add_modify_user);
}//GEN-LAST:event_addUserActionPerformed




    private boolean getboolean(String s){

        if (s.trim().equals("true")) {
            return true;
        }
        else
            return false;
    }
    public javax.swing.JTextField getjTextFieldUserName(){

        return  UserName;
    }
    public javax.swing.JTextField getjPasswordField1(){

        return  password;

    }
    public javax.swing.JTextField getjTextFieldEmployeeID(){

        return  user_Id;

    }
    public javax.swing.JTextField getjTextField_search_EmployeeID(){

        return  employee_id;

    }
    public javax.swing.JTextField getjTextField_search_UserName(){

        return  userName;

    }
public javax.swing.JCheckBox getjCheckBox3_view_employee(){

        return  jCheckBox3_view_employee;

    }
public javax.swing.JCheckBox getjCheckBox_add_cheque(){

        return  jCheckBox_add_cheque;

    }
public javax.swing.JCheckBox getjCheckBox_add_edit_employee(){

        return  jCheckBox_add_edit_employee;

    }
public javax.swing.JCheckBox getjCheckBox_handle_salary(){

        return  jCheckBox_handle_salary;

    }

public javax.swing.JCheckBox getjCheckBox_view_notifications(){

        return jCheckBox_view_notifications;
    }

public javax.swing.JTable getjTable1(){

        return jTable1;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bursar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUser;
    private javax.swing.JTabbedPane Home;
    private javax.swing.JButton Search;
    private javax.swing.JButton SearchHome;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton addUser;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit_profile;
    private javax.swing.JTextField employee_id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_serch_all;
    private javax.swing.JCheckBox jCheckBox3_view_employee;
    private javax.swing.JCheckBox jCheckBox_add_cheque;
    private javax.swing.JCheckBox jCheckBox_add_edit_employee;
    private javax.swing.JCheckBox jCheckBox_handle_salary;
    private javax.swing.JCheckBox jCheckBox_view_notifications;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Employee_ID;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_add_modify_user;
    private javax.swing.JPanel jPanel_home;
    private javax.swing.JPanel jPanel_search;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField user_Id;
    // End of variables declaration//GEN-END:variables

}