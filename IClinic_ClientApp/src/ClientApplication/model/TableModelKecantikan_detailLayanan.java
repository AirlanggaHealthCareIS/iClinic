/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Kecantikan_detailLayanan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelKecantikan_detailLayanan extends AbstractTableModel {

    private List<Kecantikan_detailLayanan> list = new ArrayList<Kecantikan_detailLayanan>(); //ambil list office dari bridge

    public TableModelKecantikan_detailLayanan(){
    }

    public Kecantikan_detailLayanan get(int row){
        return list.get(row);
    }

    public void insert(Kecantikan_detailLayanan detail_layanan){
        list.add(detail_layanan);
        fireTableDataChanged();
        }

    public void update(int row, Kecantikan_detailLayanan detail_layanan){
        list.set(row, detail_layanan);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Kecantikan_detailLayanan> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Det_Kesehatan";
            case 1 : return "Id_Kecantikan";
            case 2 : return "Keterangan";
            default: return null;
        }
    }


    public int getRowCount() {
        System.out.println(list.size());
        return list.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Det_Kesehatan();
            case 1 : return list.get(rowIndex).getId_Kecantikan();
            case 2 : return list.get(rowIndex).getKeterangan();
            default : return null;
        }
    }

}
