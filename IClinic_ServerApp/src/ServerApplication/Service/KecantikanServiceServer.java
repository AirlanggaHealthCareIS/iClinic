/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Kecantikan_detailLayanan;
import Database.Entity.Kecantikan_transaksiLayanan;
import Database.Service.KecantikanService;
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
public class KecantikanServiceServer extends UnicastRemoteObject implements KecantikanService{

    public KecantikanServiceServer() throws RemoteException {
    }

    public Kecantikan_detailLayanan insertKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Detail Layanan Kecantikan");
        return detail_layanan;
    }

    public void updateKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Detail Layanan Kecantikan");

    }

    public void deleteKecantikan_detailLayanan(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Detail Layanan Kecantikan");

    }

    public Kecantikan_detailLayanan getKecantikan_detailLayanan(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Layanan Kecantikan");

        Kecantikan_detailLayanan detail_layanan = null;
        return detail_layanan;
    }

    public List<Kecantikan_detailLayanan> getKecantikan_detailLayanan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Layanan Kecantikan");

        List<Kecantikan_detailLayanan> list = new ArrayList<Kecantikan_detailLayanan>();
        return list;
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
