/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Obat_tabelMaster;
import Database.Entity.Pembayaran;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Rindu Puspita
 */
public interface ApotekerService extends Remote {

    Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException;

    void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException;

    void deleteObat_tabelMaster(int Id_Obat) throws RemoteException;

    Obat_tabelMaster getObat_tabelMaster(int Id_Obat) throws RemoteException;

    List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException;

    Obat_detailResep insertObat_detailResep(Obat_detailResep detail_resep) throws RemoteException;

    void updateObat_detailResep(Obat_detailResep detail_resep) throws RemoteException;

    void deleteObat_detailResep(String No_Detail_Resep) throws RemoteException;

    Obat_detailResep getObat_detailResep(String Id_Obat) throws RemoteException;

    List<Obat_detailResep> getObat_detailresep(String ID_RESEP) throws RemoteException;

    Obat_resep insertObat_resep(Obat_resep obat) throws RemoteException;

    void updateObat_resep(Obat_resep obat) throws RemoteException;

    void deleteObat_resep(int Id_Resep) throws RemoteException;

    Obat_resep getObat_resep(int Id_Resep) throws RemoteException;

    List<Obat_resep> getObat_resep() throws RemoteException;

    List getNamaObat() throws RemoteException;

    String getIdObat(String namaObat) throws RemoteException;

    List getTakaran() throws RemoteException;

    String getIdTakaran(String takaran) throws RemoteException;

    List getPemakaian() throws RemoteException;

    String getIdPemakaian(String pemakaian) throws RemoteException;

    int getHargaObat(String namaobat) throws RemoteException;
    
    String getAutoNumberDariObat_detailResep() throws RemoteException;
    
    String getAutoNumberDariResep() throws RemoteException;
    
    void updateResep(Obat_resep resep, String ID_RESEP, int TOTAL_HARGA) throws RemoteException;

    //-----Pembayaran-----//
    String mencariIdPasienDariPembayaran(String idResep) throws RemoteException;

    String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException;

    Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException;

    void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idResep, int Harga) throws RemoteException;

    String getAutoNumberDariPembayaran() throws RemoteException;

    void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idResep, int Harga) throws RemoteException;

}
