/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    
    public view() {
        initComponents();
        setLocationRelativeTo(null);
        j_list.setModel(model);
        btn_ADD.setEnabled(false);
        btn_Delete.setEnabled(false);
        btn_EDIT.setEnabled(false);
        btn_Move.setEnabled(false);
    }
    
        public void traverseDepthFiles(File fileOrDir,ArrayList<String> arr) {
        // check xem fileOrDir la file hay foder
        if (fileOrDir.isDirectory()) {
            // in ten folder ra man hinh
            arr.add(fileOrDir.getAbsolutePath());
            final File[] children = fileOrDir.listFiles();
            if (children == null) {
                return;
            }
       
            for (File each : children) {
                // gọi lại hàm traverseDepthFiles()
                traverseDepthFiles(each,arr);
            }
        } else {
            // in ten file ra man hinh
            arr.add(fileOrDir.getAbsolutePath());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_text = new javax.swing.JTextField();
        btn_HienThi = new javax.swing.JButton();
        btn_ADD = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_EDIT = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        j_list = new javax.swing.JList<>();
        btn_Move = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("                          Phần Mềm Quản Lý File");

        j_text.setText("Import File");
        j_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_textActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(j_text);

        btn_HienThi.setBackground(new java.awt.Color(0, 102, 102));
        btn_HienThi.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_HienThi.setText("SHOW");
        btn_HienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HienThiActionPerformed(evt);
            }
        });

        btn_ADD.setBackground(new java.awt.Color(51, 255, 51));
        btn_ADD.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_ADD.setText("ADD");
        btn_ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ADDActionPerformed(evt);
            }
        });

        btn_Delete.setBackground(new java.awt.Color(255, 51, 51));
        btn_Delete.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_Delete.setText("DELETE");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_EDIT.setBackground(new java.awt.Color(0, 153, 153));
        btn_EDIT.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_EDIT.setText("EDIT");
        btn_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EDITActionPerformed(evt);
            }
        });

        j_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_listMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(j_list);

        btn_Move.setBackground(new java.awt.Color(51, 0, 204));
        btn_Move.setText("MOVE");
        btn_Move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Move, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 90, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                        .addComponent(btn_EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btn_HienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(48, 48, 48)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(btn_HienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_EDIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Move, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_textActionPerformed

    private void btn_HienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HienThiActionPerformed
        model.removeAllElements();
        btn_ADD.setEnabled(true);
        btn_Delete.setEnabled(true);
        btn_EDIT.setEnabled(true);
        if(j_text.getText().compareTo("")!=0)
        {
            ArrayList<String> arr = new ArrayList<>();
            File fileOrDir = new File(j_text.getText().trim());
            JOptionPane.showMessageDialog(null, "Ban da nhap File" + j_text.getText());
            view myFiles = new view();
            myFiles.traverseDepthFiles(fileOrDir,arr);
            for(String s:arr)
            {
                model.addElement(s);
            }
        }
    }//GEN-LAST:event_btn_HienThiActionPerformed

    private void j_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_listMouseClicked
        btn_ADD.setEnabled(true);
        btn_Delete.setEnabled(true);
        btn_EDIT.setEnabled(true);
        btn_Move.setEnabled(true);
    }//GEN-LAST:event_j_listMouseClicked

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        if(j_text.getText().length()==0)
        {
            btn_Delete.setEnabled(false);
            btn_ADD.setEnabled(false);
            btn_EDIT.setEnabled(false);
        }
        else
        {
            btn_Delete.setEnabled(true);
            btn_ADD.setEnabled(true);
            btn_EDIT.setEnabled(true);
            File file = new File(j_text.getText());
            file.delete();
            int index = j_list.getSelectedIndex();
            model.remove(index);
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ADDActionPerformed
        if(j_text.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ban Chua Nhap File");
        }
        else
        {
            File file = new File(j_text.getText());
            try {
                file.createNewFile();
                model.addElement(file.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Da Them File Thanh Cong");
        }
    }//GEN-LAST:event_btn_ADDActionPerformed

    private void btn_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EDITActionPerformed
        if(btn_EDIT.getText().equals("EDIT"))
        {
            j_text.setText(j_list.getSelectedValue());
            btn_EDIT.setText("UPDATE");
        }
        else
        {
            int index = j_list.getSelectedIndex();
            model.setElementAt(j_text.getText(),index);
        }
    }//GEN-LAST:event_btn_EDITActionPerformed

    private void btn_MoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MoveActionPerformed
        File file = null;
        File file_update;
        if(btn_Move.getText().equals("MOVE"))
        {
            j_text.setText(j_list.getSelectedValue());
            btn_Move.setText("PERFORMING");
            file = new File(j_text.getText());
        }
        else
        {
            file_update = new File(j_text.getText());
            InputStream inStream = null;
            OutputStream outStream = null;
 
        try {
            inStream = new FileInputStream(file);
            outStream = new FileOutputStream(file_update);
 
            int length;
            byte[] buffer = new byte[1024];
 
            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
                try {
                    inStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    outStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            int index = j_list.getSelectedIndex();
            model.remove(index);
            
        }
    }//GEN-LAST:event_btn_MoveActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    DefaultListModel model = new DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ADD;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_EDIT;
    private javax.swing.JButton btn_HienThi;
    private javax.swing.JButton btn_Move;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> j_list;
    private javax.swing.JTextField j_text;
    // End of variables declaration//GEN-END:variables
}
