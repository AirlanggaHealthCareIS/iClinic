/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;
import java.sql.Blob;

/**
 *
 * @author erin
 */
public class Lab_detailLab implements Serializable{
    private String Id_Detail_Lab;
    private String Id_Transaksi_Lab;
    private String Id_Lab;
    private byte[] Hasil;
    private String Keterangan;
    
    
     public byte[] getHasil() {
        return Hasil;
    }

    public String getId_Detail_Lab() {
        return Id_Detail_Lab;
    }
    
     public String getId_Transaksi_Lab() {
        return Id_Transaksi_Lab;
    }

    public String getId_Lab() {
        return Id_Lab;
    }
 
    public String getKeterangan() {
        return Keterangan;
    }

    public void setId_Detail_Lab(String Id_Detail_Lab) {
        this.Id_Detail_Lab = Id_Detail_Lab;
    }

    public void setId_Lab(String Id_Lab) {
        this.Id_Lab = Id_Lab;
    }
    
     public void setHasil(byte[] Hasil) {
        this.Hasil = Hasil;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public void setId_Transaksi_Lab(String idtransaksi) {
        this.Id_Transaksi_Lab = Id_Transaksi_Lab;
    }
}
