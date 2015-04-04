/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormKategori.java
 *
 * Created on Jun 25, 2010, 9:28:14 PM
 */

package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelRekam_Medis;
import Database.Entity.Rekam_Medis;
import Database.Service.DokterService;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author Tiara Ratna Sari
 */
public class FormDokter extends javax.swing.JFrame {

//    Registry registry = LocateRegistry.getRegistry("localhost", 6789);
//    
//    final DetailTransaksiBeliService service3 = (DetailTransaksiBeliService) registry.lookup("service3");
//    final PembayaranService service9 = (PembayaranService)registry.lookup("service9");
//    
//    private TransaksiBeliService TransaksiBeliService;
//    private TableModelTransaksiBeli tableModelTransaksiBeli = new TableModelTransaksiBeli();

    public FormDokter(DokterService dokterService) throws RemoteException, NotBoundException {
//        this.TransaksiBeliService = TransaksiBeliService;
//        try{
//            tableModelTransaksiBeli.setData(this.TransaksiBeliService.getTransaksiBeli());
//        }catch(RemoteException exception){
//            exception.printStackTrace();
//        }
//        initComponents();
//        setLocationRelativeTo(this);
//        setSize(655, 840);
//
//        Table_TransaksiBeli.setModel(tableModelTransaksiBeli);
//        Table_TransaksiBeli.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//
//            public void valueChanged(ListSelectionEvent e) {
//                int row = Table_TransaksiBeli.getSelectedRow();
//                 if(row != -1){
//                   TransaksiBeli transaksiBeli = tableModelTransaksiBeli.get(row);
//                   idTransaksiBeli.setText(transaksiBeli.getID_TRANSAKSIBELI());
//                   idCustomer.setText(transaksiBeli.getID_CUSTOMER());
//                   idKaryawan.setSelectedItem(transaksiBeli.getID_KARYAWAN());
//                   tglTransaksiBeli.setValue(transaksiBeli.getTGL_TRANSAKSIBELI());
//                   totalHarga.setText(String.valueOf(transaksiBeli.getTOTAL_HARGA()));
//                   diskon.setText(String.valueOf(transaksiBeli.getDISKON()));
//                   totalTagihan.setText(String.valueOf(transaksiBeli.getTOTAL_TAGIHAN()));
//                   status.setText(transaksiBeli.getSTATUS_PEMBAYARAN());
//                 }
//            }
//        });
    }
        public void clear(){
//        idTransaksiBeli.setText("");
//        idCustomer.setText("");
//        idKaryawan.setSelectedItem(0);
//        totalHarga.setText("");
//        diskon.setText("");
//        totalTagihan.setText("");
//        status.setText("");
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RekamMedis = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Riwayat = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        idRekam = new javax.swing.JLabel();
        idPasien = new javax.swing.JLabel();
        idDiagnosa = new javax.swing.JLabel();
        noDetail = new javax.swing.JLabel();
        tglRekam = new javax.swing.JLabel();
        tinggiBadan = new javax.swing.JLabel();
        beratBadan = new javax.swing.JLabel();
        tekananDarah = new javax.swing.JLabel();
        hasilPemeriksaan = new javax.swing.JLabel();
        alergi = new javax.swing.JLabel();
        totalHarga = new javax.swing.JLabel();
        layananTambahan = new javax.swing.JLabel();
        IDRekam = new javax.swing.JTextField();
        IDPasien = new javax.swing.JTextField();
        IDDiagnosa = new javax.swing.JTextField();
        NoDetail = new javax.swing.JTextField();
        tggBadan = new javax.swing.JTextField();
        brtBadan = new javax.swing.JTextField();
        tknDarah = new javax.swing.JTextField();
        Alergi = new javax.swing.JTextField();
        hasilPeriksa = new javax.swing.JTextField();
        tambahan = new javax.swing.JComboBox();
        submit = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        tglRekamM = new javax.swing.JFormattedTextField();
        totalHarga1 = new javax.swing.JTextField();
        clear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RekamMedis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Table_Riwayat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_Riwayat);

        jTabbedPane2.addTab("tab1", jScrollPane1);

        RekamMedis.addTab("Riwayat", jTabbedPane2);

        jTabbedPane3.setInheritsPopupMenu(true);
        RekamMedis.addTab("Resep", jTabbedPane3);

        idRekam.setText("ID Rekam");

        idPasien.setText("ID Pasien");

        idDiagnosa.setText("ID Diagnosa ");

        noDetail.setText("Nomor Detail");

        tglRekam.setText("Tanggal Rekam");

        tinggiBadan.setText("Tinggi Badan");

        beratBadan.setText("Berat Badan");

        tekananDarah.setText("Tekanan Darah");

        hasilPemeriksaan.setText("Hasil Pemeriksaan");

        alergi.setText("Alergi");

        totalHarga.setText("Total Harga");

        layananTambahan.setText("Layanan Tambahan");

