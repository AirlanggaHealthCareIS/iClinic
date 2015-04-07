/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Lab_detailLab;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelLab_detailLab extends AbstractTableModel {

    private List<Lab_detailLab> list = new ArrayList<Lab_detailLab>();

    public TableModelLab_detailLab(){
    }

    public Lab_detailLab get(int row){
        return list.get(row);
    }

    public void insert(Lab_detailLab detail_lab){
        list.add(detail_lab);
        fireTableDataChanged();
    }

    public void update(int row, Lab_detailLab detail_lab){
        list.set(row, detail_lab);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Lab_detailLab> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Detail_Lab";
            case 1 : return "Id_Lab";
            case 2 : return "Keterangan";
            case 3 : return "Hasil";
            case 4 : return "Tanggal";
            case 5 : return "Total_Harga";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 6;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Detail_Lab();
            case 1 : return list.get(rowIndex).getId_Lab();
            case 2 : return list.get(rowIndex).getKeterangan();
            case 3 : return list.get(rowIndex).getHasil();
            case 4 : return list.get(rowIndex).getTanggal();
            case 5 : return list.get(rowIndex).getTotal_Harga();
            default : return null;
        }
    }

}
