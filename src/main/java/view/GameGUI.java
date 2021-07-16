package view;

import java.awt.CardLayout;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import game.Game;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author franc
 */
public class GameGUI extends javax.swing.JFrame {

    private boolean win;
    private boolean battleEnd;
    private Game core;
    private CardLayout cl;
    private Iterator<String> dialogue;
    private Thread healthBarUpdate;

    /**
     * Creates new form Interface
     */
    public GameGUI() {
        initComponents();

        win = false;
        battleEnd = true;
        cl = (CardLayout) (jPanel1.getLayout());
        jLabel4.setVisible(false);
        jButton7.setVisible(false);
        jComboBox1.setVisible(false);
        jButton9.setVisible(false);
        jButton14.setVisible(false);
        jTextField2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton1.setVisible(false);

        cl.show(jPanel1, "card5");

        healthBarUpdate = new Thread() {
            @Override
            public void run() {
                while (!battleEnd) {
                    jProgressBar1.setValue(core.getEnemyHealth());
                }
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelGuard = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanelStandard = new javax.swing.JPanel();
        jPanelStart = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanelKid = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanelMerchant = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanelTemple = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jPanelRelic = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jPanelJarl = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanelSmith = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jPanelEnemy = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Talos Dynasty");
        setFont(new java.awt.Font("Footlight MT Light", 0, 10)); // NOI18N
        setIconImages(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton7.setText("Salva ed esci");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setDefaultCapable(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton7);
        jButton7.setBounds(0, 0, 150, 30);

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(410, 0, 500, 90);

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(0, 170, 110, 370);

        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4);
        jButton4.setBounds(1170, 170, 110, 370);

        jButton9.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton9.setText("Esamina");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setDefaultCapable(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton9);
        jButton9.setBounds(1110, 0, 170, 30);

        jComboBox1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        jLayeredPane1.add(jComboBox1);
        jComboBox1.setBounds(1110, 30, 170, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Bottom text");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setAutoscrolls(true);
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(6, 10, 10, 10)));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(390, 590, 530, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setEnabled(false);
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanelGuard.setOpaque(false);
        jPanelGuard.setLayout(null);

        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanelGuard.add(jButton12);
        jButton12.setBounds(510, 220, 230, 370);

        jPanel1.add(jPanelGuard, "card3");

        jPanelStandard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelStandard.setOpaque(false);
        jPanelStandard.setLayout(null);
        jPanel1.add(jPanelStandard, "card4");

        jPanelStart.setOpaque(false);
        jPanelStart.setLayout(null);

        jButton8.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton8.setText("Nuova partita");
        jButton8.setDefaultCapable(false);
        jButton8.setFocusable(false);
        jButton8.setPreferredSize(new java.awt.Dimension(120, 23));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelStart.add(jButton8);
        jButton8.setBounds(570, 370, 200, 40);

        jButton11.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton11.setText("Carica partita");
        jButton11.setDefaultCapable(false);
        jButton11.setFocusable(false);
        jButton11.setPreferredSize(new java.awt.Dimension(120, 23));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanelStart.add(jButton11);
        jButton11.setBounds(570, 410, 200, 40);

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 88)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/titolo.png"))); // NOI18N
        jPanelStart.add(jLabel2);
        jLabel2.setBounds(310, 190, 680, 140);

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Seleziona il nome");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jLabel6.setOpaque(true);
        jPanelStart.add(jLabel6);
        jLabel6.setBounds(460, 510, 220, 40);

        jTextField1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelStart.add(jTextField1);
        jTextField1.setBounds(680, 510, 220, 40);

        jPanel1.add(jPanelStart, "card5");

        jPanelKid.setOpaque(false);
        jPanelKid.setLayout(null);

        jTextField2.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanelKid.add(jTextField2);
        jTextField2.setBounds(560, 510, 80, 40);

        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanelKid.add(jButton13);
        jButton13.setBounds(570, 180, 150, 290);

        jButton14.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jButton14.setText("Vai");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanelKid.add(jButton14);
        jButton14.setBounds(640, 510, 90, 40);

        jPanel1.add(jPanelKid, "card6");

        jPanelMerchant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMerchant.setOpaque(false);
        jPanelMerchant.setLayout(null);

        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setDefaultCapable(false);
        jButton10.setDoubleBuffered(true);
        jButton10.setFocusPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelMerchant.add(jButton10);
        jButton10.setBounds(500, 100, 290, 360);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amuletos2.png"))); // NOI18N
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setFocusPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanelMerchant.add(jButton15);
        jButton15.setBounds(310, 480, 120, 150);

        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setDefaultCapable(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelMerchant.add(jButton6);
        jButton6.setBounds(755, 484, 250, 140);

        jPanel1.add(jPanelMerchant, "card2");

        jPanelTemple.setOpaque(false);
        jPanelTemple.setLayout(null);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scroll2.png"))); // NOI18N
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setFocusPainted(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanelTemple.add(jButton16);
        jButton16.setBounds(610, 440, 140, 70);

        jPanel1.add(jPanelTemple, "card7");

        jPanelRelic.setOpaque(false);
        jPanelRelic.setLayout(null);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reliquia.png"))); // NOI18N
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setFocusPainted(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanelRelic.add(jButton17);
        jButton17.setBounds(520, 50, 240, 380);

        jPanel1.add(jPanelRelic, "card8");

        jPanelJarl.setOpaque(false);
        jPanelJarl.setLayout(null);

        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelJarl.add(jButton5);
        jButton5.setBounds(520, 283, 210, 250);

        jPanel1.add(jPanelJarl, "card9");

        jPanelSmith.setOpaque(false);
        jPanelSmith.setLayout(null);

        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setFocusPainted(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanelSmith.add(jButton18);
        jButton18.setBounds(500, 283, 120, 220);

        jPanel1.add(jPanelSmith, "card10");

        jPanelEnemy.setOpaque(false);
        jPanelEnemy.setLayout(null);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngegg.png"))); // NOI18N
        jButton19.setDefaultCapable(false);
        jButton19.setFocusPainted(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanelEnemy.add(jButton19);
        jButton19.setBounds(630, 500, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nemico.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelEnemy.add(jButton2);
        jButton2.setBounds(520, 180, 280, 409);

        jProgressBar1.setForeground(new java.awt.Color(255, 0, 51));
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProgressBar1.setFocusable(false);
        jProgressBar1.setOpaque(false);
        jProgressBar1.setRequestFocusEnabled(false);
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);
        jPanelEnemy.add(jProgressBar1);
        jProgressBar1.setBounds(430, 156, 430, 20);

        jPanel1.add(jPanelEnemy, "card11");

        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 720);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/start.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(10, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(20, 20));
        jLabel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel1PropertyChange(evt);
            }
        });
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(-1, -1, 1280, 720);

        setSize(new java.awt.Dimension(1292, 757));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //walkForward
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setImage(core.walk(), jLabel1);
    }//GEN-LAST:event_jButton1ActionPerformed

    //turnLeft
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setImage(core.turnLeft(), jLabel1);
    }//GEN-LAST:event_jButton3ActionPerformed

    //turnRight
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setImage(core.turnRight(), jLabel1);
    }//GEN-LAST:event_jButton4ActionPerformed

