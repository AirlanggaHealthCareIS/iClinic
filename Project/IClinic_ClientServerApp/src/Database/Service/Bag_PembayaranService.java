/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Obat_detailResep;
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

    List<Pembayaran> getPembayaranPrintLk(String idPmbayaran) throws RemoteException;

    List<Pembayaran> getPembayaranPrintPo(String idPmbayaran) throws RemoteException;

    public List<Obat_detailResep> getObat_detailresep(String ID_RESEP) throws RemoteException;

//    List<Obat_detailResepPrint> getObat_detailresepPrint(String ID_RESEP) throws RemoteException;
    Pembayaran MeihatTotalTagihanPembayaran(String ID_PASIEN) throws RemoteException;

    public Pembayaran MeihatTotalTagihanPembelianObat(String Id_Resep) throws RemoteException;

    String updateStatusPembayaran(String ID_PEMBAYARAN, String Status) throws RemoteException;

    String getStatus(String ID_PEMBAYARAN) throws RemoteException;
}
