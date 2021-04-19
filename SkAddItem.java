
package com.students.sportsutilityshop;

/**
 *
 * @author Kaniki

public class SkAddItem extends javax.swing.JFrame {

    /**
     * Creates new form AddItem
     */
    public SkAddItem() {
        initComponents();
        this.setSize(640,370);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SkAddItem = new javax.swing.JPanel();
        SkAddItemTitle = new javax.swing.JLabel();
        SkAddItemRentPriceTitle = new javax.swing.JLabel();
        SkAddItemNameTitle = new javax.swing.JLabel();
        SkAddItemDescriptionTitle = new javax.swing.JLabel();
        SkAddItemBrandTitle = new javax.swing.JLabel();
        SkAddItemColourTitle = new javax.swing.JLabel();
        SkAddItemStockTitle = new javax.swing.JLabel();
        SkAddItemPurchasePriceTitle = new javax.swing.JLabel();
        SkAddItemRentPrice = new javax.swing.JTextField();
        SkAddItemName = new javax.swing.JTextField();
        SkAddItemDescription = new javax.swing.JTextField();
        SkAddItemBrand = new javax.swing.JTextField();
        SkAddItemColour = new javax.swing.JTextField();
        SkAddItemStock = new javax.swing.JTextField();
        SkAddItemPurchasePrice = new javax.swing.JTextField();
        SkAddItemCancel = new javax.swing.JButton();
        SkAddItemSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        SkAddItem.setLayout(null);

        SkAddItemTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SkAddItemTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SkAddItemTitle.setText("Add Item Form");
        SkAddItem.add(SkAddItemTitle);
        SkAddItemTitle.setBounds(0, 0, 740, 60);

        SkAddItemRentPriceTitle.setText("Item Rent Price :");
        SkAddItem.add(SkAddItemRentPriceTitle);
        SkAddItemRentPriceTitle.setBounds(190, 340, 110, 20);

        SkAddItemNameTitle.setText("Item Name :");
        SkAddItem.add(SkAddItemNameTitle);
        SkAddItemNameTitle.setBounds(190, 100, 100, 20);

        SkAddItemDescriptionTitle.setText("Item Description :");
        SkAddItem.add(SkAddItemDescriptionTitle);
        SkAddItemDescriptionTitle.setBounds(190, 140, 120, 20);

        SkAddItemBrandTitle.setText("Item Brand :");
        SkAddItem.add(SkAddItemBrandTitle);
        SkAddItemBrandTitle.setBounds(190, 180, 100, 20);

        SkAddItemColourTitle.setText("Item Colour :");
        SkAddItem.add(SkAddItemColourTitle);
        SkAddItemColourTitle.setBounds(190, 220, 100, 20);

        SkAddItemStockTitle.setText("Item Stock :");
        SkAddItem.add(SkAddItemStockTitle);
        SkAddItemStockTitle.setBounds(190, 260, 100, 20);

        SkAddItemPurchasePriceTitle.setText("Item Purchase Price :");
        SkAddItem.add(SkAddItemPurchasePriceTitle);
        SkAddItemPurchasePriceTitle.setBounds(190, 300, 140, 20);

        SkAddItemRentPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkAddItemRentPriceActionPerformed(evt);
            }
        });
        SkAddItem.add(SkAddItemRentPrice);
        SkAddItemRentPrice.setBounds(330, 330, 230, 30);
        SkAddItem.add(SkAddItemName);
        SkAddItemName.setBounds(330, 90, 230, 30);
        SkAddItem.add(SkAddItemDescription);
        SkAddItemDescription.setBounds(330, 130, 230, 30);
        SkAddItem.add(SkAddItemBrand);
        SkAddItemBrand.setBounds(330, 170, 230, 30);

        SkAddItemColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkAddItemColourActionPerformed(evt);
            }
        });
        SkAddItem.add(SkAddItemColour);
        SkAddItemColour.setBounds(330, 210, 230, 30);
        SkAddItem.add(SkAddItemStock);
        SkAddItemStock.setBounds(330, 250, 230, 30);
        SkAddItem.add(SkAddItemPurchasePrice);
        SkAddItemPurchasePrice.setBounds(330, 290, 230, 30);

        SkAddItemCancel.setText("Cancel");
        SkAddItemCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkAddItemCancelActionPerformed(evt);
            }
        });
        SkAddItem.add(SkAddItemCancel);
        SkAddItemCancel.setBounds(460, 370, 100, 30);

        SkAddItemSave.setText("Save");
        SkAddItem.add(SkAddItemSave);
        SkAddItemSave.setBounds(330, 370, 100, 30);

        getContentPane().add(SkAddItem);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SkAddItemColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkAddItemColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkAddItemColourActionPerformed

    private void SkAddItemRentPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkAddItemRentPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkAddItemRentPriceActionPerformed

    private void SkAddItemCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkAddItemCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkAddItemCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SkAddItem;
    private javax.swing.JTextField SkAddItemBrand;
    private javax.swing.JLabel SkAddItemBrandTitle;
    private javax.swing.JButton SkAddItemCancel;
    private javax.swing.JTextField SkAddItemColour;
    private javax.swing.JLabel SkAddItemColourTitle;
    private javax.swing.JTextField SkAddItemDescription;
    private javax.swing.JLabel SkAddItemDescriptionTitle;
    private javax.swing.JTextField SkAddItemName;
    private javax.swing.JLabel SkAddItemNameTitle;
    private javax.swing.JTextField SkAddItemPurchasePrice;
    private javax.swing.JLabel SkAddItemPurchasePriceTitle;
    private javax.swing.JTextField SkAddItemRentPrice;
    private javax.swing.JLabel SkAddItemRentPriceTitle;
    private javax.swing.JButton SkAddItemSave;
    private javax.swing.JTextField SkAddItemStock;
    private javax.swing.JLabel SkAddItemStockTitle;
    private javax.swing.JLabel SkAddItemTitle;
    // End of variables declaration//GEN-END:variables
}
