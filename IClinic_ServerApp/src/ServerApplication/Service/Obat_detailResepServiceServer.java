/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Obat_detailResep;
import Database.Service.Obat_detailResepService;
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
public class Obat_detailResepServiceServer extends UnicastRemoteObject implements Obat_detailResepService{

    public Obat_detailResepServiceServer() throws RemoteException {
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

}
