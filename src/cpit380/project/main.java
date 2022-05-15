package cpit380.project;

import AhmadClassCPIT380.Picture;
import AhmadClassCPIT380.Sound;

import javax.swing.*;
import java.awt.*;

public class main extends javax.swing.JFrame {

     public void centeredFrame (javax.swing.JFrame objFrame)
    {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    
    Picture init = new Picture();
    Picture pic = new Picture();
    ImageIcon icon = new ImageIcon();
    String name = null;
    String filename = null;

    Sound sound;
    Sound original;

    public main() { 
        
        initComponents();
          centeredFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SoundButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PictureButton1 = new javax.swing.JButton();
        movieButton = new javax.swing.JButton();
        AboutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SoundButton.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        SoundButton.setText("Sound");
        SoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Multimedia Editor");

        PictureButton1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        PictureButton1.setText("Picture");
        PictureButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PictureButton1ActionPerformed(evt);
            }
        });

        movieButton.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        movieButton.setText("Movie");
        movieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieButtonActionPerformed(evt);
            }
        });

        AboutBtn.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        AboutBtn.setText("About us");
        AboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(PictureButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(SoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(movieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(346, 346, 346))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PictureButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(movieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(AboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundButtonActionPerformed
        SoundOperations frame = new SoundOperations();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_SoundButtonActionPerformed

    private void PictureButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PictureButton1ActionPerformed
        PictureOperations frame = new PictureOperations();
        this.setVisible(false);
        frame.setVisible(true);    }//GEN-LAST:event_PictureButton1ActionPerformed

    private void movieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieButtonActionPerformed
        MovieOperations frame = new MovieOperations();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_movieButtonActionPerformed

    private void AboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutBtnActionPerformed
        AboutPanel about = new AboutPanel();
        about.setVisible(true);
    }//GEN-LAST:event_AboutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutBtn;
    private javax.swing.JButton PictureButton1;
    private javax.swing.JButton SoundButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton movieButton;
    // End of variables declaration//GEN-END:variables
}
