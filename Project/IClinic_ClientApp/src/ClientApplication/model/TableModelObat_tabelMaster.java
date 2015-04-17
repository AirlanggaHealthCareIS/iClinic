package ClientApplication.model;

import Database.Entity.Obat_tabelMaster;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelObat_tabelMaster extends AbstractTableModel {
    private List<Obat_tabelMaster> list = new ArrayList<Obat_tabelMaster>(); //ambil list office dari bridge

    public TableModelObat_tabelMaster(){}

    public Obat_tabelMaster get(int row){
        return list.get(row);
    }

    public void insert(Obat_tabelMaster obat){
        list.add(obat);
        fireTableDataChanged();
        }

    public void update(int row, Obat_tabelMaster obat){
        list.set(row, obat);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Obat_tabelMaster> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "ID OBAT";
            case 1 : return "NAMA OBAT";
            case 2 : return "JENIS OBAT";
            case 3 : return "HARGA OBAT";
            case 4 : return "SATUAN";
            default: return null;
        }
    }


    public int getRowCount() {
        System.out.println(list.size());
        return list.size();
    }

    public int getColumnCount() {
        return 5;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Obat();
            case 1 : return list.get(rowIndex).getNama_Obat();
            case 2 : return list.get(rowIndex).getJenis_Obat();
            case 3 : return list.get(rowIndex).getHarga_Obat();
            case 4 : return list.get(rowIndex).getSatuan();
            default : return null;
        }
    }

}
