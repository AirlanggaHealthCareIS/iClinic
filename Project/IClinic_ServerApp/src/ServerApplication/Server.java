package ServerApplication;

import ServerApplication.Service.AdministratorServiceServer;
import ServerApplication.Service.ApotekerServiceServer;
import ServerApplication.Service.Bag_PembayaranServiceServer;
import ServerApplication.Service.Bag_PendaftaranServiceServer;
import ServerApplication.Service.DokterServiceServer;
import ServerApplication.Service.KecantikanServiceServer;
import ServerApplication.Service.KepalaKlinikServiceServer;
import ServerApplication.Service.LabServiceServer;
import ServerApplication.Service.USGServiceServer;
import java.awt.HeadlessException;
import java.rmi.AccessException;
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

public class Server extends javax.swing.JFrame {

    Registry server = LocateRegistry.createRegistry(6789);
        
    AdministratorServiceServer administratorServiceServer = new AdministratorServiceServer();
    ApotekerServiceServer apotekerServiceServer = new ApotekerServiceServer();
    Bag_PembayaranServiceServer bag_PembayaranServiceServer = new Bag_PembayaranServiceServer();
    Bag_PendaftaranServiceServer bag_PendaftaranServiceServer = new Bag_PendaftaranServiceServer();
    DokterServiceServer dokterServiceServer = new DokterServiceServer();
    KecantikanServiceServer kecantikanServiceServer = new KecantikanServiceServer();
    KepalaKlinikServiceServer kepalaKlinikServiceServer = new KepalaKlinikServiceServer();
    LabServiceServer labServiceServer = new LabServiceServer();
    USGServiceServer uSGServiceServer = new USGServiceServer();
    
    public Server() throws RemoteException {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server");
        setPreferredSize(new java.awt.Dimension(300, 150));

        jLabel1.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to iClinic Server!");

        startButton.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopButton)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(stopButton))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
            server.rebind("service", administratorServiceServer);
            server.rebind("service1", apotekerServiceServer);
            server.rebind("service2", bag_PembayaranServiceServer);
            server.rebind("service3", bag_PendaftaranServiceServer);
            server.rebind("service4", dokterServiceServer);
            server.rebind("service5", kecantikanServiceServer);
            server.rebind("service6", kepalaKlinikServiceServer);
            server.rebind("service7", labServiceServer);
            server.rebind("service8", uSGServiceServer);
            
            JOptionPane.showMessageDialog(null, "Server aktif!", "Start Server", JOptionPane.INFORMATION_MESSAGE);
        
            startButton.setEnabled(false);
            stopButton.setEnabled(true);
        }
        catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Server gagal start!", "Error", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        try {
            server.unbind("service");
            server.unbind("service1");
            server.unbind("service2");
            server.unbind("service3");
            server.unbind("service4");
            server.unbind("service5");
            server.unbind("service6");
            server.unbind("service7");
            server.unbind("service8");
            
            JOptionPane.showMessageDialog(null, "Server telah di-nonaktif-kan!", "Stop Server", JOptionPane.INFORMATION_MESSAGE);
            
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Server gagal stop!", "Error", JOptionPane.ERROR);
        } catch (NotBoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Server gagal stop!", "Error", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_stopButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Server().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
