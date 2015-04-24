/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Lab_detailLab;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Pembayaran;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author erin
 */
public interface LabService extends Remote {

    Lab_detailLab insertLab_detailLab(Lab_detailLab detail_lab) throws RemoteException;

//    void updateLab_detailLab(Lab_detailLab detail_lab) throws RemoteException;
//
//    void deleteLab_detailLab(String Id_Detail_Lab) throws RemoteException;
    Lab_detailLab getLab_detailLab(String Id_Detail_Lab) throws RemoteException;

    List<Lab_detailLab> getLab_detailLab() throws RemoteException;

//    Lab_tabelMaster insertLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException;
//    void updateLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException;
//
//    void deleteLab_tabelMaster(String Id_Lab) throws RemoteException;
//    Lab_tabelMaster getLab_tabelMaster(String Id_Lab) throws RemoteException;
//    List<Lab_tabelMaster> getLab_tabelMaster() throws RemoteException;
    
    //-----Pembayaran-----//
    String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException;
    
    Pembayaran getPembayaranDariPembayaran (String idPembayaran)throws RemoteException;
    
    void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idDetailLab, int Harga) throws RemoteException;

}
