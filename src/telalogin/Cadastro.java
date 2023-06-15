package telalogin;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.text.MaskFormatter;

public class Cadastro extends javax.swing.JFrame {

    String nome, email, senha, nascimento, sexo, endereco, estado, telefone;
    int RA;

    public Cadastro() {
        initComponents();
        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panel_logo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        cb_sexo = new javax.swing.JComboBox<>();
        lbl_nascimento = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        btn_confirma = new javax.swing.JButton();
        lbl_senha = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        lbl_telefone = new javax.swing.JLabel();
        cb_estado = new javax.swing.JComboBox<>();
        lbl_titulo = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_nascimento = new javax.swing.JFormattedTextField();
        txt_telefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(234, 234, 234));
        panel.setForeground(new java.awt.Color(255, 255, 255));

        panel_logo.setBackground(new java.awt.Color(56, 168, 168));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telalogin/20230529_152109_0000_396_2-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logoLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        panel_logoLayout.setVerticalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logoLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_nome.setText("Nome");

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));

        lbl_nascimento.setText("Data de nascimento");

        lbl_sexo.setText("Sexo ");

        btn_confirma.setBackground(new java.awt.Color(32, 186, 186));
        btn_confirma.setText("OK");
        btn_confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmaActionPerformed(evt);
            }
        });

        lbl_senha.setText("Senha ");

        lbl_email.setText("Email");

        lbl_endereco.setText("Endereço");

        lbl_telefone.setText("Telefone");

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lbl_titulo.setBackground(new java.awt.Color(204, 204, 255));
        lbl_titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lbl_titulo.setText("Cadastro ");

        try {
            txt_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lbl_nascimento)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_email)
                                    .addComponent(lbl_senha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_endereco)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(lbl_sexo)
                                        .addGap(17, 17, 17))
                                    .addComponent(lbl_telefone))
                                .addGap(22, 22, 22)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_nascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_senha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_telefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_sexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_endereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(btn_confirma)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addGap(175, 175, 175))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nascimento)
                    .addComponent(txt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telefone)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_confirma)
                .addGap(26, 26, 26))
            .addComponent(panel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private boolean validarDados() {
        nome = txt_nome.getText();
        email = txt_email.getText();
        senha = txt_senha.getText();
        nascimento = txt_nascimento.getText();
        endereco = txt_endereco.getText();
        estado = cb_estado.getSelectedItem() == null ? "" : cb_estado.getSelectedItem().toString();
        sexo = cb_sexo.getSelectedItem() == null ? "" : cb_sexo.getSelectedItem().toString();
        telefone = txt_telefone.getText();
        
        if(nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite um nome.");
            return false;
        }
        if(email.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite um email.");
            return false;
        }
        if(senha.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite uma senha.");
            return false;
        }
        if(senha.length() < 8) {
            JOptionPane.showMessageDialog(this, "A senha deve possuir pelo menos 8 caracteres.");
            return false;
        }
        if(senha.length() > 20) {
            JOptionPane.showMessageDialog(this, "A senha deve possuir até 20 caracteres.");
            return false;
        }
        if(nascimento.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite uma data de nascimento.");
            return false;
        }

        // Verificar se a data de nascimento está no formato correto
        if(!validarData(nascimento)) {
            JOptionPane.showMessageDialog(this, "Por favor, digite uma data de nascimento válida (DD/MM/AAAA).");
            return false;
        }

        if(endereco.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite um endereco.");
            return false;
        }
        if(estado.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um estado.");
            return false;
        }
        if(sexo.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um sexo.");
            return false;
        }
        if(telefone.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, digite um telefone.");
            return false;
        }
        return true;
    }
    
    private int gerarRA() {
        Random random = new Random();
        int numero = random.nextInt(1000000000);
        RA = numero;
        return RA;
    }
    
    private boolean validarData(String data) {
        String[] partes = data.split("/");
        if(partes.length != 3) {
            return false;
        }

        int dia, mes, ano;
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            return false;
        }

        // Verificar se o dia, mês e ano são valores válidos
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900) {
            return false;
        }

        // Verificar se a data é válida (levando em conta anos bissextos)
        if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        } else if (mes == 2) {
            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
            if((bissexto && dia > 29) || (!bissexto && dia > 28)) {
                return false;
            }
        }

        return true;
    }

    
    private void inserirBanco() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/codewave","root","");
            String sql = "insert into cadastro values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, gerarRA());
            stmt.setString(2, nome.trim());
            stmt.setString(3, email.trim());
            stmt.setString(4, senha.trim());
            stmt.setString(5, nascimento);
            stmt.setString(6, sexo.trim());
            stmt.setString(7, endereco.trim());
            stmt.setString(8, estado.trim());
            stmt.setString(9, telefone);
            int i = stmt.executeUpdate();
            if(i > 0) {
            } else {
                JOptionPane.showMessageDialog(this, "ERRO");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void btn_confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmaActionPerformed
        if(validarDados()) {
            inserirBanco();
        }
    }//GEN-LAST:event_btn_confirmaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirma;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JComboBox<String> cb_sexo;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_nascimento;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JFormattedTextField txt_nascimento;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
