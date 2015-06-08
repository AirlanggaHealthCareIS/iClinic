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
    
     private String ID_RESEP;
    private int TOTAL_HARGA;
    private String NAMA_OBAT;
    private int HARGA_OBAT;
    private int JUMLAH_OBAT;
    private String TAKARAN;
    private String PEMAKAIAN;
    private String KETERANGAN;

    public void setID_RESEP(String ID_RESEP) {
        this.ID_RESEP = ID_RESEP;
    }

    public void setTOTAL_HARGA(int TOTAL_HARGA) {
        this.TOTAL_HARGA = TOTAL_HARGA;
    }

    public void setNAMA_OBAT(String NAMA_OBAT) {
        this.NAMA_OBAT = NAMA_OBAT;
    }

    public void setHARGA_OBAT(int HARGA_OBAT) {
        this.HARGA_OBAT = HARGA_OBAT;
    }

    public void setJUMLAH_OBAT(int JUMLAH_OBAT) {
        this.JUMLAH_OBAT = JUMLAH_OBAT;
    }
    
     public void setTAKARAN(String TAKARAN) {
        this.TAKARAN = TAKARAN;
    }
     
      public void setPEMAKAIAN(String PEMAKAIAN) {
        this.PEMAKAIAN = PEMAKAIAN;
    }
      
       public void setKETERANGAN(String KETERANGAN) {
        this.KETERANGAN = KETERANGAN;
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

    public int getJUMLAH_OBAT() {
        return JUMLAH_OBAT;
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
