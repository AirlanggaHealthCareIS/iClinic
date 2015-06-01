package ClientApplication;

import Database.Service.AdministratorService;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

public class Splash extends javax.swing.JFrame {
//    Registry registry = LocateRegistry.getRegistry("localhost", 6789);
//    final AdministratorService service = (AdministratorService) registry.lookup("service");
//    FormLogin logForm = new FormLogin(service);
    
    Registry registry;
    AdministratorService service;
    FormLogin logForm;
    String ipServer = "";
    BufferedReader br;
    File file = new File("ipserver.txt");
    
    public Splash() throws RemoteException, NotBoundException{
        initComponents();
        setLocationRelativeTo(this);
        
        try{
            if(file.exists()){
                br = new BufferedReader(new FileReader(file));
                ipServer = br.readLine();
                ipServerField.setEnabled(false);
                ipServerField.setText(ipServer);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ipServerField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Caviar Dreams", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        inButton.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        inButton.setText("IN");
        inButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        jLabel2.setText("IP Server:");

        ipServerField.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        ipServerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(inButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ipServerField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ipServerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inButtonActionPerformed
        try {
            ipServer = ipServerField.getText();
            registry = LocateRegistry.getRegistry(ipServer, 6789);
            service = (AdministratorService)registry.lookup("service");
            logForm = new FormLogin(service);
            
            logForm.setVisible(true);
            this.dispose();
        } catch (RemoteException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            if(file.createNewFile()){
                System.out.println("File berhasil dibuat!");
            } else {
                System.out.println("File sudah pernah dibuat!");
            }
            
            FileWriter writer = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bf = new BufferedWriter(writer);
            
            bf.write(ipServer);
            bf.close();
            System.out.println("Oke selesai. Sekarang cek isi file!");
        } catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_inButtonActionPerformed

    public String getIPServer(){
        return ipServer;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Splash().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NotBoundException ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inButton;
    private javax.swing.JTextField ipServerField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
