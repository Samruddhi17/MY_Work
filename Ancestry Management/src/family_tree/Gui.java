/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package family_tree;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     * 
     
     */
    public Gui() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 255, 153));
        jDesktopPane1.setName(""); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jLabel4.setBounds(1230, 20, 50, 60);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButton1.setText("Construct");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(1070, 350, 210, 70);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButton4.setText("EXiT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(1060, 600, 220, 60);
        jDesktopPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download.png"))); // NOI18N
        jLabel1.setBounds(1230, 280, 60, 90);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stick_figure_search_clues_md_wm.jpg"))); // NOI18N
        jLabel6.setBounds(770, 200, 50, 50);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.jpg"))); // NOI18N
        jLabel5.setBounds(1240, 540, 80, 70);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jButton5.setText("Show My Tree");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(770, 470, 210, 70);
        jDesktopPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jButton6.setText("Start");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(1050, 80, 230, 60);
        jDesktopPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/family_tree_homepaged3jpe63.jpg"))); // NOI18N
        jLabel2.setBounds(0, -80, 790, 900);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jButton2.setText("Show all members added");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(770, 250, 260, 80);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dispose();
            Add1 d =new Add1();
            d.setVisible(true);
               DefaultTableModel model = (DefaultTableModel) d.jTable1.getModel();
               MongoClient mongoClient = new MongoClient("localhost", 27017);
                     DB db = mongoClient.getDB("FamilyDb");
                     DBCollection coll = db.getCollection("MyFamily");
                         DBCursor cursor = coll.find();
                         try {
                             while (cursor.hasNext()) {
                              DBObject o = cursor.next();
                        String fname = (String) o.get("Firstname") ; 
                        String lname = (String) o.get("Lastname") ; 
                        String rel = (String) o.get("Relationship") ; 
                        String gen = (String) o.get("Gender") ;
                        String stat = (String) o.get("Status") ;
                        String dob = (String) o.get("Dob") ;
                        String age = (String) o.get("Age") ;
                         
                    model.addRow(new Object[]{fname,lname,gen,rel,age,dob,stat});
                     
                             }
                         } finally {
                             cursor.close();
                  }                                        

        } catch (UnknownHostException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
       
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       dispose();
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        try {
            dispose();
            SearchHeads s = new SearchHeads();
            s.setVisible(true);
           DefaultTableModel model = (DefaultTableModel) s.jTable1.getModel();
            MongoClient mongoClient = new MongoClient("localhost", 27017);
                     DB db = mongoClient.getDB("FamilyDb");
                     DBCollection coll = db.getCollection("MyFamily");
                         DBCursor cursor = coll.find();
                         try {
                             while (cursor.hasNext()) {
                              DBObject o = cursor.next();
                        String fname = (String) o.get("Firstname") ; 
                        String lname = (String) o.get("Lastname") ; 
                        String rel = (String) o.get("Relationship") ; 
                        String gen = (String) o.get("Gender") ;
                        String stat = (String) o.get("Status") ;
                        String dob = (String) o.get("Dob") ;
                        String age = (String) o.get("Age") ;
                 
                  if("MySelf".equals(rel)){
                     model.addRow(new Object[]{fname,lname,gen,rel,age,dob,stat});
                 }       
                        
                
                 
                             }
                         } finally {
                             cursor.close();
                  }                                        

        } catch (UnknownHostException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
       
        }
        
       
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         dispose();
        Start s= new Start();
       s.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            dispose();
           ShowAll s = new ShowAll();
            s.setVisible(true);
               DefaultTableModel model = (DefaultTableModel) s.jTable1.getModel();
               MongoClient mongoClient = new MongoClient("localhost", 27017);
                     DB db = mongoClient.getDB("FamilyDb");
                     DBCollection coll = db.getCollection("MyFamily");
                         DBCursor cursor = coll.find();
                         try {
                             while (cursor.hasNext()) {
                              DBObject o = cursor.next();
                        String fname = (String) o.get("Firstname") ; 
                        String lname = (String) o.get("Lastname") ; 
                        String rel = (String) o.get("Relationship") ; 
                        String gen = (String) o.get("Gender") ;
                        String stat = (String) o.get("Status") ;
                        String dob = (String) o.get("Dob") ;
                        String age = (String) o.get("Age") ;
                         
                    model.addRow(new Object[]{fname,lname,gen,rel,age,dob,stat});
                     
                             }
                         } finally {
                             cursor.close();
                  }                                        

        } catch (UnknownHostException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
       
        }
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}