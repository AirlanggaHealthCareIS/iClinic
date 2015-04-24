/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Kecantikan_detailLayanan;
import Database.Entity.Kecantikan_tabelMaster;
import Database.Entity.Kecantikan_transaksiLayanan;
import Database.Entity.Pembayaran;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ayundhapus
 */
public interface KecantikanService extends Remote {

    List<Kecantikan_tabelMaster> getLayananKecantikan() throws RemoteException;

    Kecantikan_detailLayanan insertKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException;

    void updateKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException;

    void deleteKecantikan_detailLayanan(int Id_Det_Kesehatan) throws RemoteException;

    Kecantikan_detailLayanan getKecantikan_detailLayanan(int Id_Det_Kesehatan) throws RemoteException;

    List<Kecantikan_detailLayanan> getKecantikan_detailLayanan() throws RemoteException;

    Kecantikan_transaksiLayanan insertKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException;

    void updateKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException;

    void deleteKecantikan_transaksiLayanan(int Id_Transaksi_Layanan) throws RemoteException;

    Kecantikan_transaksiLayanan getKecantikan_transaksiLayanan(int Id_Transaksi_Layanan) throws RemoteException;

    List<Kecantikan_transaksiLayanan> getKecantikan_transaksiLayanan() throws RemoteException;

    //-----Pembayaran-----//
    String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException;

    Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException;

    void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idRekam, int Harga) throws RemoteException;

}
