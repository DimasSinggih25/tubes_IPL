/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelompok6
 */
public class Rental extends javax.swing.JFrame {
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_custid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtavl = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtfee = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtmerk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtmodl = new javax.swing.JTextField();
        txtjml = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 470));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rental", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(180, 10, 140, 28);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nomor Polisi");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 100, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NIK");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 70, 30);

        txt_custid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_custidActionPerformed(evt);
            }
        });
        txt_custid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_custidKeyPressed(evt);
            }
        });
        jPanel1.add(txt_custid);
        txt_custid.setBounds(180, 130, 140, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 170, 80, 30);
        jPanel1.add(txtname);
        txtname.setBounds(180, 170, 140, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tanggal Sewa");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 210, 110, 30);

        jLabel5.setText("-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 220, 30, 20);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Batal");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 380, 88, 37);
        jPanel1.add(txtavl);
        txtavl.setBounds(360, 80, 102, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Kembali");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 380, 89, 37);

        txtfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeeActionPerformed(evt);
            }
        });
        jPanel1.add(txtfee);
        txtfee.setBounds(180, 330, 139, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Status");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(370, 44, 70, 22);

        total.setBackground(new java.awt.Color(204, 204, 255));
        total.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        total.setText("Total");
        total.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel1.add(total);
        total.setBounds(10, 330, 60, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Merk");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 60, 90, 30);

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Ok");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(200, 380, 88, 37);

        txtmerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmerkActionPerformed(evt);
            }
        });
        jPanel1.add(txtmerk);
        txtmerk.setBounds(180, 50, 140, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Harga");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 290, 100, 30);

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        jPanel1.add(txtharga);
        txtharga.setBounds(180, 290, 139, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Model");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(11, 94, 90, 30);
        jPanel1.add(txtmodl);
        txtmodl.setBounds(180, 90, 140, 30);
        jPanel1.add(txtjml);
        txtjml.setBounds(180, 250, 139, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Hari Sewa");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 250, 90, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgb.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 500, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 9, 500, 430);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgb.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 520, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_custidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_custidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_custidActionPerformed
    
    private void txt_custidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_custidKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_custidKeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_totalActionPerformed

    private void txtdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtdatePropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtdatePropertyChange

    private void txtduePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtduePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtduePropertyChange

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfeeActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtmerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmerkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton total;
    private javax.swing.JTextField txt_custid;
    private javax.swing.JTextField txtavl;
    private javax.swing.JTextField txtfee;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjml;
    private javax.swing.JTextField txtmerk;
    private javax.swing.JTextField txtmodl;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
