package ClientApplication;

import ClientApplication.form.FormAdministrator;
import ClientApplication.form.FormApoteker;
import ClientApplication.form.FormBag_Pembayaran;
import ClientApplication.form.FormBag_Pendaftaran;
import ClientApplication.form.FormDokter;
import ClientApplication.form.FormKecantikan;
import ClientApplication.form.FormKepala_Klinik;
import ClientApplication.form.FormLab;
import ClientApplication.form.FormUSG;
import Database.Service.AdministratorService;
import Database.Service.ApotekerService;
import Database.Service.Bag_PembayaranService;
import Database.Service.Bag_PendaftaranService;
import Database.Service.DokterService;
import Database.Service.KecantikanService;
import Database.Service.Kepala_KlinikService;
import Database.Service.LabService;
import Database.Service.USGService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author piudt
 */

public class FormLogin extends javax.swing.JFrame {
    
    Registry registry = LocateRegistry.getRegistry("localhost", 6789);
    final AdministratorService service = (AdministratorService) registry.lookup("service");
    final ApotekerService service1 = (ApotekerService) registry.lookup("service1");
    final Bag_PembayaranService service2 = (Bag_PembayaranService) registry.lookup("service2");
    final Bag_PendaftaranService service3 = (Bag_PendaftaranService) registry.lookup("service3");
    final DokterService service4 = (DokterService) registry.lookup("service4");
    final KecantikanService service5 = (KecantikanService) registry.lookup("service5");
    final Kepala_KlinikService service6 = (Kepala_KlinikService) registry.lookup("service6");
    final LabService service7 = (LabService) registry.lookup("service7");
    final USGService service8 = (USGService) registry.lookup("service8");
    
    FormAdministrator formAdministrator = new FormAdministrator(service);
    FormApoteker formApoteker = new FormApoteker(service1);
    FormBag_Pembayaran formBag_Pembayaran = new FormBag_Pembayaran(service2);
    FormBag_Pendaftaran formBag_Pendaftaran = new FormBag_Pendaftaran(service3);
    FormDokter formDokter = new FormDokter(service4);
    FormKecantikan formKecantikan = new FormKecantikan(service5);
    FormKepala_Klinik formKepala_Klinik = new FormKepala_Klinik(service6);
    FormLab formLab = new FormLab(service7);
    FormUSG formUSG = new FormUSG(service8);
 
    private AdministratorService administratorService;
    
    public FormLogin(AdministratorService administratorService) throws RemoteException, NotBoundException{
        this.administratorService = administratorService;
        initComponents();
        setLocationRelativeTo(this);
    }
    
    public FormLogin() throws RemoteException, NotBoundException{
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(1280, 730));
        setMinimumSize(new java.awt.Dimension(1280, 730));
        setPreferredSize(new java.awt.Dimension(1280, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        usernameField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        getContentPane().add(usernameField);
        usernameField.setBounds(610, 355, 180, 30);

        passwordField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        getContentPane().add(passwordField);
        passwordField.setBounds(610, 402, 180, 30);

        loginButton.setBackground(java.awt.Color.gray);
        loginButton.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(710, 450, 90, 40);

        clearButton.setBackground(java.awt.Color.gray);
        clearButton.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(610, 450, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if(usernameField.getText().equalsIgnoreCase("")||passwordField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Data yang Anda masukkan belum lengkap!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String user = usernameField.getText();
            System.out.println(user);
            String pass = passwordField.getText();
            System.out.println(pass);
            try {
                if(administratorService.loginUser(user, pass).equals("PENDAFTARAN")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Karyawan Bagian Pendaftaran!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formBag_Pendaftaran.setVisible(true);
                    this.dispose();
                }
                else if(administratorService.loginUser(user, pass).equals("Dokter")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Dokter!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formDokter.setVisible(true);
                    this.dispose();
                }
                else if(administratorService.loginUser(user, pass).equals("APOTEKER")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Apoteker!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formApoteker.setVisible(true);
                    this.dispose();
                }
                else if(administratorService.loginUser(user, pass).equals("LAB")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Karyawan Bagian Laboratorium!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formLab.setVisible(true);
                    this.dispose();    
                }
                else if(administratorService.loginUser(user, pass).equals("USG")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Karyawan Bagian USG!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formUSG.setVisible(true);
                    this.dispose();
                }
                else if(administratorService.loginUser(user, pass).equals("KECANTIKAN")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Karyawan Bagian Kecantikan!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formKecantikan.setVisible(true);
                    this.dispose();
                }
                else if(administratorService.loginUser(user, pass).equals("PEMBAYARAN")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Karyawan Bagian Pembayaran!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formBag_Pembayaran.setVisible(true);
                    this.dispose();
                }
                else if(administratorService.loginUser(user, pass).equals("KEP.KLINIK")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Kepala iClinic!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formKepala_Klinik.setVisible(true);
                    this.dispose();
                }
                else if(administratorService.loginUser(user, pass).equals("ADMINISTRATOR")){
                    JOptionPane.showMessageDialog(null, "Selamat Datang Administrator!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    formAdministrator.setVisible(true);
                    this.dispose();
                }
                else if(administratorService.loginUser(user, pass).equals("0")){
                    JOptionPane.showMessageDialog(null, "Maaf data yang anda masukkan salah, Silahkan mencoba kembali", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(RemoteException ex){
                Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        usernameField.setText("");
        passwordField.setText("");
        usernameField.requestFocus();
    }//GEN-LAST:event_clearButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

}
