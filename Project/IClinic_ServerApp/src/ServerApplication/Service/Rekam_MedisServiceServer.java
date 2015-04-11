/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Rekam_Medis;
import Database.Service.Rekam_MedisService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Rekam_MedisServiceServer extends UnicastRemoteObject implements Rekam_MedisService{

    public Rekam_MedisServiceServer() throws RemoteException {
    }

    public List<Rekam_Medis> GetRekamMedikbyPasien(String idpasien) throws RemoteException {
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM rekam_medis WHERE ID_PASIEN = ?");
            statement.setString(1, idpasien);
            ResultSet result = statement.executeQuery();
            List<Rekam_Medis> rms = new ArrayList<Rekam_Medis>();
            if(result.next()){
                Rekam_Medis rm = new Rekam_Medis();
                rm.setId_Rekam(result.getInt("ID_REKAM"));
                rm.setId_Diagnosa(result.getInt("ID_DIAGNOSA"));
                rm.setNo_Detail(result.getInt("NO_DETAIL"));
                rm.setTgl_Rekam(result.getDate("TGL_REKAM"));
                rm.setTinggi(result.getInt("TINGGI"));
                rm.setBerat(result.getInt("BERAT"));
                rm.setTekanan_Darah(result.getInt("TEKANAN_DARAH"));
                //rm.setHasil_Pemerikasaan(result.getLong("HASIL_PEMERIKSAAN"));
                rm.setAlergi(result.getString("ALERGI"));
                rm.setTotal_Harga(result.getInt("TOTAL_HARGA"));
                rm.setLayanan_Tambahan(result.getString("LAYANAN_TAMBAHAN"));
                rms.add(rm);
            }
            return rms;
        } catch (SQLException exception){
            System.out.println(exception);
            return null;
        } finally{
            if (statement != null){
                try{
                    statement.close();
                } catch(SQLException exception){
                        
                }
            }
        }
        
    }
    
    
}
