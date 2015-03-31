/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Obat_resep;
import Database.Service.Obat_resepService;
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
public class Obat_resepServiceServer extends UnicastRemoteObject implements Obat_resepService{

    public Obat_resepServiceServer() throws RemoteException {
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
