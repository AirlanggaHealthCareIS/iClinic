/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author erin
 */
public class Lab_transaksiLab implements Serializable{
     private String Id_Transaksi_Lab;
    private String Id_Pasien;
    private int Total_Harga;
    private String Tanggal;
   

    public String getId_Transaksi_Lab() {
        return Id_Transaksi_Lab;
    }
    
     public String getId_Pasien() {
        return Id_Pasien;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }
    
    public String getTanggal() {
        return Tanggal;
    }

    public void setId_Transaksi_Lab(String Id_Transaksi_Lab) {
        this.Id_Transaksi_Lab = Id_Transaksi_Lab;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }
    
    public void setId_Pasien(String Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

}


