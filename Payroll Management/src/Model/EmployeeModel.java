/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EmployeeModel {

    public void addEmployee(Employee e) {
        java.sql.Connection con = DBConnection.initConnection();
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate("INSERT INTO employees ( EmployeeID,Name,Designation,Gender, NIC,Address,Email, Mobile,Division,  SalaryClass,BasicSalary,AccountNumber, TaxRate,NotificationMethod)" + " VALUES" + "('"
                    + e.getEmployeeId() + "', '"
                    + e.getName() + "', '"
                    + e.getDesignation() + "', '"
                    + e.getGender() + "', '"
                    + e.getNic() + "', '"
                    + e.getAddress() + "', '"
                    + e.getEmail() + "', '"
                    + e.getMobile() + "', '"
                    + e.getDivision() + "', '"
                    + e.getSalaryClass() + "', '"
                    + e.getBasicsalary() + "', '"
                    + e.getAccountNumber() + "', '"
                    + e.getTax() + "', '"
                    + e.getNotificationMeth() + "')");
            JOptionPane.showMessageDialog(null, "Employee added Sucessfully");
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }

    public void editEmployee(Employee e) {
//Name, EmployeeID, NIC, Designation, Gender, Address, Email, Mobile, Division, SalaryClass, AccountNumber, NotificationMethod, Tax
        java.sql.Connection con = DBConnection.initConnection();
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate("UPDATE employees SET "
                    + "EmployeeID = '" + e.getEmployeeId() + "', "
                    + "Name = '" + e.getName() + "', "
                    + "NIC = '" + e.getNic() + "', "
                    + "Designation = '" + e.getDesignation() + "', "
                    + "Gender = '" + e.getGender() + "', "
                    + "Address = '" + e.getAddress() + "', "
                    + "Email = '" + e.getEmail() + "', "
                    + "Mobile = '" + e.getMobile() + "', "
                    + "Division = '" + e.getDivision() + "', "
                    + "SalaryClass = '" + e.getSalaryClass() + "', "
                    + "AccountNumber = '" + e.getAccountNumber() + "', "
                    + "BasicSalary= '" + e.getBasicsalary() + "', "
                    + "NotificationMethod = '" + e.getNotificationMeth() + "', "
                    + "Tax = '" + e.getTax() + "' WHERE id='" + e.getEmployeeId() + "'");
            JOptionPane.showMessageDialog(null, "Employee added Sucessfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public Employee getEmployee(String id) {
        Employee employee = null;
        java.sql.Connection con = DBConnection.initConnection();
        try {
            Statement statement = con.createStatement();
            statement.executeQuery("SELECT * FROM employees WHERE EmployeeID='" 
                    + Integer.parseInt(id) + "'");
            ResultSet rs = statement.getResultSet();
            if (rs.next()) {
                employee = new Employee();
                employee.setName(rs.getString("Name"));
                employee.setEmployeeId(rs.getString("EmployeeID"));
                employee.setNic(rs.getString("NIC"));
                employee.setDesignation(rs.getString("Designation"));
                employee.setGender(rs.getString("Gender"));
                employee.setAddress(rs.getString("Address"));
                employee.setEmail(rs.getString("Email"));
                employee.setMobile(rs.getString("Mobile"));
                employee.setDivision(rs.getString("Division"));
                employee.setSalaryClass(rs.getString("SalaryClass"));
                employee.setBasicSalary(rs.getString("Basicsalary"));
                employee.setAccountNumber(rs.getString("AccountNumber"));
                employee.setNotificationMeth(rs.getString("NotificationMethod"));
                employee.setTax(rs.getString("TaxRate"));
                rs.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return employee;
    }

    public static ResultSet searchEmployee(String name, String id) {

        java.sql.Connection con = DBConnection.initConnection();
        ResultSet rs = null;

        try {
            Statement statement = con.createStatement();
            if (id.equals("") && name.equals("")) {
                statement.executeQuery("SELECT * FROM employees ORDER BY name");
            } else if (id.equals("")) {
                statement.executeQuery("SELECT * FROM employees WHERE Name REGEXP '(" + name + ")' ");
            } else {
                statement.executeQuery("SELECT * FROM employees WHERE EmployeeId REGEXP '(" + id + ")'");

            }

            rs = statement.getResultSet();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return rs;
    }

    public int getLast() {
        int id = 0;
        java.sql.Connection con = DBConnection.initConnection();


        try {
            Statement statement = con.createStatement();
            statement.executeQuery("SELECT MAX(employeeID) FROM employees");
            ResultSet rs = statement.getResultSet();
            if (rs.next()) {
                id = rs.getInt(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return id;
    }

    public void delete(Employee employee) {
        java.sql.Connection con = DBConnection.initConnection();
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate("DELETE * FROM employees WHERE EmployeeID='" + employee.getEmployeeId() + "'");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
