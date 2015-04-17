/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

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
    
    
    List getNamaDetail() throws RemoteException;
    
    String getIdDetail(String namaDetail) throws RemoteException;

    List<Rekam_Medis> GetRekam_MedisbyPasien(String idpasien) throws RemoteException;
}
