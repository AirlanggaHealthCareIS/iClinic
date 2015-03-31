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
    private int Id_Pembayaran;
    private int Id_USG;
    private int Id_Detail_Lab;
    private int Id_Rekam;
    private int Id_Transaksi_Layanan;
    private Date Tanggal_Bayar;
    private int Total_Harga;

    public int getId_Pembayaran() {
        return Id_Pembayaran;
    }

    public int getId_USG() {
        return Id_USG;
    }

    public int getId_Detail_Lab() {
        return Id_Detail_Lab;
    }

    public int getId_Rekam() {
        return Id_Rekam;
    }

    public int getId_Transaksi_Layanan() {
        return Id_Transaksi_Layanan;
    }

    public Date getTanggal_Bayar() {
        return Tanggal_Bayar;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }

    public void setId_Pembayaran(int Id_Pembayaran) {
        this.Id_Pembayaran = Id_Pembayaran;
    }

    public void setId_USG(int Id_USG) {
        this.Id_USG = Id_USG;
    }

    public void setId_Detail_Lab(int Id_Detail_Lab) {
        this.Id_Detail_Lab = Id_Detail_Lab;
    }

    public void setId_Rekam(int Id_Rekam) {
        this.Id_Rekam = Id_Rekam;
    }

    public void setId_Transaksi_Layanan(int Id_Transaksi_Layanan) {
        this.Id_Transaksi_Layanan = Id_Transaksi_Layanan;
    }

    public void setTanggal_Bayar(Date Tanggal_Bayar) {
        this.Tanggal_Bayar = Tanggal_Bayar;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

}
