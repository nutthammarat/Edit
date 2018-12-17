/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WATCHARAPOL PLOYJAN
 */
public class OrderPage extends javax.swing.JFrame {

    /**
     * Creates new form OrderPage
     */
    public OrderPage() {
        initComponents();
        OrderService.getOrder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sumtxt = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txt_totalprice = new javax.swing.JLabel();
        lbl_icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bgChange = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(580, 290));
        setMinimumSize(new java.awt.Dimension(580, 290));
        setPreferredSize(new java.awt.Dimension(580, 290));
        setResizable(false);
        setSize(new java.awt.Dimension(580, 290));
        getContentPane().setLayout(null);
        getContentPane().add(sumtxt);
        sumtxt.setBounds(480, 280, 100, 20);

        btn_Back.setBackground(new java.awt.Color(255, 0, 51));
        btn_Back.setForeground(new java.awt.Color(255, 204, 204));
        btn_Back.setText("กลับ");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Back);
        btn_Back.setBounds(30, 220, 80, 23);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(102, 102, 255));
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 80, 500, 130);

        txt_totalprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_totalprice.setForeground(new java.awt.Color(102, 0, 204));
        txt_totalprice.setText("...");
        getContentPane().add(txt_totalprice);
        txt_totalprice.setBounds(390, 220, 90, 30);

        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconorder.png"))); // NOI18N
        getContentPane().add(lbl_icon);
        lbl_icon.setBounds(50, -40, 60, 160);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("รายการสั่งสินค้า");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, -10, 160, 130);

        lbl_price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_price.setForeground(new java.awt.Color(102, 0, 204));
        lbl_price.setText("ราคารวม : ");
        getContentPane().add(lbl_price);
        lbl_price.setBounds(300, 220, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 204));
        jLabel3.setText("บาท");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 220, 40, 20);

        bgChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgorder.jpg"))); // NOI18N
        getContentPane().add(bgChange);
        bgChange.setBounds(0, 0, 570, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public static void showProfileForm() {
        ProfileForm profile = new ProfileForm();
        profile.show();
    } 
    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        showProfileForm();
        hide();
    }//GEN-LAST:event_btn_BackActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgChange;
    private javax.swing.JButton btn_Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_price;
    public static javax.swing.JLabel sumtxt;
    public static javax.swing.JLabel txt_totalprice;
    // End of variables declaration//GEN-END:variables
}
