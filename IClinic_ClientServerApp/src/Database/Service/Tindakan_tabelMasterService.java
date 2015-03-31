/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Tindakan_tabelMaster;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Tindakan_tabelMasterService extends Remote {
    Tindakan_tabelMaster insertTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException;

    void updateTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException;

    void deleteTindakan_tabelMaster(int Id_Tindakan) throws RemoteException;

    Tindakan_tabelMaster getTindakan_tabelMaster(int Id_Tindakan) throws RemoteException;

    List<Tindakan_tabelMaster> getTindakan_tabelMaster() throws RemoteException;
}
