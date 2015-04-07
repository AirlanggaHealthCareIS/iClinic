/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Obat_tabelMaster;
import Database.Service.ApotekerService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
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
public class ApotekerServiceServer extends UnicastRemoteObject implements ApotekerService{

    public ApotekerServiceServer() throws RemoteException {
    }

    public Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Obat");
        return obat;
    }

    public void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Obat");

    }

    public void deleteObat_tabelMaster(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Obat");

    }

    public Obat_tabelMaster getObat_tabelMaster(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Obat");

        Obat_tabelMaster obat = null;
        return obat;
    }

    public List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Obat");

        List<Obat_tabelMaster> list = new ArrayList<Obat_tabelMaster>();
        return list;
    }
    
    public Obat_detailResep insertObat_detailResep(Obat_detailResep detail_resep) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Detail Resep");
        return detail_resep;
    }

    public void updateObat_detailResep(Obat_detailResep detail_resep) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Detail Resep");

    }

    public void deleteObat_detailResep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Detail Resep");

    }

    public Obat_detailResep getObat_detailResep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Resep");

        Obat_detailResep detail_resep = null;
        return detail_resep;
    }

    public List<Obat_detailResep> getObat_detailResep() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Resep");

        List<Obat_detailResep> list = new ArrayList<Obat_detailResep>();
        return list;
    }
    
    public Obat_resep insertObat_resep(Obat_resep resep) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Obat");
        return resep;
    }

    public void updateObat_resep(Obat_resep resep) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Obat");

    }

    public void deleteObat_resep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Obat");

    }

    public Obat_resep getObat_resep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Obat");

        Obat_resep resep = null;
        return resep;
    }

    public List<Obat_resep> getObat_resep() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Obat");

        List<Obat_resep> list = new ArrayList<Obat_resep>();
        return list;
    }
}
