/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.USG;
import Database.Service.USGService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public class USGServiceServer extends UnicastRemoteObject implements USGService {

    public USGServiceServer() throws RemoteException {
    }

    public USG insertUSG(USG usg) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel USG");
        return usg;
       
    }

    public void updateUSG(USG usg) throws RemoteException {
       
        System.out.println("Client Melakukan Proses Update pada Tabel USG");

    }

    public void deleteUSG(int Id_USG) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel USG");

    }

    public USG getUSG(int Id_USG) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel USG");
        USG usg = null;
        return usg;

    }

    public List<USG> getUSG() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel USG");
        List<USG> list = new ArrayList<USG>();
        return list;

    }

}
