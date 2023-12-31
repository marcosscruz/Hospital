package br.com.hospital.telas;

import br.com.hospital.telas.paciente.*;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class TelaPrincipal extends javax.swing.JFrame {
    
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuInterno = new javax.swing.JDesktopPane();
        planoFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuPacientes = new javax.swing.JMenu();
        menuCadastroPacientes = new javax.swing.JMenuItem();
        menuEditarPacientes = new javax.swing.JMenuItem();
        menuExcluirPacientes = new javax.swing.JMenuItem();
        menuColaboradores = new javax.swing.JMenu();
        menuCadastroColaboradores = new javax.swing.JMenuItem();
        menuEditarColaboradores = new javax.swing.JMenuItem();
        menuExcluirColaboradores = new javax.swing.JMenuItem();
        menuFerramentas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuOrdenar = new javax.swing.JMenuItem();
        menuPlanoFundo = new javax.swing.JMenuItem();
        menuProntuarios = new javax.swing.JMenu();
        menuOpcao = new javax.swing.JMenu();
        menuGerenciarUser = new javax.swing.JMenu();
        menuNovoUser = new javax.swing.JMenuItem();
        trocarUsuario = new javax.swing.JMenuItem();
        encerrarSistema = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setBackground(new java.awt.Color(153, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 450));
        setResizable(false);

        planoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/plano_fundo_2.png"))); // NOI18N

        javax.swing.GroupLayout menuInternoLayout = new javax.swing.GroupLayout(menuInterno);
        menuInterno.setLayout(menuInternoLayout);
        menuInternoLayout.setHorizontalGroup(
            menuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInternoLayout.createSequentialGroup()
                .addComponent(planoFundo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuInternoLayout.setVerticalGroup(
            menuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInternoLayout.createSequentialGroup()
                .addComponent(planoFundo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuInterno.setLayer(planoFundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/cadastros_pacientes_colab.png"))); // NOI18N
        menuCadastros.setText("Cadastros     ");
        menuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/pacientes.png"))); // NOI18N
        menuPacientes.setText("Pacientes");

        menuCadastroPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/cadastrar.png"))); // NOI18N
        menuCadastroPacientes.setText("Cadastrar");
        menuCadastroPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCadastroPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroPacientesActionPerformed(evt);
            }
        });
        menuPacientes.add(menuCadastroPacientes);

        menuEditarPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/editar.png"))); // NOI18N
        menuEditarPacientes.setText("Editar");
        menuEditarPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPacientes.add(menuEditarPacientes);

        menuExcluirPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/remover.png"))); // NOI18N
        menuExcluirPacientes.setText("Excluir");
        menuExcluirPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPacientes.add(menuExcluirPacientes);

        menuCadastros.add(menuPacientes);

        menuColaboradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/collaborator.png"))); // NOI18N
        menuColaboradores.setText("Colaboradores");

        menuCadastroColaboradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/cadastrar.png"))); // NOI18N
        menuCadastroColaboradores.setText("Cadastrar");
        menuCadastroColaboradores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCadastroColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroColaboradoresActionPerformed(evt);
            }
        });
        menuColaboradores.add(menuCadastroColaboradores);

        menuEditarColaboradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/editar.png"))); // NOI18N
        menuEditarColaboradores.setText("Editar");
        menuEditarColaboradores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuColaboradores.add(menuEditarColaboradores);

        menuExcluirColaboradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/remover.png"))); // NOI18N
        menuExcluirColaboradores.setText("Excluir");
        menuExcluirColaboradores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuColaboradores.add(menuExcluirColaboradores);

        menuCadastros.add(menuColaboradores);

        jMenuBar1.add(menuCadastros);

        menuFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/ferramentas.png"))); // NOI18N
        menuFerramentas.setText("Ferramentas     ");
        menuFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/lista_all.png"))); // NOI18N
        jMenuItem1.setText("Exibir Lista");
        menuFerramentas.add(jMenuItem1);

        menuOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/ordernar.png"))); // NOI18N
        menuOrdenar.setText("Ordenar Pacientes");
        menuOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFerramentas.add(menuOrdenar);

        menuPlanoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/wallpaper.png"))); // NOI18N
        menuPlanoFundo.setText("Plano de Fundo");
        menuPlanoFundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPlanoFundoActionPerformed(evt);
            }
        });
        menuFerramentas.add(menuPlanoFundo);

        jMenuBar1.add(menuFerramentas);

        menuProntuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/prontuario.png"))); // NOI18N
        menuProntuarios.setText("Prontuários     ");
        menuProntuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(menuProntuarios);

        menuOpcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/options.png"))); // NOI18N
        menuOpcao.setText("Opções");
        menuOpcao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuGerenciarUser.setText("Gerênciar Usuário");

        menuNovoUser.setText("Novo Usuário");
        menuGerenciarUser.add(menuNovoUser);

        trocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/trocar_usuario.png"))); // NOI18N
        trocarUsuario.setText("Trocar de usuário");
        trocarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarUsuarioActionPerformed(evt);
            }
        });
        menuGerenciarUser.add(trocarUsuario);

        menuOpcao.add(menuGerenciarUser);

        encerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/sair_sistema.png"))); // NOI18N
        encerrarSistema.setText("Encerrar Sistema");
        encerrarSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarSistemaActionPerformed(evt);
            }
        });
        menuOpcao.add(encerrarSistema);

        jMenuBar1.add(menuOpcao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuInterno)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuInterno)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
    
    private void menuCadastroPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacientesActionPerformed
        // TODO add your handling code here:
        CadastroPaciente cadPaciente = new CadastroPaciente();
        menuInterno.add(cadPaciente);
        cadPaciente.setVisible(true);
    }//GEN-LAST:event_menuCadastroPacientesActionPerformed

    private void encerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarSistemaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_encerrarSistemaActionPerformed

    private void trocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocarUsuarioActionPerformed
        // TODO add your handling code here:
        TelaLogin trocarUser = new TelaLogin();
        trocarUser.setVisible(true);
        dispose();
    }//GEN-LAST:event_trocarUsuarioActionPerformed

    private void menuCadastroColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroColaboradoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroColaboradoresActionPerformed

    private void menuPlanoFundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPlanoFundoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();

            ImageIcon imageIcon = new ImageIcon(imagePath);
            planoFundo.setIcon(imageIcon);
        }
    }//GEN-LAST:event_menuPlanoFundoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem encerrarSistema;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem menuCadastroColaboradores;
    private javax.swing.JMenuItem menuCadastroPacientes;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuColaboradores;
    private javax.swing.JMenuItem menuEditarColaboradores;
    private javax.swing.JMenuItem menuEditarPacientes;
    private javax.swing.JMenuItem menuExcluirColaboradores;
    private javax.swing.JMenuItem menuExcluirPacientes;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenu menuGerenciarUser;
    private javax.swing.JDesktopPane menuInterno;
    private javax.swing.JMenuItem menuNovoUser;
    private javax.swing.JMenu menuOpcao;
    private javax.swing.JMenuItem menuOrdenar;
    private javax.swing.JMenu menuPacientes;
    private javax.swing.JMenuItem menuPlanoFundo;
    private javax.swing.JMenu menuProntuarios;
    private javax.swing.JLabel planoFundo;
    private javax.swing.JMenuItem trocarUsuario;
    // End of variables declaration//GEN-END:variables
}
