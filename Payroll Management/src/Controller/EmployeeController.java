package Controller;

import Entity.Employee;
import GUI.Main;
import Model.EmployeeModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeController {

    public Main view;
    private EmployeeModel employeeModel;

    public EmployeeController() {
        employeeModel = new EmployeeModel();
    }

    public void initialize() {
        try {


            ArrayList<ArrayList> data = new ArrayList();
            ResultSet rs = employeeModel.searchEmployee("", "");
            ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
            int columns = md.getColumnCount();
            while (rs.next()) {
                ArrayList row = new ArrayList();
                for (int i = 1; i <= columns; i++) {
                    row.add(rs.getObject(i));
                }

                data.add(row);
            }
            updatetable(data);
        } catch (SQLException ex) {
        }
    }

    public void addEmployee() {
        try {
            Employee employee = new Employee();
            if (!"".equals(view.getjTextFieldName().getText())) {
                employee.setName(view.getjTextFieldName().getText());
            } else {
                throw new Exception("No Employee name!!!");
            }
            if (!"".equals(view.getjTextFieldNic().getText())) {
                employee.setNic(view.getjTextFieldNic().getText());
            } else {
                throw new Exception("Please enter an NIC number!!!");
            }
            employee.setDesignation(view.getjTextFieldDesignation().getText());
            employee.setAddress(view.getjTextFieldAddress().getText());
            employee.setEmail(view.getjTextFieldEmail().getText());
            employee.setEmployeeId(view.getjTextFieldEmpId().getText());
            employee.setGender((String) view.getjComboBoxGender().getSelectedItem());
            employee.setAccountNumber(view.getjTextFieldAccNo().getText());
            employee.setNotificationMeth("Email" /*view.getjComboBoxNotificationMeth().getSelectedItem()*/);
            employee.setSalaryClass(view.getjTextFieldSalClass().getText());
            if (!"".equals(view.getjTextBasicSalary().getText())) {
                employee.setBasicSalary(view.getjTextBasicSalary().getText());
            } else {
                throw new Exception("Basic Salary cannot left blank!!!");
            }
            employee.setTax(view.getjTextFieldTax().getText());
            employee.setMobile(view.getjTextFieldMobile().getText());
            employee.setDivision(view.getjTextFieldDivision().getText());
            Employee e = employeeModel.getEmployee(employee.getEmployeeId());
            if (e != null) {
                employeeModel.editEmployee(employee);
                JOptionPane.showMessageDialog(null, "Update Employee");
            } else {

                employeeModel.addEmployee(employee);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void viewEmloyee() {
        Employee person;
        int row = -1;
        row = view.getjTableSearch().getSelectedRow();
        if (row > -1) {
            String employeeid = view.getjTableSearch().getModel().getValueAt(row, 0) + "";
            person = employeeModel.getEmployee(employeeid);
            view.getjTextFieldName().setText(person.getName());
            view.getjTextFieldDesignation().setText(person.getDesignation());
            view.getjTextFieldAccNo().setText(person.getAccountNumber());
            view.getjTextFieldAddress().setText(person.getAddress());
            view.getjTextFieldDivision().setText(person.getDivision());
            view.getjTextFieldEmail().setText(person.getEmail());
            view.getjTextFieldEmpId().setText(person.getEmployeeId());
            view.getjTextFieldMobile().setText(person.getMobile());
            view.getjTextFieldNic().setText(person.getNic());

            view.getjTextFieldSalClass().setText(person.getSalaryClass());
            view.getjTextFieldTax().setText(person.getTax());
            view.getjTabbedPane1().setSelectedIndex(1);
        } else {
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }

    public void searchEmployee() {


        ArrayList<ArrayList> data = new ArrayList();
        ResultSet rs = employeeModel.searchEmployee(view.getjTextFieldNameSearch().getText(), view.getjTextFieldEmployeeSearch().getText());

        if (rs == null) {
            return;
        }

        try {
            ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
            int columns = md.getColumnCount();



            while (rs.next()) {
                ArrayList row = new ArrayList(columns);
                for (int i = 1; i <= columns; i++) {
                    row.add(rs.getObject(i));
                }

                data.add(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        updatetable(data);
    }

    public final void updatetable(ArrayList<ArrayList> data) {
        DefaultTableModel dft = (DefaultTableModel) view.getjTableSearch().getModel();
        dft.setRowCount(0);


        for (int i = 0; i < data.size(); i++) {
            Object o[] = new Object[4];
            o[0] = data.get(i).get(0);
            o[1] = data.get(i).get(1);
            o[2] = data.get(i).get(2);
            o[3] = data.get(i).get(8);
            dft.addRow(o);
        }
    }

    public void clear() {
        view.getjTextFieldName().setText("");
        view.getjTextFieldNic().setText("");
        view.getjTextFieldDesignation().setText("");
        view.getjTextFieldAddress().setText("");
        view.getjTextFieldEmail().setText("");
        view.getjTextFieldAccNo().setText("");
        view.getjTextFieldSalClass().setText("");
        view.getjTextFieldTax().setText("");
        view.getjTextFieldEmpId().setText("");
        view.getjTextFieldMobile().setText("");
        view.getjTextFieldDivision().setText("");
        view.getjTextBasicSalary().setText("");
        view.getjTextFieldEmpId().setText((employeeModel.getLast() + 1) + "");

    }

    public void deleteEmployee() {
        Employee e = new Employee();
        e.setEmployeeId(view.getjTextFieldEmpId().getText());
        employeeModel.delete(e);
    }
}
