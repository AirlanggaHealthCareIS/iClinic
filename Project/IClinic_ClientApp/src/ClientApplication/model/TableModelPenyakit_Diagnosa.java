/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Penyakit_diagnosa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelPenyakit_Diagnosa extends AbstractTableModel {

    private List<Penyakit_diagnosa> list = new ArrayList<Penyakit_diagnosa>();

    public TableModelPenyakit_Diagnosa(){
    }

    public Penyakit_diagnosa get(int row){
        return list.get(row);
    }

    public void insert(Penyakit_diagnosa diagnosa){
        list.add(diagnosa);
        fireTableDataChanged();
    }

    public void update(int row, Penyakit_diagnosa diagnosa){
        list.set(row, diagnosa);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Penyakit_diagnosa> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Diagnosa";
            case 1 : return "Id_Penyakit";
            case 2 : return "Diagnosa";
            case 3 : return "Keterangan";
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
            case 0 : return list.get(rowIndex).getId_Diagnosa();
            case 1 : return list.get(rowIndex).getId_Penyakit();
            case 2 : return list.get(rowIndex).getDiagnosa();
            case 3 : return list.get(rowIndex).getKeterangan();
            default : return null;
        }
    }

}
