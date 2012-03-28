/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    
    public static Connection initConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/Pay",
                    "root",
                    "123");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
