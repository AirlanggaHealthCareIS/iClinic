/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Rekam_Medis;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Rekam_MedisService extends Remote {
    Rekam_Medis insertRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException;

    void updateRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException;

    void deleteRekam_Medis(int Id_Rekam) throws RemoteException;

    Rekam_Medis getRekam_Medis(int Id_Rekam) throws RemoteException;

    List<Rekam_Medis> getRekam_Medis() throws RemoteException;
}
