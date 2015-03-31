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
            case 0 : return "Id_Pembayaran";
            case 1 : return "Id_USG";
            case 2 : return "Id_Detail_Lab";
            case 3 : return "Id_Rekam";
            case 4 : return "Id_Transaksi_Layanan";
            case 5 : return "Tanggal_Bayar";
            case 6 : return "Total_Harga";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Pembayaran();
            case 1 : return list.get(rowIndex).getId_USG();
            case 2 : return list.get(rowIndex).getId_Detail_Lab();
            case 3 : return list.get(rowIndex).getId_Rekam();
            case 4 : return list.get(rowIndex).getId_Transaksi_Layanan();
            case 5 : return list.get(rowIndex).getTanggal_Bayar();
            case 6 : return list.get(rowIndex).getTotal_Harga();
            default : return null;
        }
    }

}
