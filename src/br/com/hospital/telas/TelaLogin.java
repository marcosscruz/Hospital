package br.com.hospital.telas;

import br.com.hospital.colaboradores.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    private ArrayList<Usuario> usuarioDataBase;

    public TelaLogin() {
        // Inicializa o banco de dados de usuários com um usuário de exemplo
        usuarioDataBase = new ArrayList<>();
        usuarioDataBase.add(new Usuario("login", "senha"));

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPequena = new javax.swing.JLabel();
        textLogin = new javax.swing.JLabel();
        usuarioLogin = new javax.swing.JTextField();
        textSenha = new javax.swing.JLabel();
        usuarioSenha = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(500, 250));
        setMinimumSize(new java.awt.Dimension(500, 250));
        setResizable(false);

        logoPequena
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/logo_login.png"))); // NOI18N

        textLogin.setText("Login:");

        textSenha.setText("Senha:");

        loginButton.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/entrar_sistema.png"))); // NOI18N
        loginButton.setText("Entrar");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        sairButton.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/sair_sistema.png"))); // NOI18N
        sairButton.setText("Sair");
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(logoPequena)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textLogin)
                                        .addComponent(usuarioLogin)
                                        .addComponent(textSenha)
                                        .addComponent(usuarioSenha)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(51, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(logoPequena))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(textLogin)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(usuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(textSenha)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(usuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(loginButton)
                                                        .addComponent(sairButton))))
                                .addContainerGap(81, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String nomeUser = usuarioLogin.getText();
        char[] senhaUser = usuarioSenha.getPassword();

        if (nomeUser.isEmpty() || senhaUser.length == 0) {
            JOptionPane.showMessageDialog(TelaLogin.this, "Preencha todos os campos!");
        }

        boolean autiticado = false;
        for (Usuario usuario : usuarioDataBase) {
            if (usuario.getNomeUsuario().equals(nomeUser) && usuario.getSenhaUsuario().equals(new String(senhaUser))) {
                autiticado = true;
                break;
            }
        }

        if (autiticado) {
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);

            setVisible(false);
            dispose();
        } else {
            JOptionPane.showMessageDialog(TelaLogin.this, "Usuário ou Senha inconrretos!");
        }
    }// GEN-LAST:event_loginButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_sairButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoPequena;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel textLogin;
    private javax.swing.JLabel textSenha;
    private javax.swing.JTextField usuarioLogin;
    private javax.swing.JPasswordField usuarioSenha;
    // End of variables declaration//GEN-END:variables
}
