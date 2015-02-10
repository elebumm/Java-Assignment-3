/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credentials;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lewismenelaws
 */
public class Credentials {
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("gator3119.hostgator.com");
            String db = "rbp_cpro";
            String user = "rbp_cprouser";
            String pass = "P@ssw0rd";
            conn = DriverManager.getConnection(db, user, pass);
        }
        catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(Credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
}
