/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.AdjustmentDetails;
import Entity.Adjustments;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandujith
 */
public class AdjustmentDetailsModel {

    public void insert(AdjustmentDetails adjustments) {
        try {
            Connection con = DBConnection.initConnection();
            String sql = "";
            con.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void update(AdjustmentDetails adjustments) {
        try {
            Connection con = DBConnection.initConnection();
            String sql = "";
            con.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(AdjustmentDetails adjustments) {
        try {
            Connection con = DBConnection.initConnection();
            String sql = "";
            con.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public AdjustmentDetails get(String code) {
        AdjustmentDetails adjustmentDetails = null;
        try {
            Connection con = DBConnection.initConnection();
            String sql = "SELECT * FROM AdjustmentDetails WHERE code = '" + code + "'";
            ResultSet rs = con.createStatement().executeQuery(sql);
            if (rs.next()) {
                adjustmentDetails = new AdjustmentDetails();
                adjustmentDetails.setCode(rs.getString("code"));
                adjustmentDetails.setDescription(rs.getString("description"));
                adjustmentDetails.setTaxable((rs.getInt("taxable") == 1 ? true : false));

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return adjustmentDetails;
    }

    public ArrayList<AdjustmentDetails> getAll() {
        ArrayList<AdjustmentDetails> adjustments = new ArrayList<AdjustmentDetails>();

        try {
            String sql = "SELECT * FROM AdjustmentDetails";
            Connection con = DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                AdjustmentDetails adjustmentDetails = new AdjustmentDetails();
                adjustmentDetails.setCode(rs.getString("code"));
                adjustmentDetails.setDescription(rs.getString("description"));
                adjustmentDetails.setTaxable((rs.getInt("taxable") == 1 ? true : false));
                adjustments.add(adjustmentDetails);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return adjustments;
    }
}
