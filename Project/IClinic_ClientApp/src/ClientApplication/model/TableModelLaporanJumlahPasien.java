/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.LaporanJumlahPasien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelLaporanJumlahPasien extends AbstractTableModel {

    private List<LaporanJumlahPasien> list = new ArrayList<LaporanJumlahPasien>();

    public TableModelLaporanJumlahPasien(){
    }

    public LaporanJumlahPasien get(int row){
        return list.get(row);
    }

    public void insert(LaporanJumlahPasien laporanJumlahPasien){
        list.add(laporanJumlahPasien);
        fireTableDataChanged();
    }

    public void update(int row, LaporanJumlahPasien laporanJumlahPasien){
        list.set(row, laporanJumlahPasien);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<LaporanJumlahPasien> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "PASIEN";
            case 1 : return "DOKTER";
            case 2 : return "LAB";
            case 3 : return "KECANTIKAN";
            case 4 : return "USG";
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
            case 0 : return list.get(rowIndex).getPASIEN();
            case 1 : return list.get(rowIndex).getDOKTER();
            case 2 : return list.get(rowIndex).getLAB();
            case 3 : return list.get(rowIndex).getKECANTIKAN();
            case 4 : return list.get(rowIndex).getUSG();
            default : return null;
        }
    }

}
