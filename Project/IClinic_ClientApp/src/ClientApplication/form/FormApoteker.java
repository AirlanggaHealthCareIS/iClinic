/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelObat_detailResep;
import Database.Entity.Obat_detailResep;
import ClientApplication.model.TableModelObat_resep;
import Database.Entity.Obat_resep;
import ClientApplication.model.TableModelObat_tabelMaster;
import Database.Entity.Obat_tabelMaster;
import Database.Service.ApotekerService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author RinduPW
 */
public class FormApoteker extends javax.swing.JFrame {

private TableModelObat_detailResep tableModelObat_detailResep = new TableModelObat_detailResep();
    private ApotekerService apotekerService;
    
    public FormApoteker(ApotekerService apotekerService) {
        this.apotekerService = apotekerService;
        try{
            tableModelObat_detailResep.setData(this.apotekerService.getObat_detailResep(null));
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(this);
        setSize(665, 730);

        Table_Apotek.setModel(tableModelObat_detailResep);
        Table_Apotek.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = Table_Apotek.getSelectedRow();
                if(row != -1){
                    Obat_detailResep obat_detailResep = new Obat_detailResep();
                }
            }
        });
    }
    
    public void clear(){
        TextField_IdResep.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField_IdResep = new javax.swing.JTextField();
        Button_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Apotek = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        clear1 = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        submit1 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        Exit1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField11 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel1.setLayout(null);

        jLabel1.setText("ID Resep");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 310, 106, 22);

        jLabel3.setText("Detail Resep");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 460, 106, 22);
        jPanel1.add(TextField_IdResep);
        TextField_IdResep.setBounds(120, 310, 183, 22);

        Button_Search.setText("Search");
        Button_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Button_Search);
        Button_Search.setBounds(330, 310, 65, 23);

        Table_Apotek.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Table_Apotek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table_Apotek);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(590, 230, 550, 430);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/3.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 1280, 800);

        jTabbedPane1.addTab("LIHAT RESEP", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(100, 330, 183, 22);

        jLabel4.setText("ID Resep");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 290, 106, 22);

        jLabel5.setText("ID Obat");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 330, 106, 22);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(100, 250, 183, 22);

        jLabel8.setText("No. Detail Resep");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 250, 106, 22);
        jPanel2.add(jTextField7);
        jTextField7.setBounds(100, 290, 183, 22);

        jLabel9.setText("Kuantitas");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 410, 106, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(100, 370, 183, 22);

        jLabel10.setText("Nama Obat");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 370, 106, 22);
        jPanel2.add(jTextField8);
        jTextField8.setBounds(100, 410, 50, 22);

        jLabel11.setText("Detail Resep");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 460, 106, 22);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Obat", "Jenis Obat", "Kuantitas", "Harga"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 510, 999, 101);

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel2.add(clear1);
        clear1.setBounds(550, 690, 168, 58);

        submit.setText("Simpan Data");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit);
        submit.setBounds(330, 690, 178, 54);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit);
        Exit.setBounds(770, 690, 168, 58);

        jLabel20.setText("Total Harga");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 640, 106, 22);
        jPanel2.add(jTextField12);
        jTextField12.setBounds(100, 640, 183, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/3.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 1280, 810);

        jTabbedPane1.addTab("PENUKARAN RESEP", jPanel2);

        jPanel3.setLayout(null);

        submit1.setText("Simpan Data");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        jPanel3.add(submit1);
        submit1.setBounds(330, 690, 178, 54);

        clear2.setText("Clear");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        jPanel3.add(clear2);
        clear2.setBounds(550, 690, 168, 58);

        Exit1.setText("Exit");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });
        jPanel3.add(Exit1);
        Exit1.setBounds(770, 690, 168, 58);

        jLabel15.setText("ID Pasien");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(10, 250, 106, 22);

        jLabel16.setText("ID Resep");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 300, 106, 22);

        jLabel17.setText("Nama Obat");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(10, 360, 106, 22);

        jLabel18.setText("Kuantitas");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(10, 410, 106, 22);

        jLabel19.setText("Detail Resep");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(10, 450, 106, 22);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Obat", "Jenis Obat", "Kuantitas", "Harga"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 490, 999, 101);
        jPanel3.add(jTextField9);
        jTextField9.setBounds(100, 250, 183, 22);
        jPanel3.add(jTextField10);
        jTextField10.setBounds(100, 300, 183, 22);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(100, 360, 183, 22);
        jPanel3.add(jTextField11);
        jTextField11.setBounds(100, 410, 50, 22);

        jLabel21.setText("Total Harga");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 630, 106, 22);
        jPanel3.add(jTextField13);
        jTextField13.setBounds(100, 630, 183, 22);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/3.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(0, 0, 1290, 810);

        jTabbedPane1.addTab("PEMBELIAN OBAT", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        //if(tglTransaksiBeli.getText().equals("")||idCustomer.getText().equalsIgnoreCase("")
            //                ||idKaryawan.getSelectedItem().equals("")||totalHarga.getText().equals("")||diskon.getText().equals("")){
            //            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
            //        }
        //        else{
            //            try{
                //                TransaksiBeli transaksiBeli = new TransaksiBeli();
                //                transaksiBeli.setID_TRANSAKSIBELI(idTransaksiBeli.getText());
                //                transaksiBeli.setID_CUSTOMER(idCustomer.getText());
                //                transaksiBeli.setID_KARYAWAN(idKaryawan.getSelectedItem().toString());
                //                transaksiBeli.setTGL_TRANSAKSIBELI((Date)tglTransaksiBeli.getValue());
                //                transaksiBeli.setTOTAL_HARGA(Integer.parseInt(totalHarga.getText()));
                //                transaksiBeli.setDISKON(Integer.parseInt(diskon.getText()));
                //                transaksiBeli.setTOTAL_TAGIHAN(Integer.parseInt(totalTagihan.getText()));
                //                transaksiBeli.setSTATUS_PEMBAYARAN(status.getText());
                //
                //                TransaksiBeliService.updateTransaksiBeli(transaksiBeli);
                //                tableModelTransaksiBeli.insert(transaksiBeli);
                //
                //                TransaksiBeliService.insertPembayaran(transaksiBeli, idPembayaran.getText(), Integer.parseInt(jumlahBayar.getText()), Integer.parseInt(sisaTagihan.getText()));
                //
                //                String idPemasukan = TransaksiBeliService.getAutoNumberPemasukan();
                //                TransaksiBeliService.insertPemasukan(transaksiBeli, idPemasukan, idPembayaran.getText(), Integer.parseInt(jumlahBayar.getText()));
                //                TransaksiBeliService.insertBukuBesar(transaksiBeli, idPemasukan, Integer.parseInt(jumlahBayar.getText()));
                //
                //                int jumlah_transaksi = TransaksiBeliService.hitungMember(idCustomer.getText());
                //                if(jumlah_transaksi == 3){
                    //                    TransaksiBeliService.insertMember(idCustomer.getText());
                    //                }
                //                clear();
                //            }
            //            catch(RemoteException exception){
                //                exception.printStackTrace();
                //            }
            //        }
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
 //if(tglTransaksiBeli.getText().equals("")||idCustomer.getText().equalsIgnoreCase("")
            //                ||idKaryawan.getSelectedItem().equals("")||totalHarga.getText().equals("")||diskon.getText().equals("")){
            //            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
            //        }
        //        else{
            //            try{
                //                TransaksiBeli transaksiBeli = new TransaksiBeli();
                //                transaksiBeli.setID_TRANSAKSIBELI(idTransaksiBeli.getText());
                //                transaksiBeli.setID_CUSTOMER(idCustomer.getText());
                //                transaksiBeli.setID_KARYAWAN(idKaryawan.getSelectedItem().toString());
                //                transaksiBeli.setTGL_TRANSAKSIBELI((Date)tglTransaksiBeli.getValue());
                //                transaksiBeli.setTOTAL_HARGA(Integer.parseInt(totalHarga.getText()));
                //                transaksiBeli.setDISKON(Integer.parseInt(diskon.getText()));
                //                transaksiBeli.setTOTAL_TAGIHAN(Integer.parseInt(totalTagihan.getText()));
                //                transaksiBeli.setSTATUS_PEMBAYARAN(status.getText());
                //
                //                TransaksiBeliService.updateTransaksiBeli(transaksiBeli);
                //                tableModelTransaksiBeli.insert(transaksiBeli);
                //
                //                TransaksiBeliService.insertPembayaran(transaksiBeli, idPembayaran.getText(), Integer.parseInt(jumlahBayar.getText()), Integer.parseInt(sisaTagihan.getText()));
                //
                //                String idPemasukan = TransaksiBeliService.getAutoNumberPemasukan();
                //                TransaksiBeliService.insertPemasukan(transaksiBeli, idPemasukan, idPembayaran.getText(), Integer.parseInt(jumlahBayar.getText()));
                //                TransaksiBeliService.insertBukuBesar(transaksiBeli, idPemasukan, Integer.parseInt(jumlahBayar.getText()));
                //
                //                int jumlah_transaksi = TransaksiBeliService.hitungMember(idCustomer.getText());
                //                if(jumlah_transaksi == 3){
                    //                    TransaksiBeliService.insertMember(idCustomer.getText());
                    //                }
                //                clear();
                //            }
            //            catch(RemoteException exception){
                //                exception.printStackTrace();
                //            }
            //        }
        // TODO add your handling code here:
    }//GEN-LAST:event_submit1ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear2ActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Exit1ActionPerformed

    private void Button_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SearchActionPerformed
        if(TextField_IdResep.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Anda Belum menginputkan ID RESEP");
    }
    else if( !TextField_IdResep.getText().equals("")){
        try{
            tableModelObat_detailResep.setData(apotekerService.getObat_detailResep(TextField_IdResep.getText()));
            Table_Apotek.setModel(tableModelObat_detailResep);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }
    }//GEN-LAST:event_Button_SearchActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Search;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit1;
    private javax.swing.JTable Table_Apotek;
    private javax.swing.JTextField TextField_IdResep;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit1;
    // End of variables declaration//GEN-END:variables
}
