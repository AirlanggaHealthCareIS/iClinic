/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

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
 * @author Tiara Ratna Sari
 */
public interface DokterService extends Remote {

    Rekam_Medis insertRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException;

    Tindakan_detailTindakan insertDetailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException;

    Tindakan_detailTindakan getDetailTindakan(String No_Detail) throws RemoteException;

    List<Tindakan_detailTindakan> getDetailTindakan() throws RemoteException;

    void updateRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException;

    void deleteRekam_Medis(String Id_Rekam) throws RemoteException;

    Rekam_Medis getRekam_Medis(String Id_Rekam) throws RemoteException;

    List<Rekam_Medis> getRekam_Medis() throws RemoteException;

    //-----------------//
//        List getNamaBarangDetailTB() throws RemoteException;
//        String getIdBarangDetailTB(String namaBarang) throws RemoteException;
    List getNamaDiagnosa() throws RemoteException;

    String getIdDiagnosa(String namaDiagnosa) throws RemoteException;

//    List getAntrian() throws RemoteException;
//    
//---------------------------//    
    //---------------------//
    List getNamaTindakan() throws RemoteException;

    String getIdTindakan(String namaTindakan) throws RemoteException;

    List<Rekam_Medis> GetRekam_MedisbyPasien(String idpasien) throws RemoteException;

    String getAutoNumberNoDetail() throws RemoteException;

    String getAutoNumberIdRekam() throws RemoteException;

    int getTarif(String nama_tindakan) throws RemoteException;

    //-----Pembayaran-----//
    String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException;

    Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException;

    void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idRekam, int Harga) throws RemoteException;

}
