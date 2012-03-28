/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Adjustments;
import Entity.Salary;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandujith
 */
public class AdjustmentsModel {

    public void insert(Adjustments adjustment) {
        try {
            String sql = "INSERT INTO Adjustments (salaryId, code, amount) VALUES ('"
                    + adjustment.getSalaryId() + "', '" + adjustment.getCode() + "','" + adjustment.getAmount() + "')";
            Connection con = DBConnection.initConnection();
            con.createStatement().executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void update(Adjustments adjustments) {
        try {
            String sql = "UPDATE Adjustments SET amount = '" + adjustments.getAmount()
                    + "' WHERE SalaryID = '" + adjustments.getSalaryId()
                    + "' AND code = '" + adjustments.getCode() + "'";
            Connection con = DBConnection.initConnection();
            con.createStatement().executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Adjustments getAdjustment(int SalaryId, String code) {
        Adjustments adjustments = null;
        try {
            String sql = "SELECT * FROM Adjustments WHERE SalaryId = '" + SalaryId + "' AND code='"
                    + code + "'";
            Connection con = DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);
            if (rs.next()) {
                adjustments = new Adjustments();
                adjustments.setAmount(rs.getDouble("amount"));
                adjustments.setCode(rs.getString("code"));
                adjustments.setSalaryId(rs.getInt("salaryId"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return adjustments;
    }

    public ArrayList<Adjustments> getAllForSalary(int SalaryId) {
        ArrayList<Adjustments> adjustmentses = new ArrayList<Adjustments>();
        try {
            String sql = "SELECT * FROM Adjustments WHERE SalaryId = '" + SalaryId + "'";
            Connection con = DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);
            if (rs.next()) {
                Adjustments adjustments = new Adjustments();
                adjustments.setAmount(rs.getDouble("amount"));
                adjustments.setCode(rs.getString("code"));
                adjustments.setSalaryId(rs.getInt("salaryId"));
                adjustmentses.add(adjustments);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return adjustmentses;
    }

    public void delete(int SalaryId, String code) {
        try {
            String sql = "DELETE FROM Adjustments WHERE SalaryId = '" 
                    + SalaryId + "' AND code = '" + code + "'";
            Connection con = DBConnection.initConnection();
            con.createStatement().executeUpdate(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
