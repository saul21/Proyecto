/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derk
 */
public class cnn {
    Connection conn;
    Statement state;
    ResultSet res;
    
    
    
    
    
    public cnn (){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("","", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cnn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(cnn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
