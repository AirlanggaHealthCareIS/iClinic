package ServerApplication.model;
import ServerApplication.entity.log;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelLog extends AbstractTableModel {

    private List<log> list = new ArrayList<log>();

    public TableModelLog(){
    }

    public log get(int row){
        return list.get(row);
    }

    public void insert(log logger){
        list.add(logger);
        fireTableDataChanged();
    }

    public void update(int row, log logger){
        list.set(row, logger);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<log> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Tanggal";
            case 1 : return "Kegiatan";
            case 2 : return "Aktor";
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
            case 0 : return list.get(rowIndex).getTanggal();
            case 1 : return list.get(rowIndex).getKegiatan();
            case 2 : return list.get(rowIndex).getAktor();
            default : return null;
        }
    }

}
