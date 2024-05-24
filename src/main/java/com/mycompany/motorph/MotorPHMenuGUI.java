/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motorph;

import javax.swing.ImageIcon;

/**
 *
 * @author Lance1
 */
public class MotorPHMenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MotorPHMenuGUI() {
        setFrameIconImage();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCalculateGrossWage = new javax.swing.JButton();
        btnSearchEmployee = new javax.swing.JButton();
        btnCalculateNetWage = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MotorPH Payroll System");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(223, 54, 54));
        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main Menu");
        jLabel2.setOpaque(true);

        btnCalculateGrossWage.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculateGrossWage.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnCalculateGrossWage.setText("Calculate gross wage");
        btnCalculateGrossWage.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnCalculateGrossWage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculateGrossWage.setFocusable(false);
        btnCalculateGrossWage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalculateGrossWageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalculateGrossWageMouseExited(evt);
            }
        });

        btnSearchEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchEmployee.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnSearchEmployee.setText("Search employee");
        btnSearchEmployee.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnSearchEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchEmployee.setFocusable(false);
        btnSearchEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchEmployeeMouseExited(evt);
            }
        });
        btnSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeActionPerformed(evt);
            }
        });

        btnCalculateNetWage.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculateNetWage.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnCalculateNetWage.setText("Calculate net wage");
        btnCalculateNetWage.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnCalculateNetWage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculateNetWage.setFocusable(false);
        btnCalculateNetWage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalculateNetWageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalculateNetWageMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("I want to...");
        jLabel3.setMaximumSize(new java.awt.Dimension(93, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(93, 25));
        jLabel3.setOpaque(true);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusable(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSearchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculateNetWage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculateGrossWage, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnCalculateGrossWage, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnCalculateNetWage, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchEmployeeMouseEntered
        // TODO add your handling code here:
        btnSearchEmployee.setBackground(new java.awt.Color(203, 203, 239));
    }//GEN-LAST:event_btnSearchEmployeeMouseEntered

    private void btnSearchEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchEmployeeMouseExited
        // TODO add your handling code here:
        btnSearchEmployee.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnSearchEmployeeMouseExited

    private void btnCalculateGrossWageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateGrossWageMouseEntered
        // TODO add your handling code here:
        btnCalculateGrossWage.setBackground(new java.awt.Color(203, 203, 239));
    }//GEN-LAST:event_btnCalculateGrossWageMouseEntered

    private void btnCalculateGrossWageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateGrossWageMouseExited
        // TODO add your handling code here:
        btnCalculateGrossWage.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnCalculateGrossWageMouseExited

    private void btnCalculateNetWageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateNetWageMouseEntered
        // TODO add your handling code here:
        btnCalculateNetWage.setBackground(new java.awt.Color(203, 203, 239));
    }//GEN-LAST:event_btnCalculateNetWageMouseEntered

    private void btnCalculateNetWageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateNetWageMouseExited
        // TODO add your handling code here:
        btnCalculateNetWage.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnCalculateNetWageMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        btnExit.setBackground(new java.awt.Color(191, 47, 47));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        // TODO add your handling code here:
        new SearchEmployeeGUI().setVisible(true);
    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

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
            java.util.logging.Logger.getLogger(MotorPHMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorPHMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorPHMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorPHMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorPHMenuGUI().setVisible(true);
            }
        });
    }
    
    private void setFrameIconImage() {
        String pathToImageIcon = "C:\\Users\\Lance1\\Desktop\\projects\\java\\CP2\\CP2-Group-5\\src\\main\\resources\\images\\motorph-logo.jpg";
        ImageIcon img = new ImageIcon(pathToImageIcon);
        setIconImage(img.getImage());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateGrossWage;
    private javax.swing.JButton btnCalculateNetWage;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
