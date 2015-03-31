/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.USG;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelUSG extends AbstractTableModel {

    private List<USG> list = new ArrayList<USG>();

    public TableModelUSG(){
    }

    public USG get(int row){
        return list.get(row);
    }

    public void insert(USG usg){
        list.add(usg);
        fireTableDataChanged();
    }

    public void update(int row, USG usg){
        list.set(row, usg);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<USG> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_USG";
            case 1 : return "Hasil";
            case 2 : return "Harga";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_USG();
            case 1 : return list.get(rowIndex).getHasil();
            case 2 : return list.get(rowIndex).getHarga();
            default : return null;
        }
    }

}
