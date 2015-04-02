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

    void deleteRekam_Medis(int Id_Rekam) throws RemoteException;

    Rekam_Medis getRekam_Medis(int Id_Rekam) throws RemoteException;

    List<Rekam_Medis> getRekam_Medis() throws RemoteException;
    
    Penyakit_tabelMaster insertPenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException;

    void updatePenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException;

    void deletePenyakit_tabelMaster(int Id_Penyakit) throws RemoteException;

    Penyakit_tabelMaster getPenyakit_tabelMaster(int Id_Penyakit) throws RemoteException;

    List<Penyakit_tabelMaster> getPenyakit_tabelMaster() throws RemoteException;
    
    Penyakit_diagnosa insertPenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException;

    void updatePenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException;

    void deletePenyakit_diagnosa(int Id_Diagnosa) throws RemoteException;

    Penyakit_diagnosa getPenyakit_diagnosa(int Id_Diagnosa) throws RemoteException;

    List<Penyakit_diagnosa> getPenyakit_diagnosa() throws RemoteException;
    
    Tindakan_tabelMaster insertTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException;

    void updateTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException;

    void deleteTindakan_tabelMaster(int Id_Tindakan) throws RemoteException;

    Tindakan_tabelMaster getTindakan_tabelMaster(int Id_Tindakan) throws RemoteException;

    List<Tindakan_tabelMaster> getTindakan_tabelMaster() throws RemoteException;
    
    Tindakan_detailTindakan insertTindakan_detailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException;

    void updateTindakan_detailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException;

    void deleteTindakan_detailTindakan(int No_Detail) throws RemoteException;

    Tindakan_detailTindakan getTindakan_detailTindakan(int No_Detail) throws RemoteException;

    List<Tindakan_detailTindakan> getTindakan_detailTindakan() throws RemoteException;
    
    
}
