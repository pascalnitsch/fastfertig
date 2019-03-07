/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzer;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author pasca
 */
public class startbild extends javax.swing.JFrame {

    /**
     * Creates new form startbild
     */
    public startbild() {
        initComponents();
        //this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = 1280;
        int ysize = 1024;
        this.setSize(xsize, ysize);
        mysettings();
    }
     
     private String pass = null;
     private String ben = null;
     private String Spass = "menne";
     private String Sben = "jan";
     private String Spass1 = null;
     private String Spass2 = null;
     private ImageIcon pic2;
     private ImageIcon pic1;
     
     private void mysettings(){
         strt.setVisible(true);
         einlogg.setVisible(false);
         registrieren.setVisible(false);
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/Fertiges.mini.logo.png")));
         pic2 = new ImageIcon(getClass().getResource("/image/idk.png"));
         pic1 = new ImageIcon(getClass().getResource("/image/idk1.png"));
         
     }
     
    private void einloggen(){
        ben = jTextField1.getText();
        pass = String.valueOf(jPasswordField1.getPassword());
             if(Sben.equals(ben) && Spass.equals(pass)){ 
               // dispose();
                NewJFrame quiz = new NewJFrame();
                quiz.setVisible(true);
                this.dispose();
                
            } else {
                System.out.println(pass);
                System.out.println(ben);
                //dispose();
                jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
                jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
                jPasswordField1.setText(null);
            }
    }
    
    private void regist (){
        Spass1  = String.valueOf(jPasswordField2.getPassword());
        Spass2  = String.valueOf(jPasswordField3.getPassword());
        if(Spass1.equals(Spass2)){
            Spass = Spass1;
            Sben = jTextField2.getText();
            registrieren.setVisible(false);
            strt.setVisible(true);
        } else {
            jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
            jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
            jPasswordField2.setText(null);
            jPasswordField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, Color.red));
            jPasswordField3.setText(null);
            jPasswordField2.requestFocusInWindow();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        einlogg = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        strt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registrieren = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        einlogg.setBackground(new java.awt.Color(255, 255, 255));
        einlogg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fertiges.Logo.png"))); // NOI18N
        einlogg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        einlogg.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 300, -1));

        jPasswordField1.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        einlogg.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 300, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/anm1.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        einlogg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 700, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Benutzername:");
        einlogg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Passwort:");
        einlogg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, -1, -1));

        getContentPane().add(einlogg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        strt.setBackground(new java.awt.Color(255, 255, 255));
        strt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/regist.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        strt.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/anm1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        strt.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fertiges.Logo.png"))); // NOI18N
        strt.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/schliessen.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        strt.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, -1, -1));

        getContentPane().add(strt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        registrieren.setBackground(new java.awt.Color(255, 255, 255));
        registrieren.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fertiges.Logo.png"))); // NOI18N
        registrieren.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        registrieren.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 300, -1));

        jPasswordField2.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });
        registrieren.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 300, -1));

        jPasswordField3.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyPressed(evt);
            }
        });
        registrieren.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 300, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Registrieren");
        registrieren.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 815, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Benutzername:");
        registrieren.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Passwort:");
        registrieren.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Passwort wiederholen:");
        registrieren.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/idk1.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        registrieren.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 810, -1, -1));

        getContentPane().add(registrieren, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1024));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        dispose();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        //NewJFrame quiz = new NewJFrame();
        //quiz.setVisible(true);
        strt.setVisible(false);
        einlogg.setVisible(true);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            einloggen();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
            einloggen();
    }//GEN-LAST:event_jLabel6MousePressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jPasswordField1.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        ImageIcon f2 = new ImageIcon(getClass().getResource("/image/schliessen1.png"));
       jLabel4.setIcon(f2);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
         ImageIcon f3 = new ImageIcon(getClass().getResource("/image/schliessen.png"));
       jLabel4.setIcon(f3);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        ImageIcon f24 = new ImageIcon(getClass().getResource("/image/regist1.png"));
       jLabel1.setIcon(f24);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        ImageIcon f4 = new ImageIcon(getClass().getResource("/image/regist.png"));
       jLabel1.setIcon(f4);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        ImageIcon fr24 = new ImageIcon(getClass().getResource("/image/anm.png"));
       jLabel2.setIcon(fr24);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       ImageIcon frr24 = new ImageIcon(getClass().getResource("/image/anm1.png"));
       jLabel2.setIcon(frr24);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jPasswordField2.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jPasswordField3.requestFocusInWindow();
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jPasswordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            regist();
        }
    }//GEN-LAST:event_jPasswordField3KeyPressed

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jLabel13.setIcon(pic2);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel13.setIcon(pic1);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
            regist();
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        strt.setVisible(false);
        registrieren.setVisible(true);
    }//GEN-LAST:event_jLabel1MousePressed

    
    
    
    

    
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
            java.util.logging.Logger.getLogger(startbild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startbild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startbild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startbild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startbild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel einlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel registrieren;
    private javax.swing.JPanel strt;
    // End of variables declaration//GEN-END:variables
}
