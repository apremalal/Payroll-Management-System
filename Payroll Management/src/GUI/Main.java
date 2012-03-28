/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Test.java
 *
 * Created on Nov 1, 2011, 1:34:54 PM
 */
package GUI;

import Entity.*;
import Controller.*;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main extends javax.swing.JFrame {

    public EmployeeController employeeController = new EmployeeController();
    public SalaryController salaryController = new SalaryController();
    public ChequeController chequeController = new ChequeController();
    public NotificationsController notificationsController = new NotificationsController();
    public int row;
    public int colmn = 2;
    String employeeid;
    Employee person;

    public Main() {

        initComponents();
        initx();

        employeeController.view = this;
        salaryController.view = this;
        chequeController.view = this;
        notificationsController.view = this;
        employeeController.initialize();
        notificationsController.initialize();
    }

    public void initx() {
        getjPanel2().setEnabled(false);
        getPnlCheque().setEnabled(false);
        getPnlNotifications().setEnabled(false);
        getPnlSearch().setEnabled(false);
        getPnlSalary().setEnabled(false);
        jComboBoxNotificationMeth.setVisible(false);
        getBtnDeletecheque().setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        btnHomeEmployee = new javax.swing.JButton();
        btnHomeSearch = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnHomeNotifications = new javax.swing.JButton();
        btnHomeAdministrator = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        pnlNotifications = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableNotifications = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        dateFrom = new com.toedter.calendar.JDateChooser();
        dateTo = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        btnViewCheque = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        jButtonView = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSearch = new javax.swing.JTable();
        jButtonSalary = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTextFieldEmployeeSearch = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldNameSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        pnlSalary = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableSalary = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmbAdjustments = new javax.swing.JComboBox();
        txtAmount = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txtNetAmount = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField30 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        textEmployeeIdSalary = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jYearChooser = new com.toedter.calendar.JYearChooser();
        jMonthChooser = new com.toedter.calendar.JMonthChooser();
        jButton1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        pnlCheque = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableCheque = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAddCheque = new javax.swing.JButton();
        btnDeletecheque = new javax.swing.JButton();
        btnNewCheque = new javax.swing.JButton();
        btnNotifyCheque = new javax.swing.JButton();
        lblNotification = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldEmployeeIDCheque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldAmountCheque = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldDuration = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldBankAccountNUmber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldChequeNumber = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldBank = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldBranch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        pnlEmployee = new javax.swing.JPanel();
        jComboBoxNotificationMeth = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmpId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldAddress = new javax.swing.JTextArea();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMobile = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDesignation = new javax.swing.JTextField();
        jTextFieldDivision = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSalClass = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextBasicSalary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAccNo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldTax = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButtonNewEmployee = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonDeleteEmployee = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        btnHomeEmployee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHomeEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Employee.png"))); // NOI18N
        btnHomeEmployee.setText("Employee");
        btnHomeEmployee.setIconTextGap(20);
        btnHomeEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeEmployeeActionPerformed(evt);
            }
        });

        btnHomeSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHomeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search1.png"))); // NOI18N
        btnHomeSearch.setText("Search");
        btnHomeSearch.setIconTextGap(25);
        btnHomeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeSearchActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Log Out_32x32.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btnHomeNotifications.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHomeNotifications.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notificatios.png"))); // NOI18N
        btnHomeNotifications.setText("Notifications");
        btnHomeNotifications.setIconTextGap(20);
        btnHomeNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeNotificationsActionPerformed(evt);
            }
        });

        btnHomeAdministrator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHomeAdministrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin.png"))); // NOI18N
        btnHomeAdministrator.setText("Administrator");
        btnHomeAdministrator.setIconTextGap(20);
        btnHomeAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeAdministratorActionPerformed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHomeLayout.createSequentialGroup()
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHomeEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(btnHomeNotifications, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHomeAdministrator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(btnHomeSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHomeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHomeNotifications, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(btnHomeAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Home", pnlHome);
        pnlHome.getAccessibleContext().setAccessibleName("");

        tableNotifications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Date", "Time", "ChequeId", "Success"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableNotifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNotificationsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableNotifications);

        jLabel20.setText("From");

        jLabel21.setText("To");

        jButton13.setText("Show");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(dateTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        btnViewCheque.setText("View Cheque");
        btnViewCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewChequeActionPerformed(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Apps-preferences-desktop-notification-icon.png"))); // NOI18N

        jLabel41.setText("Select a period to view cheque notifications.");

        javax.swing.GroupLayout pnlNotificationsLayout = new javax.swing.GroupLayout(pnlNotifications);
        pnlNotifications.setLayout(pnlNotificationsLayout);
        pnlNotificationsLayout.setHorizontalGroup(
            pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotificationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewCheque)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlNotificationsLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel41))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                            .addComponent(jLabel40))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlNotificationsLayout.setVerticalGroup(
            pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotificationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNotificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNotificationsLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewCheque)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Notifications", pnlNotifications);

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButton12.setText("Add Cheque");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Designation", "Division"
            }
        ));
        jScrollPane1.setViewportView(jTableSearch);

        jButtonSalary.setText("Salary");
        jButtonSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalaryActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel33.setText("Employee ID");

        jTextFieldEmployeeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmployeeSearchActionPerformed(evt);
            }
        });

        jLabel32.setText("Name");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel42.setText("OR");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(51, 51, 51)))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNameSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmployeeSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(102, 102, 102))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmployeeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextFieldNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButtonSearch)
                .addGap(29, 29, 29))
        );

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search_256x256.png"))); // NOI18N

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalary)
                    .addComponent(jButtonView)
                    .addComponent(jButton12))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Search", pnlSearch);

        jButton14.setText("Pay");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Amount"
            }
        ));
        jTableSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSalaryMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableSalary);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel26.setText("Adjustment:");

        jLabel27.setText("Amount:");

        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAmountFocusLost(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAmount)
                    .addComponent(cmbAdjustments, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4))
                .addContainerGap(5, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cmbAdjustments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel28.setText("Net Adjustment");

        txtNetAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNetAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetAmountActionPerformed(evt);
            }
        });
        txtNetAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNetAmountFocusLost(evt);
            }
        });

        jLabel23.setText("Taxes");

        jTextField24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField24FocusLost(evt);
            }
        });

        jTextField30.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });
        jTextField30.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField30FocusLost(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel30.setText("Total ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNetAmount)
                            .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, 0, 412, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jLabel31.setText("Employee ID");

        jLabel22.setText("Basic Salary");

        jLabel24.setText("Year:");

        jLabel25.setText("Month:");

        jYearChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jYearChooserPropertyChange(evt);
            }
        });

        jMonthChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMonthChooserMouseClicked(evt);
            }
        });
        jMonthChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMonthChooserPropertyChange(evt);
            }
        });
        jMonthChooser.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jMonthChooserVetoableChange(evt);
            }
        });

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField23)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jYearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jMonthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmployeeIdSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(textEmployeeIdSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jYearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stackofmoney256.png"))); // NOI18N

        javax.swing.GroupLayout pnlSalaryLayout = new javax.swing.GroupLayout(pnlSalary);
        pnlSalary.setLayout(pnlSalaryLayout);
        pnlSalaryLayout.setHorizontalGroup(
            pnlSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSalaryLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalaryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        pnlSalaryLayout.setVerticalGroup(
            pnlSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSalaryLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSalaryLayout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Salary", pnlSalary);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableCheque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Cheque NO", "Amount", "Date Added"
            }
        ));
        jTableCheque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableChequeMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableCheque);

        btnAddCheque.setText("Add");
        btnAddCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChequeActionPerformed(evt);
            }
        });

        btnDeletecheque.setText("Delete");
        btnDeletecheque.setEnabled(false);
        btnDeletecheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletechequeActionPerformed(evt);
            }
        });

        btnNewCheque.setText("New");
        btnNewCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewChequeActionPerformed(evt);
            }
        });

        btnNotifyCheque.setText("Notify");
        btnNotifyCheque.setEnabled(false);
        btnNotifyCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotifyChequeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNotifyCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletecheque, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletecheque)
                    .addComponent(btnNotifyCheque)
                    .addComponent(btnAddCheque)
                    .addComponent(btnNewCheque))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lblNotification, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNotification, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setText("Employee ID");

        jLabel13.setText("Amount");

        jLabel14.setText("Duration");

        jLabel16.setText("Banck Account Number");

        jLabel15.setText("Cheque Number");

        jLabel17.setText("Bank");

        jLabel18.setText("Branch");

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAmountCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmployeeIDCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldBankAccountNUmber, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel18))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBranch, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jTextFieldBank, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jTextFieldChequeNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addContainerGap(314, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldEmployeeIDCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAmountCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldBankAccountNUmber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldChequeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check256.png"))); // NOI18N

        javax.swing.GroupLayout pnlChequeLayout = new javax.swing.GroupLayout(pnlCheque);
        pnlCheque.setLayout(pnlChequeLayout);
        pnlChequeLayout.setHorizontalGroup(
            pnlChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlChequeLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel35)))
                .addContainerGap())
        );
        pnlChequeLayout.setVerticalGroup(
            pnlChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Cheque Details", pnlCheque);

        jComboBoxNotificationMeth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SMS", "E-Mail", "None" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setText("EmployeeID");

        jTextFieldEmpId.setEditable(false);

        jLabel11.setText("Name");

        jLabel5.setText("Gender");

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", " " }));

        jLabel2.setText("NIC No.");

        jLabel6.setText("Address");

        jTextFieldAddress.setColumns(20);
        jTextFieldAddress.setRows(5);
        jScrollPane2.setViewportView(jTextFieldAddress);

        jLabel3.setText("E-Mail");

        jLabel4.setText("Mobile No");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNic, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Designation");

        jLabel10.setText("Division");

        jLabel8.setText("Salary Class");

        jLabel29.setText("Basic Salary");

        jLabel9.setText("Account Number");

        jLabel37.setText("Tax");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel29)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jTextFieldDesignation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jTextFieldSalClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jTextBasicSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jTextFieldAccNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                        .addGap(64, 64, 64))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSalClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButtonNewEmployee.setText("New");
        jButtonNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewEmployeeActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Save");
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
        });
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDeleteEmployee.setText("Delete");
        jButtonDeleteEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteEmployeeMouseClicked(evt);
            }
        });
        jButtonDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNewEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jButtonDeleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista_icons_07.png"))); // NOI18N

        javax.swing.GroupLayout pnlEmployeeLayout = new javax.swing.GroupLayout(pnlEmployee);
        pnlEmployee.setLayout(pnlEmployeeLayout);
        pnlEmployeeLayout.setHorizontalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jComboBoxNotificationMeth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEmployeeLayout.setVerticalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxNotificationMeth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab(" Employee", pnlEmployee);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Add New Employee");
        jMenu1.add(jMenuItem1);

        jMenuItem7.setText("Add New Administrator");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenu3.setText("Search Employee");
        jMenu1.add(jMenu3);

        jMenuItem2.setText("Add Cheque");
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Log out");
        jMenu1.add(jMenuItem4);

        jMenuItem3.setText("Exit");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem5.setText("Profile");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Help");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem6.setText("Help");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab4");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-839)/2, (screenSize.height-650)/2, 839, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        employeeController.addEmployee();
}//GEN-LAST:event_jButtonAddActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        salaryController.paySalary();
}//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField30ActionPerformed

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jButtonDeleteEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteEmployeeMouseClicked
        employeeController.clear();
    }//GEN-LAST:event_jButtonDeleteEmployeeMouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Bursar ad = new Bursar();
        ad.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        employeeController.viewEmloyee();
        getjTabbedPane1().setSelectedIndex(5);
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        employeeController.searchEmployee();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void btnHomeEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeEmployeeActionPerformed
        getjTabbedPane1().setSelectedIndex(5);
        employeeController.clear();
    }//GEN-LAST:event_btnHomeEmployeeActionPerformed

    private void jTextFieldEmployeeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmployeeSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmployeeSearchActionPerformed

    private void jButtonNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewEmployeeActionPerformed
        employeeController.clear();
    }//GEN-LAST:event_jButtonNewEmployeeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        salaryController.addAdjustment();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNetAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetAmountActionPerformed

    private void jButtonDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteEmployeeActionPerformed
        employeeController.deleteEmployee();
    }//GEN-LAST:event_jButtonDeleteEmployeeActionPerformed

    private void jButtonSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalaryActionPerformed
        salaryController.viewSalary();
    }//GEN-LAST:event_jButtonSalaryActionPerformed

    private void btnDeletechequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletechequeActionPerformed
        chequeController.deleteCheque();
    }//GEN-LAST:event_btnDeletechequeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        salaryController.deleteAdjustment();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTableSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSalaryMouseClicked
        salaryController.showValues();
    }//GEN-LAST:event_jTableSalaryMouseClicked

    private void jYearChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jYearChooserPropertyChange
        salaryController.monthSelected();
    }//GEN-LAST:event_jYearChooserPropertyChange

    private void jMonthChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMonthChooserPropertyChange
        salaryController.monthSelected();        // TODO add your handling code here:
    }//GEN-LAST:event_jMonthChooserPropertyChange

    private void jTextField24FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField24FocusLost
        salaryController.lostFocus(jTextField24);
    }//GEN-LAST:event_jTextField24FocusLost

    private void txtAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmountFocusLost
        salaryController.lostFocus(txtAmount);
    }//GEN-LAST:event_txtAmountFocusLost

    private void txtNetAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNetAmountFocusLost
        salaryController.lostFocus(txtNetAmount);
    }//GEN-LAST:event_txtNetAmountFocusLost

    private void jTextField30FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField30FocusLost
        salaryController.lostFocus(jTextField30);
    }//GEN-LAST:event_jTextField30FocusLost

    private void jMonthChooserVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jMonthChooserVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMonthChooserVetoableChange

    private void jMonthChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMonthChooserMouseClicked
        salaryController.monthSelected();
    }//GEN-LAST:event_jMonthChooserMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        notificationsController.show();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btnNewChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewChequeActionPerformed
        chequeController.newCheque();
    }//GEN-LAST:event_btnNewChequeActionPerformed

    private void btnHomeAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAdministratorActionPerformed
        AdministratorController administratorController = new AdministratorController();
    }//GEN-LAST:event_btnHomeAdministratorActionPerformed

    private void btnHomeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeSearchActionPerformed
        getjTabbedPane1().setSelectedIndex(2);
        employeeController.initialize();
    }//GEN-LAST:event_btnHomeSearchActionPerformed

    private void btnHomeNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeNotificationsActionPerformed
        getjTabbedPane1().setSelectedIndex(1);
    }//GEN-LAST:event_btnHomeNotificationsActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        getjTabbedPane1().setSelectedIndex(4);
        chequeController.fillData();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new Splash().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnAddChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChequeActionPerformed
        chequeController.addCheque();
    }//GEN-LAST:event_btnAddChequeActionPerformed

    private void btnViewChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewChequeActionPerformed
        notificationsController.viewCheque();
    }//GEN-LAST:event_btnViewChequeActionPerformed

    private void tableNotificationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNotificationsMouseClicked
    }//GEN-LAST:event_tableNotificationsMouseClicked

    private void jTableChequeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableChequeMouseClicked
        chequeController.viewChequeEntry();
    }//GEN-LAST:event_jTableChequeMouseClicked

    private void btnNotifyChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotifyChequeActionPerformed
        chequeController.sendNotification();
    }//GEN-LAST:event_btnNotifyChequeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getjTabbedPane1().setSelectedIndex(2);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getjTabbedPane1().setSelectedIndex(2);
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCheque;
    private javax.swing.JButton btnDeletecheque;
    private javax.swing.JButton btnHomeAdministrator;
    public javax.swing.JButton btnHomeEmployee;
    public javax.swing.JButton btnHomeNotifications;
    public javax.swing.JButton btnHomeSearch;
    private javax.swing.JButton btnNewCheque;
    private javax.swing.JButton btnNotifyCheque;
    private javax.swing.JButton btnViewCheque;
    private javax.swing.JComboBox cmbAdjustments;
    private com.toedter.calendar.JDateChooser dateFrom;
    private com.toedter.calendar.JDateChooser dateTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDeleteEmployee;
    private javax.swing.JButton jButtonNewEmployee;
    javax.swing.JButton jButtonSalary;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox jComboBoxGender;
    private javax.swing.JComboBox jComboBoxNotificationMeth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private com.toedter.calendar.JMonthChooser jMonthChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCheque;
    private javax.swing.JTable jTableSalary;
    private javax.swing.JTable jTableSearch;
    private javax.swing.JTextField jTextBasicSalary;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextFieldAccNo;
    private javax.swing.JTextArea jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAmountCheque;
    private javax.swing.JTextField jTextFieldBank;
    private javax.swing.JTextField jTextFieldBankAccountNUmber;
    private javax.swing.JTextField jTextFieldBranch;
    private javax.swing.JTextField jTextFieldChequeNumber;
    private javax.swing.JTextField jTextFieldDesignation;
    private javax.swing.JTextField jTextFieldDivision;
    private javax.swing.JTextField jTextFieldDuration;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmpId;
    private javax.swing.JTextField jTextFieldEmployeeIDCheque;
    private javax.swing.JTextField jTextFieldEmployeeSearch;
    private javax.swing.JTextField jTextFieldMobile;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameSearch;
    private javax.swing.JTextField jTextFieldNic;
    private javax.swing.JTextField jTextFieldSalClass;
    private javax.swing.JTextField jTextFieldTax;
    private com.toedter.calendar.JYearChooser jYearChooser;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JPanel pnlCheque;
    private javax.swing.JPanel pnlEmployee;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlNotifications;
    private javax.swing.JPanel pnlSalary;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JTable tableNotifications;
    private javax.swing.JTextField textEmployeeIdSalary;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtNetAmount;
    // End of variables declaration//GEN-END:variables

    public void setjTableCheque(JTable jTableCheque) {
        this.jTableCheque = jTableCheque;
    }

    public JTextField getjTextFieldAmountCheque() {
        return jTextFieldAmountCheque;
    }

    public void setjTextFieldAmountCheque(JTextField jTextFieldAmountCheque) {
        this.jTextFieldAmountCheque = jTextFieldAmountCheque;
    }

    public JTextField getjTextFieldBank() {
        return jTextFieldBranch;
    }

    public void setjTextFieldBank(JTextField jTextFieldBank) {
        this.jTextFieldBank = jTextFieldBank;
    }

    public JTextField getjTextFieldBankAccountNUmber() {
        return jTextFieldBankAccountNUmber;
    }

    public void setjTextFieldBankAccountNUmber(JTextField jTextFieldBankAccountNUmber) {
        this.jTextFieldBankAccountNUmber = jTextFieldBankAccountNUmber;
    }

    public JTextField getjTextFieldBranch() {
        return jTextFieldBranch;
    }

    public void setjTextFieldBranch(JTextField jTextFieldBranch) {
        this.jTextFieldBranch = jTextFieldBranch;
    }

    public JTextField getjTextFieldChequeNumber() {
        return jTextFieldChequeNumber;
    }

    public void setjTextFieldChequeNumber(JTextField jTextFieldChequeNumber) {
        this.jTextFieldChequeNumber = jTextFieldChequeNumber;
    }

    public JTextField getjTextFieldEmployeeIDCheque() {
        return jTextFieldEmployeeIDCheque;
    }

    public void setjTextFieldEmployeeIDCheque(JTextField jTextFieldEmployeeIDCheque) {
        this.jTextFieldEmployeeIDCheque = jTextFieldEmployeeIDCheque;
    }

    public JTextField getjTextFieldDuration() {
        return jTextFieldDuration;
    }

    public javax.swing.JComboBox getjComboBoxGender() {
        return jComboBoxGender;
    }

    /**
     * @return the jComboBoxNotificationMeth
     */
    public javax.swing.JComboBox getjComboBoxNotificationMeth() {
        return jComboBoxNotificationMeth;
    }

    /**
     * @return the jTabbedPane1
     */
    public javax.swing.JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public javax.swing.JTable getjTableCheque() {
        return jTableCheque;
    }

    /**
     * @return the jTable2
     */
    public javax.swing.JTable getjTable2() {
        return getTableNotifications();
    }

    /**
     * @return the jTableSearch
     */
    public javax.swing.JTable getjTableSearch() {
        return jTableSearch;
    }

    /**
     * @return the jTextField11
     */
    public javax.swing.JTextField getjTextField11() {
        return jTextFieldEmployeeIDCheque;
    }

    /**
     * @return the jTextField12
     */
    public javax.swing.JTextField getjTextField12() {
        return jTextFieldAmountCheque;
    }

    /**
     * @return the jTextField13
     */
    public javax.swing.JTextField getjTextField13() {
        return jTextFieldDuration;
    }

    /**
     * @return the jTextField16
     */
    public javax.swing.JTextField getjTextField16() {
        return jTextFieldBankAccountNUmber;
    }

    /**
     * @return the jTextField17
     */
    public javax.swing.JTextField getjTextField17() {
        return jTextFieldChequeNumber;
    }

    /**
     * @return the jTextField19
     */
    public javax.swing.JTextField getjTextField19() {
        return jTextFieldBank;
    }

    /**
     * @return the jTextField20
     */
    public javax.swing.JTextField getjTextField20() {
        return jTextFieldBranch;
    }

    /**
     * @return the jTextField21
     */
    /**
     * @return the jTextField23
     */
    public javax.swing.JTextField getjTextField23() {
        return getTextBasicSalarySalary();
    }

    /**
     * @return the jTextField24
     */
    public javax.swing.JTextField getjTextField24() {
        return getTextTaxesSalary();
    }

    /**
     * @return the jTextField25
     */
    /**
     * @return the jTextFieldAccNo
     */
    public javax.swing.JTextField getjTextFieldAccNo() {
        return jTextFieldAccNo;
    }

    /**
     * @return the jTextFieldAddress
     */
    public javax.swing.JTextArea getjTextFieldAddress() {
        return jTextFieldAddress;
    }

    /**
     * @return the jTextFieldDesignation
     */
    public javax.swing.JTextField getjTextFieldDesignation() {
        return jTextFieldDesignation;
    }

    /**
     * @return the jTextFieldDivision
     */
    public javax.swing.JTextField getjTextFieldDivision() {
        return jTextFieldDivision;
    }

    /**
     * @return the jTextFieldEmail
     */
    public javax.swing.JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    /**
     * @return the jTextFieldEmpId
     */
    public javax.swing.JTextField getjTextFieldEmpId() {
        return jTextFieldEmpId;
    }

    /**
     * @return the jTextFieldEmployeeSearch
     */
    public javax.swing.JTextField getjTextFieldEmployeeSearch() {
        return jTextFieldEmployeeSearch;
    }

    /**
     * @return the jTextFieldMobile
     */
    public javax.swing.JTextField getjTextFieldMobile() {
        return jTextFieldMobile;
    }

    /**
     * @return the jTextFieldNICSearch
     */
    /**
     * @return the jTextFieldName
     */
    public javax.swing.JTextField getjTextFieldName() {
        return jTextFieldName;
    }

    /**
     * @return the jTextFieldNameSearch
     */
    public javax.swing.JTextField getjTextFieldNameSearch() {
        return jTextFieldNameSearch;
    }

    /**
     * @return the jTextFieldNic
     */
    public javax.swing.JTextField getjTextFieldNic() {
        return jTextFieldNic;
    }

    /**
     * @return the jTextFieldSalClass
     */
    public javax.swing.JTextField getjTextFieldSalClass() {
        return jTextFieldSalClass;
    }

    /**
     * @return the jTextFieldTax
     */
    public javax.swing.JTextField getjTextFieldTax() {
        return jTextFieldTax;
    }

    /**
     * @return the cmbAdjustments
     */
    public javax.swing.JComboBox getCmbAdjustments() {
        return cmbAdjustments;
    }

    /**
     * @return the jTableSalary
     */
    public javax.swing.JTable getjTableSalary() {
        return jTableSalary;
    }

    /**
     * @return the jTextBasicSalary
     */
    public javax.swing.JTextField getjTextBasicSalary() {
        return jTextBasicSalary;
    }

    /**
     * @return the jTextField30
     */
    public javax.swing.JTextField getjTextField30() {
        return jTextField30;
    }

    /**
     * @return the jTextField31
     */
    public javax.swing.JTextField getjTextField31() {
        return getTextEmployeeIdSalary();
    }

    /**
     * @return the jYearChooser
     */
    public com.toedter.calendar.JYearChooser getjYearChooser() {
        return jYearChooser;
    }

    /**
     * @return the txtAmount
     */
    public javax.swing.JTextField getTxtAmount() {
        return txtAmount;
    }

    /**
     * @return the txtNetAmount
     */
    public javax.swing.JTextField getTxtNetAmount() {
        return txtNetAmount;
    }

    /**
     * @return the dateFrom
     */
    public com.toedter.calendar.JDateChooser getDateFrom() {
        return dateFrom;
    }

    /**
     * @return the dateTo
     */
    public com.toedter.calendar.JDateChooser getDateTo() {
        return dateTo;
    }

    /**
     * @return the jMonthChooser
     */
    public com.toedter.calendar.JMonthChooser getjMonthChooser() {
        return jMonthChooser;
    }

    /**
     * @return the tableNotifications
     */
    public javax.swing.JTable getTableNotifications() {
        return tableNotifications;
    }

    /**
     * @return the textBasicSalarySalary
     */
    public javax.swing.JTextField getTextBasicSalarySalary() {
        return jTextField23;
    }

    /**
     * @return the textEmployeeIdSalary
     */
    public javax.swing.JTextField getTextEmployeeIdSalary() {
        return textEmployeeIdSalary;
    }

    /**
     * @return the textTaxesSalary
     */
    public javax.swing.JTextField getTextTaxesSalary() {
        return jTextField24;
    }

    /**
     * @return the jButton1
     */
    public javax.swing.JButton getjButton1() {
        return getBtnHomeEmployee();
    }

    /**
     * @return the jButton10
     */
    public javax.swing.JButton getjButton10() {
        return getBtnAddCheque();
    }

    /**
     * @return the jButton11
     */
    public javax.swing.JButton getjButton11() {
        return getBtnHomeNotifications();
    }

    /**
     * @return the jButton12
     */
    public javax.swing.JButton getjButton12() {
        return jButton12;
    }

    /**
     * @return the jButton13
     */
    public javax.swing.JButton getjButton13() {
        return jButton13;
    }

    /**
     * @return the jButton14
     */
    public javax.swing.JButton getjButton14() {
        return jButton14;
    }

    /**
     * @return the jButton2
     */
    public javax.swing.JButton getjButton2() {
        return getBtnDeletecheque();
    }

    /**
     * @return the jButton3
     */
    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    /**
     * @return the jButton4
     */
    public javax.swing.JButton getjButton4() {
        return jButton4;
    }

    /**
     * @return the jButton5
     */
    public javax.swing.JButton getjButton5() {
        return getBtnNewCheque();
    }

    /**
     * @return the jButton8
     */
    public javax.swing.JButton getjButton8() {
        return getBtnHomeSearch();
    }

    /**
     * @return the jButton9
     */
    public javax.swing.JButton getjButton9() {
        return jButton9;
    }

    /**
     * @return the jButtonAdd
     */
    public javax.swing.JButton getjButtonAdd() {
        return jButtonAdd;
    }

    /**
     * @return the jButtonDeleteEmployee
     */
    public javax.swing.JButton getjButtonDeleteEmployee() {
        return jButtonDeleteEmployee;
    }

    /**
     * @return the jButtonNewEmployee
     */
    public javax.swing.JButton getjButtonNewEmployee() {
        return jButtonNewEmployee;
    }

    /**
     * @return the jButtonSalary
     */
    public javax.swing.JButton getjButtonSalary() {
        return jButtonSalary;
    }

    /**
     * @return the jButtonSearch
     */
    public javax.swing.JButton getjButtonSearch() {
        return jButtonSearch;
    }

    /**
     * @return the jButtonView
     */
    public javax.swing.JButton getjButtonView() {
        return jButtonView;
    }

    /**
     * @return the btnHomeAdministrator
     */
    public javax.swing.JButton getBtnHomeAdministrator() {
        return btnHomeAdministrator;
    }

    /**
     * @return the btnHomeEmployee
     */
    public javax.swing.JButton getBtnHomeEmployee() {
        return btnHomeEmployee;
    }

    /**
     * @return the btnHomeNotifications
     */
    public javax.swing.JButton getBtnHomeNotifications() {
        return btnHomeNotifications;
    }

    /**
     * @return the btnHomeSearch
     */
    public javax.swing.JButton getBtnHomeSearch() {
        return btnHomeSearch;
    }

    /**
     * @param jTabbedPane1 the jTabbedPane1 to set
     */
    public void setjTabbedPane1(javax.swing.JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return getPnlEmployee();
    }

    /**
     * @return the pnlCheque
     */
    public javax.swing.JPanel getPnlCheque() {
        return pnlCheque;
    }

    /**
     * @return the pnlEmployee
     */
    public javax.swing.JPanel getPnlEmployee() {
        return pnlEmployee;
    }

    /**
     * @return the pnlHome
     */
    public javax.swing.JPanel getPnlHome() {
        return pnlHome;
    }

    /**
     * @return the pnlNotifications
     */
    public javax.swing.JPanel getPnlNotifications() {
        return pnlNotifications;
    }

    /**
     * @return the pnlSalary
     */
    public javax.swing.JPanel getPnlSalary() {
        return pnlSalary;
    }

    /**
     * @return the pnlSearch
     */
    public javax.swing.JPanel getPnlSearch() {
        return pnlSearch;
    }

    /**
     * @return the btnAddCheque
     */
    public javax.swing.JButton getBtnAddCheque() {
        return btnAddCheque;
    }

    /**
     * @return the btnDeletecheque
     */
    public javax.swing.JButton getBtnDeletecheque() {
        return btnDeletecheque;
    }

    /**
     * @return the btnNewCheque
     */
    public javax.swing.JButton getBtnNewCheque() {
        return btnNewCheque;
    }

    /**
     * @return the btnNotifyCheque
     */
    public javax.swing.JButton getBtnNotifyCheque() {
        return btnNotifyCheque;
    }

    /**
     * @return the btnViewCheque
     */
    public javax.swing.JButton getBtnViewCheque() {
        return btnViewCheque;
    }

    /**
     * @return the lblNotification
     */
    public javax.swing.JLabel getLblNotification() {
        return lblNotification;
    }
    /**
     * @return the jTableCheque
     */
}
