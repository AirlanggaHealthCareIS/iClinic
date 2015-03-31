/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Penyakit_diagnosa;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Penyakit_diagnosaService extends Remote {
    Penyakit_diagnosa insertPenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException;

    void updatePenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException;

    void deletePenyakit_diagnosa(int Id_Diagnosa) throws RemoteException;

    Penyakit_diagnosa getPenyakit_diagnosa(int Id_Diagnosa) throws RemoteException;

    List<Penyakit_diagnosa> getPenyakit_diagnosa() throws RemoteException;

}
