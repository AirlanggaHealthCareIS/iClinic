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

    void deletePembayaran(String ID_PEMBAYARAN) throws RemoteException;

    Pembayaran getPembayaran(String ID_PEMBAYARAN) throws RemoteException;

    List<Pembayaran> getPembayaran() throws RemoteException;
    
    Pembayaran MeihatTotalTagihanPembayaran(String ID_PASIEN,Date TANGGAL) throws RemoteException;
    
    void updateStatusPembayaran(String ID_PEMBAYARAN, String Status) throws RemoteException;
    
    String getStatus(String ID_PEMBAYARAN) throws RemoteException;
}
