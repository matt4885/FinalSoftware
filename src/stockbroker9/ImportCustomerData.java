/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockbroker9;

import javafx.stage.FileChooser;

import static stockbroker9.Driver.cl;
import static stockbroker9.Driver.homeContainer;
import static stockbroker9.Driver.client;
import java.io.*;
import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Gary
 */
public class ImportCustomerData extends javax.swing.JPanel {

    /**
     * Creates new form ImportCustomerData
     */
    public ImportCustomerData() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonMainMenu = new javax.swing.JButton();
        labelImportCustomerData = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        labelImportStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.GridBagLayout());

        buttonMainMenu.setText("Main Menu");
        buttonMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMainMenuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(66, 416, 44, 0);
        add(buttonMainMenu, gridBagConstraints);

        labelImportCustomerData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelImportCustomerData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImportCustomerData.setText("Import Customer Data - Choose File to Import");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 192;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 214, 0, 0);
        add(labelImportCustomerData, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 347;
        gridBagConstraints.ipady = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 108, 0, 113);
        add(jFileChooser1, gridBagConstraints);

        labelImportStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelImportStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImportStatus.setText("-import status-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 404, 0, 0);
        add(labelImportStatus, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMainMenuActionPerformed
        cl.show(homeContainer, "Main Menu");
    }//GEN-LAST:event_buttonMainMenuActionPerformed

    public void okayPerformed(ActionEvent e) {
        /*if (e.getSource() == openButton) {
            File file = jFileChooser1.getSelectedFile();
            System.out.println("Opening file " + file.getName() + ".");
            Scanner s = new Scanner(System.in);
            String[] csvString = new String[9];
            String read;
            boolean cond = true;
            while (cond) {
                read = s.nextLine();
                csvString = read.split(",");
                dbConnect.setCustData(read);
                if (read.isEmpty())
                    cond = false;


            } */
        }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMainMenu;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel labelImportCustomerData;
    private javax.swing.JLabel labelImportStatus;
    // End of variables declaration//GEN-END:variables
}
