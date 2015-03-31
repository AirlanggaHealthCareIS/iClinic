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
public class Lab_detailLab implements Serializable{
    private int Id_Detail_Lab;
    private int Id_Lab;
    private String Keterangan;
    private Long Hasil;
    private Date Tanggal;
    private int Total_Harga;

    public int getId_Detail_Lab() {
        return Id_Detail_Lab;
    }

    public int getId_Lab() {
        return Id_Lab;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public Long getHasil() {
        return Hasil;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }

    public void setId_Detail_Lab(int Id_Detail_Lab) {
        this.Id_Detail_Lab = Id_Detail_Lab;
    }

    public void setId_Lab(int Id_Lab) {
        this.Id_Lab = Id_Lab;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public void setHasil(Long Hasil) {
        this.Hasil = Hasil;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

}
