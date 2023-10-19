/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mainframe;

import java.awt.CardLayout;

/**
 *
 * @author isabe
 */
public class MainFrame_1 extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame_1() {
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

        SplitPanel = new javax.swing.JSplitPane();
        TopPanel = new javax.swing.JPanel();
        FormButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPanel.setDividerLocation(120);
        SplitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        SplitPanel.setToolTipText("");

        FormButton.setText("Form");
        FormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormButtonActionPerformed(evt);
            }
        });

        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(FormButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addComponent(ViewButton)
                .addGap(87, 87, 87))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormButton)
                    .addComponent(ViewButton))
                .addGap(25, 25, 25))
        );

        SplitPanel.setTopComponent(TopPanel);

        BottomPanel.setLayout(new java.awt.CardLayout());
        SplitPanel.setRightComponent(BottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormButtonActionPerformed
        // TODO add your handling code here:
        FormPanel_1 NewFormPanel_1 = new FormPanel_1(BottomPanel);
        BottomPanel.add(NewFormPanel_1);
        CardLayout layout = (CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel); //39:23
        //SplitPanel.setBottomComponent(newFormPanel_1);
    }//GEN-LAST:event_FormButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        ViewPanel NewViewPanel = new ViewPanel(null);
        BottomPanel.add(NewViewPanel);
        CardLayout layout = (CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel);
    }//GEN-LAST:event_ViewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JButton FormButton;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton ViewButton;
    // End of variables declaration//GEN-END:variables
}
