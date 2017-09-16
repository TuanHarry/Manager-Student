/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuan Tran
 */
public class ConnectDB {
    Connection conn;
    // connect to database
    public ConnectDB() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
            System.out.println("Connected");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnectMySQL(){
        return this.conn;
    }
}
