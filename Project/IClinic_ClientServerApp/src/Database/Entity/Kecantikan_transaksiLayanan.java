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
public class Kecantikan_transaksiLayanan implements Serializable{

    private String Id_Transaksi_Layanan;
    private String Id_Pasien;
    private Date Tanggal;
    private int Total_Harga;

    public String getId_Transaksi_Layanan() {
        return Id_Transaksi_Layanan;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }

    public void setId_Transaksi_Layanan(String Id_Transaksi_Layanan) {
        this.Id_Transaksi_Layanan = Id_Transaksi_Layanan;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

    public String getId_Pasien() {
        return Id_Pasien;
    }

    public void setId_Pasien(String Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

}
