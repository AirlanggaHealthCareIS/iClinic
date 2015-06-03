/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormSuplier.java
 *
 * Created on Jun 25, 2010, 9:35:19 PM
 */

package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelPembayaran;
import Database.Entity.Pembayaran;
import ClientApplication.model.TableModelPasien;
import Database.Entity.Pasien;
import ClientApplication.model.TableModelObat_detailResep;
import Database.Entity.Obat_detailResep;
import Database.Service.Kepala_KlinikService;
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
public class FormKepala_Klinik extends javax.swing.JFrame {
    Kepala_KlinikService a;
    TableModelPembayaran b = new TableModelPembayaran();
    Pembayaran c = new Pembayaran();
    

    public FormKepala_Klinik(Kepala_KlinikService kepala_KlinikService) {
        a=kepala_KlinikService;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Pembayaran");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 340, 130, 40);

        jButton2.setText("Jumlah Pasien");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 340, 130, 40);

        jButton3.setText("Cetak Rekam Medis");
        getContentPane().add(jButton3);
        jButton3.setBounds(790, 340, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/9.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1318, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            b.setData(a.getPembayaran());
        } catch (RemoteException ex) {
            Logger.getLogger(FormKepala_Klinik.class.getName()).log(Level.SEVERE, null, ex);
        }
//<<<<<<< Updated upstream
////        Table_Pembayaran.setModel(b);
//=======
//      //  Table_Pembayaran.setModel(b);
//>>>>>>> Stashed changes
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
