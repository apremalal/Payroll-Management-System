/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Salary;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandujith
 */
public class SalaryModel {

    public Salary getLastSalary() {
        Salary salary = null;
        try {
            String sql = "SELECT * FROM Salary WHERE SalaryId = (SELECT MAX(SalaryId) FROM "
                    + "Salary)";
            Connection con = DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);
            if (rs.next()) {
                salary = new Salary();
                salary.setEmployeeId(rs.getInt("EmployeeId"));
                salary.setMonth(rs.getInt("month"));
                salary.setSalaryId(rs.getInt("SalaryId"));
                salary.setYear(rs.getInt("year"));
                salary.setAmount(rs.getDouble("Amount"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return salary;
    }

    public void insert(Salary salary) {
        try {
            String sql = "INSERT INTO Salary (SalaryId, EmployeeId, Year, Month, Amount) VALUES ('"
                    + salary.getSalaryId() + "', '" + salary.getEmployeeId() + "','" + salary.getYear() + "'"
                    + ",'" + salary.getMonth() + "','" + salary.getAmount() + "')";
            Connection con = DBConnection.initConnection();
            con.createStatement().executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Salary getSalary(int employeeId, int year, int month) {
        Salary salary = null;
        try {
            String sql = "SELECT * FROM Salary WHERE EmployeeId = '" + employeeId + "' AND Year="
                    + "'" + year + "' AND month = '" + month + "'";
            Connection con = DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);
            if (rs.next()) {
                salary = new Salary();
                salary.setEmployeeId(rs.getInt("EmployeeId"));
                salary.setMonth(rs.getInt("month"));
                salary.setSalaryId(rs.getInt("SalaryId"));
                salary.setYear(rs.getInt("year"));
                salary.setAmount(rs.getDouble("Amount"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return salary;
    }
}
