/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Rekam_Medis;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface Rekam_MedisService extends Remote{
    List<Rekam_Medis> GetRekamMedikbyPasien (String idpasien) throws RemoteException;
}
