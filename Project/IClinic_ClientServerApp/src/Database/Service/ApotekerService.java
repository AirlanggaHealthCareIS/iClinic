/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Obat_tabelMaster;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Rindu Puspita
 */
public interface ApotekerService extends Remote {
    Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException;

    void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException;

    void deleteObat_tabelMaster(int Id_Obat) throws RemoteException;

    Obat_tabelMaster getObat_tabelMaster(int Id_Obat) throws RemoteException;

    List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException;
    
    Obat_detailResep insertObat_detailResep(Obat_detailResep detail_resep) throws RemoteException;

    void updateObat_detailResep(Obat_detailResep detail_resep) throws RemoteException;

    void deleteObat_detailResep(int No_Detail_Resep) throws RemoteException;

    Obat_detailResep getObat_detailResep(int No_Detail_Resep) throws RemoteException;

    List<Obat_detailResep> getObat_detailResep(String ID_RESEP) throws RemoteException;

    Obat_resep insertObat_resep(Obat_resep obat) throws RemoteException;

    void updateObat_resep(Obat_resep obat) throws RemoteException;

    void deleteObat_resep(int Id_Resep) throws RemoteException;

    Obat_resep getObat_resep(int Id_Resep) throws RemoteException;

    List<Obat_resep> getObat_resep() throws RemoteException;
    
    List getNamaObat () throws RemoteException;
    
    String getIdObat (String namaObat) throws RemoteException;
    
   List getTakaran () throws RemoteException;
   
   String getIdTakaran(String takaran) throws RemoteException;
   
   List getPemakaian() throws RemoteException;
   
   String getIdPemakaian(String pemakaian) throws RemoteException;
   
   int getHargaObat(String namaobat) throws RemoteException;
  
}
