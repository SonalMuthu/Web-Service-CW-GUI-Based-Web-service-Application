package ws_bank_client;

import customer_ws.Customers;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Keshav
 */
public class CustomerAccount extends javax.swing.JFrame {

    /**
     * Creates new form CustomerAccount
     */
    public CustomerAccount() {
        initComponents();
        lblHeading.setText("Create New Customer");
        btnEdit.setVisible(false);
        btnDelete.setVisible(false);
    }

    CustomerAccount(Customers cust) {
        initComponents();
        lblHeading.setText("Manage Customer");
        btnAdd.setVisible(false);
        btnClear.setVisible(false);
        txtName.setText(cust.getName());
        txtDob.setText(cust.getBirtDate());
        txtAddress.setText(cust.getAddress());
        txtMobNo.setText(cust.getMobile());
        txtEmail.setText(cust.getEmail());
        txtAccType.setText(cust.getAccountType());
        txtAccNo.setText(cust.getAccountNumber());
        txtSortCode.setText(cust.getSortCode());
        txtBalance.setText(cust.getBalance());
        txtCard.setText(cust.getCard());
        
        txtAccNo.setEditable(false);
        txtAccType.setEditable(false);
        txtSortCode.setEditable(false);
        txtBalance.setEditable(false);
        txtCard.setEditable(false);
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
        lblHeading = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblMobNo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAccType = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblSortCode = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblCard = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtMobNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAccType = new javax.swing.JTextField();
        txtAccNo = new javax.swing.JTextField();
        txtSortCode = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtCard = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblErrorMessage = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        lblHeading.setBackground(new java.awt.Color(255, 255, 255));
        lblHeading.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 102, 255));

        lblName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 255));
        lblName.setText("Name");

        lblDob.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblDob.setForeground(new java.awt.Color(0, 102, 255));
        lblDob.setText("Birth Date");

        lblAddress.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 102, 255));
        lblAddress.setText("Address");

        lblMobNo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMobNo.setForeground(new java.awt.Color(0, 102, 255));
        lblMobNo.setText("Mobile No");

        lblEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 102, 255));
        lblEmail.setText("E-Mail");

        lblAccType.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblAccType.setForeground(new java.awt.Color(0, 102, 255));
        lblAccType.setText("Account Type");

        lblAccNo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblAccNo.setForeground(new java.awt.Color(0, 102, 255));
        lblAccNo.setText("Account Number");

        lblSortCode.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblSortCode.setForeground(new java.awt.Color(0, 102, 255));
        lblSortCode.setText("Sort Code");

        lblBalance.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(0, 102, 255));
        lblBalance.setText("Balance");

        lblCard.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblCard.setForeground(new java.awt.Color(0, 102, 255));
        lblCard.setText("Card");

        txtName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtDob.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtMobNo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEmail.setToolTipText("");

        txtAccType.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtAccNo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtSortCode.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtBalance.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtCard.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAdd.setText("Add Customer");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblErrorMessage.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        btnEdit.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblErrorMessage)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnEdit))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete))
                        .addContainerGap(280, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDob)
                            .addComponent(lblName)
                            .addComponent(lblAddress)
                            .addComponent(lblMobNo)
                            .addComponent(lblEmail)
                            .addComponent(lblAccType)
                            .addComponent(lblAccNo)
                            .addComponent(lblSortCode)
                            .addComponent(lblBalance)
                            .addComponent(lblCard))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txtMobNo)
                            .addComponent(txtEmail)
                            .addComponent(txtAccType)
                            .addComponent(txtAccNo)
                            .addComponent(txtSortCode)
                            .addComponent(txtBalance)
                            .addComponent(txtCard)
                            .addComponent(txtDob)
                            .addComponent(txtName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(34, 34, 34))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(lblErrorMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDob)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMobNo)
                            .addComponent(txtMobNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAccType)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnBack)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSortCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBalance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCard))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(32, 32, 32))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = txtName.getText();
        String dob = txtDob.getText();
        String address = txtAddress.getText();
        String mobileNo = txtMobNo.getText();
        String email = txtEmail.getText();
        String accType = txtAccType.getText();
        String accNo = txtAccNo.getText();
        String sortCode = txtSortCode.getText();
        String balance = txtBalance.getText();
        String card = txtCard.getText();

        if (!name.equals("") || !dob.equals("") || !address.equals("") || !mobileNo.equals("") || !email.equals("") 
                || !accType.equals("") || !accNo.equals("") || !sortCode.equals("") || !balance.equals("") || !card.equals("")) {
            String result = addCustomer(name, address, mobileNo, dob, email, accType, accNo, balance, sortCode, card);
            if (result.equalsIgnoreCase("Insert Succesful")) {
                showMessageDialog(null, "Customer Successfully Registered");
                this.setVisible(false);
                new Customer_List().setVisible(true);
            } else {
                showMessageDialog(null, "Insertion Failed");
            }
        } else {
            lblErrorMessage.setText("Please fill all the fields!!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new Customer_List().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtDob.setText("");
        txtAddress.setText("");
        txtMobNo.setText("");
        txtEmail.setText("");
        txtAccType.setText("");
        txtAccNo.setText("");
        txtSortCode.setText("");
        txtBalance.setText("");
        txtCard.setText("");
        lblErrorMessage.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String name = txtName.getText();
        String dob = txtDob.getText();
        String address = txtAddress.getText();
        String mobileNo = txtMobNo.getText();
        String email = txtEmail.getText();
        String accNo = txtAccNo.getText();
        String result = editCustomer(name, address, dob, mobileNo, email, accNo);
        if (result.equalsIgnoreCase("Update Succesful")) {
            showMessageDialog(null, "Customer Successfully Edited");
            this.setVisible(false);
            new Customer_List().setVisible(true);
        } else {
            showMessageDialog(null, "Editing Failed");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String accNo = txtAccNo.getText();
        System.out.println(accNo);
        String result = deleteCustomer(accNo);
        if (result.equalsIgnoreCase("Delete Succesful")) {
            showMessageDialog(null, "Customer Successfully Deleted");
            this.setVisible(false);
            new Customer_List().setVisible(true);
        } else {
            showMessageDialog(null, "Deletion Failed, Check the old username");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblAccType;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCard;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblMobNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSortCode;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JTextField txtAccType;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtCard;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSortCode;
    // End of variables declaration//GEN-END:variables

    private static String addCustomer(java.lang.String name, java.lang.String address, 
          java.lang.String mobile, java.lang.String dateOfBirth, java.lang.String email, 
          java.lang.String accountType, java.lang.String accountNumber, java.lang.String balance, 
          java.lang.String sortCode, java.lang.String card) {
        customer_ws.CustomerWs_Service service = new customer_ws.CustomerWs_Service();
        customer_ws.CustomerWs port = service.getCustomerWsPort();
        return port.addCustomer(name, address, mobile, dateOfBirth, email, accountType, accountNumber, 
                balance, sortCode, card);
    }

    private static String editCustomer(java.lang.String name, java.lang.String address, 
            java.lang.String dateOfBirth, java.lang.String mobile, java.lang.String email, 
            java.lang.String accountNumber) {
        customer_ws.CustomerWs_Service service = new customer_ws.CustomerWs_Service();
        customer_ws.CustomerWs port = service.getCustomerWsPort();
        return port.editCustomer(name, address, dateOfBirth, mobile, email, accountNumber);
    }

    private static String deleteCustomer(java.lang.String accountNumber) {
        customer_ws.CustomerWs_Service service = new customer_ws.CustomerWs_Service();
        customer_ws.CustomerWs port = service.getCustomerWsPort();
        return port.deleteCustomer(accountNumber);
    }

}