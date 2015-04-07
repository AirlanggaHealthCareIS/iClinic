/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Penyakit_tabelMaster;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelPenyakit_tabelMaster extends AbstractTableModel {

    private List<Penyakit_tabelMaster> list = new ArrayList<Penyakit_tabelMaster>();

    public TableModelPenyakit_tabelMaster(){
    }

    public Penyakit_tabelMaster get(int row){
        return list.get(row);
    }

    public void insert(Penyakit_tabelMaster penyakit){
        list.add(penyakit);
        fireTableDataChanged();
    }

    public void update(int row, Penyakit_tabelMaster penyakit){
        list.set(row, penyakit);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Penyakit_tabelMaster> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Penyakit";
            case 1 : return "Penyakit";
            case 2 : return "Gejala";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Penyakit();
            case 1 : return list.get(rowIndex).getPenyakit();
            case 2 : return list.get(rowIndex).getGejala();
            default : return null;
        }
    }

}
