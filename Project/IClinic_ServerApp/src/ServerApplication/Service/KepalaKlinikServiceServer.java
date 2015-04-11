/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Obat_detailResep;
import Database.Entity.Pasien;
import Database.Entity.Pembayaran;
import Database.Service.Kepala_KlinikService;
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
public class KepalaKlinikServiceServer extends UnicastRemoteObject implements Kepala_KlinikService {

    public KepalaKlinikServiceServer() throws RemoteException {
    }

    public Pembayaran getPembayaran(int Id_Pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");
        PreparedStatement statement = null; 
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM pembayaran WHERE ID_PEMBAYARAN = ?");

            ResultSet result = statement.executeQuery();

            Pembayaran pembayaran = null;

            if(result.next()){
                pembayaran = new Pembayaran();
                pembayaran.setId_Pembayaran(result.getString("Id_Pembayaran"));
                pembayaran.setId_USG(result.getString("Id_USG"));
                pembayaran.setId_Detail_Lab(result.getString("Id_Detail_Lab"));
                pembayaran.setId_Resep(result.getString("Id_Resep"));
                pembayaran.setId_Rekam(result.getString("Id_Rekam"));
                pembayaran.setId_Transaksi_Layanan(result.getString("Id_Transaksi_Layanan"));
                pembayaran.setTanggal_Bayar(result.getDate("Tanggal_Bayar"));
                pembayaran.setTotal_Harga(result.getInt("Total_Harga"));
                pembayaran.setStatus(result.getString("Status"));
            }
            
        return pembayaran;
    }catch(SQLException exception){
          exception.printStackTrace();
          return null;
        }finally{
            if(statement != null){
                try{
                    statement.close();
                }catch(SQLException exception){
                   exception.printStackTrace();
                }
            }
        }
    }

    public List<Pembayaran> getPembayaran() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Pembayaran");
        List<Pembayaran> list = new ArrayList<Pembayaran>();
        return list;
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
