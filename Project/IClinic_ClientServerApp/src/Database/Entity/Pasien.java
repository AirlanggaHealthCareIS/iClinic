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
    private Date Tanggal_Lahir;
    private int Usia;
    private int No_HP;
    private String Jenis_Kelamin;
    private int No_Ktp;
    private Date Tanggal_Daftar;
    
    public void setNo_Ktp(int No_Ktp){
        this.No_Ktp = No_Ktp;
    }
    public int getNo_Ktp(){
        return No_Ktp;
    }

    public int getId_Pasien() {
        return Id_Pasien;
    }

    public String getNama_Pasien() {
        return Nama_Pasien;
    }

    public String getAlamat() {
        return Alamat;
    }

    public Date Tanggal_Lahir() {
        return Tanggal_Lahir;
    }

    public int getUsia() {
        return Usia;
    }
    public Date getTanggal_Daftar() {
        return Tanggal_Daftar;
    }

    public int getNo_HP() {
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

    public void setTanggal_Lahir(Date Tanggal_Lahir) {
        this.Tanggal_Lahir = Tanggal_Lahir;
    }

    public void setUsia(int Usia) {
        this.Usia = Usia;
    }
    public void setTanggal_Daftar(Date Tanggal_Daftar) {
        this.Usia = Usia;
    }

    public void setNo_HP(int No_HP) {
        this.No_HP = No_HP;
    }

    public void setJenis_Kelamin(String Jenis_Kelamin) {
        this.Jenis_Kelamin = Jenis_Kelamin;
    }
    
}
