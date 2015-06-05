/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication;

import Database.Service.AdministratorService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Madridista
 */
public class databasehelper {
    private static Connection connection;
    
    static Registry registry;
    static AdministratorService service;
    static FormLogin logForm;
    static String ipServer = "";
    static BufferedReader br;
    static File file = new File("ipserver.txt");

    public static Connection getConnection() throws RemoteException {
        try {
            if (file.exists()) {
                br = new BufferedReader(new FileReader(file));
                ipServer = br.readLine();
                registry = LocateRegistry.getRegistry(ipServer, 6789);
                service = (AdministratorService) registry.lookup("service");
                logForm = new FormLogin(service, ipServer);
                logForm.setVisible(true);
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(NotBoundException e){
            e.printStackTrace();
        }
        String connectTo = "jdbc:mysql://" + ipServer + ":3306/klinik2";
        if(connection == null){
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = DriverManager.getConnection(connectTo,"root","");
            } catch (SQLException ex) {
                Logger.getLogger(databasehelper.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        return connection;
    }
}
