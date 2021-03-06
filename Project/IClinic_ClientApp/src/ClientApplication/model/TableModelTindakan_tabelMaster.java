package ClientApplication.model;

import Database.Entity.Tindakan_tabelMaster;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelTindakan_tabelMaster extends AbstractTableModel {
    private List<Tindakan_tabelMaster> list = new ArrayList<Tindakan_tabelMaster>();

    public TableModelTindakan_tabelMaster(){}

    public Tindakan_tabelMaster get(int row){
        return list.get(row);
    }

    public void insert(Tindakan_tabelMaster tindakan){
        list.add(tindakan);
        fireTableDataChanged();
    }

    public void update(int row, Tindakan_tabelMaster tindakan){
        list.set(row, tindakan);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Tindakan_tabelMaster> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "ID TINDAKAN";
            case 1 : return "SPESIALISASI";
            case 2 : return "NAMA TINDAKAN";
            case 3 : return "TARIF";
            case 4 : return "KETERANGAN";
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
            case 0 : return list.get(rowIndex).getId_Tindakan();
            case 1 : return list.get(rowIndex).getSpesialisasi();
            case 2 : return list.get(rowIndex).getNama_Tindakan();
            case 3 : return list.get(rowIndex).getTarif();
            case 4 : return list.get(rowIndex).getKeterangan();
            default : return null;
        }
    }

}
