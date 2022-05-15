
package cpit380.project;

import AhmadClassCPIT380.MovieMaker;
import java.awt.Dimension;
import java.awt.Toolkit;


public class MovieOperations extends javax.swing.JFrame {

    
     public void centeredFrame (javax.swing.JFrame objFrame)
    {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    
    public MovieOperations() {
        initComponents();
          centeredFrame(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        BackwardButton = new javax.swing.JButton();
        rectangleMovie = new javax.swing.JButton();
        tickertapeMovie = new javax.swing.JButton();
        sunsetMovie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(626, 366));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 255));
        jLabel7.setText("Movie Operations");

        BackwardButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BackwardButton.setText("← ");
        BackwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackwardButtonActionPerformed(evt);
            }
        });

        rectangleMovie.setText("Rectangle Movie");
        rectangleMovie.setMaximumSize(new java.awt.Dimension(87, 32));
        rectangleMovie.setMinimumSize(new java.awt.Dimension(87, 32));
        rectangleMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleMovieActionPerformed(evt);
            }
        });

        tickertapeMovie.setText("Tickertape Movie");
        tickertapeMovie.setMaximumSize(new java.awt.Dimension(87, 32));
        tickertapeMovie.setMinimumSize(new java.awt.Dimension(87, 32));
        tickertapeMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tickertapeMovieActionPerformed(evt);
            }
        });

        sunsetMovie.setText("Sunset Movie");
        sunsetMovie.setMaximumSize(new java.awt.Dimension(87, 32));
        sunsetMovie.setMinimumSize(new java.awt.Dimension(87, 32));
        sunsetMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunsetMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackwardButton)
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sunsetMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tickertapeMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectangleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(54, 54, 54)
                        .addComponent(rectangleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(tickertapeMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(sunsetMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackwardButtonActionPerformed
        main backwardFrame = new main();
        this.setVisible(false);
        backwardFrame.setVisible(true);
    }//GEN-LAST:event_BackwardButtonActionPerformed

    private void rectangleMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleMovieActionPerformed
        String dir = "\\rectangle";
        new MovieMaker().makeRectangleMovie(dir);
    }//GEN-LAST:event_rectangleMovieActionPerformed

    private void tickertapeMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tickertapeMovieActionPerformed
        String dir = "\\rectangle";
        new MovieMaker().makeTickerTapeMovie(dir, "Tickertape Movie");
    }//GEN-LAST:event_tickertapeMovieActionPerformed

    private void sunsetMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunsetMovieActionPerformed
        String dir = "\\sunset";
        new MovieMaker().makeSunsetMovie(dir);
    }//GEN-LAST:event_sunsetMovieActionPerformed

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
            java.util.logging.Logger.getLogger(MovieOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackwardButton;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton rectangleMovie;
    private javax.swing.JButton sunsetMovie;
    private javax.swing.JButton tickertapeMovie;
    // End of variables declaration//GEN-END:variables
}
