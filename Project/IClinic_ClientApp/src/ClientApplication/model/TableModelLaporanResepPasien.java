/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;
import Database.Entity.LaporanResepPasien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Erin
 */
public class TableModelLaporanResepPasien extends AbstractTableModel{
    private List<LaporanResepPasien> list = new ArrayList<LaporanResepPasien>();

    public TableModelLaporanResepPasien(){
    }

    public LaporanResepPasien get(int row){
        return list.get(row);
    }

    public void insert(LaporanResepPasien laporanResepPasien){
        list.add(laporanResepPasien);
        fireTableDataChanged();
    }

    public void update(int row, LaporanResepPasien laporanResepPasien){
        list.set(row, laporanResepPasien);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<LaporanResepPasien> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "ID_RESEP";
            case 1 : return "TOTAL_HARGA";
            case 2 : return "NAMA_OBAT";
            case 3 : return "HARGA_OBAT";
            case 4 : return "JUMLAH_OBAT";
            case 5 : return "TAKARAN";
            case 6 : return "PEMAKAIAN";
            case 7 : return "KETERANGAN";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 8;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getID_RESEP();
            case 1 : return list.get(rowIndex).getTOTAL_HARGA();
            case 2 : return list.get(rowIndex).getNAMA_OBAT();
            case 3 : return list.get(rowIndex).getHARGA_OBAT();
            case 4 : return list.get(rowIndex).getJUMLAH_OBAT();
            case 5 : return list.get(rowIndex).getTAKARAN();
            case 6 : return list.get(rowIndex).getPEMAKAIAN();
            case 7 : return list.get(rowIndex).getKETERANGAN();
            default : return null;
        }
    }

}
