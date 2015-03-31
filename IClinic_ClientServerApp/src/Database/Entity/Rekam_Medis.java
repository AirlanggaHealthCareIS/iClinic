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

    private int Id_Rekam;
    private int Id_Diagnosa;
    private int Id_Pasien;
    private int No_Detail;
    private int Id_Resep;
    private Date Tgl_Rekam;
    private int Tinggi;
    private int Berat;
    private int Tekanan_Darah;
    private Long Hasil_Pemerikasaan;
    private String Alergi;
    private int Total_Harga;
    private String Layanan_Tambahan;

    public int getId_Rekam() {
        return Id_Rekam;
    }

    public int getId_Diagnosa() {
        return Id_Diagnosa;
    }

    public int getId_Pasien() {
        return Id_Pasien;
    }

    public int getNo_Detail() {
        return No_Detail;
    }

    public int getId_Resep() {
        return Id_Resep;
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

    public Long getHasil_Pemerikasaan() {
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

    public void setId_Rekam(int Id_Rekam) {
        this.Id_Rekam = Id_Rekam;
    }

    public void setId_Diagnosa(int Id_Diagnosa) {
        this.Id_Diagnosa = Id_Diagnosa;
    }

    public void setId_Pasien(int Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }

    public void setNo_Detail(int No_Detail) {
        this.No_Detail = No_Detail;
    }

    public void setId_Resep(int Id_Resep) {
        this.Id_Resep = Id_Resep;
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

    public void setHasil_Pemerikasaan(Long Hasil_Pemerikasaan) {
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
    
}
