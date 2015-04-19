package Database.Service;

import Database.Entity.Kecantikan_tabelMaster;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Obat_tabelMaster;
import Database.Entity.Penyakit_tabelMaster;
import Database.Entity.Tindakan_tabelMaster;
import Database.Entity.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface AdministratorService extends Remote {
    String loginUser(String Username, String Password) throws RemoteException;
    
    User insertUser(User user) throws RemoteException;

    void updateUser(User user) throws RemoteException;

    void deleteUser(String Id_User) throws RemoteException;

    User getUser(String Id_User) throws RemoteException;

    List<User> getUser() throws RemoteException;
    
    Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException;

    void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException;

    void deleteObat_tabelMaster(String Id_Obat) throws RemoteException;

    Obat_tabelMaster getObat_tabelMaster(String Id_Obat) throws RemoteException;

    List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException;
    
    Penyakit_tabelMaster insertPenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException;

    void updatePenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException;

    void deletePenyakit_tabelMaster(String Id_Penyakit) throws RemoteException;

    Penyakit_tabelMaster getPenyakit_tabelMaster(String Id_Penyakit) throws RemoteException;

    List<Penyakit_tabelMaster> getPenyakit_tabelMaster() throws RemoteException;
    
    Tindakan_tabelMaster insertTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException;

    void updateTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException;

    void deleteTindakan_tabelMaster(String Id_Tindakan) throws RemoteException;

    Tindakan_tabelMaster getTindakan_tabelMaster(String Id_Tindakan) throws RemoteException;

    List<Tindakan_tabelMaster> getTindakan_tabelMaster() throws RemoteException;
    
    Lab_tabelMaster insertLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException;

    void updateLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException;

    void deleteLab_tabelMaster(String Id_Lab) throws RemoteException;

    Lab_tabelMaster getLab_tabelMaster(String Id_Lab) throws RemoteException;

    List<Lab_tabelMaster> getLab_tabelMaster() throws RemoteException;
    
    Kecantikan_tabelMaster insertKecantikan_tabelMaster(Kecantikan_tabelMaster kecantikan) throws RemoteException;

    void updateKecantikan_tabelMaster(Kecantikan_tabelMaster kecantikan) throws RemoteException;

    void deleteKecantikan_tabelMaster(String Id_Kecantikan) throws RemoteException;

    Kecantikan_tabelMaster getKecantikan_tabelMaster(String Id_Kecantikan) throws RemoteException;

    List<Kecantikan_tabelMaster> getKecantikan_tabelMaster() throws RemoteException;


}
