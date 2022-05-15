package cpit380.project;

import AhmadClassCPIT380.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class SoundOperations extends javax.swing.JFrame {

     public void centeredFrame (javax.swing.JFrame objFrame)
    {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    Sound sound;
    Sound original;

    public SoundOperations() {
        initComponents();
          centeredFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        sound1 = new javax.swing.JButton();
        tripleSound = new javax.swing.JButton();
        IncreasePos = new javax.swing.JButton();
        PosHalfSpinner = new javax.swing.JSpinner();
        BackwardButton = new javax.swing.JButton();
        echoBtn = new javax.swing.JButton();
        echoValue = new javax.swing.JSpinner();
        sampleValue = new javax.swing.JSpinner();
        IncreaseNegative = new javax.swing.JButton();
        NegativeIncrease = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        normalizeBtn = new javax.swing.JButton();
        soundToTextBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Sound Operations");

        sound1.setText("Blend Two Samples");
        sound1.setMaximumSize(new java.awt.Dimension(87, 32));
        sound1.setMinimumSize(new java.awt.Dimension(87, 32));
        sound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sound1ActionPerformed(evt);
            }
        });

        tripleSound.setText("Sample");
        tripleSound.setMaximumSize(new java.awt.Dimension(87, 32));
        tripleSound.setMinimumSize(new java.awt.Dimension(87, 32));
        tripleSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tripleSoundActionPerformed(evt);
            }
        });

        IncreasePos.setText("Increase Positive Half");
        IncreasePos.setMaximumSize(new java.awt.Dimension(87, 32));
        IncreasePos.setMinimumSize(new java.awt.Dimension(87, 32));
        IncreasePos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncreasePosActionPerformed(evt);
            }
        });

        BackwardButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BackwardButton.setText("← ");
        BackwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackwardButtonActionPerformed(evt);
            }
        });

        echoBtn.setText("Echo");
        echoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                echoBtnActionPerformed(evt);
            }
        });

        IncreaseNegative.setText("Increase Negative Half");
        IncreaseNegative.setMaximumSize(new java.awt.Dimension(87, 32));
        IncreaseNegative.setMinimumSize(new java.awt.Dimension(87, 32));
        IncreaseNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncreaseNegativeActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        normalizeBtn.setText("Normalize");
        normalizeBtn.setMaximumSize(new java.awt.Dimension(87, 32));
        normalizeBtn.setMinimumSize(new java.awt.Dimension(87, 32));
        normalizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalizeBtnActionPerformed(evt);
            }
        });

        soundToTextBtn.setText("Sound to Text");
        soundToTextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundToTextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(echoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IncreasePos, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PosHalfSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(echoValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(tripleSound, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sampleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(IncreaseNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NegativeIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sound1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(normalizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundToTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackwardButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(echoBtn)
                            .addComponent(echoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NegativeIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IncreaseNegative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PosHalfSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IncreasePos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tripleSound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sampleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(88, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(normalizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(soundToTextBtn)
                                .addGap(0, 59, Short.MAX_VALUE))
                            .addComponent(jSeparator3))
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sound1ActionPerformed
        Sound sound1 = new Sound(FileChooser.pickAFile());
        Sound sound2 = new Sound(FileChooser.pickAFile());

        sound1.explore("Before");

        int value = 0;

        if (sound1.getLength() > sound2.getLength()) {
            sound = new Sound(sound1.getLength());
        } else {
            sound = new Sound(sound2.getLength());
        }

        int halfSound1 = sound1.getLength() / 2;
        int halfSound2 = sound2.getLength() / 2;

        for (int index = 0; index < halfSound1 - 1; index++) {
            sound.setSampleValueAt(index, sound1.getSampleValueAt(index));
        }

        for (int index = 0; index < halfSound1 - 1; index++) {
            value = (int) ((sound1.getSampleValueAt(index + halfSound1) * 0.5) + (sound2.getSampleValueAt(index) * 0.5));
            sound.setSampleValueAt(index, value);
        }

        for (int index = halfSound2; index < sound2.getLength() - 1; index++) {
            sound.setSampleValueAt(index, sound2.getSampleValueAt(index));
        }

        sound.explore("After");
    }//GEN-LAST:event_sound1ActionPerformed

    private void tripleSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripleSoundActionPerformed

        Sound sound = new Sound(FileChooser.pickAFile());

        sound.explore("Before");
        int targetIndex = 0;
        for (int sourceIndex = 0; sourceIndex < sound.getLength(); sourceIndex = sourceIndex + (int) sampleValue.getValue(), targetIndex++) {
            sound.setSampleValueAt(targetIndex, sound.getSampleValueAt(sourceIndex));
        }
        for (int i = targetIndex; i < sound.getLength(); i++) {
            sound.setSampleValueAt(i, 0);
        }
        sound.explore("After");
    }//GEN-LAST:event_tripleSoundActionPerformed

    private void IncreasePosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncreasePosActionPerformed
        // TODO: rewrite the method ..

        Sound sound = new Sound(FileChooser.pickAFile());

        // Increase positive half by value
        sound.explore("Before");

        // Increase positive half by value
        SoundSample[] sampleArray = sound.getSamples();
        SoundSample sample = null;
        int value = 0;
        int index = 0;

        // loop through all the samples in the array
        while (index < (int) (sampleArray.length / 2)) {
            sample = sampleArray[index];
            value = sample.getValue();
            if (value > 0) {
                sample.setValue(value * (int) PosHalfSpinner.getValue());
            }
            index++;
        }

        // Increase negative half by value
        sampleArray = sound.getSamples();
        sample = null;
        value = 0;
        index = (int) (sampleArray.length / 2);

        // loop through all the samples in the array
        while (index < sampleArray.length) {
            sample = sampleArray[index];
            value = sample.getValue();
            if (value < 0) {
                sample.setValue(value * (int) PosHalfSpinner.getValue());
            }
            index++;
        }

        sound.explore("After");
    }//GEN-LAST:event_IncreasePosActionPerformed

    private void BackwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackwardButtonActionPerformed
        main backwardFrame = new main();
        this.setVisible(false);
        backwardFrame.setVisible(true);
    }//GEN-LAST:event_BackwardButtonActionPerformed

    private void echoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_echoBtnActionPerformed
        Sound sound = new Sound(FileChooser.pickAFile());
        sound.explore("Before");
        sound.echo((int) echoValue.getValue());
        sound.explore("After");
    }//GEN-LAST:event_echoBtnActionPerformed

    private void IncreaseNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncreaseNegativeActionPerformed
        sound.explore("Before");

// Increase negative half by value
        SoundSample[] sampleArray = sound.getSamples();
        SoundSample sample = null;
        int value = 0;
        int index = (int) (sampleArray.length / 2);

        // loop through all the samples in the array
        while (index < sampleArray.length) {
            sample = sampleArray[index];
            value = sample.getValue();
            if (value < 0) {
                sample.setValue(value * ((int) NegativeIncrease.getValue()));
            }
            index++;
        }

        sound.explore("After");
    }//GEN-LAST:event_IncreaseNegativeActionPerformed

    private void normalizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalizeBtnActionPerformed
        Sound sound = new Sound(FileChooser.pickAFile());
        sound.explore("Before");
        sound.normalize();
        sound.explore("After");
    }//GEN-LAST:event_normalizeBtnActionPerformed

    private void soundToTextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundToTextBtnActionPerformed
        Sound s = new Sound(FileChooser.pickAFile());
        s.writeSamplesAsText(FileChooser.pickAFile());
    }//GEN-LAST:event_soundToTextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SoundOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoundOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoundOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoundOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoundOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackwardButton;
    private javax.swing.JButton IncreaseNegative;
    private javax.swing.JButton IncreasePos;
    private javax.swing.JSpinner NegativeIncrease;
    private javax.swing.JSpinner PosHalfSpinner;
    private javax.swing.JButton echoBtn;
    private javax.swing.JSpinner echoValue;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton normalizeBtn;
    private javax.swing.JSpinner sampleValue;
    private javax.swing.JButton sound1;
    private javax.swing.JButton soundToTextBtn;
    private javax.swing.JButton tripleSound;
    // End of variables declaration//GEN-END:variables
}
