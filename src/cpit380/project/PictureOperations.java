package cpit380.project;

import AhmadClassCPIT380.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PictureOperations extends javax.swing.JFrame {

    public void generalizedMinFilter(int size) {
        int x = pic.getWidth();
        int y = pic.getHeight();
        int half = size / 2;
        Picture copy = new Picture(x, y);
        copy.copy(pic, 0, 0, x, y, 0, 0);
        int Red[] = new int[size * size];
        int Green[] = new int[size * size];
        int Blue[] = new int[size * size];
        for (int v = half; v <= y - (half + 1); v++) {
            for (int u = half; u <= x - (half + 1); u++) {

                int k = 0;
                for (int j = -half; j <= half; j++) {
                    for (int i = -half; i <= half; i++) {
                        Red[k] = copy.getPixel(u + i, v + j).getRed();
                        Green[k] = copy.getPixel(u + i, v + j).getGreen();
                        Blue[k] = copy.getPixel(u + i, v + j).getBlue();
                        k++;
                    }
                }
                Arrays.sort(Red);
                Arrays.sort(Green);
                Arrays.sort(Blue);
                pic.getPixel(u, v).setColor(new Color(Red[0], Green[0], Blue[0]));
            }
        }
        showPanel.setIcon(new ImageIcon(pic.getImage()));

    }

    public void boxFilter() {
        int f = 5;
        int x = pic.getWidth();
        int y = pic.getHeight();

        Picture img = new Picture(x, y);
        img.copy(pic, 0, 0, x, y, 0, 0);
        int q = (f / 2);

        for (int v = q; v <= y - (q + 1); v++) {
            for (int u = q; u <= x - (q + 1); u++) {

                int sumRed = 0, sumGreen = 0, sumBlue = 0;

                for (int j = -q; j <= q; j++) {
                    for (int i = -q; i <= q; i++) {

                        int red = img.getPixel(u + i, v + j).getRed();
                        sumRed += red;

                        int green = img.getPixel(u + i, v + j).getGreen();
                        sumGreen += green;

                        int blue = img.getPixel(u + i, v + j).getBlue();
                        sumBlue += blue;
                    }
                }

                int Red = (int) Math.round(sumRed / (f * f));
                int Green = (int) Math.round(sumGreen / (f * f));
                int Blue = (int) Math.round(sumBlue / (f * f));

                pic.getPixel(u, v).setColor(new Color(Red, Green, Blue));
            }
        }
        showPanel.setIcon(new ImageIcon(pic.getImage()));

    }

    public void binary() {
        int f = 50;
        pic.grayscale();
        Pixel pixels[] = pic.getPixels();
        for (Pixel currentPixel : pixels) {
            if (currentPixel.getAverage() <= f) {
                currentPixel.setColor(Color.WHITE);
            } else {
                currentPixel.setColor(Color.BLACK);
            }
        }
        showPanel.setIcon(new ImageIcon(pic.getImage()));

    }

    public void centeredFrame(javax.swing.JFrame objFrame) {
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

    public PictureOperations() {
        initComponents();
        centeredFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showPanel = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        RedSlider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        GreenSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        BlueSlider1 = new javax.swing.JSlider();
        ScaleSpinner = new javax.swing.JSpinner();
        RotateBtn = new javax.swing.JButton();
        RotateSpinner = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        GridBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        GridName = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        DiagonalTopBot = new javax.swing.JButton();
        EdgeDetection = new javax.swing.JButton();
        MirrorVertical = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        HorizentalVertical = new javax.swing.JButton();
        DiagonalBotTop = new javax.swing.JButton();
        Scale = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Blurring = new javax.swing.JButton();
        BlurringSpinner = new javax.swing.JSpinner();
        Laplacian = new javax.swing.JButton();
        LaplacianSlider = new javax.swing.JSlider();
        GaussianButton = new javax.swing.JButton();
        GaussianSlider = new javax.swing.JSlider();
        Chromakey = new javax.swing.JButton();
        Greyscale = new javax.swing.JButton();
        Sepia = new javax.swing.JButton();
        NegateBtn = new javax.swing.JButton();
        BinaryBtn = new javax.swing.JButton();
        BoxBtn = new javax.swing.JButton();
        MinBtn = new javax.swing.JButton();
        BackwardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showPanel.setForeground(new java.awt.Color(0, 0, 0));
        showPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPanel.setName(""); // NOI18N

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Red");

        RedSlider.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        RedSlider.setMaximum(255);
        RedSlider.setSnapToTicks(true);
        RedSlider.setValue(128);
        RedSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RedSliderStateChanged(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Green");

        GreenSlider.setMaximum(256);
        GreenSlider.setSnapToTicks(true);
        GreenSlider.setValue(128);
        GreenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GreenSliderStateChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Blue");

        BlueSlider1.setMaximum(255);
        BlueSlider1.setSnapToTicks(true);
        BlueSlider1.setValue(128);
        BlueSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BlueSlider1StateChanged(evt);
            }
        });

        RotateBtn.setText("Rotate");
        RotateBtn.setMinimumSize(new java.awt.Dimension(62, 30));
        RotateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateBtnActionPerformed(evt);
            }
        });

        GridBtn.setText("Grid + Name");
        GridBtn.setMaximumSize(new java.awt.Dimension(115, 35));
        GridBtn.setMinimumSize(new java.awt.Dimension(115, 35));
        GridBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GridBtnActionPerformed(evt);
            }
        });

        GridName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GridNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Enter name here");

        DiagonalTopBot.setText("Diagonal Bottom/Top");
        DiagonalTopBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagonalTopBotActionPerformed(evt);
            }
        });

        EdgeDetection.setText("Edge Detection");
        EdgeDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdgeDetectionActionPerformed(evt);
            }
        });

        MirrorVertical.setText("Mirror Vertical");
        MirrorVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MirrorVerticalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Mirroring and Other Operations");

        HorizentalVertical.setText("Mirror Horizental");
        HorizentalVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorizentalVerticalActionPerformed(evt);
            }
        });

        DiagonalBotTop.setText("Diagonal Top/Bottom");
        DiagonalBotTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagonalBotTopActionPerformed(evt);
            }
        });

        Scale.setText("Scale");
        Scale.setMinimumSize(new java.awt.Dimension(62, 30));
        Scale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(EdgeDetection, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DiagonalTopBot, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MirrorVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DiagonalBotTop, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HorizentalVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BlueSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RedSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GreenSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Scale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScaleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(RotateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(GridBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GridName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(15, 15, 15)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RotateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jLabel5)
                            .addContainerGap(162, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator3))
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MirrorVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorizentalVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiagonalTopBot, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiagonalBotTop, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdgeDetection, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Scale, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RotateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RotateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScaleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(RedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(GreenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BlueSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GridBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(GridName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(133, 133, 133)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(90, 90, 90)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(66, 66, 66)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Filters");

        Blurring.setText("Blurring");
        Blurring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlurringActionPerformed(evt);
            }
        });

        Laplacian.setText("Laplacian");
        Laplacian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaplacianActionPerformed(evt);
            }
        });

        LaplacianSlider.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        LaplacianSlider.setMaximum(3);
        LaplacianSlider.setMinimum(1);
        LaplacianSlider.setSnapToTicks(true);
        LaplacianSlider.setToolTipText("");
        LaplacianSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LaplacianSliderStateChanged(evt);
            }
        });

        GaussianButton.setText("Gaussian");
        GaussianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaussianButtonActionPerformed(evt);
            }
        });

        GaussianSlider.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        GaussianSlider.setMaximum(3);
        GaussianSlider.setMinimum(1);
        GaussianSlider.setSnapToTicks(true);
        GaussianSlider.setToolTipText("");
        GaussianSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GaussianSliderStateChanged(evt);
            }
        });

        Chromakey.setText("Chromakey");
        Chromakey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChromakeyActionPerformed(evt);
            }
        });

        Greyscale.setText("Greyscale");
        Greyscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreyscaleActionPerformed(evt);
            }
        });

        Sepia.setText("Sepia");
        Sepia.setMaximumSize(new java.awt.Dimension(87, 32));
        Sepia.setMinimumSize(new java.awt.Dimension(87, 32));
        Sepia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SepiaActionPerformed(evt);
            }
        });

        NegateBtn.setText("Negate");
        NegateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegateBtnActionPerformed(evt);
            }
        });

        BinaryBtn.setText("Binary");
        BinaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinaryBtnActionPerformed(evt);
            }
        });

        BoxBtn.setText("Box");
        BoxBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxBtnActionPerformed(evt);
            }
        });

        MinBtn.setText("Min");
        MinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Laplacian, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LaplacianSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(GaussianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GaussianSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Blurring, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BlurringSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Sepia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Greyscale, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Chromakey, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NegateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BinaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BoxBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(234, 234, 234))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sepia, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Greyscale, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chromakey, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Laplacian, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BlurringSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Blurring, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LaplacianSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GaussianSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GaussianButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NegateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BinaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(MinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        BackwardButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BackwardButton.setText("← ");
        BackwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackwardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackwardButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(showPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(Reset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        String dir = "C:\\intro-prog-java\\MediaSources";
        filename = FileChooser.pickAFile();
        pic = new Picture(filename);
        init = new Picture(filename);
        icon = new ImageIcon(pic.getImage());
        showPanel.setIcon(icon);
    }//GEN-LAST:event_browseButtonActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed

        pic = new Picture(init);
        showPanel.setIcon(new ImageIcon(pic.getImage()));
        GridName.setText("");
        RotateSpinner.setValue(Integer.valueOf(0));
        ScaleSpinner.setValue(Integer.valueOf(0));
        RedSlider.setValue(128);
        BlueSlider1.setValue(128);
        GreenSlider.setValue(128);


    }//GEN-LAST:event_ResetActionPerformed

    private void RedSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RedSliderStateChanged
        int red = RedSlider.getValue();
        Pixel[] pixels = pic.getPixels();
        for (Pixel p : pixels) {
            p.setRed(red);
        }
        icon = new ImageIcon(pic.getImage());
        showPanel.setIcon(icon);
    }//GEN-LAST:event_RedSliderStateChanged

    private void GreenSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GreenSliderStateChanged
        int green = GreenSlider.getValue();
        Pixel[] pixels = pic.getPixels();
        for (Pixel p : pixels) {
            p.setGreen(green);
        }

        icon = new ImageIcon(pic.getImage());
        showPanel.setIcon(icon);
    }//GEN-LAST:event_GreenSliderStateChanged

    private void BlueSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BlueSlider1StateChanged
        int blue = BlueSlider1.getValue();
        Pixel[] pixels = pic.getPixels();
        for (Pixel p : pixels) {
            p.setBlue(blue);
        }

        icon = new ImageIcon(pic.getImage());
        showPanel.setIcon(icon);

    }//GEN-LAST:event_BlueSlider1StateChanged

    private void RotateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateBtnActionPerformed
        pic = pic.rotate((int) RotateSpinner.getValue());
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_RotateBtnActionPerformed

    private void GridBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GridBtnActionPerformed
        pic.drawGrid();
        pic.drawString(GridName.getText(), 50, 100);
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_GridBtnActionPerformed

    private void GridNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GridNameActionPerformed

    }//GEN-LAST:event_GridNameActionPerformed

    private void DiagonalTopBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagonalTopBotActionPerformed
        pic.mirrorDiagTopLeftBotRight();
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_DiagonalTopBotActionPerformed

    private void EdgeDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdgeDetectionActionPerformed
        pic.edgeDetection(5);
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_EdgeDetectionActionPerformed

    private void MirrorVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MirrorVerticalActionPerformed
        pic.mirrorVertical();
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_MirrorVerticalActionPerformed

    private void HorizentalVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorizentalVerticalActionPerformed
        pic.mirrorHorizontal();
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_HorizentalVerticalActionPerformed

    private void DiagonalBotTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagonalBotTopActionPerformed
        pic.mirrorDiagTopRightBotLeft();
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_DiagonalBotTopActionPerformed

    private void ScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScaleActionPerformed
        pic = pic.scaleUp((int) ScaleSpinner.getValue());
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_ScaleActionPerformed

    private void BlurringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlurringActionPerformed
        pic.blur((int) BlurringSpinner.getValue());
    }//GEN-LAST:event_BlurringActionPerformed

    private void LaplacianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaplacianActionPerformed
        int size = (int) LaplacianSlider.getValue();
        int FilterSize = (size);
        int sumR, sumG, sumB;

        double filter[][] = {{-0.075, -0.125, -0.075},
        {-0.125, 2.0, -0.125},
        {-0.075, -0.125, -0.075}};

        int start = (int) Math.floor(FilterSize / 2);

        for (int i = start; i <= pic.getWidth() - (start + 1); i++) {
            for (int j = start; j <= pic.getHeight() - (start + 1); j++) {
                sumR = 0;
                sumG = 0;
                sumB = 0;
                for (int k = -start; k <= start; k++) {
                    for (int l = -start; l <= start; l++) {
                        double c = filter[k + 1][l + 1];
                        int red = pic.getPixel(i + k, j + 1).getRed();
                        sumR += red * c;
                        int green = pic.getPixel(i + k, j + 1).getGreen();
                        sumG += green * c;
                        int blue = pic.getPixel(i + k, j + 1).getBlue();
                        sumB += blue * c;
                    }
                }
                int Red = (int) Math.min(FilterSize, Math.max(0, sumR));
                int Green = (int) Math.min(FilterSize, Math.max(0, sumG));
                int Blue = (int) Math.min(FilterSize, Math.max(0, sumB));

                pic.getPixel(i, j).setBlue(sumB);
                pic.getPixel(i, j).setGreen(sumG);
                pic.getPixel(i, j).setRed(sumR);
            }
        }
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_LaplacianActionPerformed

    private void LaplacianSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LaplacianSliderStateChanged

    }//GEN-LAST:event_LaplacianSliderStateChanged

    private void GaussianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaussianButtonActionPerformed

        double[][] filter = null;

        if ((int) GaussianSlider.getValue() == 0) {
            filter = new double[][]{
                {0.075, 0.125, 0.075},
                {0.125, 0.200, 0.125},
                {0.075, 0.125, 0.075}
            };
        } else if ((int) GaussianSlider.getValue() == 1) {
            filter = new double[][]{
                {0.05, 0.075, 0.05},
                {0.075, 0.500, 0.075},
                {0.05, 0.075, 0.05}
            };
        } else if ((int) GaussianSlider.getValue() == 2) {
            filter = new double[][]{
                {0.02, 0.03, 0.02},
                {0.03, 0.800, 0.03},
                {0.02, 0.03, 0.02}
            };
        }

        int sumR, sumG, sumB;

        for (int i = 1; i <= pic.getWidth() - 2; i++) {
            for (int j = 1; j <= pic.getHeight() - 2; j++) {
                sumR = 0;
                sumG = 0;
                sumB = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        sumR += filter[k + 1][l + 1] * pic.getPixel(i + k, j + l).getRed();
                        sumG += filter[k + 1][l + 1] * pic.getPixel(i + k, j + l).getGreen();
                        sumB += filter[k + 1][l + 1] * pic.getPixel(i + k, j + l).getBlue();
                    }
                }
                pic.getPixel(i, j).setRed(sumR);
                pic.getPixel(i, j).setGreen(sumG);
                pic.getPixel(i, j).setBlue(sumB);
            }
        }
    }//GEN-LAST:event_GaussianButtonActionPerformed

    private void GaussianSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GaussianSliderStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_GaussianSliderStateChanged

    private void ChromakeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChromakeyActionPerformed
        String filename1 = FileChooser.pickAFile();
        Picture newbg = new Picture(filename1);
        pic.chromakey(newbg);
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_ChromakeyActionPerformed

    private void GreyscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreyscaleActionPerformed
        pic.grayscale();
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_GreyscaleActionPerformed

    private void SepiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SepiaActionPerformed
        pic.sepiaTint();
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_SepiaActionPerformed

    private void BackwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackwardButtonActionPerformed
        main backwardFrame = new main();
        this.setVisible(false);
        backwardFrame.setVisible(true);
    }//GEN-LAST:event_BackwardButtonActionPerformed

    private void NegateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegateBtnActionPerformed
        pic.negate();
        showPanel.setIcon(new ImageIcon(pic.getImage()));
    }//GEN-LAST:event_NegateBtnActionPerformed

    private void BinaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinaryBtnActionPerformed
        binary();
    }//GEN-LAST:event_BinaryBtnActionPerformed

    private void BoxBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxBtnActionPerformed
        boxFilter();
    }//GEN-LAST:event_BoxBtnActionPerformed

    private void MinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinBtnActionPerformed
        generalizedMinFilter(13);

     }//GEN-LAST:event_MinBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PictureOperations.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PictureOperations.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PictureOperations.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PictureOperations.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PictureOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackwardButton;
    private javax.swing.JButton BinaryBtn;
    private javax.swing.JSlider BlueSlider1;
    private javax.swing.JButton Blurring;
    private javax.swing.JSpinner BlurringSpinner;
    private javax.swing.JButton BoxBtn;
    private javax.swing.JButton Chromakey;
    private javax.swing.JButton DiagonalBotTop;
    private javax.swing.JButton DiagonalTopBot;
    private javax.swing.JButton EdgeDetection;
    private javax.swing.JButton GaussianButton;
    private javax.swing.JSlider GaussianSlider;
    private javax.swing.JSlider GreenSlider;
    private javax.swing.JButton Greyscale;
    private javax.swing.JButton GridBtn;
    private java.awt.TextField GridName;
    private javax.swing.JButton HorizentalVertical;
    private javax.swing.JButton Laplacian;
    private javax.swing.JSlider LaplacianSlider;
    private javax.swing.JButton MinBtn;
    private javax.swing.JButton MirrorVertical;
    private javax.swing.JButton NegateBtn;
    private javax.swing.JSlider RedSlider;
    private javax.swing.JButton Reset;
    private javax.swing.JButton RotateBtn;
    private javax.swing.JSpinner RotateSpinner;
    private javax.swing.JButton Scale;
    private javax.swing.JSpinner ScaleSpinner;
    private javax.swing.JButton Sepia;
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel showPanel;
    // End of variables declaration//GEN-END:variables
}
