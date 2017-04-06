package sstest1;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sstest1.GUI1.usernameGrab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n0623631
 */
public class GUI33 extends javax.swing.JFrame {

    Socket s;
    String inputText;
    String outputText;
    string username;
    DataOutputStream outToServer;
    DataInputStream inFromServer;
    
    public GUI33()
    {
 
        InetAddress ia = InetAddress.getLoopbackAddress();
        try {
            s = new Socket("localhost",5000); //create socket
            outToServer = new DataOutputStream(s.getOutputStream());
            inFromServer = new DataInputStream(s.getInputStream());
            initComponents();
            receiveFromServer();
        } catch (Exception ex) {Logger.getLogger(GUI33.class.getName()).log(Level.SEVERE, null, ex);}
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InformationTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        PlayButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FriendPostsTextArea = new javax.swing.JTextArea();
        SendButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ConnectedPeopleList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        FriendsList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        FriendRequestList = new javax.swing.JList<>();
        RefuseButton = new javax.swing.JButton();
        AcceptButton = new javax.swing.JButton();
        SendButton3 = new javax.swing.JButton();
        SendButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        SharedSongsList = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PostBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        InformationTextArea.setColumns(20);
        InformationTextArea.setRows(5);
        jScrollPane1.setViewportView(InformationTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(224, 90, 166, 158);

        jLabel1.setText("Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(232, 70, 56, 14);

        PlayButton.setText("Play");
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PlayButton);
        PlayButton.setBounds(457, 259, 93, 31);

        FriendPostsTextArea.setColumns(20);
        FriendPostsTextArea.setRows(5);
        jScrollPane2.setViewportView(FriendPostsTextArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 325, 570, 138);

        SendButton.setText("Send");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SendButton);
        SendButton.setBounds(507, 474, 93, 31);

        jLabel2.setText("Post:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(26, 482, 25, 14);

        jLabel3.setText("Friend Posts");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 305, 59, 14);

        ConnectedPeopleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ConnectedPeopleList);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(36, 576, 153, 130);

        FriendsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(FriendsList);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(30, 90, 160, 158);

        FriendRequestList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(FriendRequestList);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(358, 576, 153, 130);

        RefuseButton.setText("Refuse");
        RefuseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefuseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RefuseButton);
        RefuseButton.setBounds(530, 620, 100, 31);

        AcceptButton.setText("Accept");
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AcceptButton);
        AcceptButton.setBounds(529, 576, 98, 31);

        SendButton3.setText("Request Friendship");
        SendButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(SendButton3);
        SendButton3.setBounds(207, 576, 125, 31);

        SendButton4.setText("Send");
        SendButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(SendButton4);
        SendButton4.setBounds(207, 620, 125, 31);

        jLabel4.setText("List of connected people");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(36, 551, 117, 14);

        jLabel5.setText("Friendship Request form");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(358, 551, 117, 14);

        SharedSongsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(SharedSongsList);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(425, 90, 160, 158);

        jLabel6.setText("Friends");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 70, 35, 14);

        jLabel7.setText("Shared Songs");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(425, 70, 66, 14);

        jLabel8.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("SPOOFIFY");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 10, 210, 48);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 30, 10, 710);

        PostBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostBoxActionPerformed(evt);
            }
        });
        getContentPane().add(PostBox);
        PostBox.setBounds(80, 480, 420, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        // TODO add your handling code here:
                
    }//GEN-LAST:event_SendButtonActionPerformed
private void receiveFromServer() throws IOException{
        Thread receiveFromServer = new Thread()
                
        {
            @Override
            public void run()
            {
                while (true)
                {
                    try {
                        outputText = inFromServer.readUTF();
                        FriendPostsTextArea.append(outputText + System.lineSeparator());
                        FriendPostsTextArea.selectAll();
                       FriendPostsTextArea.setCaretPosition(FriendPostsTextArea.getDocument().getLength());
                    } catch (IOException ex) {
                        Logger.getLogger(GUI33.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        receiveFromServer.start();
    }
    
    private void sendToServer() throws IOException{
        inputText = PostBox.getText();                  
        outToServer.writeUTF(usernameGrab.username + inputText);
        PostBox.setText("");
     }   
           
    private void RefuseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefuseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefuseButtonActionPerformed

    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptButtonActionPerformed

    private void SendButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SendButton3ActionPerformed

    private void SendButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SendButton4ActionPerformed

    private void PostBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostBoxActionPerformed
        // TODO add your handling code here:
                              try {
            sendToServer();
        } catch (IOException ex) { System.out.println("sendToServer Error");}
            
    }//GEN-LAST:event_PostBoxActionPerformed

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
            java.util.logging.Logger.getLogger(GUI33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI33().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JList<String> ConnectedPeopleList;
    private javax.swing.JTextArea FriendPostsTextArea;
    private javax.swing.JList<String> FriendRequestList;
    private javax.swing.JList<String> FriendsList;
    private javax.swing.JTextArea InformationTextArea;
    private javax.swing.JButton PlayButton;
    private javax.swing.JTextField PostBox;
    private javax.swing.JButton RefuseButton;
    private javax.swing.JButton SendButton;
    private javax.swing.JButton SendButton3;
    private javax.swing.JButton SendButton4;
    private javax.swing.JList<String> SharedSongsList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
