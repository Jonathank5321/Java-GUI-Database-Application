
package com.students.sportsutilityshop;

/**
 *
 * @author Kaniki

public class SkHelp extends javax.swing.JFrame {

    /**
     * Creates new form AddItem
     */
    public SkHelp() {
        initComponents();
        this.setSize(745,380);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SkAddCustomer = new javax.swing.JPanel();
        SkHelpTitle = new javax.swing.JLabel();
        SkHelpClose = new javax.swing.JButton();
        SkHelpScroll = new javax.swing.JScrollPane();
        SkHelpText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        SkAddCustomer.setLayout(null);

        SkHelpTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SkHelpTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SkHelpTitle.setText("Add Customer Form");
        SkAddCustomer.add(SkHelpTitle);
        SkHelpTitle.setBounds(0, 0, 740, 60);

        SkHelpClose.setText("Close");
        SkHelpClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkHelpCloseActionPerformed(evt);
            }
        });
        SkAddCustomer.add(SkHelpClose);
        SkHelpClose.setBounds(310, 310, 100, 30);

        SkHelpText.setColumns(20);
        SkHelpText.setRows(5);
        SkHelpScroll.setViewportView(SkHelpText);

        SkAddCustomer.add(SkHelpScroll);
        SkHelpScroll.setBounds(30, 70, 680, 230);

        getContentPane().add(SkAddCustomer);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SkHelpCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkHelpCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkHelpCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SkAddCustomer;
    private javax.swing.JButton SkHelpClose;
    private javax.swing.JScrollPane SkHelpScroll;
    private javax.swing.JTextArea SkHelpText;
    private javax.swing.JLabel SkHelpTitle;
    // End of variables declaration//GEN-END:variables
}
