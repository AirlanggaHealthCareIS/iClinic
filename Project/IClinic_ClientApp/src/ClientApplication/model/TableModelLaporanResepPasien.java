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
            case 0 : return "obat_NAMA_OBAT";
            case 1 : return "obat_HARGA_OBAT";
            case 2 : return "resep_ID_RESEP";
            case 3 : return "resep_TOTAL_HARGA";
            case 4 : return "detail_resep_TAKARAN";
            case 5 : return "detail_resep_PEMAKAIAN";
            case 6 : return "detail_resep_JUMLAH";
            case 7 : return "detail_resep_KETERANGAN";
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
            case 0 : return list.get(rowIndex).getNAMA_OBAT();
            case 1 : return list.get(rowIndex).getHARGA_OBAT();
            case 2 : return list.get(rowIndex).getID_RESEP();
            case 3 : return list.get(rowIndex).getTOTAL_HARGA();
            case 4 : return list.get(rowIndex).getTAKARAN();
            case 5 : return list.get(rowIndex).getPEMAKAIAN();
            case 6 : return list.get(rowIndex).getJUMLAH();
            case 7 : return list.get(rowIndex).getKETERANGAN();
            default : return null;
        }
    }

}
