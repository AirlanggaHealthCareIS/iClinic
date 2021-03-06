/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Tiara Ratna Sari
 */
public class Rekam_Medis implements Serializable {

    private String Id_Rekam;
    private String Id_Penyakit;
    private String Id_Pasien;
    private Date Tgl_Rekam;
    private int Tinggi;
    private int Berat;
    private int Tekanan_Darah;
    private String Hasil_Pemerikasaan;
    private String Alergi;
    private int Total_Harga;
    private String Layanan_Tambahan;

    public String getId_Rekam() {
        return Id_Rekam;
    }

    public String getId_Penyakit() {
        return Id_Penyakit;
    }

    public String getId_Pasien() {
        return Id_Pasien;
    }

    public Date getTgl_Rekam() {
        return Tgl_Rekam;
    }

    public int getTinggi() {
        return Tinggi;
    }

    public int getBerat() {
        return Berat;
    }

    public int getTekanan_Darah() {
        return Tekanan_Darah;
    }

    public String getHasil_Pemerikasaan() {
        return Hasil_Pemerikasaan;
    }

    public String getAlergi() {
        return Alergi;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }

    public String getLayanan_Tambahan() {
        return Layanan_Tambahan;
    }

    public void setId_Rekam(String Id_Rekam) {
        this.Id_Rekam = Id_Rekam;
    }

    public void setId_Penyakit(String Id_Penyakit) {
        this.Id_Penyakit = Id_Penyakit;
    }

    public void setId_Pasien(String Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }

    public void setTgl_Rekam(Date Tgl_Rekam) {
        this.Tgl_Rekam = Tgl_Rekam;
    }

    public void setTinggi(int Tinggi) {
        this.Tinggi = Tinggi;
    }

    public void setBerat(int Berat) {
        this.Berat = Berat;
    }

    public void setTekanan_Darah(int Tekanan_Darah) {
        this.Tekanan_Darah = Tekanan_Darah;
    }

    public void setHasil_Pemerikasaan(String Hasil_Pemerikasaan) {
        this.Hasil_Pemerikasaan = Hasil_Pemerikasaan;
    }

    public void setAlergi(String Alergi) {
        this.Alergi = Alergi;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

    public void setLayanan_Tambahan(String Layanan_Tambahan) {
        this.Layanan_Tambahan = Layanan_Tambahan;
    }

//    public void setId_Diagnosa(Penyakit_diagnosa id_diagnosa) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
}
