/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Choppy
 */
public class LoginForm extends javax.swing.JFrame {

    public static User userCurrent ;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        txt_Username = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();
        btn_Login = new javax.swing.JButton();
        btn_Register = new javax.swing.JButton();
        lbl_nameshop = new javax.swing.JLabel();
        lbl_nameshop1 = new javax.swing.JLabel();
        bgpanel = new javax.swing.JPanel();
        bgpanel2 = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        bgLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 604));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        txt_Username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Username.setForeground(new java.awt.Color(153, 102, 255));
        txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Username);
        txt_Username.setBounds(240, 210, 450, 60);

        txt_Password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Password.setForeground(new java.awt.Color(153, 102, 255));
        getContentPane().add(txt_Password);
        txt_Password.setBounds(240, 290, 450, 60);

        btn_Login.setBackground(new java.awt.Color(51, 0, 255));
        btn_Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(255, 255, 255));
        btn_Login.setText("เข้าสู่ระบบ");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Login);
        btn_Login.setBounds(280, 410, 160, 50);

        btn_Register.setBackground(new java.awt.Color(255, 0, 0));
        btn_Register.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Register.setForeground(new java.awt.Color(255, 255, 255));
        btn_Register.setText("สมัครสมาชิก");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Register);
        btn_Register.setBounds(470, 410, 160, 50);

        lbl_nameshop.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        lbl_nameshop.setText("Clothes Shop");
        getContentPane().add(lbl_nameshop);
        lbl_nameshop.setBounds(90, 60, 540, 90);

        lbl_nameshop1.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        lbl_nameshop1.setForeground(new java.awt.Color(255, 204, 204));
        lbl_nameshop1.setText("Clothes Shop");
        getContentPane().add(lbl_nameshop1);
        lbl_nameshop1.setBounds(100, 60, 540, 90);

        bgpanel.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(bgpanel);
        bgpanel.setBounds(0, 60, 480, 90);

        bgpanel2.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(bgpanel2);
        bgpanel2.setBounds(10, 70, 480, 90);

        lbl_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_username.setText("ชื่อผู้ใช้ :");
        getContentPane().add(lbl_username);
        lbl_username.setBounds(140, 210, 100, 60);

        lbl_password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_password.setText("รหัสผ่าน :");
        getContentPane().add(lbl_password);
        lbl_password.setBounds(130, 290, 110, 60);

        bgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgLogin.jpg"))); // NOI18N
        getContentPane().add(bgLogin);
        bgLogin.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsernameActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        User user = new User(txt_Username.getText(), txt_Password.getText());
        LoginService.goToMain(user);
        setVisible(false);
        userCurrent = UserService.getUser(txt_Username.getText());
       // CartService.usercurrentdao = usercurent;
//        MainPage.userIdtxt.setText(usercurent);
        
        

    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        LoginService.goTORegister();
        setVisible(false);
    }//GEN-LAST:event_btn_RegisterActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLogin;
    private javax.swing.JPanel bgpanel;
    private javax.swing.JPanel bgpanel2;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Register;
    private javax.swing.JLabel lbl_nameshop;
    private javax.swing.JLabel lbl_nameshop1;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txt_Password;
    private static javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}