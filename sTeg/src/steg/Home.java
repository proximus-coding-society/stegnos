
package steg;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {


    String encMessage,path,name,stegan,ext,text;
    int returnVal;
    JFileChooser chooser;
    STeg enc = new STeg();
    
    public Home() {
        
        this.setSize(800, 570);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,50);
        
        
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgpanel = new javax.swing.JPanel();
        imglabel = new javax.swing.JLabel();
        Encryption = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        messageText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        passwordText1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        pathText1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        browseBut1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        encryptBut = new javax.swing.JButton();
        ENCRYPT = new javax.swing.JLabel();
        DECRYPT = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        passwordText2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        decryptBut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        eMessage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(18, 26, 24));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left.setBackground(new java.awt.Color(94, 216, 223));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/steg/images/sTeg.png"))); // NOI18N

        javax.swing.GroupLayout imgpanelLayout = new javax.swing.GroupLayout(imgpanel);
        imgpanel.setLayout(imgpanelLayout);
        imgpanelLayout.setHorizontalGroup(
            imgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imglabel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        imgpanelLayout.setVerticalGroup(
            imgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imglabel, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(imgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 630));

        Encryption.setBackground(new java.awt.Color(42, 68, 66));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Message");

        messageText.setBackground(new java.awt.Color(42, 68, 66));
        messageText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messageText.setForeground(new java.awt.Color(255, 255, 255));
        messageText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        messageText.setBorder(null);
        messageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        passwordText1.setBackground(new java.awt.Color(42, 68, 66));
        passwordText1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordText1.setForeground(new java.awt.Color(255, 255, 255));
        passwordText1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        passwordText1.setBorder(null);
        passwordText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordText1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Choose File");

        pathText1.setEditable(false);
        pathText1.setBackground(new java.awt.Color(42, 68, 66));
        pathText1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pathText1.setForeground(new java.awt.Color(255, 255, 255));
        pathText1.setBorder(null);
        pathText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathText1ActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(119, 226, 100));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        browseBut1.setBackground(new java.awt.Color(68, 198, 64));
        browseBut1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        browseBut1.setForeground(new java.awt.Color(255, 255, 255));
        browseBut1.setText("Browse");
        browseBut1.setContentAreaFilled(false);
        browseBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBut1ActionPerformed(evt);
            }
        });
        jPanel3.add(browseBut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, 30));

        jPanel4.setBackground(new java.awt.Color(129, 212, 118));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encryptBut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        encryptBut.setForeground(new java.awt.Color(255, 255, 255));
        encryptBut.setText("Encrypt & Hide");
        encryptBut.setContentAreaFilled(false);
        encryptBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButActionPerformed(evt);
            }
        });
        jPanel4.add(encryptBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        ENCRYPT.setBackground(new java.awt.Color(94, 216, 223));
        ENCRYPT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ENCRYPT.setForeground(new java.awt.Color(255, 255, 255));
        ENCRYPT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ENCRYPT.setText("ENCRYPT");
        ENCRYPT.setOpaque(true);

        DECRYPT.setBackground(new java.awt.Color(94, 216, 223));
        DECRYPT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DECRYPT.setForeground(new java.awt.Color(255, 255, 255));
        DECRYPT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DECRYPT.setText("DECRYPT");
        DECRYPT.setOpaque(true);

        jPanel5.setBackground(new java.awt.Color(119, 226, 100));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");

        passwordText2.setBackground(new java.awt.Color(42, 68, 66));
        passwordText2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordText2.setForeground(new java.awt.Color(255, 255, 255));
        passwordText2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordText2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passwordText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordText2ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(129, 212, 118));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        decryptBut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        decryptBut.setForeground(new java.awt.Color(255, 255, 255));
        decryptBut.setText("Decrypt and Show");
        decryptBut.setContentAreaFilled(false);
        decryptBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButActionPerformed(evt);
            }
        });
        jPanel6.add(decryptBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Your Message");

        eMessage.setEditable(false);
        eMessage.setBackground(new java.awt.Color(94, 216, 223));
        eMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        eMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMessageMouseClicked(evt);
            }
        });
        eMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EncryptionLayout = new javax.swing.GroupLayout(Encryption);
        Encryption.setLayout(EncryptionLayout);
        EncryptionLayout.setHorizontalGroup(
            EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ENCRYPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DECRYPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EncryptionLayout.createSequentialGroup()
                .addGroup(EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncryptionLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addGroup(EncryptionLayout.createSequentialGroup()
                                    .addComponent(pathText1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(EncryptionLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(EncryptionLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(passwordText2))
                                .addGroup(EncryptionLayout.createSequentialGroup()
                                    .addGap(322, 322, 322)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eMessage)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        EncryptionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jSeparator1, jSeparator2, jSeparator3, passwordText1});

        EncryptionLayout.setVerticalGroup(
            EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionLayout.createSequentialGroup()
                .addComponent(ENCRYPT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathText1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DECRYPT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EncryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordText2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(Encryption, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 470, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void messageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextActionPerformed

    private void passwordText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordText1ActionPerformed

    private void pathText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathText1ActionPerformed

    private void browseBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBut1ActionPerformed

                        
                                
                        chooser = new JFileChooser("./");
			chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			chooser.setFileFilter(new Image_Filter());
			returnVal = chooser.showOpenDialog(imgpanel);
                        
                        if (returnVal == JFileChooser.APPROVE_OPTION){
				
                                File directory = chooser.getSelectedFile();
				
					text = messageText.getText();
					ext  = Image_Filter.getExtension(directory);
					name = directory.getName();
					path = directory.getPath();
					path = path.substring(0,path.length()-name.length()-1);
					name = name.substring(0, name.length()-4);
                                            stegan = "new"+name;
                                        pathText1.setText(path + "/" + name + "." + ext);
                        }      
                        
					
                        




        // TODO add your handling code here:
    }//GEN-LAST:event_browseBut1ActionPerformed

    private void passwordText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordText2ActionPerformed

    private void encryptButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButActionPerformed
        // ENCRYPTIONNNNNNNNNNNNNNNNNNNNNNN
        
        encMessage = Crypto.encrypt(messageText.getText(), passwordText1.getText());
        
        eMessage.setText(encMessage);
        
        JOptionPane.showConfirmDialog(this,"Encrypted Message => "+encMessage);
        
       if (returnVal == JFileChooser.APPROVE_OPTION){
				File directory = chooser.getSelectedFile();
                                
				try{
					text = messageText.getText();
					ext  = Image_Filter.getExtension(directory);
					name = directory.getName();
					path = directory.getPath();
					path = path.substring(0,path.length()-name.length()-1);
					name = name.substring(0, name.length()-4);
                                            stegan = "new"+name;
                                        
					
						if(enc.encode(path,name,ext,encMessage))
						{
							JOptionPane.showMessageDialog(imgpanel, "The Image was encoded Successfully!", 
							"Success!", JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							JOptionPane.showMessageDialog(imgpanel, "The Image could not be encoded!", 
							"Error!", JOptionPane.INFORMATION_MESSAGE);
						}
				         Left.add(imgpanel);
                                        imgpanel.add(imglabel);
                                        
					imglabel.setIcon(null);
                                        System.out.println(path + "/" + stegan + ".png");
                                        imglabel.setIcon(new ImageIcon(ImageIO.read(new File(path + "/" + stegan + ".png"))));
                                        imgpanel.setVisible(true);
					imglabel.setVisible(true);
                                
                                
                                
                                
                                
                                }
				catch(Exception except) {
				        System.out.println(except);
					}
			}


                
        
    }//GEN-LAST:event_encryptButActionPerformed

    private void eMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eMessageActionPerformed

    private void eMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMessageMouseClicked
        // TODO add your handling code here:
        String myString = eMessage.getText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }//GEN-LAST:event_eMessageMouseClicked

    private void decryptButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButActionPerformed
        // TODO add your handling code here:
        
        
        Stegno dec = new Stegno();
        stegan = "new"+name;
        String message = dec.decode(path, stegan);
			System.out.println(path + ", " + stegan);
			System.out.println(message);
                        if(message != "")
			{
				
				JOptionPane.showMessageDialog(imgpanel, "The Image was decoded Successfully!", 
							"Success!", JOptionPane.INFORMATION_MESSAGE);
				
			}
			else
			{
				JOptionPane.showMessageDialog(imgpanel, "The Image could not be decoded!", 
							"Error!", JOptionPane.INFORMATION_MESSAGE);
			}
                        
        
        String Message = Crypto.decrypt(message, passwordText2.getText());
        eMessage.setText(Message);
        System.out.println(Message+"there");
    }//GEN-LAST:event_decryptButActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DECRYPT;
    private javax.swing.JLabel ENCRYPT;
    private javax.swing.JPanel Encryption;
    private javax.swing.JPanel Left;
    private javax.swing.JButton browseBut1;
    private javax.swing.JButton decryptBut;
    private javax.swing.JTextField eMessage;
    private javax.swing.JButton encryptBut;
    private javax.swing.JLabel imglabel;
    private javax.swing.JPanel imgpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField messageText;
    private javax.swing.JTextField passwordText1;
    private javax.swing.JTextField passwordText2;
    private javax.swing.JTextField pathText1;
    // End of variables declaration//GEN-END:variables
}
