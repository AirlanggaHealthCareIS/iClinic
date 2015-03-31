/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Penyakit_tabelMaster;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Penyakit_tabelMasterService extends Remote {
    Penyakit_tabelMaster insertPenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException;

    void updatePenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException;

    void deletePenyakit_tabelMaster(int Id_Penyakit) throws RemoteException;

    Penyakit_tabelMaster getPenyakit_tabelMaster(int Id_Penyakit) throws RemoteException;

    List<Penyakit_tabelMaster> getPenyakit_tabelMaster() throws RemoteException;

}
