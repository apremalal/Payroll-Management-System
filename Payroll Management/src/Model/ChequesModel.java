package Model;

import Entity.Cheques;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ChequesModel {

    public void addCheque(Cheques cheques) {
        java.sql.Connection con = DBConnection.initConnection();
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate("INSERT INTO cheque (ChequeID,EmployeeID,ChequeNo,Amount,Date,Duration,AccountNumber,Branch,Bank)" + " VALUES" + "('"
                    + cheques.getChequeId() + "', '"
                    + cheques.getEmployeeId() + "', '"
                    + cheques.getChequeNo() + "', '"
                    + cheques.getAmount() + "', '"
                    + cheques.getDate() + "', '"
                    + cheques.getEspirationDuration() + "', '"
                    + cheques.getBankAccNo() + "', '"
                    + cheques.getBranch() + "','"
                    + cheques.getBank() + "')");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public ResultSet getCheque(String chequenum) {
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM cheque WHERE ChequeNo = '" + chequenum + "'";
            Connection con = DBConnection.initConnection();
            rs = con.createStatement().executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet getCheques(String employeeid) {
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM cheque WHERE EmployeeID='" + employeeid + "'";
            Connection con = (Connection) DBConnection.initConnection();
            rs = con.createStatement().executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }

    public void deletecheque(Cheques cheque) {
        java.sql.Connection con = DBConnection.initConnection();
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate("DELETE  FROM cheque WHERE ChequeNo='" + cheque.getChequeNo() + "'");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Cheques getCheque(int chequeId) {
        Cheques cheques = null;

        try {
            String sql = "SELECT * FROM cheque WHERE ChequeId='" + chequeId + "'";
            Connection con = (Connection) DBConnection.initConnection();
            ResultSet rs = con.createStatement().executeQuery(sql);
            if (rs.next()) {
                cheques = new Cheques();
                cheques.setAmount(rs.getDouble("amount"));
                cheques.setChequeNo(rs.getString("chequeNO"));
                cheques.setBank(rs.getString("Bank"));
                cheques.setBankAccNo(rs.getString("AccountNumber"));
                cheques.setBranch(rs.getString("Branch"));
                cheques.setChequeId(rs.getInt("ChequeId"));
                cheques.setDate(rs.getDate("Date"));
                cheques.setEmployeeId(rs.getInt("EmployeeId"));
                cheques.setEspirationDuration(rs.getInt("Duration"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cheques;
    }
}
