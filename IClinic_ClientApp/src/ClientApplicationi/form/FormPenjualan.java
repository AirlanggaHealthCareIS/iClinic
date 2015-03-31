/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormPenjualan.java
 *
 * Created on Jun 25, 2010, 9:53:47 PM
 */

package ClientApplicationi.form;

import ClientApplication.FormClient;
import ClientApplication.model.TableModelPenjualan;
import Database.Entity.Penjualan;
import Database.Service.PenjualanService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Madridista
 */
public class FormPenjualan extends javax.swing.JFrame {

     private TableModelPenjualan tableModelPenjualan = new TableModelPenjualan();
     private PenjualanService penjualanService;
    /** Creates new form FormPenjualan */
    public FormPenjualan(PenjualanService penjualanService) {
        this.penjualanService = penjualanService;
        try{
            tableModelPenjualan.setData(this.penjualanService.getPenjualan());
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
        initComponents();

        tablePenjualan.setModel(tableModelPenjualan);
        tablePenjualan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = tablePenjualan.getSelectedRow();
                if(row != -1){
                    Penjualan penjualan = tableModelPenjualan.get(row);
                    Id_Penjualan.setValue(penjualan.getId_Penjualan());
                    Tgl.setValue(penjualan.getTgl());
                }
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePenjualan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tgl = new javax.swing.JFormattedTextField();
        Id_Penjualan = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablePenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePenjualan);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PENJUALAN"));

        jLabel1.setText("Id_Penjualan");

        jLabel2.setText("Tanggal");

        Tgl.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd MMMM yyyy"))));
        Tgl.setValue(new java.util.Date());

        Id_Penjualan.setEditable(false);
        Id_Penjualan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        Id_Penjualan.setValue(new Long(0L));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id_Penjualan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id_Penjualan)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        Insert.setText("INSERT");
        Insert.setPreferredSize(new java.awt.Dimension(90, 30));
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel2.add(Insert);

        Update.setText("UPDATE");
        Update.setPreferredSize(new java.awt.Dimension(90, 30));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update);

        Delete.setText("DELETE");
        Delete.setPreferredSize(new java.awt.Dimension(90, 30));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete);

        Refresh.setText("REFRESH");
        Refresh.setPreferredSize(new java.awt.Dimension(90, 30));
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(Refresh);

        Exit.setText("EXIT");
        Exit.setPreferredSize(new java.awt.Dimension(90, 30));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
  if(Tgl.getText().equalsIgnoreCase("")){
       JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");

   }
   else{
            try{
           Penjualan penjualan = new Penjualan();
          penjualan.setTgl((Date) Tgl.getValue());

           Penjualan penjualan1= penjualanService.insertPenjualan(penjualan);
           tableModelPenjualan.insert(penjualan1);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
   }
    }//GEN-LAST:event_InsertActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
  if(Tgl.getText().equalsIgnoreCase("")){
       JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");

   }
   else{
         try{

            int row = tablePenjualan.getSelectedRow();
            if(row == -1){
                return;
            }

           Penjualan penjualan = tableModelPenjualan.get(row);
           penjualan.setTgl((Date) Tgl.getValue());

           penjualanService.updatePenjualan(penjualan);
           tableModelPenjualan.update(row, penjualan);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
   }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        try{

            int row = tablePenjualan.getSelectedRow();
            if(row == -1){
                return;
            }
        Long Id_Penjualan = tableModelPenjualan.get(row).getId_Penjualan();

           penjualanService.deletePenjualan(Id_Penjualan);
           tableModelPenjualan.delete(row);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        try{
           List<Penjualan> list = penjualanService.getPenjualan();
           tableModelPenjualan.setData(list);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
          FormClient formClient = new FormClient();
            formClient.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(FormPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(FormPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExitActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JFormattedTextField Id_Penjualan;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Refresh;
    private javax.swing.JFormattedTextField Tgl;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePenjualan;
    // End of variables declaration//GEN-END:variables

}
