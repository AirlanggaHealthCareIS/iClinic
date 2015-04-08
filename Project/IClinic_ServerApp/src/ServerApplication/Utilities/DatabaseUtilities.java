/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Madridista
 */
public class DatabaseUtilities {
    private static Connection connection;

    public static Connection getConnection() {
       if(connection == null){
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/klinik2","root","");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        return connection;
    }


}