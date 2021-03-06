    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Antrian;
import Database.Entity.Pembayaran;
import Database.Entity.USG;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Arlin
 */
public interface USGService extends Remote {

    void insertUSG(USG usg) throws RemoteException;

//    void updateUSG(USG usg) throws RemoteException;
//
//    void deleteUSG(String Id_USG) throws RemoteException;
    USG getUSG(String Id_USG) throws RemoteException;

    List<USG> getUSG() throws RemoteException;

    //-----Pembayaran-----//
    String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException;

    Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException;

    void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idTransaksiUSG, int Harga) throws RemoteException;

    String getAutoNumberDariPembayaran() throws RemoteException;

    void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idTransaksiUSG, int Harga) throws RemoteException;

    Antrian Id_pasien(Antrian antrian)throws RemoteException;
    String Id_usg()throws RemoteException;
    void ubahstatus(String ID_ANTRIAN)throws RemoteException;
    String Nama_pasien(String id_pasien) throws RemoteException;
}
