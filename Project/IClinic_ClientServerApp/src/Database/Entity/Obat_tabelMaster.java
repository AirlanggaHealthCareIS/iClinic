package Database.Entity;

import java.io.Serializable;

public class Obat_tabelMaster implements Serializable{

    private String Id_Obat;
    private String Nama_Obat;
    private String Jenis_Obat;
    private int Harga_Obat;
    private String Satuan;

    public String getId_Obat() {
        return Id_Obat;
    }

    public String getNama_Obat() {
        return Nama_Obat;
    }

    public String getJenis_Obat() {
        return Jenis_Obat;
    }

    public int getHarga_Obat() {
        return Harga_Obat;
    }

    public String getSatuan() {
        return Satuan;
    }

    public void setId_Obat(String Id_Obat) {
        this.Id_Obat = Id_Obat;
    }

    public void setNama_Obat(String Nama_Obat) {
        this.Nama_Obat = Nama_Obat;
    }

    public void setJenis_Obat(String Jenis_Obat) {
        this.Jenis_Obat = Jenis_Obat;
    }

    public void setHarga_Obat(int Harga_Obat) {
        this.Harga_Obat = Harga_Obat;
    }

    public void setSatuan(String Satuan) {
        this.Satuan = Satuan;
    }
    
}
