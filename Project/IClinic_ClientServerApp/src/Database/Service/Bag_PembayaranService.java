/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Pembayaran;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Bag_PembayaranService extends Remote {
    Pembayaran insertPembayaran(Pembayaran pembayaran) throws RemoteException;

    void updatePembayaran(Pembayaran pembayaran) throws RemoteException;

    void deletePembayaran(String Id_Pembayaran) throws RemoteException;

    Pembayaran getPembayaran(String Id_Pembayaran) throws RemoteException;

    List<Pembayaran> getPembayaran() throws RemoteException;
    
    Pembayaran MeihatTotalTagihanPembayaran(String Id_Pasien,Date tanggal) throws RemoteException;
    
    void updateStatusPembayaran(String Id_Pembayaran, String Status) throws RemoteException;
    
    String getStatus(String Id_Pembayaran) throws RemoteException;
}
