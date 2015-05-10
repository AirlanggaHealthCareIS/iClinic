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

/**
 *
 * @author Arlin
 */
public class FormUSG extends javax.swing.JFrame {

    private FormUSG f;
    private USGService usgService;
    private TableModelUSG tableModelusg;
    private Image image;
    public Boolean pasienExist = false;
    public int number = 1;
    private USG usg;
    private Antrian antrian= new Antrian();
    private String idusgisi = "";
    private String tgl = "";
    public FormUSG(USGService usgService) {
        this.usgService = usgService;
        initComponents();
        isiid();
        cekdaftar();
        isitanggal();
        harga.setText("100000");
//        antrian();
        try {
            tableModelusg.setData(this.usgService.getUSG());
        } catch (RemoteException exception) {
            exception.printStackTrace();
        }
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
        tanggal.setText("");
        hasil.setText("");
        deskrip.setText("");
        harga.setText("");
    }

    private void cekdaftar(){
        try {
            antrian=usgService.Id_pasien(antrian);
            if(antrian.getId_Pasien()=="kosong"){
                JOptionPane.showMessageDialog(null, "Belum ada antrian");
                cekdaftar();
            }
            else if(antrian.getId_Pasien()=="salah"){
                JOptionPane.showMessageDialog(null, "Tidak terkoneksi ke database");
                cekdaftar();
            }
            else{
                idpasien.setText(antrian.getId_Pasien());
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isitanggal(){
        Date date=new Date();
        tgl=tgl+Integer.toString(date.getDate())+"/";
        if(date.getMonth()<9){
            tgl=tgl+"0"+Integer.toString((date.getMonth()+1))+"/";
        }
        else{
             tgl=tgl+Integer.toString((date.getMonth()+1))+"/";
        }
        tgl=tgl+Integer.toString((date.getYear()+1900));
        tanggal.setText(tgl);
    }
    
    public void kembaliawal() {
        isiid();
        cekdaftar();
        isitanggal();
        harga.setText("100000");
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
        pilih = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskrip = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        panelGambar1 = new ClientApplication.form.PanelGambar();
        jLabel6 = new javax.swing.JLabel();

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

        pilih.setText("Pilih");
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        jPanel1.add(pilih);
        pilih.setBounds(530, 270, 51, 23);

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
        simpan.setBounds(520, 510, 67, 23);

        javax.swing.GroupLayout panelGambar1Layout = new javax.swing.GroupLayout(panelGambar1);
        panelGambar1.setLayout(panelGambar1Layout);
        panelGambar1Layout.setHorizontalGroup(
            panelGambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        panelGambar1Layout.setVerticalGroup(
            panelGambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(panelGambar1);
        panelGambar1.setBounds(690, 260, 190, 200);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/6.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
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
    if (idpasien.getText().equals("") || idusg.getText().equals("")|| tanggal.getText().equals("")|| hasil.getText().equals("") || deskrip.getText().equals("") || harga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
   }
    else{
         USG usg=new USG();
         usg.setId_pasien(idpasien.getText());
         usg.setId_USG(idusg.getText());
         usg.setHarga(Integer.parseInt(harga.getText()));
         usg.setTanggal(tanggal.getText());
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
                 Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
               }
            usg.setHasil(outputStream.toByteArray());
           }
        try {
            usgService.insertUSG(usg);
        } catch (RemoteException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            usgService.ubahstatus(antrian.getId_Antrian());
             JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke database");
        } catch (RemoteException ex) {
            Logger.getLogger(FormUSG.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan karena gagal koneksi ke database");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField namapasien;
    private ClientApplication.form.PanelGambar panelGambar1;
    private javax.swing.JButton pilih;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField tanggal;
    // End of variables declaration//GEN-END:variables

}
