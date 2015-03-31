/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Rekam_Medis;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelRekam_Medis extends AbstractTableModel {

    private List<Rekam_Medis> list = new ArrayList<Rekam_Medis>();

    public TableModelRekam_Medis(){
    }

    public Rekam_Medis get(int row){
        return list.get(row);
    }

    public void insert(Rekam_Medis rekam_medis){
        list.add(rekam_medis);
        fireTableDataChanged();
    }

    public void update(int row, Rekam_Medis rekam_medis){
        list.set(row, rekam_medis);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Rekam_Medis> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Rekam";
            case 1 : return "Id_Diagnosa";
            case 2 : return "Id_Pasien";
            case 3 : return "No_Detail";
            case 4 : return "Id_Resep";
            case 5 : return "Tgl_Rekam";
            case 6 : return "Tinggi";
            case 7 : return "Berat";
            case 8 : return "Tekanan_Darah";
            case 9 : return "Hasil_Pemerikasaan";
            case 10 : return "Alergi";
            case 11 : return "Total_Harga";
            case 12 : return "Layanan_Tambahan";
            default: return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 13;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Rekam();
            case 1 : return list.get(rowIndex).getId_Diagnosa();
            case 2 : return list.get(rowIndex).getId_Pasien();
            case 3 : return list.get(rowIndex).getNo_Detail();
            case 4 : return list.get(rowIndex).getId_Resep();
            case 5 : return list.get(rowIndex).getTgl_Rekam();
            case 6 : return list.get(rowIndex).getTinggi();
            case 7 : return list.get(rowIndex).getBerat();
            case 8 : return list.get(rowIndex).getTekanan_Darah();
            case 9 : return list.get(rowIndex).getHasil_Pemerikasaan();
            case 10 : return list.get(rowIndex).getAlergi();
            case 11 : return list.get(rowIndex).getTotal_Harga();
            case 12 : return list.get(rowIndex).getLayanan_Tambahan();
            default : return null;
        }
    }

}
