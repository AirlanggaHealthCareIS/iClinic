/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;
import Database.Entity.Lab_transaksiLab;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author erin
 */
public class TableModelLab_transaksiLab extends AbstractTableModel{
    
    private List<Lab_transaksiLab> list = new ArrayList<Lab_transaksiLab>(); //ambil list office dari bridge

    public TableModelLab_transaksiLab(){
    }

    public Lab_transaksiLab get(int row){
        return list.get(row);
    }

    public void insert(Lab_transaksiLab transaksi_Lab){
        list.add(transaksi_Lab);
        fireTableDataChanged();
        }

    public void update(int row, Lab_transaksiLab transaksi_Lab){
        list.set(row, transaksi_Lab);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Lab_transaksiLab> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_Transaksi_Lab";
            case 1 : return "Id_Pasien";
            case 2 : return "Total_Harga";
            case 3 : return "Tanggal";
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
            case 0 : return list.get(rowIndex).getId_Transaksi_Lab();
            case 1 : return list.get(rowIndex).getId_Pasien();
            case 2 : return list.get(rowIndex).getTotal_Harga();
            case 3 : return list.get(rowIndex).getTanggal();
            default : return null;
        }
    }

}


  
