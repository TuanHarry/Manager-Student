/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuan Tran
 */
public class QuanLyDiem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Login().setVisible(true);
        
    }
    //private Connection conn;
   
}
