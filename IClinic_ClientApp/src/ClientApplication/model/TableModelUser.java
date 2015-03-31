/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tiara Ratna Sari
 */
public class TableModelUser extends AbstractTableModel {

    private List<User> list = new ArrayList<User>();

    public TableModelUser(){
    }

    public User get(int row){
        return list.get(row);
    }

    public void insert(User user){
        list.add(user);
        fireTableDataChanged();
    }

    public void update(int row, User user){
        list.set(row, user);
        fireTableDataChanged();
    }

    public void delete(int row){
        list.remove(row);
        fireTableDataChanged();
    }

    public void setData(List<User> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Id_User";
            case 1 : return "Nama_User";
            case 2 : return "Jabatan";
            case 3 : return "Username";
            case 4 : return "Password";
            default : return null;
        }
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 5;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getId_User();
            case 1 : return list.get(rowIndex).getNama_User();
            case 2 : return list.get(rowIndex).getJabatan();
            case 3 : return list.get(rowIndex).getUsername();
            case 4 : return list.get(rowIndex).getPassword();
            default : return null;
        }
    }

}
