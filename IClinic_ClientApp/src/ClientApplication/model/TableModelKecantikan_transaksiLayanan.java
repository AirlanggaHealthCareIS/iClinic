/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Kecantikan_transaksiLayanan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelKecantikan_transaksiLayanan extends AbstractTableModel {

    private List<Kecantikan_transaksiLayanan> list = new ArrayList<Kecantikan_transaksiLayanan>(); //ambil list office dari bridge

    public TableModelKecantikan_transaksiLayanan(){
    }

    public Kecantikan_transaksiLayanan get(int row){
        return list.get(row);
    }

    public void insert(Kecantikan_transaksiLayanan transaksi_layanan){
        list.add(transaksi_layanan);
        fireTableDataChanged();
        }

    public void update(int row, Kecantikan_transaksiLayanan transaksi_layanan){
        list.set(row, transaksi_layanan);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Kecantikan_transaksiLayanan> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Transaksi_Layanan";
            case 1 : return "Id_Det_Kesehatan";
            case 2 : return "Total_Harga";
            default: return null;
        }
    }


    public int getRowCount() {
        System.out.println(list.size());
        return list.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Transaksi_Layanan();
            case 1 : return list.get(rowIndex).getId_Det_Kesehatan();
            case 2 : return list.get(rowIndex).getTotal_Harga();
            default : return null;
        }
    }

}
