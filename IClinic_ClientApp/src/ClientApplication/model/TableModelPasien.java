/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Pasien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelPasien extends AbstractTableModel {

    private List<Pasien> list = new ArrayList<Pasien>();

    public TableModelPasien(){
    }

    public Pasien get(int row){
        return list.get(row);
    }

    public void insert(Pasien pasien){
        list.add(pasien);
        fireTableDataChanged();
    }

    public void update(int row, Pasien pasien){
        list.set(row, pasien);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Pasien> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Pasien";
            case 1 : return "Nama_Pasien";
            case 2 : return "Alamat";
            case 3 : return "TTL";
            case 4 : return "Usia";
            case 5 : return "No_HP";
            case 6 : return "Jenis_Kelamin";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Pasien();
            case 1 : return list.get(rowIndex).getNama_Pasien();
            case 2 : return list.get(rowIndex).getAlamat();
            case 3 : return list.get(rowIndex).getTTL();
            case 4 : return list.get(rowIndex).getUsia();
            case 5 : return list.get(rowIndex).getNo_HP();
            case 6 : return list.get(rowIndex).getJenis_Kelamin();
            default : return null;
        }
    }

}
