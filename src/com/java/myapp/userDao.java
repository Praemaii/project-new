/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.myapp;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

/**
 *
 * @author Acer
 */
public class userDao implements Runnable {

    private JTable DisplayTB;
    private DefaultTableModel model;
    private JFrame F;

    @Override
    public void run() {
        while (true) {
            model = new DefaultTableModel();
            model.addColumn("#");
            model.addColumn("FirstTime");
            model.addColumn("Number");
            model.addColumn("ID CARD");
            model.addColumn("passenger");
            BasicDBObject document = new BasicDBObject();
            MongoClient mongo;

            try {
                mongo = new MongoClient("localhost", 27017);
                DB db = mongo.getDB("mini");
                DBCollection table = db.getCollection("queues");

                DBCursor c = table.find();
                int i = 0;
                while (c.hasNext()) {
                    i++;
                    String Row = c.next().toString();
                    JSONObject obj = new JSONObject(Row);
                    System.out.println(Row);
                    model.addRow(new Object[]{
                        i,
                        obj.getString("FirstTime"),
                        obj.getString("Number"),
                        obj.getString("ID CARD"),
                        obj.getString("passenger")
                    });
                }

            } catch (Exception ex) {

            }
            DisplayTB.setModel(model);
//        F.validate();
//        F.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public userDao(JTable DisplayTB, JFrame F) {
        this.DisplayTB = DisplayTB;
        this.F = F;
    }
    static DBCollection table;

    public static void getPassanger(JTextField ti) {
        BasicDBObject document = new BasicDBObject();
        MongoClient mongo;

        //เอาข้อมูล user มาแสดงที่ combobox
        try {
            mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("mini");
            DBCollection table = db.getCollection("passenger");

            DBCursor c = table.find();
            int i = 0;
            while (c.hasNext()) {
                i++;

                String Row = c.next().toString();
                JSONObject obj = new JSONObject(Row);
                cb.addItem(obj.getString("Username"));

            }
        } catch (Exception e) {

        }
    }

    public static void addUser(JTextField ti, JTextField n, JRadioButton g1, JRadioButton r1, JSONObject Data) {
        BasicDBObject document = new BasicDBObject();
        MongoClient mongo;
        try {
            mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("mini");
            table = db.getCollection("queues");
        } catch (UnknownHostException ex) {

        }
        //เมื่อกดเข้าต่อคิว ข้อมูลจะบันทึกลงฐานข้อมูล
        try {
            document.put("FirstTime", ti.getText());
            document.put("Number", n.getText());
            document.put("ID CARD", Data.getString("ID CARD"));
            document.put("passenger", cb.getItemCount());
        } catch (Exception e) {

        }

        if (g1.isSelected()) {
            document.put("passenger", g1.getText());
        } else {
            document.put("passenger", r1.getText());
        }
        table.insert(document);
        JOptionPane.showMessageDialog(null, "Success!!!");
    }


}
