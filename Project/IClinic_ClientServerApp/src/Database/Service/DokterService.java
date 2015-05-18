/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Antrian;
import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Pembayaran;
import Database.Entity.Penyakit_diagnosa;
import Database.Entity.Penyakit_tabelMaster;
import Database.Entity.Rekam_Medis;
import Database.Entity.Tindakan_detailTindakan;
import Database.Entity.Tindakan_tabelMaster;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Afifah, piudt, Ayundha
 */
public interface DokterService extends Remote {

    Rekam_Medis insertRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException;

    Tindakan_detailTindakan insertDetailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException;

    Tindakan_detailTindakan getDetailTindakan(String No_Detail) throws RemoteException;

    List<Tindakan_detailTindakan> getDetailTindakanById(String ID_Rekam) throws RemoteException;

    void updateRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException;

    void deleteRekam_Medis(String Id_Rekam) throws RemoteException;

    Rekam_Medis getRekam_Medis(String Id_Rekam) throws RemoteException;

    List<Rekam_Medis> getRekam_Medis() throws RemoteException;

    List getNamaDiagnosa() throws RemoteException;

    String getIdDiagnosa(String namaDiagnosa) throws RemoteException;

    String getRekamMedisbyID () throws RemoteException;

    Antrian insertAntrian (Antrian antrian) throws RemoteException;
//    List getAntrian() throws RemoteException;

    List getNamaTindakan() throws RemoteException;

    String getIdTindakan(String namaTindakan) throws RemoteException;

    List<Rekam_Medis> GetRekam_MedisbyPasien(String idpasien) throws RemoteException;

    String getAutoNumberNoDetail() throws RemoteException;

    String getAutoNumberIdRekam() throws RemoteException;

    String getAutoNumberAntrian () throws RemoteException;
    
    int getTarif(String nama_tindakan) throws RemoteException;

    //-----Pembayaran-----//
    String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException;

    Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException;

    void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idRekam, int Harga) throws RemoteException;

    String getAutoNumberDariPembayaran() throws RemoteException;

    void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idRekam, int Harga) throws RemoteException;

    //----- Resep -----//
    String getAutoNumberResep() throws RemoteException;
    
    String getAutoNumberDetailResep() throws RemoteException;
    
    Obat_detailResep insertDetailResep(Obat_detailResep detailResep) throws RemoteException;
    
    void updateDetailResep(Obat_detailResep detailResep) throws RemoteException;
    
    void deleteDetailResep(String No_Detail_Resep) throws RemoteException;
    
    List<Obat_detailResep> getAllDetailResepByIDResep(String ID_RESEP) throws RemoteException;
    
    Obat_resep insertResep(Obat_resep resep) throws RemoteException;
    
    List getNamaObat() throws RemoteException;

    int getHargaObat(String namaObat) throws RemoteException;
    
    String getIDObat(String namaObat) throws RemoteException;
    
    void updateResep(Obat_resep resep, String ID_RESEP, int TOTAL_HARGA) throws RemoteException;
    
    String getLastIDRekamMedis() throws RemoteException;
}
