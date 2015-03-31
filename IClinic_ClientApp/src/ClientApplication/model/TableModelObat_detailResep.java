/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Obat_detailResep;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelObat_detailResep extends AbstractTableModel {

    private List<Obat_detailResep> list = new ArrayList<Obat_detailResep>(); //ambil list office dari bridge

    public TableModelObat_detailResep(){
    }

    public Obat_detailResep get(int row){
        return list.get(row);
    }

    public void insert(Obat_detailResep detail_resep){
        list.add(detail_resep);
        fireTableDataChanged();
        }

    public void update(int row, Obat_detailResep detail_resep){
        list.set(row, detail_resep);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Obat_detailResep> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "No_Detail_Resep";
            case 1 : return "Id_Resep";
            case 2 : return "Id_Obat";
            case 3 : return "Takaran";
            case 4 : return "Pemakaian";
            case 5 : return "Jumlah";
            case 6 : return "Keterangan";
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
            case 1 : return list.get(rowIndex).getId_Resep();
            case 2 : return list.get(rowIndex).getId_Obat();
            case 3 : return list.get(rowIndex).getTakaran();
            case 4 : return list.get(rowIndex).getPemakaian();
            case 5 : return list.get(rowIndex).getJumlah();
            case 6 : return list.get(rowIndex).getKeterangan();
            default : return null;
        }
    }

}
