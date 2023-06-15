package telalogin;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_ra = new javax.swing.JLabel();
        lbl_senha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_senha = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        txt_ra = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(59, 179, 179));

        panel1.setBackground(new java.awt.Color(131, 211, 211));
        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setForeground(new java.awt.Color(204, 204, 204));

        lbl_titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        lbl_titulo.setText("Login");

        lbl_ra.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lbl_ra.setText("RA");

        lbl_senha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lbl_senha.setText("Senha ");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btn_login.setBackground(new java.awt.Color(204, 204, 204));
        btn_login.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_login.setText("Entrar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lbl_titulo))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_senha)
                            .addComponent(lbl_ra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txt_ra))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_titulo)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ra)
                        .addComponent(txt_ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_senha))
                        .addGap(66, 66, 66)
                        .addComponent(btn_login)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telalogin/20230529_152109_0000_396_2-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarUsuario(String ra, String senha) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/codewave", "root", "");
            String sql = "select * from cadastro where ra=? and senha=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ra);
            pst.setString(2, senha);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                this.dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "RA ou senha incorretos.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String ra = txt_ra.getText();
        String senha = txt_senha.getText();
        if(ra.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o ra ou senha");
        } else {
            verificarUsuario(ra, senha);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_ra;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txt_ra;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
