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
//import ServerApplication.Utilities.DatabaseUtilities;
import ClientApplication.FormLogin;
import ClientApplication.model.TableModelUSG;
import Database.Entity.Antrian;
import Database.Entity.Pembayaran;
import Database.Entity.USG;
import Database.Service.USGService;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Arlin
 */
public class FormUSG extends javax.swing.JFrame {

    private FormUSG f;
    private USGService usgService;
    private TableModelUSG tableModelusg =  new TableModelUSG();
    private Image image;
    private USG usg;
    private Antrian antrian= new Antrian();
    private String idusgisi = "";
    private String tgl = "";
    public FormUSG(USGService usgService) {
        this.usgService = usgService;

        try {
            tableModelusg.setData(this.usgService.getUSG());
        } catch (RemoteException exception) {
            exception.printStackTrace();
        }

        initComponents();
        harga.setText("100000");
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
        Nama.setText("");
        hasil.setText("");
        panelGambar1.setImage(null);
        deskrip.setText("");
        harga.setText("");
    }

    private void cekdaftar(){
        try {
            antrian=usgService.Id_pasien(antrian);
             if("kosong".equals(antrian.getId_Pasien())){
                int reply = JOptionPane.showConfirmDialog(null, "Tidak ada antrian. Apakah ingin memproses kembali?", "konfirmasi", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    cekdaftar();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Silahkan klik mulai jika ingin memulai kembali");
                }
            }
            else if("salah".equals(antrian.getId_Pasien())){
                JOptionPane.showMessageDialog(null, "Tidak terkoneksi ke database");
                cekdaftar();
            }
            else{
                idpasien.setText(antrian.getId_Pasien());
                Nama.setText(usgService.Nama_pasien(idpasien.getText()));
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.ALL, null, ex);
        }
    }
    
    private void isiid(){
        try {
            idusgisi=usgService.Id_usg();
            if(idusgisi=="salah"){
                JOptionPane.showMessageDialog(null, "Tidak terkoneksi ke database");
                isiid();
            }
            else{
                idusg.setText(idusgisi);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.ALL, null, ex);
        }
    }
    
//    public void isitanggal(){
//        Date date=new Date();
//        tgl=tgl+Integer.toString(date.getDate())+"/";
//        if(date.getMonth()<9){
//            tgl=tgl+"0"+Integer.toString((date.getMonth()+1))+"/";
//        }
//        else{
//             tgl=tgl+Integer.toString((date.getMonth()+1))+"/";
//        }
//        tgl=tgl+Integer.toString((date.getYear()+1900));
//        tanggal.setText(tgl);
//    }
    
