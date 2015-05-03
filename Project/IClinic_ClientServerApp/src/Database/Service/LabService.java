/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Lab_detailLab;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Lab_transaksiLab;
import Database.Entity.Pembayaran;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author erin
 */
public interface LabService extends Remote {

    List<Lab_tabelMaster> getLaboratorium()throws RemoteException;
    
//  Lab_tabelMaster getLab_tabelMaster(String Id_Lab) throws RemoteException;
    
    
    void insertLab_detailLab(Lab_detailLab detail_lab) throws RemoteException;
    
    Lab_detailLab getLab_detailLab(String Id_Detail_Lab) throws RemoteException;
    
    List<Lab_detailLab> getLab_detailLab() throws RemoteException;

    void insertLab_transaksiLab(Lab_transaksiLab transaksi_lab) throws RemoteException;

    void updateLab_transaksiLab (Lab_transaksiLab transaksi_lab) throws RemoteException;

    void deleteLab_transaksiLab (int Id_Transaksi_Lab) throws RemoteException;

    Lab_transaksiLab getLab_transaksiLab(int Id_Transaksi_Lab) throws RemoteException;

    List<Lab_transaksiLab> getLab_transaksiLab() throws RemoteException;
    
    
    //-----Pembayaran-----//
    String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException;
    
    Pembayaran getPembayaranDariPembayaran (String idPembayaran)throws RemoteException;
    
    void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idDetailLab, int Harga) throws RemoteException;

    String getAutoNumberDariPembayaran () throws RemoteException;
    
    void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idDetailLab, int Harga) throws RemoteException;
   
}