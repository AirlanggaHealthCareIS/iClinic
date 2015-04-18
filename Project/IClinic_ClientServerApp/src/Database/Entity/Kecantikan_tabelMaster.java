package Database.Entity;
import java.io.Serializable;

public class Kecantikan_tabelMaster implements Serializable{

    private String Id_Kecantikan;
    private String Jenis_Layanan;
    private String Deskripsi;
    private int Tarif;

    public String getId_Kecantikan() {
        return Id_Kecantikan;
    }

    public String getJenis_Layanan() {
        return Jenis_Layanan;
    }

    public int getTarif() {
        return Tarif;
    }

    public void setId_Kecantikan(String Id_Kecantikan) {
        this.Id_Kecantikan = Id_Kecantikan;
    }

    public void setJenis_Layanan(String Jenis_Layanan) {
        this.Jenis_Layanan = Jenis_Layanan;
    }

    public void setTarif(int Tarif) {
        this.Tarif = Tarif;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

}
