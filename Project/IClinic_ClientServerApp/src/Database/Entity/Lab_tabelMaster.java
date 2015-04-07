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
public class Lab_tabelMaster implements Serializable{
    private int Id_Lab;
    private String Jenis_Pemeriksaan;
    private String Harga;

    public int getId_Lab() {
        return Id_Lab;
    }

    public String getJenis_Pemeriksaan() {
        return Jenis_Pemeriksaan;
    }

    public String getHarga() {
        return Harga;
    }

    public void setId_Lab(int Id_Lab) {
        this.Id_Lab = Id_Lab;
    }

    public void setJenis_Pemeriksaan(String Jenis_Pemeriksaan) {
        this.Jenis_Pemeriksaan = Jenis_Pemeriksaan;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

}
