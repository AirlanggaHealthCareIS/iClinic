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
    
    private String NAMA_OBAT;
    private int HARGA_OBAT;
    private String ID_RESEP;
    private int TOTAL_HARGA;
    private String TAKARAN;
    private String PEMAKAIAN;
    private int JUMLAH;
    private String KETERANGAN;

    public void setID_RESEP(String resep_ID_RESEP) {
        this.ID_RESEP = resep_ID_RESEP;
    }

    public void setTOTAL_HARGA(int resep_TOTAL_HARGA) {
        this.TOTAL_HARGA = resep_TOTAL_HARGA;
    }

    public void setNAMA_OBAT(String obat_NAMA_OBAT) {
        this.NAMA_OBAT = obat_NAMA_OBAT;
    }

    public void setHARGA_OBAT(int obat_HARGA_OBAT) {
        this.HARGA_OBAT = obat_HARGA_OBAT;
    }

    public void setJUMLAH(int detail_resep_JUMLAH) {
        this.JUMLAH = detail_resep_JUMLAH;
    }
    
     public void setTAKARAN(String detail_resep_TAKARAN) {
        this.TAKARAN = detail_resep_TAKARAN;
    }
     
      public void setPEMAKAIAN(String detail_resep_PEMAKAIAN) {
        this.PEMAKAIAN = detail_resep_PEMAKAIAN;
    }
      
       public void setKETERANGAN(String detail_resep_KETERANGAN) {
        this.KETERANGAN = detail_resep_KETERANGAN;
    }

    public String getID_RESEP() {
        return ID_RESEP;
    }

    public int getTOTAL_HARGA() {
        return TOTAL_HARGA;
    }

    public String getNAMA_OBAT() {
        return NAMA_OBAT;
    }

    public int getHARGA_OBAT() {
        return HARGA_OBAT;
    }

    public int getJUMLAH() {
        return JUMLAH;
    }
    
     public String getTAKARAN() {
        return TAKARAN;
    }
     
     public String getPEMAKAIAN() {
        return PEMAKAIAN;
    }
      
     public String getKETERANGAN() {
        return KETERANGAN;
    }


   
}
