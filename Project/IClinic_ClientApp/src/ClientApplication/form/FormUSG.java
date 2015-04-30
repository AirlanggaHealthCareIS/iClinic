/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Arlin
 *
 * 
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelUSG;
import Database.Entity.Pembayaran;
import Database.Entity.USG;
import Database.Service.USGService;
import java.awt.Color;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Arlin
 */
public class FormUSG extends javax.swing.JFrame {

    private FormUSG f;
    private USGService usgService;
    private TableModelUSG tableModelusg;

    public FormUSG(USGService usgService) {
        this.usgService = usgService;

//        antrian();
//        try {
//            tableModelusg.setData(this.usgService.getUSG());
//        } catch (RemoteException exception) {
//            exception.printStackTrace();
//        }
//
//        initComponents();
//        setLocationRelativeTo(this);
//        setSize(665, 730);
//    }
//
//        jTable1.setModel(tableModelusg);
//        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//
//            public void valueChanged(ListSelectionEvent e) {
//                int row = jTable1.getSelectedRow();
//                if(row != -1){
//                    USG usg = tableModelusg.get(row);
//                    idpasien.setText(usg.getId_pasien());
//                    idusg.setText(usg.getId_USG());
////                    jTextField6.setset(usg.getHasil());
//                    deskrip.setText(usg.getDeskripsi());
//                    harga.setText(String.valueOf(usg.getHarga()));
//                }
//            }
    //    });
    }
    
    public void clear() {
        idpasien.setText("");
        idusg.setText("");
        hasil.setText("");
        deskrip.setText("");
        harga.setText("");
    }

//    public void antrian() {
//        String in = idusg.getText();
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        try {
//            Class.forName("com.jdbc.mysql.Driver");
//            conn = DriverManager.getConnection("jdbcmysql:///klinik2", "root", "usg");
//            pstmt = conn.prepareStatement("select ID_PASIEN,ID_USG,TANGGAL_USG from transaksi_usg where ID_USG=?");
//            pstmt.setString(1, in);
//            rs = pstmt.executeQuery();
//            if (rs.next()) {
//                idusg.setText(rs.getString("ID_USG"));
//                idpasien.setText(rs.getString("ID_PASIEN"));
//                tanggal.setText(rs.getString("TANGGAL_USG"));
//            } else {
//                JOptionPane.showMessageDialog(null, "Antrian selanjutnya masih kosong, silahkan tunggu  ");
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        } finally {
//            try {
//                conn.close();
//                pstmt.close();
//                rs.close();
//            } catch (Exception e) {
//            }
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idpasien = new javax.swing.JTextField();
        namapasien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        idusg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        unggah = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskrip = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setText("ID Pasien              :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 200, 100, 14);

        jLabel3.setText("Nama Pasien         :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 230, 100, 14);
        jPanel1.add(idpasien);
        idpasien.setBounds(250, 200, 80, 20);
        jPanel1.add(namapasien);
        namapasien.setBounds(250, 230, 180, 20);

        jLabel4.setText("Tanggal Pemerikasaan :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(530, 170, 130, 14);

        jLabel5.setText("ID USG          :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 200, 70, 14);
        jPanel1.add(tanggal);
        tanggal.setBounds(660, 170, 80, 20);
        jPanel1.add(idusg);
        idusg.setBounds(660, 200, 80, 20);

        jLabel7.setText("Hasil pemeriksaan :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 270, 100, 14);
        jPanel1.add(hasil);
        hasil.setBounds(250, 270, 260, 20);

        unggah.setText("Pilih");
        jPanel1.add(unggah);
        unggah.setBounds(530, 270, 51, 23);

        jLabel8.setText("Keterangan          :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 300, 100, 14);

        deskrip.setColumns(20);
        deskrip.setRows(5);
        jScrollPane1.setViewportView(deskrip);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 300, 260, 150);

        jLabel11.setText("Total transasksi :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 470, 90, 14);
        jPanel1.add(harga);
        harga.setBounds(250, 470, 140, 20);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan);
        simpan.setBounds(540, 480, 67, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/6.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 1300, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        boolean isi1 = false;
        boolean isi2 = false;
        boolean isi3 = false;
        boolean isi4 = false;
        boolean isi5 = false;
        boolean isi6 = false;
        boolean isi7 = false;
//        boolean isi8 = false;
//        boolean isi9 = false;

        if (!idpasien.getText().equals("") && idpasien.getText().length() <= 12) {
            isi1 = true;
        }
        if (!namapasien.getText().equals("") && namapasien.getText().length() <= 30) {
            isi2 = true;
        }
        if ((!idusg.getText().equals("")) && idusg.getText().length() <= 16) {
            isi3 = true;
        }
        if (!hasil.getText().equals("")) {
            isi4 = true;
        }
        if (!deskrip.getText().equals("")) {
            isi5 = true;
        }
        if (!harga.getText().equals("")) {
            isi6 = true;
        }
        if (!tanggal.getText().equals("")) {
            isi7 = true;
        }
//       if(!tanggal.getCalendar().equals("")){
//            isi5 = true;
//       }

        if (isi1 && isi2 && isi3 && isi4 && isi5 && isi6) {
            String a = idpasien.getText();
            String b = namapasien.getText();
            String c = idusg.getText();
            String d = hasil.getText();
            String e = deskrip.getText();
            int f = Integer.parseInt(harga.getText());
            //Date h = tanggal.getText();

            JOptionPane.showMessageDialog(null, "Data Anda Berhasil Di Inputkan");
            clear();
        } else {
            if (!isi1) {
                idpasien.setBackground(Color.red);
            }
            if (!isi2) {
                namapasien.setBackground(Color.red);
            }
            if (!isi3) {
                idusg.setBackground(Color.red);
            }
            if (!isi4) {
                hasil.setBackground(Color.red);
            }
            if (!isi5) {
                deskrip.setBackground(Color.red);
            }
            if (!isi6) {
                harga.setBackground(Color.red);
            }
            if (!isi7) {
                tanggal.setBackground(Color.red);
            }
            JOptionPane.showMessageDialog(null, "Ada kesalahan pada kolom isian Anda. Mohon memperbaiki field yang berwarna merah untuk melanjutkan.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        String idPasien = idpasien.getText();
        String idTransaksiUSG = idusg.getText();
        int hargaTransaksi = Integer.parseInt(harga.getText());
        try {
            String idPembayaran = usgService.mencariIdPembayaranDariPembayaran(idPasien);
            if(!idPembayaran.equalsIgnoreCase("")){
                Pembayaran pembayaran = usgService.getPembayaranDariPembayaran(idPembayaran);
                usgService.updatePembayaranDariPembayaran(pembayaran, idTransaksiUSG, hargaTransaksi);
            }
            else if(idPembayaran.equalsIgnoreCase("")){
                idPembayaran = usgService.getAutoNumberDariPembayaran();
                usgService.insertPembayaranDariPembayaran(idPembayaran, idPasien, idTransaksiUSG, hargaTransaksi);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_simpanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea deskrip;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField hasil;
    private javax.swing.JTextField idpasien;
    private javax.swing.JTextField idusg;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namapasien;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField tanggal;
    private javax.swing.JButton unggah;
    // End of variables declaration//GEN-END:variables

}
