/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Pembayaran;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelPembayaran extends AbstractTableModel {

    private List<Pembayaran> list = new ArrayList<Pembayaran>();

    public TableModelPembayaran(){
    }

    public Pembayaran get(int row){
        return list.get(row);
    }

    public void insert(Pembayaran pembayaran){
        list.add(pembayaran);
        fireTableDataChanged();
    }

    public void update(int row, Pembayaran pembayaran){
        list.set(row, pembayaran);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Pembayaran> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "ID_PEMBAYARAN";
            case 1 : return "ID_PASIEN";
            case 2 : return "NAMA_PASIEN";
            case 3 : return "ID_USG";
            case 4 : return "TOTAL_USG";
            case 5 : return "ID_TRANSAKSI_LAB";
            case 6 : return "TOTAL_LAB";
            case 7 : return "ID_RESEP";
            case 8 : return "TOTAL_RESEP";
            case 9 : return "ID_REKAM";
            case 10 : return "TOTAL_REKAM";
            case 11 : return "ID_TRANSAKSI_LAYANAN";
            case 12 : return "TOTAL_KECANTIKAN";
            case 13 : return "TANGGAL_BAYAR";
            case 14 : return "TOTAL_HARGA";
            case 15 : return "STATUS";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 16;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getID_PEMBAYARAN();
            case 1 : return list.get(rowIndex).getID_PASIEN();
            case 2 : return list.get(rowIndex).getNAMA_PASIEN();
            case 3 : return list.get(rowIndex).getID_USG();
            case 4 : return list.get(rowIndex).getTOTAL_USG();
            case 5 : return list.get(rowIndex).getID_TRANSAKSI_LAB();
            case 6 : return list.get(rowIndex).getTOTAL_LAB();
            case 7 : return list.get(rowIndex).getID_RESEP();
            case 8 : return list.get(rowIndex).getTOTAL_RESEP();
            case 9 : return list.get(rowIndex).getID_REKAM();
            case 10 : return list.get(rowIndex).getTOTAL_REKAM();
            case 11 : return list.get(rowIndex).getID_TRANSAKSI_LAYANAN();
            case 12 : return list.get(rowIndex).getTOTAL_KECANTIKAN();
            case 13: return list.get(rowIndex).getTANGGAL_BAYAR();
            case 14 : return list.get(rowIndex).getTOTAL_HARGA();
            case 15 : return list.get(rowIndex).getSTATUS();
            default : return null;
        }
    }

}
