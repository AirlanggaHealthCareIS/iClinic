/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Obat_detailResepPembelian;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rindu Puspita
 */
public class TableModelObat_detailResepPembelian extends AbstractTableModel {

    private List<Obat_detailResepPembelian> list = new ArrayList<Obat_detailResepPembelian>(); //ambil list office dari bridge

    public TableModelObat_detailResepPembelian(){
    }

    public Obat_detailResepPembelian get(int row){
        return list.get(row);
    }

    public void insert(Obat_detailResepPembelian detail_resep){
        list.add(detail_resep);
        fireTableDataChanged();
        }

    public void update(int row, Obat_detailResepPembelian detail_resep){
        list.set(row, detail_resep);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Obat_detailResepPembelian> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "NO_DETAIL_RESEP";
            case 1 : return "NAMA_OBAT";
            case 2 : return "TAKARAN";
            case 3 : return "PEMAKAIAN";
            case 4 : return "JUMLAH";
            case 5 : return "HARGA";
            case 6 : return "TOTAL";
            default: return null;
        }
    }


    public int getRowCount() {
        System.out.println(list.size());
        return list.size();
    }

    public int getColumnCount() {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getNo_Detail_Resep();
            case 1 : return list.get(rowIndex).getNama_Obat();
            case 2 : return list.get(rowIndex).getTakaran();
            case 3 : return list.get(rowIndex).getPemakaian();
            case 4 : return list.get(rowIndex).getJumlah();
            case 5 : return list.get(rowIndex).getHarga();
            case 6 : return list.get(rowIndex).getTotal();
            default : return null;
        }
    }
}
