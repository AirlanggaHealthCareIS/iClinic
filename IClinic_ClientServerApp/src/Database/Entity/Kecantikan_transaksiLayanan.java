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
public class Kecantikan_transaksiLayanan implements Serializable{

    private int Id_Transaksi_Layanan;
    private int Id_Det_Kesehatan;
    private int Total_Harga;

    public int getId_Transaksi_Layanan() {
        return Id_Transaksi_Layanan;
    }

    public int getId_Det_Kesehatan() {
        return Id_Det_Kesehatan;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }

    public void setId_Transaksi_Layanan(int Id_Transaksi_Layanan) {
        this.Id_Transaksi_Layanan = Id_Transaksi_Layanan;
    }

    public void setId_Det_Kesehatan(int Id_Det_Kesehatan) {
        this.Id_Det_Kesehatan = Id_Det_Kesehatan;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

}
