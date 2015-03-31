/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Kecantikan_transaksiLayanan;
import Database.Service.Kecantikan_transaksiLayananService;
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
public class Kecantikan_transaksiLayananServiceServer extends UnicastRemoteObject implements Kecantikan_transaksiLayananService{

    public Kecantikan_transaksiLayananServiceServer() throws RemoteException {
    }

    public Kecantikan_transaksiLayanan insertKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Transaksi Layanan Kesehatan");
        return transaksi_layanan;
    }

    public void updateKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Transaksi Layanan Kesehatan");

    }

    public void deleteKecantikan_transaksiLayanan(int Id_Transaksi_Layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Transaksi Layanan Kesehatan");

    }

    public Kecantikan_transaksiLayanan getKecantikan_transaksiLayanan(int Id_Transaksi_Layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Transaksi Layanan Kesehatan");

        Kecantikan_transaksiLayanan transaksi_layanan = null;
        return transaksi_layanan;
    }

    public List<Kecantikan_transaksiLayanan> getKecantikan_transaksiLayanan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Transaksi Layanan Kesehatan");

        List<Kecantikan_transaksiLayanan> list = new ArrayList<Kecantikan_transaksiLayanan>();
        return list;
    }

}
