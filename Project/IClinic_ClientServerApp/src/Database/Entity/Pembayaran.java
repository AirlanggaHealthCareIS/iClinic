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
public class Pembayaran implements Serializable  {
    private String Id_Pembayaran;
    private String Id_Pasien;
    private String Nama_Pasien;
    private String Id_USG;
    private int Total_USG;
    private String Id_Detail_Lab;
    private int Total_Lab;
    private String Id_Resep;
    private int Total_Resep;
    private String Id_Rekam;
    private int Total_Rekam;
    private String Id_Transaksi_Layanan;
    private int Total_Kecantikan;
    private Date Tanggal_Bayar;
    private int Total_Harga;
    private String Status;

    public void setId_Pembayaran(String Id_Pembayaran) {
        this.Id_Pembayaran = Id_Pembayaran;
    }

    public void setId_Pasien(String Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }

    public void setNama_Pasien(String Nama_Pasien) {
        this.Nama_Pasien = Nama_Pasien;
    }

    public void setId_USG(String Id_USG) {
        this.Id_USG = Id_USG;
    }

    public void setTotal_USG(int Total_USG) {
        this.Total_USG = Total_USG;
    }

    public void setId_Detail_Lab(String Id_Detail_Lab) {
        this.Id_Detail_Lab = Id_Detail_Lab;
    }

    public void setTotal_Lab(int Total_Lab) {
        this.Total_Lab = Total_Lab;
    }

    public void setId_Resep(String Id_Resep) {
        this.Id_Resep = Id_Resep;
    }

    public void setTotal_Resep(int Total_Resep) {
        this.Total_Resep = Total_Resep;
    }

    public void setId_Rekam(String Id_Rekam) {
        this.Id_Rekam = Id_Rekam;
    }

    public void setTotal_Rekam(int Total_Rekam) {
        this.Total_Rekam = Total_Rekam;
    }

    public void setId_Transaksi_Layanan(String Id_Transaksi_Layanan) {
        this.Id_Transaksi_Layanan = Id_Transaksi_Layanan;
    }

    public void setTotal_Kecantikan(int Total_Kecantikan) {
        this.Total_Kecantikan = Total_Kecantikan;
    }

    public void setTanggal_Bayar(Date Tanggal_Bayar) {
        this.Tanggal_Bayar = Tanggal_Bayar;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getId_Pembayaran() {
        return Id_Pembayaran;
    }

    public String getId_Pasien() {
        return Id_Pasien;
    }

    public String getNama_Pasien() {
        return Nama_Pasien;
    }

    public String getId_USG() {
        return Id_USG;
    }

    public int getTotal_USG() {
        return Total_USG;
    }

    public String getId_Detail_Lab() {
        return Id_Detail_Lab;
    }

    public int getTotal_Lab() {
        return Total_Lab;
    }

    public String getId_Resep() {
        return Id_Resep;
    }

    public int getTotal_Resep() {
        return Total_Resep;
    }

    public String getId_Rekam() {
        return Id_Rekam;
    }

    public int getTotal_Rekam() {
        return Total_Rekam;
    }

    public String getId_Transaksi_Layanan() {
        return Id_Transaksi_Layanan;
    }

    public int getTotal_Kecantikan() {
        return Total_Kecantikan;
    }

    public Date getTanggal_Bayar() {
        return Tanggal_Bayar;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }

    public String getStatus() {
        return Status;
    }

}
