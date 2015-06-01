package ClientApplication.model;

import Database.Entity.Lab_tabelMaster;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelLab_tabelMaster extends AbstractTableModel {

    private List<Lab_tabelMaster> list = new ArrayList<Lab_tabelMaster>();

    public TableModelLab_tabelMaster(){}

    public Lab_tabelMaster get(int row){
        return list.get(row);
    }

    public void insert(Lab_tabelMaster laboratorium){
        list.add(laboratorium);
        fireTableDataChanged();
    }

    public void update(int row, Lab_tabelMaster laboratorium){
        list.set(row, laboratorium);
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
            case 0 : return "ID LAB";
            case 1 : return "JENIS PEMERIKSAAN";
            case 2 : return "HARGA";
            case 3 : return "DESKRIPSI";
            default : return null;
        }
    }

    public int getRowCount() {
        System.out.println(list.size());
        return list.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Lab();
            case 1 : return list.get(rowIndex).getJenis_Pemeriksaan();
            case 2 : return list.get(rowIndex).getHarga();
            case 3 : return list.get(rowIndex).getDeskripsi();
            default : return null;
        }
    }

}
