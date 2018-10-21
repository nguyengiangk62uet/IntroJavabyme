/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary1_0;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import synthesiser.GoogleTranslate;
import synthesiser.SynthesiserV2;

/**
 *
 * @author Nguyen Giang
 */
public class mainForm extends javax.swing.JFrame {

    public static String editString = null;
    public static Dictionary dic = new Dictionary();
    public static DefaultListModel wordListModel = new DefaultListModel();

    /**
     * Creates new form mainForm
     */
    public mainForm() {
        initComponents();
        this.setTitle("Từ điển Java");
        this.setLocationRelativeTo(null);
        dic.insertFromFile();
        showWordfromfile();
        vietnamArea.setLineWrap(true);
        vietnamArea.setWrapStyleWord(true);
        engArea.setLineWrap(true);
        engArea.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchFieldtext = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        explainArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ngheButton = new javax.swing.JButton();
        themButton = new javax.swing.JButton();
        xoaButton = new javax.swing.JButton();
        suaButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        engArea = new javax.swing.JTextArea();
        dichDoanVanButton = new javax.swing.JButton();
        ngheDoanVanEngButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        vietnamArea = new javax.swing.JTextArea();
        ngheVNDoanVanButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        themItemMenu = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenu();
        aboutItemMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        searchLabel.setBackground(new java.awt.Color(255, 51, 0));
        searchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(0, 0, 255));
        searchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Dictionary1_0\\Image\\if_Search_132289.png")); // NOI18N
        searchLabel.setText("Search");
        searchLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchFieldtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldtextKeyReleased(evt);
            }
        });

        wordList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        wordList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(wordList);

        explainArea.setColumns(20);
        explainArea.setRows(5);
        jScrollPane2.setViewportView(explainArea);

        jLabel1.setBackground(new java.awt.Color(204, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("English");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 255))));

        jLabel2.setBackground(new java.awt.Color(255, 102, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiếng Việt");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 255))));

        ngheButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ngheButton.setForeground(new java.awt.Color(204, 0, 51));
        ngheButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Dictionary1_0\\Image\\if_Sound_132388.png")); // NOI18N
        ngheButton.setText("Nghe");
        ngheButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ngheButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ngheButtonMouseClicked(evt);
            }
        });

        themButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Dictionary1_0\\Image\\if_Add_132335.png")); // NOI18N
        themButton.setText("Thêm từ");
        themButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        themButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themButtonMouseClicked(evt);
            }
        });

        xoaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Dictionary1_0\\Image\\if_Trash_132322.png")); // NOI18N
        xoaButton.setText("Xóa từ");
        xoaButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        xoaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaButtonMouseClicked(evt);
            }
        });

        suaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Dictionary1_0\\Image\\if_Notes_132293.png")); // NOI18N
        suaButton.setText("Sửa từ");
        suaButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        suaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchFieldtext, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(ngheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFieldtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel)
                    .addComponent(ngheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Từ điển", jPanel1);

        jLabel3.setText("English");

        engArea.setColumns(20);
        engArea.setRows(5);
        engArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                engAreaKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(engArea);

        dichDoanVanButton.setText("Dịch");
        dichDoanVanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dichDoanVanButtonMouseClicked(evt);
            }
        });

        ngheDoanVanEngButton.setText("Nghe");
        ngheDoanVanEngButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ngheDoanVanEngButtonMouseClicked(evt);
            }
        });

        vietnamArea.setColumns(20);
        vietnamArea.setRows(5);
        jScrollPane4.setViewportView(vietnamArea);

        ngheVNDoanVanButton.setText("Nghe");
        ngheVNDoanVanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ngheVNDoanVanButtonMouseClicked(evt);
            }
        });

        jLabel4.setText("Tiếng Việt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngheVNDoanVanButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(dichDoanVanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ngheDoanVanEngButton)))
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                        .addComponent(jScrollPane4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dichDoanVanButton)
                    .addComponent(ngheDoanVanEngButton))
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ngheVNDoanVanButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dịch đoạn văn", jPanel2);

        jMenu3.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(exitMenuItem);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");

        themItemMenu.setText("Thêm từ");
        themItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themItemMenuActionPerformed(evt);
            }
        });
        jMenu4.add(themItemMenu);

        jMenuBar1.add(jMenu4);

        aboutMenuItem.setText("About");

        aboutItemMenu.setText("About Team");
        aboutItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemMenuActionPerformed(evt);
            }
        });
        aboutMenuItem.add(aboutItemMenu);

        jMenuBar1.add(aboutMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Show word in word list

    public void showWordfromfile() {
        wordListModel.addElement("Có: " + dic.listWord.size() + " từ");
        for (int i = 0; i < dic.listWord.size(); i++) {
            wordListModel.addElement(dic.listWord.get(i).getWord_taget());
        }
        wordList.setModel(wordListModel);
    }

    // Remove all word in word list and explain area
    public void removeAllword() {
        wordListModel.removeAllElements();
        explainArea.setText("");
        //wordList.removeAll();
    }

    private void aboutItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemMenuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "- Java English-Vietnamese Dictonary! \n- Phiên bản 1.0.0\n- Author: Nguyễn Giang."
                + "\n\n\n\n\t\t- Copyright 2018.");

    }//GEN-LAST:event_aboutItemMenuActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void themItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themItemMenuActionPerformed
        // TODO add your handling code here:
        new themForm().setVisible(true);
    }//GEN-LAST:event_themItemMenuActionPerformed

    // Edit button mouse clicked
    private void suaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suaButtonMouseClicked
        // TODO add your handling code here
        editString = wordList.getSelectedValue();
        if (wordList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn từ cần sửa!");
        } else {
            new suatuForm().setVisible(true);
        }
    }//GEN-LAST:event_suaButtonMouseClicked

    private void xoaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaButtonMouseClicked
        String delWord = wordList.getSelectedValue();
        if (wordList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn từ cần xóa!");
        } else {
            int check = JOptionPane.showConfirmDialog(rootPane, "Bạn chắc chắn muốn xóa từ: " + delWord + " ?");
            if (check == JOptionPane.YES_OPTION) {
                for (int i = 0; i < dic.listWord.size(); i++) {
                    if (dic.listWord.get(i).getWord_taget().equals(delWord)) {
                        dic.listWord.remove(i);
                    }
                }
                Dictionary.dictionaryExportToFile();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
                removeAllword();
                showWordfromfile();
            }

        }
    }//GEN-LAST:event_xoaButtonMouseClicked

    private void themButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themButtonMouseClicked
        // TODO add your handling code here:
        new themForm().setVisible(true);
    }//GEN-LAST:event_themButtonMouseClicked

    // Nghe từ
    private void ngheButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ngheButtonMouseClicked
        // TODO add your handling code here:
        String value = wordList.getSelectedValue();
        if (wordList.getSelectedIndex() != -1) {
            speak(value);
        }
    }//GEN-LAST:event_ngheButtonMouseClicked

    // Event mouse click in word list -> show explain
    private void wordListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordListMouseClicked
        // TODO add your handling code here:
        String select = wordList.getSelectedValue();
        for (int i = 0; i < dic.listWord.size(); i++) {
            if (dic.listWord.get(i).getWord_taget().equals(select)) {
                explainArea.setText(dic.listWord.get(i).getWord_explain());
            }
        }
    }//GEN-LAST:event_wordListMouseClicked

    private void searchFieldtextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldtextKeyReleased
        if (!searchFieldtext.getText().equals("")) {
            removeAllword();
            for (int i = 0; i < dic.listWord.size(); i++) {
                if (dic.listWord.get(i).getWord_taget().startsWith(searchFieldtext.getText())) {
                    wordListModel.addElement(dic.listWord.get(i).getWord_taget());
                }
            }
            wordList.setModel(wordListModel);
        } else {
            removeAllword();
            showWordfromfile();
        }
    }//GEN-LAST:event_searchFieldtextKeyReleased

    private void engAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_engAreaKeyReleased
        // TODO add your handling code here:
        if (!engArea.getText().equals("")) {
            try {
                vietnamArea.setText(GoogleTranslate.translate("vi", engArea.getText()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_engAreaKeyReleased

    private void dichDoanVanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dichDoanVanButtonMouseClicked
        // TODO add your handling code here:
        if (engArea.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đoạn văn!");
        } else {
            try {
                vietnamArea.setText(GoogleTranslate.translate("vi", engArea.getText()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_dichDoanVanButtonMouseClicked

    private void ngheDoanVanEngButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ngheDoanVanEngButtonMouseClicked
        // TODO add your handling code here:
        if (!engArea.getText().equals("")) {
            speak(engArea.getText());
        }
    }//GEN-LAST:event_ngheDoanVanEngButtonMouseClicked

    private void ngheVNDoanVanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ngheVNDoanVanButtonMouseClicked
        // TODO add your handling code here:
        if (!vietnamArea.getText().equals("")) {
            speak(vietnamArea.getText());
        }
    }//GEN-LAST:event_ngheVNDoanVanButtonMouseClicked

    public void speak(String text) {
        SynthesiserV2 synthesizer = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");

        //Create a new Thread because JLayer is running on the current Thread and will make the application to lag
        Thread thread = new Thread(() -> {
            try {

                //Create a JLayer instance
                AdvancedPlayer player = new AdvancedPlayer(synthesizer.getMP3Data(text));
                player.play();

            } catch (JavaLayerException e) {

                e.printStackTrace(); //Print the exception ( we want to know , not hide below our finger , like many developers do...)

            } catch (IOException ex) {
                Logger.getLogger(mainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        //We don't want the application to terminate before this Thread terminates
        thread.setDaemon(false);

        //Start the Thread
        thread.start();

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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItemMenu;
    private javax.swing.JMenu aboutMenuItem;
    private javax.swing.JButton dichDoanVanButton;
    private javax.swing.JTextArea engArea;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JTextArea explainArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton ngheButton;
    private javax.swing.JButton ngheDoanVanEngButton;
    private javax.swing.JButton ngheVNDoanVanButton;
    private javax.swing.JTextField searchFieldtext;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JButton suaButton;
    private javax.swing.JButton themButton;
    private javax.swing.JMenuItem themItemMenu;
    private javax.swing.JTextArea vietnamArea;
    private javax.swing.JList<String> wordList;
    private javax.swing.JButton xoaButton;
    // End of variables declaration//GEN-END:variables
}
