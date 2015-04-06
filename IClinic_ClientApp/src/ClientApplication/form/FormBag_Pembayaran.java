/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.Splash;
import ClientApplication.model.TableModelPembayaran;
import Database.Entity.Pembayaran;
import Database.Service.Bag_PembayaranService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
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
public class FormBag_Pembayaran extends javax.swing.JFrame {
    
    private TableModelPembayaran tableModelPembayaran = new TableModelPembayaran();
    private Bag_PembayaranService bag_PembayaranService;
    
    public FormBag_Pembayaran(Bag_PembayaranService bag_PembayaranService) {
        this.bag_PembayaranService = bag_PembayaranService;
        try{
            tableModelPembayaran.setData(this.bag_PembayaranService.getPembayaran());
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(this);
        setSize(665, 730);

        Table_Bahan.setModel(tableModelPembayaran);
        Table_Bahan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = Table_Bahan.getSelectedRow();
                if(row != -1){
                    Pembayaran pembayaran = tableModelPembayaran.get(row);
                    TextField_idPembayaran.setText(pembayaran.getId_Pembayaran());
                    TextField_tglPembayaran.setValue(pembayaran.getTanggal_Bayar());
                    TextField_Usg.setText(String.valueOf(pembayaran.getId_USG()));
                    TextField_Lab.setText(String.valueOf(pembayaran.getId_Detail_Lab()));
                    TextField_RekamMedis.setText(String.valueOf(pembayaran.getId_Rekam()));
                    TextField_Kecantikan.setText(String.valueOf(pembayaran.getId_Transaksi_Layanan()));
                    TextField_totalPembayaran.setText(String.valueOf(pembayaran.getTotal_Harga()));
                }
            }
        });
    }
    
    public void clear(){
        TextField_idPasien.setText("");
        TextField_namaPasien.setText("");
        TextField_idPembayaran.setText("");
        TextField_tglPembayaran.setText("");
        TextField_Kecantikan.setText("");
        TextField_Lab.setText("");
        TextField_RekamMedis.setText("");
        TextField_Usg.setText("");
        TextField_totalPembayaran.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_Tunai = new javax.swing.JButton();
        button_Debit = new javax.swing.JButton();
        button_Print = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        button_Delete = new javax.swing.JButton();
        button_Update = new javax.swing.JButton();
        button_Exit = new javax.swing.JButton();
        Label_RekamMedis = new javax.swing.JLabel();
        TextField_RekamMedis = new javax.swing.JTextField();
        Label_Lab = new javax.swing.JLabel();
        TextField_Lab = new javax.swing.JTextField();
        Label_Usg = new javax.swing.JLabel();
        TextField_Usg = new javax.swing.JTextField();
        Label_Kecantikan = new javax.swing.JLabel();
        TextField_Kecantikan = new javax.swing.JTextField();
        Label_totalPembayaran = new javax.swing.JLabel();
        TextField_totalPembayaran = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Label_idPasien = new javax.swing.JLabel();
        TextField_idPasien = new javax.swing.JTextField();
        Label_namaPasien = new javax.swing.JLabel();
        TextField_namaPasien = new javax.swing.JTextField();
        Label_idPembayaran = new javax.swing.JLabel();
        TextField_idPembayaran = new javax.swing.JTextField();
        Label_tglPembayaran = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Bahan = new javax.swing.JTable();
        TextField_tglPembayaran = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM PEMBAYARAN");
        setMaximumSize(new java.awt.Dimension(1370, 730));
        setMinimumSize(new java.awt.Dimension(1370, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        button_Tunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Tunai.png"))); // NOI18N
        getContentPane().add(button_Tunai);
        button_Tunai.setBounds(40, 610, 65, 65);

        button_Debit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Debit.png"))); // NOI18N
        getContentPane().add(button_Debit);
        button_Debit.setBounds(150, 610, 65, 65);

        button_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Printer.png"))); // NOI18N
        button_Print.setEnabled(false);
        getContentPane().add(button_Print);
        button_Print.setBounds(450, 610, 65, 65);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Daftar Pembayaran");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(590, 210, 220, 29);

        button_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Delete.png"))); // NOI18N
        getContentPane().add(button_Delete);
        button_Delete.setBounds(1150, 380, 65, 65);

        button_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Update.png"))); // NOI18N
        getContentPane().add(button_Update);
        button_Update.setBounds(1150, 270, 65, 65);

        button_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Exit.png"))); // NOI18N
        getContentPane().add(button_Exit);
        button_Exit.setBounds(1150, 610, 65, 65);

        Label_RekamMedis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_RekamMedis.setText("REKAM MEDIS");
        getContentPane().add(Label_RekamMedis);
        Label_RekamMedis.setBounds(40, 410, 230, 29);

        TextField_RekamMedis.setEditable(false);
        TextField_RekamMedis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(TextField_RekamMedis);
        TextField_RekamMedis.setBounds(280, 410, 250, 30);

        Label_Lab.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Lab.setText("LAB");
        getContentPane().add(Label_Lab);
        Label_Lab.setBounds(40, 450, 230, 29);

        TextField_Lab.setEditable(false);
        TextField_Lab.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(TextField_Lab);
        TextField_Lab.setBounds(280, 450, 250, 30);

        Label_Usg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Usg.setText("USG");
        getContentPane().add(Label_Usg);
        Label_Usg.setBounds(40, 490, 230, 29);

        TextField_Usg.setEditable(false);
        TextField_Usg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(TextField_Usg);
        TextField_Usg.setBounds(280, 490, 250, 30);

        Label_Kecantikan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Kecantikan.setText("KECANTIKAN");
        getContentPane().add(Label_Kecantikan);
        Label_Kecantikan.setBounds(40, 530, 230, 29);

        TextField_Kecantikan.setEditable(false);
        TextField_Kecantikan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(TextField_Kecantikan);
        TextField_Kecantikan.setBounds(280, 530, 250, 30);

        Label_totalPembayaran.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_totalPembayaran.setText("TOTAL PEMBAYARAN");
        getContentPane().add(Label_totalPembayaran);
        Label_totalPembayaran.setBounds(40, 570, 230, 29);

        TextField_totalPembayaran.setEditable(false);
        TextField_totalPembayaran.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(TextField_totalPembayaran);
        TextField_totalPembayaran.setBounds(280, 570, 250, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Search.png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 220, 40, 33);

        Label_idPasien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_idPasien.setText("ID PASIEN");
        getContentPane().add(Label_idPasien);
        Label_idPasien.setBounds(40, 220, 150, 29);

        TextField_idPasien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(TextField_idPasien);
        TextField_idPasien.setBounds(200, 220, 250, 30);

        Label_namaPasien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_namaPasien.setText("NAMA PASIEN");
        getContentPane().add(Label_namaPasien);
        Label_namaPasien.setBounds(40, 270, 150, 29);

        TextField_namaPasien.setEditable(false);
        TextField_namaPasien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(TextField_namaPasien);
        TextField_namaPasien.setBounds(200, 270, 250, 30);

        Label_idPembayaran.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_idPembayaran.setText("ID PEMBAYARAN");
        getContentPane().add(Label_idPembayaran);
        Label_idPembayaran.setBounds(40, 330, 230, 29);

        TextField_idPembayaran.setEditable(false);
        TextField_idPembayaran.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(TextField_idPembayaran);
        TextField_idPembayaran.setBounds(280, 330, 250, 30);

        Label_tglPembayaran.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_tglPembayaran.setText("TGL PEMBAYARAN");
        getContentPane().add(Label_tglPembayaran);
        Label_tglPembayaran.setBounds(40, 370, 230, 29);

        Table_Bahan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_Bahan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 260, 550, 430);

        TextField_tglPembayaran.setEditable(false);
        TextField_tglPembayaran.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        TextField_tglPembayaran.setValue(new java.util.Date());
        getContentPane().add(TextField_tglPembayaran);
        TextField_tglPembayaran.setBounds(280, 370, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/3.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(1370, 730));
        jLabel1.setMinimumSize(new java.awt.Dimension(1370, 730));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1370, 730));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Kecantikan;
    private javax.swing.JLabel Label_Lab;
    private javax.swing.JLabel Label_RekamMedis;
    private javax.swing.JLabel Label_Usg;
    private javax.swing.JLabel Label_idPasien;
    private javax.swing.JLabel Label_idPembayaran;
    private javax.swing.JLabel Label_namaPasien;
    private javax.swing.JLabel Label_tglPembayaran;
    private javax.swing.JLabel Label_totalPembayaran;
    private javax.swing.JTable Table_Bahan;
    private javax.swing.JTextField TextField_Kecantikan;
    private javax.swing.JTextField TextField_Lab;
    private javax.swing.JTextField TextField_RekamMedis;
    private javax.swing.JTextField TextField_Usg;
    private javax.swing.JTextField TextField_idPasien;
    private javax.swing.JTextField TextField_idPembayaran;
    private javax.swing.JTextField TextField_namaPasien;
    private javax.swing.JFormattedTextField TextField_tglPembayaran;
    private javax.swing.JTextField TextField_totalPembayaran;
    private javax.swing.JButton button_Debit;
    private javax.swing.JButton button_Delete;
    private javax.swing.JButton button_Exit;
    private javax.swing.JButton button_Print;
    private javax.swing.JButton button_Tunai;
    private javax.swing.JButton button_Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
