/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Lab_tabelMaster;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelLab_tabelMaster extends AbstractTableModel {

    private List<Lab_tabelMaster> list = new ArrayList<Lab_tabelMaster>();

    public TableModelLab_tabelMaster(){
    }

    public Lab_tabelMaster get(int row){
        return list.get(row);
    }

    public void insert(Lab_tabelMaster lab){
        list.add(lab);
        fireTableDataChanged();
    }

    public void update(int row, Lab_tabelMaster lab){
        list.set(row, lab);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Lab_tabelMaster> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Lab";
            case 1 : return "Jenis_Pemeriksaan";
            case 2 : return "Harga";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 5;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Lab();
            case 1 : return list.get(rowIndex).getJenis_Pemeriksaan();
            case 2 : return list.get(rowIndex).getHarga();
            default : return null;
        }
    }

}
