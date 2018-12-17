
public class ChangeAddressForm extends javax.swing.JFrame {

    /**
     * Creates new form ChangeAddress
     */
    public ChangeAddressForm() {
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

        btn_Ok = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        txt_NameAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbl_ChangeAddress = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        bgChange = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(546, 293));
        setResizable(false);
        setSize(new java.awt.Dimension(546, 293));
        getContentPane().setLayout(null);

        btn_Ok.setBackground(new java.awt.Color(34, 167, 240));
        btn_Ok.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_Ok.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ok.setText("ตกลง");
        btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Ok);
        btn_Ok.setBounds(280, 140, 70, 25);

        btn_Cancel.setBackground(new java.awt.Color(255, 0, 0));
        btn_Cancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancel.setText("ยกเลิก");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cancel);
        btn_Cancel.setBounds(360, 140, 80, 25);

        txt_NameAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_NameAddress.setForeground(new java.awt.Color(102, 102, 255));
        txt_NameAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_NameAddress);
        txt_NameAddress.setBounds(220, 90, 220, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 290);

        lbl_ChangeAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_ChangeAddress.setText("เปลี่ยนที่อยู่จัดส่ง");
        getContentPane().add(lbl_ChangeAddress);
        lbl_ChangeAddress.setBounds(180, 20, 200, 50);

        lbl_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_address.setText("ที่อยู่จัดส่งใหม่ :");
        getContentPane().add(lbl_address);
        lbl_address.setBounds(120, 90, 100, 30);

        bgChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgChange.jpg"))); // NOI18N
        getContentPane().add(bgChange);
        bgChange.setBounds(0, 0, 550, 290);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        // TODO add your handling code here:
        ProfileService.showProfileForm();
        this.hide();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void txt_NameAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameAddressActionPerformed

    private void btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OkActionPerformed
       String address = txt_NameAddress.getText();
        if(ProfileService.checkNullTextfield(address)){
            ProfileService.changeAddress(LoginForm.userCurrent,address);
            ProfileService.showProfileForm();
            this.hide();
        }
    }//GEN-LAST:event_btn_OkActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgChange;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_ChangeAddress;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JTextField txt_NameAddress;
    // End of variables declaration//GEN-END:variables
}