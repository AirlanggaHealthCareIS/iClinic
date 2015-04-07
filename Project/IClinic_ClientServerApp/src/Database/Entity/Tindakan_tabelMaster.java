/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;

/**
 *
 * @author Tiara Ratna Sari
 */
public class Tindakan_tabelMaster implements Serializable{
    private int Id_Tindakan;
    private String Spesialisasi;
    private String Nama_Tindakan;
    private int Tarif;
    private String Keterangan;

    public int getId_Tindakan() {
        return Id_Tindakan;
    }

    public String getSpesialisasi() {
        return Spesialisasi;
    }

    public String getNama_Tindakan() {
        return Nama_Tindakan;
    }

    public int getTarif() {
        return Tarif;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setId_Tindakan(int Id_Tindakan) {
        this.Id_Tindakan = Id_Tindakan;
    }

    public void setSpesialisasi(String Spesialisasi) {
        this.Spesialisasi = Spesialisasi;
    }

    public void setNama_Tindakan(String Nama_Tindakan) {
        this.Nama_Tindakan = Nama_Tindakan;
    }

    public void setTarif(int Tarif) {
        this.Tarif = Tarif;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
