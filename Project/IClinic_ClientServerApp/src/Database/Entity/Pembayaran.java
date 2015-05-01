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
public class Pembayaran implements Serializable  {
    private String ID_PEMBAYARAN;
    private String ID_PASIEN;
    private String NAMA_PASIEN;
    private String ID_USG;
    private int TOTAL_USG;
    private String ID_TRANSAKSI_LAB;
    private int TOTAL_LAB;
    private String ID_RESEP;
    private int TOTAL_RESEP;
    private String ID_REKAM;
    private int TOTAL_REKAM;
    private String ID_TRANSAKSI_LAYANAN;
    private int TOTAL_KECANTIKAN;
    private Date TANGGAL_BAYAR;
    private int TOTAL_HARGA;
    private String STATUS;

    public void setID_PEMBAYARAN(String ID_PEMBAYARAN) {
        this.ID_PEMBAYARAN = ID_PEMBAYARAN;
    }

    public void setID_PASIEN(String ID_PASIEN) {
        this.ID_PASIEN = ID_PASIEN;
    }

    public void setNAMA_PASIEN(String NAMA_PASIEN) {
        this.NAMA_PASIEN = NAMA_PASIEN;
    }

    public void setID_USG(String ID_USG) {
        this.ID_USG = ID_USG;
    }

    public void setTOTAL_USG(int TOTAL_USG) {
        this.TOTAL_USG = TOTAL_USG;
    }

    public void setID_TRANSAKSI_LAB(String ID_TRANSAKSI_LAB) {
        this.ID_TRANSAKSI_LAB = ID_TRANSAKSI_LAB;
    }

    public void setTOTAL_LAB(int TOTAL_LAB) {
        this.TOTAL_LAB = TOTAL_LAB;
    }

    public void setID_RESEP(String ID_RESEP) {
        this.ID_RESEP = ID_RESEP;
    }

    public void setTOTAL_RESEP(int TOTAL_RESEP) {
        this.TOTAL_RESEP = TOTAL_RESEP;
    }

    public void setID_REKAM(String ID_REKAM) {
        this.ID_REKAM = ID_REKAM;
    }

    public void setTOTAL_REKAM(int TOTAL_REKAM) {
        this.TOTAL_REKAM = TOTAL_REKAM;
    }

    public void setID_TRANSAKSI_LAYANAN(String ID_TRANSAKSI_LAYANAN) {
        this.ID_TRANSAKSI_LAYANAN = ID_TRANSAKSI_LAYANAN;
    }

    public void setTOTAL_KECANTIKAN(int TOTAL_KECANTIKAN) {
        this.TOTAL_KECANTIKAN = TOTAL_KECANTIKAN;
    }

    public void setTANGGAL_BAYAR(Date TANGGAL_BAYAR) {
        this.TANGGAL_BAYAR = TANGGAL_BAYAR;
    }

    public void setTOTAL_HARGA(int TOTAL_HARGA) {
        this.TOTAL_HARGA = TOTAL_HARGA;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getID_PEMBAYARAN() {
        return ID_PEMBAYARAN;
    }

    public String getID_PASIEN() {
        return ID_PASIEN;
    }

    public String getNAMA_PASIEN() {
        return NAMA_PASIEN;
    }

    public String getID_USG() {
        return ID_USG;
    }

    public int getTOTAL_USG() {
        return TOTAL_USG;
    }

    public String getID_TRANSAKSI_LAB() {
        return ID_TRANSAKSI_LAB;
    }

    public int getTOTAL_LAB() {
        return TOTAL_LAB;
    }

    public String getID_RESEP() {
        return ID_RESEP;
    }

    public int getTOTAL_RESEP() {
        return TOTAL_RESEP;
    }

    public String getID_REKAM() {
        return ID_REKAM;
    }

    public int getTOTAL_REKAM() {
        return TOTAL_REKAM;
    }

    public String getID_TRANSAKSI_LAYANAN() {
        return ID_TRANSAKSI_LAYANAN;
    }

    public int getTOTAL_KECANTIKAN() {
        return TOTAL_KECANTIKAN;
    }

    public Date getTANGGAL_BAYAR() {
        return TANGGAL_BAYAR;
    }

    public int getTOTAL_HARGA() {
        return TOTAL_HARGA;
    }

    public String getSTATUS() {
        return STATUS;
    }

}
