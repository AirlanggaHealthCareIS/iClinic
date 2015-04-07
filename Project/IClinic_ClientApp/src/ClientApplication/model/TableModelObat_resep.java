/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Obat_resep;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelObat_resep extends AbstractTableModel {

    private List<Obat_resep> list = new ArrayList<Obat_resep>(); //ambil list office dari bridge

    public TableModelObat_resep(){
    }

    public Obat_resep get(int row){
        return list.get(row);
    }

    public void insert(Obat_resep resep){
        list.add(resep);
        fireTableDataChanged();
        }

    public void update(int row, Obat_resep resep){
        list.set(row, resep);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Obat_resep> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Resep";
            case 1 : return "Total_Harga";
            default: return null;
        }
    }


    public int getRowCount() {
        System.out.println(list.size());
        return list.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_Resep();
            case 1 : return list.get(rowIndex).getTotal_Harga();
            default : return null;
        }
    }

}
