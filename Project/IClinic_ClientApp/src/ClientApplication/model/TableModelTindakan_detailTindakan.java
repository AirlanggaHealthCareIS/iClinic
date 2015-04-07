/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.Tindakan_detailTindakan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelTindakan_detailTindakan extends AbstractTableModel {

    private List<Tindakan_detailTindakan> list = new ArrayList<Tindakan_detailTindakan>();

    public TableModelTindakan_detailTindakan(){
    }

    public Tindakan_detailTindakan get(int row){
        return list.get(row);
    }

    public void insert(Tindakan_detailTindakan detail_tindakan){
        list.add(detail_tindakan);
        fireTableDataChanged();
    }

    public void update(int row, Tindakan_detailTindakan detail_tindakan){
        list.set(row, detail_tindakan);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<Tindakan_detailTindakan> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "No_Detail";
            case 1 : return "Id_Tindakan";
            case 2 : return "Keterangan";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getNo_Detail();
            case 1 : return list.get(rowIndex).getId_Tindakan();
            case 2 : return list.get(rowIndex).getKeterangan();
            default : return null;
        }
    }

}