    public void kembaliawal() {
        isiid();
        cekdaftar();
        harga.setText("100000");
    }

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
        idpasien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idusg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        pilih = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskrip = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        panelGambar1 = new ClientApplication.form.PanelGambar();
        tanggal = new javax.swing.JFormattedTextField();
        Mulai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 0, 16)); // NOI18N
        jLabel2.setText("ID Pasien ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 200, 120, 19);

        idpasien.setEditable(false);
        idpasien.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jPanel1.add(idpasien);
        idpasien.setBounds(290, 190, 130, 30);

        jLabel4.setFont(new java.awt.Font("Caviar Dreams", 0, 16)); // NOI18N
        jLabel4.setText("Tanggal Pemeriksaan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(710, 170, 180, 17);

        jLabel5.setFont(new java.awt.Font("Caviar Dreams", 0, 16)); // NOI18N
        jLabel5.setText("ID USG ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 160, 120, 19);

        idusg.setEditable(false);
        idusg.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jPanel1.add(idusg);
        idusg.setBounds(290, 150, 130, 30);

        jLabel7.setFont(new java.awt.Font("Caviar Dreams", 0, 16)); // NOI18N
        jLabel7.setText("Hasil pemeriksaan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 350, 160, 19);
        jPanel1.add(hasil);
        hasil.setBounds(290, 350, 260, 30);

        pilih.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        pilih.setText("Pilih");
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        jPanel1.add(pilih);
        pilih.setBounds(560, 350, 90, 30);

        jLabel8.setFont(new java.awt.Font("Caviar Dreams", 0, 16)); // NOI18N
        jLabel8.setText("Keterangan");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(720, 350, 110, 17);

        deskrip.setColumns(20);
        deskrip.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        deskrip.setRows(5);
        jScrollPane1.setViewportView(deskrip);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(900, 350, 260, 170);

        jLabel11.setFont(new java.awt.Font("Caviar Dreams", 0, 16)); // NOI18N
        jLabel11.setText("Total transasksi");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(720, 540, 130, 17);

        harga.setEditable(false);
        harga.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jPanel1.add(harga);
        harga.setBounds(900, 540, 160, 30);

        simpan.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan);
        simpan.setBounds(1060, 610, 100, 30);

        panelGambar1.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelGambar1Layout = new javax.swing.GroupLayout(panelGambar1);
        panelGambar1.setLayout(panelGambar1Layout);
        panelGambar1Layout.setHorizontalGroup(
            panelGambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panelGambar1Layout.setVerticalGroup(
            panelGambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel1.add(panelGambar1);
        panelGambar1.setBounds(290, 390, 260, 250);

        tanggal.setEditable(false);
        tanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        tanggal.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        tanggal.setValue(new java.util.Date());
        jPanel1.add(tanggal);
        tanggal.setBounds(900, 160, 160, 30);

        Mulai.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Mulai.setText("Mulai");
        Mulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MulaiActionPerformed(evt);
            }
        });
        jPanel1.add(Mulai);
        Mulai.setBounds(290, 270, 90, 30);

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 0, 16)); // NOI18N
        jLabel3.setText("Nama Pasien");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 240, 120, 17);

        Nama.setEditable(false);
        Nama.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jPanel1.add(Nama);
        Nama.setBounds(290, 230, 260, 30);

        jLabel6.setFont(new java.awt.Font("Caviar Dreams", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/6.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 1270, 730);

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
    if (idpasien.getText().equals("") || idusg.getText().equals("")|| hasil.getText().equals("") || deskrip.getText().equals("") || harga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
   }
    else{
         USG usg=new USG();
         usg.setId_pasien(idpasien.getText());
         usg.setId_USG(idusg.getText());
         usg.setHarga(Integer.parseInt(harga.getText()));
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
          Date date = new Date();
          String now = dateFormat.format(date);
        try {
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(now);
            usg.setTanggal(date2);
        } catch (ParseException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
        }
         usg.setDeskripsi(deskrip.getText());
         if(!hasil.getText().equals("")){
             ObjectOutputStream objectOutputStream=null;
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
             try {
                 objectOutputStream = new ObjectOutputStream(outputStream);
                 ImageIcon icon = new ImageIcon(image);
                 objectOutputStream.writeObject(icon);
                 objectOutputStream.flush();
                 objectOutputStream.close();
             } catch (IOException ex) {
                 Logger.getLogger(FormUSG.class.getName()).log(Level.ALL, null, ex);
               }
            usg.setHasil(outputStream.toByteArray());
           }
        try {
            usgService.insertUSG(usg);
        } catch (RemoteException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.ALL, null, ex);
            }
        try {
            usgService.ubahstatus(antrian.getId_Antrian());
             JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke database");
        } catch (RemoteException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan karena gagal koneksi ke database");
        }
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

        clear();
        kembaliawal();
    }//GEN-LAST:event_simpanActionPerformed

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileNameExtensionFilter("jpg|png|bmp", "jpg","png","bmp"));

        if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File file=chooser.getSelectedFile();
            try {
                image = ImageIO.read(file);
                panelGambar1.setImage(image);
            } catch (IOException ex) {
                Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
            }
            hasil.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_pilihActionPerformed

    private void MulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MulaiActionPerformed
        isiid();
        cekdaftar();// TODO add your handling code here:
    }//GEN-LAST:event_MulaiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mulai;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextArea deskrip;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField hasil;
    private javax.swing.JTextField idpasien;
    private javax.swing.JTextField idusg;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private ClientApplication.form.PanelGambar panelGambar1;
    private javax.swing.JButton pilih;
    private javax.swing.JButton simpan;
    private javax.swing.JFormattedTextField tanggal;
    // End of variables declaration//GEN-END:variables

}