    //Salva ed esci
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        core.save();
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    //Cambio immagine
    private void jLabel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel1PropertyChange
        try {
            switch (core.currentImage()) {
                case Game.KID_PANEL:
                    if(!core.hasHappened(Game.KID_EVENT)){
                        cl.show(jPanel1, "card6");
                    }
                    
                    break;

                case Game.GUARD_PANEL:
                    cl.show(jPanel1, "card3");

                    if (core.getPlayerInventory().contains(Game.TALOS_AMULET)) {
                        jButton1.setVisible(true);
                        jButton12.setVisible(false);
                    } else {
                        jButton1.setVisible(false);
                    }

                    break;

                case Game.MERCHANT_PANEL:
                    cl.show(jPanel1, "card2");

                    if (core.getPlayerInventory().contains(Game.TALOS_AMULET)) {
                        jButton15.setVisible(false);
                    }

                    break;

                case Game.JARL_PANEL:
                    cl.show(jPanel1, "card9");
                    break;

                case Game.TEMPLE_PANEL:
                    cl.show(jPanel1, "card7");
                    break;

                case Game.BLACKSMITH_PANEL:
                    cl.show(jPanel1, "card10");
                    break;

                case Game.RELIC_PANEL:
                    if(!core.getPlayerInventory().contains(Game.TALOS_RELIC)){
                        cl.show(jPanel1, "card8");
                    }
                    
                    break;

                case Game.ENEMY_PANEL:
                    if (!core.hasHappened(Game.ENEMY_EVENT)) {
                        cl.show(jPanel1, "card11");
                        
                        if (jButton2.isVisible()) {
                            jButton3.setVisible(false);
                            jButton4.setVisible(false);
                            jButton19.setVisible(false);
                            jButton1.setVisible(false);
                            jProgressBar1.setVisible(false);
                        }
                    }

                    break;

                default:
                    cl.show(jPanel1, "card4");
                    jButton1.setVisible(true);
            }
        } catch (Exception e) {
            //Capire perché dà NullPointerException (forse perché il jLabel1PropertyChange avviene prima della generazione delle altre cose)
            System.err.println(e);
        }
    }//GEN-LAST:event_jLabel1PropertyChange

    //jLabel dialogo
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        if (dialogue.hasNext()) {
            jLabel4.setText("<html>" + dialogue.next() + "</html>"); //I tag html servono per il wrapping del testo.
        } else {
            jLabel4.setVisible(false);

            if (win) { //Caso in cui il giocatore ha vinto e debba essere mostrata l'immagine finale.
                cl.show(jPanel1, "card4");
                setImage("end.png", jLabel1);
                jButton7.setVisible(false);
                jButton9.setVisible(false);
                jComboBox1.setVisible(false);
                jButton5.setVisible(false);
                jButton1.setVisible(false);
                jButton3.setVisible(false);
                jButton4.setVisible(false);
            }
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    //Esamina
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        displayDialogue(core.loadDialogue((String) jComboBox1.getSelectedItem()));
    }//GEN-LAST:event_jButton9ActionPerformed

    //Mercante
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        displayDialogue(core.loadDialogue(Game.MERCHANT_FIRST));
    }//GEN-LAST:event_jButton10ActionPerformed

    //Guardia
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        displayDialogue(core.loadDialogue(Game.GUARD));
    }//GEN-LAST:event_jButton12ActionPerformed

    //Spada
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        displayDialogue(core.loadDialogue(Game.BOOK));
    }//GEN-LAST:event_jButton6ActionPerformed

    //Nuova partita
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if (!jTextField1.getText().isEmpty()) {
            core = new Game(jTextField1.getText());
            if (new File("saveGame.json").isFile()) {
                if (JOptionPane.showConfirmDialog(GameGUI.this, "Esiste già un altro salvataggio. Vuoi sovrascriverlo?", "Attenzione!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    core.save();
                    startGame();
                }
            } else {
                startGame();
            }
        } else {
            JOptionPane.showMessageDialog(GameGUI.this, "Devi inserire un nome.", "Errore!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    //Carica partita
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (new File("saveGame.json").isFile()) {
            core = new Game();
            core.load();

            core.getPlayerInventory().forEach(item -> {
                jComboBox1.addItem((String) item);
            });

            startGame();
        } else {
            JOptionPane.showMessageDialog(GameGUI.this, "Non esiste alcun file da caricare.", "Errore!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    //Bimba
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (!core.hasHappened(Game.KID_EVENT)) {
            displayDialogue(core.loadDialogue(Game.KID_FIRST));
            addItem(Game.GOLDEN_RING); //Rimuovere il commento per vincere senza giocare
            jTextField2.setVisible(true);
            jButton14.setVisible(true);
            jButton13.setVisible(false);
            core.startMiniGame();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    //Controllo lunghezza numero minigioco
    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (jTextField2.getText().length() == 4) {
            jButton14.setEnabled(true);
        } else {
            jButton14.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    //Tentativo minigioco
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            Integer.parseInt(jTextField2.getText());

            core.guessGame(jTextField2.getText());
            jLabel4.setVisible(true);
            String result = core.getGameResult();
            jLabel4.setText("<html>" + result.replace(". ", ".<br>") + "</html>"); //Fa andare a capo la frase.

            if (result.equals(Game.WIN) || result.equals(Game.LOSE)) {
                jTextField2.setText("");

                if (result.equals(Game.WIN)) {
                    jTextField2.setVisible(false);
                    jButton14.setVisible(false);
                    displayDialogue(core.loadDialogue(Game.KID_WIN));
                    addItem(Game.GOLDEN_RING);
                    core.makeHappen(Game.KID_EVENT);
                } else if (result.equals(Game.LOSE)) {
                    displayDialogue(core.loadDialogue(Game.KID_LOSE));
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(jPanel1, "Errore! Inserire solo numeri.");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    //Amuleto
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (core.getPlayerInventory().contains(Game.GOLDEN_COIN)) {
            jButton15.setVisible(false);
            addItem(Game.TALOS_AMULET);
            removeItem(Game.GOLDEN_COIN);
            jButton10.setVisible(false);
            displayDialogue(core.loadDialogue(Game.PURCHASE));
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    //Jarl
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (core.getPlayerInventory().contains(Game.TALOS_RELIC)) {
            displayDialogue(core.loadDialogue(Game.JARL_END));
            win = true;
        } else {
            displayDialogue(core.loadDialogue(Game.JARL_START));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    //Pergamena
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        displayDialogue(core.loadDialogue(Game.SCROLL));
    }//GEN-LAST:event_jButton16ActionPerformed

    //Fabbro
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (core.getPlayerInventory().contains(Game.GOLDEN_RING)) {
            removeItem(Game.GOLDEN_RING);
            addItem(Game.GOLDEN_COIN);
            displayDialogue(core.loadDialogue(Game.SMITH_OBJECT));
        } else {
            displayDialogue(core.loadDialogue(Game.SMITH_NO_OBJECT));
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    //Reliquia
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        addItem(Game.TALOS_RELIC);
        jComboBox1.setSelectedItem(Game.TALOS_RELIC);
        jButton17.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    //Colpo nemico
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        core.hitEnemy();

        if (core.getEnemyHealth() == 0) {
            battleEnd = true;
            displayDialogue(core.loadDialogue(Game.ENEMY_DEATH));
            jButton19.setVisible(false);
            jButton2.setVisible(false);
            jProgressBar1.setVisible(false);

            jButton3.setVisible(true);
            jButton4.setVisible(true);
            core.makeHappen(Game.ENEMY_EVENT);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    //Nemico
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        displayDialogue(core.loadDialogue(Game.TALOS));
        if (battleEnd) {
            jProgressBar1.setVisible(true);
            jButton19.setVisible(true);
            healthBarUpdate.start();
            core.startBattle();
            battleEnd = false;
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    //Custom methods
    
    //Imposta l'immagine image nel label jLab. Serve a rendere più semplice l'utilizzo della funzione standard setIcon.
    private void setImage(String image, javax.swing.JLabel jLab) {
        jLab.setIcon(new ImageIcon(getClass().getResource("/" + image)));
    }

    //Inizializzazione dei componenti
    private void startGame() {
        cl.show(jPanel1, "card4");
        setImage(core.currentImage(), jLabel1);

        jButton7.setVisible(true);
        jComboBox1.setVisible(true);
        jButton9.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton1.setVisible(true);
    }

    private void displayDialogue(List dl) {
        dialogue = dl.iterator();

        if (dialogue.hasNext()) {
            jLabel4.setText("<html>" + dialogue.next() + "</html>"); //I tag html servono per il wrapping del testo.
            jLabel4.setVisible(true);
        } else {
            jLabel4.setVisible(false);
        }
    }

    private void addItem(String item) {
        core.getPlayerInventory().add(item);
        jComboBox1.addItem(item);
    }

    private void removeItem(String item) {
        core.getPlayerInventory().remove(item);
        jComboBox1.removeItem(item);
    }

    //Main
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GameGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
    private static javax.swing.JComboBox<String> jComboBox1;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEnemy;
    private javax.swing.JPanel jPanelGuard;
    private javax.swing.JPanel jPanelJarl;
    private javax.swing.JPanel jPanelKid;
    private javax.swing.JPanel jPanelMerchant;
    private javax.swing.JPanel jPanelRelic;
    private javax.swing.JPanel jPanelSmith;
    private javax.swing.JPanel jPanelStandard;
    private javax.swing.JPanel jPanelStart;
    private javax.swing.JPanel jPanelTemple;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
