/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_102;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author xploiter
 */
public class Admin extends javax.swing.JFrame {
        Connection connection;
        Statement stmt = null;
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student's Name", "Level", "Subject", "authorized"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organizer ID", "Event Name", "description", "location", "Total seats", "timestamp"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("USERS");

        jLabel2.setText("EVENTS");

        jButton1.setText("Load User data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Load events");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("UPDATE EVENTS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("UPDATE USER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booked By", "Event Name", "Location", "Description ", "Organizer"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel4.setText("Bookings");

        jButton4.setText("jButton4");

        jButton7.setText("UPDATE BOOKING");

        jButton8.setText("UPDATE BOOKING");

        jButton9.setText("DELETE BOOKING");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("DELETE EVENT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("DELETE USER");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("LOAD BOOKING");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton5)
                            .addGap(236, 236, 236)
                            .addComponent(jButton10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addGap(481, 481, 481)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11)
                        .addGap(230, 230, 230))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(41, 41, 41)
                                .addComponent(jButton12)
                                .addGap(28, 28, 28))
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addGap(61, 61, 61)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton8)
                        .addGap(190, 190, 190)
                        .addComponent(jButton9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton12)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton10))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton9))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql2 = "SELECT * FROM student";
         ResultSet rs2 = stmt.executeQuery(sql2);
    
         boolean booked = false;
         String s_booked = "";
         int student_id = 0 ; int level = 0;
         String username = ""; String subject = ""; String password = "";
         Boolean authorized = false;
        
        while(rs2.next()){
            student_id = rs2.getInt("student_id");
            username = rs2.getString("username");
            level = rs2.getInt("level");
            subject = rs2.getString("subject");
            password = rs2.getString("password");
            authorized = rs2.getBoolean("authorized");
              String s_student_id = Integer.toString(student_id);
        String s_level = Integer.toString(level);
        String s_authorized = "";
        if (authorized== true){
            s_authorized = "true";
        }else{
            s_authorized="false";
       }
       String[] data2 = {s_student_id, username , s_level , subject , s_authorized};
        javax.swing.table.DefaultTableModel tblModel1 = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        tblModel1.addRow(data2);
     
       }
      
       }catch(SQLException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql1 = "SELECT * FROM program";
         ResultSet rs1 = stmt.executeQuery(sql1);
         int organizer_id = 0 ; 
         String event_name = "" , location = "", timestamp="" , description="";
         int remaining_seats =0;
         boolean booked = false;
         String s_booked = "";
      
        while(rs1.next()){
            organizer_id = rs1.getInt("organizer_id");
            event_name = rs1.getString("event_name");
            description = rs1.getString("description");
            location = rs1.getString("location");
            remaining_seats = rs1.getInt("remaining_seats");
            timestamp = rs1.getString("timestamp");
       
        String s_organizer_id = Integer.toString(organizer_id);
        String s_remaining_seats = Integer.toString(remaining_seats);
        String[] data = {s_organizer_id, event_name , description , location , 
        s_remaining_seats, timestamp, "Yet to be made"};
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel)jTable2.getModel();
        tblModel.addRow(data);
        }
       
      
       }catch(SQLException e){
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel)jTable2.getModel();
      if(jTable2.getSelectedRowCount() == 1){
        int row = jTable2.getSelectedRow();
        String event_name = jTable2.getModel().getValueAt(row, 1).toString();
        System.out.println(event_name);
        this.dispose();
        new UpdateEvent(event_name).setVisible(true);
           
           
      }else{
           if(jTable2.getSelectedRowCount() == 0){
               JOptionPane.showMessageDialog(this , "Table is empty");
           }else{
               JOptionPane.showMessageDialog(this, "Please select one at a time");
           }
       }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel)jTable1.getModel();
       if(jTable1.getSelectedRowCount() == 1){
           int row = jTable1.getSelectedRow();
           String id = jTable1.getModel().getValueAt(row, 0).toString();
           int _id = Integer.parseInt(id);
////           System.out.println(id);
           this.dispose();
           new UpdateUser(_id).setVisible(true);
           
           
       }else{
           if(jTable1.getSelectedRowCount() == 0){
               JOptionPane.showMessageDialog(this , "Table is empty");
           }else{
               JOptionPane.showMessageDialog(this, "Please select one at a time");
           }
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
       try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");

         stmt = connection.createStatement();
         String sql = "SELECT * FROM booking";
         ResultSet rs = stmt.executeQuery(sql);
         int booked_by = 0 ; 
         String event_name = "" , location = "", timestamp="" , description="";
         int organizer =0;
         
         while(rs.next()){
            booked_by = rs.getInt("booked_by");
            event_name = rs.getString("event_name");
            description = rs.getString("description");
            location = rs.getString("location");
            organizer = rs.getInt("organizer");
        String s_booked_by = Integer.toString(booked_by);
        String s_organizer = Integer.toString(organizer);
        String[] data = {s_booked_by, event_name, description , location , s_organizer};
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel)jTable3.getModel();
        tblModel.addRow(data);
         }

       
       }catch(SQLException e){
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
       javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel)jTable1.getModel();
       if(jTable1.getSelectedRowCount() == 1){
           int row = jTable1.getSelectedRow();
           String id = jTable1.getModel().getValueAt(row, 0).toString();
           int _id = Integer.parseInt(id);
////           System.out.println(id);
           new Db().delete_user(_id);
           JOptionPane.showMessageDialog(this, "User deleted successfully!");
           
           
       }else{
           if(jTable1.getSelectedRowCount() == 0){
               JOptionPane.showMessageDialog(this , "Table is empty");
           }else{
               JOptionPane.showMessageDialog(this, "Please select one at a time");
           }
       }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel)jTable2.getModel();
       if(jTable2.getSelectedRowCount() == 1){
           int row = jTable2.getSelectedRow();
           String event_name = jTable2.getModel().getValueAt(row, 1).toString();
////           System.out.println(id);
           new Db().delete_event(event_name);
           JOptionPane.showMessageDialog(this, "Event deleted successfully!");
           
           
       }else{
           if(jTable2.getSelectedRowCount() == 0){
               JOptionPane.showMessageDialog(this , "Table is empty");
           }else{
               JOptionPane.showMessageDialog(this, "Please select one at a time");
           }
       }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       javax.swing.table.DefaultTableModel tblModel = (javax.swing.table.DefaultTableModel)jTable3.getModel();
       if(jTable3.getSelectedRowCount() == 1){
           int row = jTable3.getSelectedRow();
           String event_name = jTable3.getModel().getValueAt(row, 1).toString();
////           System.out.println(id);
           new Db().delete_booking(event_name);
           JOptionPane.showMessageDialog(this, "Booking deleted successfully!");
           
           
       }else{
           if(jTable3.getSelectedRowCount() == 0){
               JOptionPane.showMessageDialog(this , "Table is empty");
           }else{
               JOptionPane.showMessageDialog(this, "Please select one at a time");
           }
       }
    }//GEN-LAST:event_jButton9ActionPerformed
    public void start(){
        new Admin().setVisible(true);

    }
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
