/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Service.AntrianService;
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
public class AntrianServiceServer extends UnicastRemoteObject implements AntrianService {

    public AntrianServiceServer() throws RemoteException {
    }

    public Antrian insertAntrian(Antrian antrian) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Antrian");
        return antrian;
       
    }

    public void updateAntrian(Antrian antrian) throws RemoteException {
       
        System.out.println("Client Melakukan Proses Update pada Tabel Antrian");

    }

    public void deleteAntrian(int Id_Antrian) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Antrian");

    }

    public Antrian getAntrian(int Id_Antrian) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Antrian");
        Antrian antrian = null;
        return antrian;

    }

    public List<Antrian> getAntrian() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Antrian");
        List<Antrian> list = new ArrayList<Antrian>();
        return list;

    }

}
