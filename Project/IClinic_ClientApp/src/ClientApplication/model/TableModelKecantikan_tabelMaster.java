package ClientApplication.model;

import Database.Entity.Kecantikan_tabelMaster;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelKecantikan_tabelMaster extends AbstractTableModel {

    private List<Kecantikan_tabelMaster> list = new ArrayList<Kecantikan_tabelMaster>(); //ambil list office dari bridge

    public TableModelKecantikan_tabelMaster(){}

    public Kecantikan_tabelMaster get(int row){
        return list.get(row);
    }

    public void insert(Kecantikan_tabelMaster kecantikan){
        list.add(kecantikan);
        fireTableDataChanged();
        }

    public void update(int row, Kecantikan_tabelMaster kecantikan){
        list.set(row, kecantikan);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Kecantikan_tabelMaster> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "ID KECANTIKAN";
            case 1 : return "JENIS LAYANAN";
            case 2 : return "TARIF";
            case 3 : return "DESKRIPSI";
            default: return null;
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
            case 0 : return list.get(rowIndex).getId_Kecantikan();
            case 1 : return list.get(rowIndex).getJenis_Layanan();
            case 2 : return list.get(rowIndex).getTarif();
            case 3 : return list.get(rowIndex).getDeskripsi();
            default : return null;
        }
    }

}
