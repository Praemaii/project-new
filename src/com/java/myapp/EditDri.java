/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.myapp;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import java.awt.Cursor;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import org.json.JSONObject;

/**
 *
 * @author Acer
 */
public class EditDri extends javax.swing.JFrame {

    DBCollection table;
    DB db;
    String[] messageString = {};

    /**
     * Creates new form EditDri
     */
    public EditDri() {
        initComponents();
        BasicDBObject document = new BasicDBObject();

        MongoClient mongo;
        try {
            mongo = new MongoClient("localhost", 27017);
            db = mongo.getDB("mini");
            table = db.getCollection("users");

        } catch (UnknownHostException ex) {
            Logger.getLogger(รวมม.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        pv = new javax.swing.JTextField();
        stt = new javax.swing.JTextField();
        lp = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        lc = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        pk = new javax.swing.JTextField();
        dt = new javax.swing.JTextField();
        ff = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel9.setText("SubDistrict");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 108, -1));

        jLabel10.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel10.setText("License");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 80, -1));

        jLabel11.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel11.setText("Province");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 80, -1));

        jLabel12.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel12.setText("District");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 80, -1));

        jLabel13.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel13.setText("Parking");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 80, -1));

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel5.setText("Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel6.setText("License Plate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel7.setText("ID Card");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 129, -1));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 130, -1));

        jLabel14.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel14.setText("First Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 228, 40));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 244, 33));
        getContentPane().add(pv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 228, 33));
        getContentPane().add(stt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 228, 33));
        getContentPane().add(lp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 230, 33));
        getContentPane().add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 228, 33));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 240, 33));
        getContentPane().add(lc, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 244, 33));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        getContentPane().add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 230, 33));
        getContentPane().add(pk, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 244, 33));
        getContentPane().add(dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 244, 33));

        ff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffActionPerformed(evt);
            }
        });
        getContentPane().add(ff, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 230, 40));

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 90, 40));

        jLabel15.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel15.setText("on/off");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 80, -1));

        jLabel16.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        jLabel16.setText("CarType");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 80, -1));
        getContentPane().add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 244, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\r.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Exdriver exd = new Exdriver();
        exd.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void removeAllDocuments(DBCollection collection) {
        collection.remove(new BasicDBObject());
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BasicDBObject document = new BasicDBObject();
        MongoClient mongo;
        try {
            mongo = new MongoClient("localhost", 27017);
            db = mongo.getDB("mini");
            table = db.getCollection("users");
        } catch (UnknownHostException ex) {
            Logger.getLogger(redriver.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (id.getText().length() != 13) {
            JOptionPane.showMessageDialog(this, "กรุณากรอกเลขบัตรประชาชน 13 หลัก");
            id.requestFocus();
            return;
        } else if (fn.getText().isEmpty() && ln.getText().isEmpty() && n.getText().isEmpty() && id.getText().isEmpty() && lp.getText().isEmpty() && lc.getText().isEmpty() && pv.getText().isEmpty() && dt.getText().isEmpty() && sdt.getText().isEmpty() && pk.getText().isEmpty() && stt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "โปรดกรอกข้อมูล");
        } else if (fn.getText().isEmpty() || ln.getText().isEmpty() || n.getText().isEmpty() || id.getText().isEmpty() || lp.getText().isEmpty() || lc.getText().isEmpty() || pv.getText().isEmpty() || dt.getText().isEmpty() || sdt.getText().isEmpty() || pk.getText().isEmpty() || stt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "โปรดกรอกข้อมูลให้ครบ");
        } else {
            //Update ข้อมูลจากชื่อที่เลือก
            BasicDBObject updateDocument = new BasicDBObject();
            BasicDBObject searchQuery2 = new BasicDBObject().append("First Name", ff.getText());
            updateDocument.append("$set", new BasicDBObject().append("First Name", fn.getText()).append("Last Name", ln.getText()).append("Number", n.getText()).append("ID CARD", id.getText()).append("License Plate", lp.getText()).append("License", lc.getText()).append("Province", pv.getText()).append("District", dt.getText()).append("SubDistrict", sdt.getText()).append("Parking", pk.getText()).append("on/off", stt.getText()).append("CarType", ct.getText()));

            table.updateMulti(searchQuery2, updateDocument);
            JOptionPane.showMessageDialog(this, "Updated");

            Exdriver ex = new Exdriver();
            ex.show();
            this.hide();

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void ffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ffActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed

    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed

    }//GEN-LAST:event_lnActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //แสดงข้อมูลที่ค้นหาขึ้นในบล็อค
        BasicDBObject search = new BasicDBObject();
        search.put("First Name", ff.getText());

        DBCursor cursor = table.find(search);

        
        String Row = cursor.next().toString();
        JSONObject obj = new JSONObject(Row);
        System.out.println(Row);

        String Username = obj.getString("First Name");
        System.out.println("First Name: " + Username);

        fn.setText(obj.getString("First Name"));
        ln.setText(obj.getString("Last Name"));
        n.setText(obj.getString("Number"));
        id.setText(obj.getString("ID CARD"));
        lp.setText(obj.getString("License Plate"));
        lc.setText(obj.getString("License"));
        pv.setText(obj.getString("Province"));
        dt.setText(obj.getString("District"));
        sdt.setText(obj.getString("SubDistrict"));
        pk.setText(obj.getString("Parking"));
        stt.setText(obj.getString("on/off"));

        ct.setText(obj.getString("CarType"));


    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ct;
    private javax.swing.JTextField dt;
    private javax.swing.JTextField ff;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lc;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField lp;
    private javax.swing.JTextField n;
    private javax.swing.JTextField pk;
    private javax.swing.JTextField pv;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField stt;
    // End of variables declaration//GEN-END:variables

    private static class bufferdReader {

        private static Object readLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public bufferdReader() {
        }
    }
}
