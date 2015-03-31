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
public class Pasien implements Serializable  {
    private int Id_Pasien;
    private String Nama_Pasien;
    private String Alamat;
    private Date TTL;
    private int Usia;
    private String No_HP;
    private String Jenis_Kelamin;

    public int getId_Pasien() {
        return Id_Pasien;
    }

    public String getNama_Pasien() {
        return Nama_Pasien;
    }

    public String getAlamat() {
        return Alamat;
    }

    public Date getTTL() {
        return TTL;
    }

    public int getUsia() {
        return Usia;
    }

    public String getNo_HP() {
        return No_HP;
    }

    public String getJenis_Kelamin() {
        return Jenis_Kelamin;
    }

    public void setId_Pasien(int Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }

    public void setNama_Pasien(String Nama_Pasien) {
        this.Nama_Pasien = Nama_Pasien;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setTTL(Date TTL) {
        this.TTL = TTL;
    }

    public void setUsia(int Usia) {
        this.Usia = Usia;
    }

    public void setNo_HP(String No_HP) {
        this.No_HP = No_HP;
    }

    public void setJenis_Kelamin(String Jenis_Kelamin) {
        this.Jenis_Kelamin = Jenis_Kelamin;
    }
    
}