        IDRekam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDRekamActionPerformed(evt);
            }
        });

        IDPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDPasienActionPerformed(evt);
            }
        });

        NoDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoDetailActionPerformed(evt);
            }
        });

        tknDarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tknDarahActionPerformed(evt);
            }
        });

        Alergi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlergiActionPerformed(evt);
            }
        });

        hasilPeriksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilPeriksaActionPerformed(evt);
            }
        });

        tambahan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahanActionPerformed(evt);
            }
        });

        submit.setText("Simpan Data");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        tglRekamM.setEditable(false);
        tglRekamM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        tglRekamM.setValue(new java.util.Date());
        tglRekamM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglRekamMActionPerformed(evt);
            }
        });

        totalHarga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalHarga1ActionPerformed(evt);
            }
        });

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idRekam)
                            .addComponent(idPasien)
                            .addComponent(idDiagnosa)
                            .addComponent(noDetail)
                            .addComponent(tglRekam)
                            .addComponent(tinggiBadan)
                            .addComponent(beratBadan)
                            .addComponent(tekananDarah)
                            .addComponent(hasilPemeriksaan)
                            .addComponent(alergi)
                            .addComponent(layananTambahan)
                            .addComponent(totalHarga))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(IDRekam, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                .addComponent(IDPasien)
                                .addComponent(IDDiagnosa)
                                .addComponent(tglRekamM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NoDetail))
                            .addComponent(hasilPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tknDarah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addComponent(brtBadan, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tggBadan, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(Alergi, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRekam)
                    .addComponent(IDRekam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPasien)
                    .addComponent(IDPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idDiagnosa)
                    .addComponent(IDDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noDetail)
                    .addComponent(NoDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tglRekam)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tinggiBadan)
                                    .addComponent(tggBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tglRekamM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(beratBadan))
                    .addComponent(brtBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tekananDarah)
                    .addComponent(tknDarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hasilPemeriksaan)
                        .addGap(176, 176, 176)
                        .addComponent(alergi)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalHarga)
                            .addComponent(totalHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hasilPeriksa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alergi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(layananTambahan))
                    .addComponent(tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
        );

        RekamMedis.addTab("Rekam Medis", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RekamMedis)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RekamMedis)
        );

        RekamMedis.getAccessibleContext().setAccessibleName("Rekam Medis");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDRekamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDRekamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDRekamActionPerformed

    private void IDPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDPasienActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_IDPasienActionPerformed

    private void NoDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoDetailActionPerformed

    private void tknDarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tknDarahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tknDarahActionPerformed

    private void hasilPeriksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilPeriksaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilPeriksaActionPerformed

    private void AlergiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlergiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlergiActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void tglRekamMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglRekamMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglRekamMActionPerformed

    private void totalHarga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalHarga1ActionPerformed
//if(totalTagihan.getText().equalsIgnoreCase("")){
//            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
//        }
//        else if( !totalTagihan.getText().equals("")){
//            int total_harga = Integer.parseInt(totalTagihan.getText());
//            int bayar = Integer.parseInt(jumlahBayar.getText());
//
//            int total = total_harga;
//
//            if(bayar < total){
//                int sisa = total - bayar;
//                sisaTagihan.setText(""+sisa+"");
//                kembali.setText("0");
//                status.setText("HUTANG");
//            }
//            else if (total < bayar){
//                int kembalian = bayar - total;
//                kembali.setText(""+kembalian+"");
//                sisaTagihan.setText("0");
//                status.setText("LUNAS");
//            }
//            else{
//                kembali.setText("0");
//                sisaTagihan.setText("0");
//                status.setText("LUNAS");
//            }
//        }       }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_totalHarga1ActionPerformed

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

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear1ActionPerformed

    private void tambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergi;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField IDDiagnosa;
    private javax.swing.JTextField IDPasien;
    private javax.swing.JTextField IDRekam;
    private javax.swing.JTextField NoDetail;
    private javax.swing.JTabbedPane RekamMedis;
    private javax.swing.JTable Table_Riwayat;
    private javax.swing.JLabel alergi;
    private javax.swing.JLabel beratBadan;
    private javax.swing.JTextField brtBadan;
    private javax.swing.JButton clear1;
    private javax.swing.JLabel hasilPemeriksaan;
    private javax.swing.JTextField hasilPeriksa;
    private javax.swing.JLabel idDiagnosa;
    private javax.swing.JLabel idPasien;
    private javax.swing.JLabel idRekam;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel layananTambahan;
    private javax.swing.JLabel noDetail;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox tambahan;
    private javax.swing.JLabel tekananDarah;
    private javax.swing.JTextField tggBadan;
    private javax.swing.JLabel tglRekam;
    private javax.swing.JFormattedTextField tglRekamM;
    private javax.swing.JLabel tinggiBadan;
    private javax.swing.JTextField tknDarah;
    private javax.swing.JLabel totalHarga;
    private javax.swing.JTextField totalHarga1;
    // End of variables declaration//GEN-END:variables

    private void typeOnlyNumber(ActionEvent evt) {
//        char c = evt.getKeyChar();
//        if(!(Character.isDigit(c)||c == KeyEvent.VK_BACK_SPACE)||c == KeyEvent.VK_DELETE){
//            getToolkit().beep();
//            evt.consume();
//        } //To change body of generated methods, choose Tools | Templates.
    }

}
