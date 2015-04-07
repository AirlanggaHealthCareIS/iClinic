/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.USG;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface USGService extends Remote {
    USG insertUSG(USG usg) throws RemoteException;

    void updateUSG(USG usg) throws RemoteException;

    void deleteUSG(int Id_USG) throws RemoteException;

    USG getUSG(int Id_USG) throws RemoteException;

    List<USG> getUSG() throws RemoteException;
}
