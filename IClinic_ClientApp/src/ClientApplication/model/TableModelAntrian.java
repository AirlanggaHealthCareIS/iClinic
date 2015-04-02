package ClientApplication.model;

import Database.Entity.Antrian;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelAntrian extends AbstractTableModel {

    private List<Antrian> list = new ArrayList<Antrian>();

    public TableModelAntrian(){
    }

    public Antrian get(int row){
        return list.get(row);
    }

    public void insert(Antrian antrian){
        list.add(antrian);
        fireTableDataChanged();
    }

    public void update(int row, Antrian antrian){
        list.set(row, antrian);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Antrian> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Antrian";
            case 1 : return "Id_Pasien";
            case 2 : return "Jenis_Antrian";
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
            case 0 : return list.get(rowIndex).getId_Antrian();
            case 1 : return list.get(rowIndex).getId_Pasien();
            case 2 : return list.get(rowIndex).getJenis_Antrian();
            case 3 : return list.get(rowIndex).getKeterangan();
            default : return null;
        }
    }

}
