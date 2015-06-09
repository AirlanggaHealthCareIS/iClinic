/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Entity;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Erin
 */
public class LaporanResepPasien implements Serializable {
    
    private String obat_NAMA_OBAT;
    private int obat_HARGA_OBAT;
    private String resep_ID_RESEP;
    private int resep_TOTAL_HARGA;
    private String detail_resep_TAKARAN;
    private String detail_resep_PEMAKAIAN;
    private int detail_resep_JUMLAH;
    private String detail_resep_KETERANGAN;

    public void setresep_ID_RESEP(String resep_ID_RESEP) {
        this.resep_ID_RESEP = resep_ID_RESEP;
    }

    public void setresep_TOTAL_HARGA(int resep_TOTAL_HARGA) {
        this.resep_TOTAL_HARGA = resep_TOTAL_HARGA;
    }

    public void setobat_NAMA_OBAT(String obat_NAMA_OBAT) {
        this.obat_NAMA_OBAT = obat_NAMA_OBAT;
    }

    public void setobat_HARGA_OBAT(int obat_HARGA_OBAT) {
        this.obat_HARGA_OBAT = obat_HARGA_OBAT;
    }

    public void setdetail_resep_JUMLAH(int detail_resep_JUMLAH) {
        this.detail_resep_JUMLAH = detail_resep_JUMLAH;
    }
    
     public void setdetail_resep_TAKARAN(String detail_resep_TAKARAN) {
        this.detail_resep_TAKARAN = detail_resep_TAKARAN;
    }
     
      public void setdetail_resep_PEMAKAIAN(String detail_resep_PEMAKAIAN) {
        this.detail_resep_PEMAKAIAN = detail_resep_PEMAKAIAN;
    }
      
       public void setdetail_resep_KETERANGAN(String detail_resep_KETERANGAN) {
        this.detail_resep_KETERANGAN = detail_resep_KETERANGAN;
    }

    public String getresep_ID_RESEP() {
        return resep_ID_RESEP;
    }

    public int getresep_TOTAL_HARGA() {
        return resep_TOTAL_HARGA;
    }

    public String getobat_NAMA_OBAT() {
        return obat_NAMA_OBAT;
    }

    public int getobat_HARGA_OBAT() {
        return obat_HARGA_OBAT;
    }

    public int getdetail_resep_JUMLAH() {
        return detail_resep_JUMLAH;
    }
    
     public String getdetail_resep_TAKARAN() {
        return detail_resep_TAKARAN;
    }
     
     public String getdetail_resep_PEMAKAIAN() {
        return detail_resep_PEMAKAIAN;
    }
      
     public String getdetail_resep_KETERANGAN() {
        return detail_resep_KETERANGAN;
    }


   
}
