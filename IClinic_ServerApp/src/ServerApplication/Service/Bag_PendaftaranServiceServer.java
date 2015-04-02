/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Pasien;
import Database.Service.Bag_PendaftaranService;
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
public class Bag_PendaftaranServiceServer extends UnicastRemoteObject implements Bag_PendaftaranService {

    public Bag_PendaftaranServiceServer() throws RemoteException {
    }
    
    public Pasien insertPasien(Pasien pasien) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Pasien");
        return pasien;
    }

    public void updatePasien(Pasien pasien) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Pasien");
    }

    public void deletePasien(int Id_Pasien) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Pasien");
    }

    public Pasien getPasien(int Id_Pasien) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pasien");
        Pasien pasien = null;
        return pasien;
    }

    public List<Pasien> getPasien() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Pasien");
        List<Pasien> list = new ArrayList<Pasien>();
        return list;
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
