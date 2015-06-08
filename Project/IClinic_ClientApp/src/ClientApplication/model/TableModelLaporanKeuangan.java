/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.LaporanKeuangan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelLaporanKeuangan extends AbstractTableModel {

    private List<LaporanKeuangan> list = new ArrayList<LaporanKeuangan>();

    public TableModelLaporanKeuangan(){
    }

    public LaporanKeuangan get(int row){
        return list.get(row);
    }

    public void insert(LaporanKeuangan laporanKeuangan){
        list.add(laporanKeuangan);
        fireTableDataChanged();
    }

    public void update(int row, LaporanKeuangan laporanKeuangan){
        list.set(row, laporanKeuangan);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<LaporanKeuangan> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "DOKTER";
            case 1 : return "RESEP";
            case 2 : return "LAB";
            case 3 : return "USG";
            case 4 : return "KECANTIKAN";
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
            case 0 : return list.get(rowIndex).getDOKTER();
            case 1 : return list.get(rowIndex).getRESEP();
            case 2 : return list.get(rowIndex).getLAB();
            case 3 : return list.get(rowIndex).getUSG();
            case 4 : return list.get(rowIndex).getKECANTIKAN();
            default : return null;
        }
    }

}
