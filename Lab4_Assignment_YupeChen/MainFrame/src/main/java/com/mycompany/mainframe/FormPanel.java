/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mainframe;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author isabe
 */
public class FormPanel extends javax.swing.JFrame {

    /**
     * Creates new form FormPanel
     */
    private JPanel BottomPanel;
    public FormPanel(javax.swing.JPanel InputPanel) {
        initComponents();
        this.BottomPanel = InputPanel;
    }

    private FormPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderGroup = new javax.swing.ButtonGroup();
        UserFormLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        AgeTextField = new javax.swing.JTextField();
        FemaleButton = new javax.swing.JRadioButton();
        MaleButton = new javax.swing.JRadioButton();
        TypeDropDown = new javax.swing.JComboBox<>();
        LastNameLabel = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserFormLabel.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        UserFormLabel.setText("User Form");

        FirstNameLabel.setText("First Name");

        AgeLabel.setText("Age");

        GenderLabel.setText("Gender");

        TypeLabel.setText("Type");

        AgeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTextFieldActionPerformed(evt);
            }
        });
        AgeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeTextFieldKeyPressed(evt);
            }
        });

        GenderGroup.add(FemaleButton);
        FemaleButton.setText("Female");

        GenderGroup.add(MaleButton);
        MaleButton.setText("Male");
        MaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleButtonActionPerformed(evt);
            }
        });

        TypeDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Surgery", "Cardiology", "Physiology", "Psychiatry" }));

        LastNameLabel.setText("Last Name");

        EmailLabel.setText("Email");

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserFormLabel)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(239, 239, 239)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaleButton)
                            .addComponent(TypeDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FemaleButton))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SubmitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(LastNameTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(249, 249, 249))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(FirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(220, 220, 220)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(249, 249, 249)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgeTextField)
                                    .addComponent(FirstNameTextField)
                                    .addComponent(EmailTextField))))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(UserFormLabel)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenderLabel)
                    .addComponent(FemaleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(MaleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLabel)
                    .addComponent(TypeDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(SubmitButton)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleButtonActionPerformed

    private void AgeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTextFieldActionPerformed

    private void AgeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeTextFieldKeyPressed
        // TODO add your handling code here:
        try{
            int Age = Integer.parseInt(AgeTextField.getText());
            AgeTextField.setForeground(Color.black);
        }
        catch(Exception e){
            AgeTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_AgeTextFieldKeyPressed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        User NewUser = new User();
        NewUser.setFirstName(FirstNameTextField.getText());
        NewUser.setLastName(LastNameTextField.getText());
        NewUser.setEmail(EmailTextField.getText());
        NewUser.setAge(AgeTextField.getText());
        NewUser.setGender(GenderGroup.getSelection().getActionCommand());
        NewUser.setType(TypeDropDown.getSelectedItem().toString());
        
        ViewPanel NewViewPanel = new ViewPanel(NewUser);
        BottomPanel.add(NewViewPanel);
        CardLayout layout = (CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel);
    }//GEN-LAST:event_SubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JRadioButton FemaleButton;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JRadioButton MaleButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JComboBox<String> TypeDropDown;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel UserFormLabel;
    // End of variables declaration//GEN-END:variables
}
