package br.com.hospital.telas;

import br.com.hospital.telas.paciente.ListaPaciente;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuPacientes = new javax.swing.JMenu();
        menuListaPacientes = new javax.swing.JMenuItem();
        menuCadastroPacientes = new javax.swing.JMenuItem();
        menuEditarPacientes = new javax.swing.JMenuItem();
        menuExcluirPacientes = new javax.swing.JMenuItem();
        menuColaboradores = new javax.swing.JMenu();
        menuListaColaboradores = new javax.swing.JMenuItem();
        menuCadastroColaboradores = new javax.swing.JMenuItem();
        menuEditarColaboradores = new javax.swing.JMenuItem();
        menuExcluirColaboradores = new javax.swing.JMenuItem();
        menuFerramentas = new javax.swing.JMenu();
        menuOrdenar = new javax.swing.JMenuItem();
        menuProntuarios = new javax.swing.JMenu();
        menuOpcao = new javax.swing.JMenu();
        trocarUsuario = new javax.swing.JMenuItem();
        encerrarSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(900, 450));
        setResizable(false);

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/cadastros_pacientes_colab.png"))); // NOI18N
        menuCadastros.setText("Cadastros     ");
        menuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/pacientes.png"))); // NOI18N
        menuPacientes.setText("Pacientes");

        menuListaPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/lista_all.png"))); // NOI18N
        menuListaPacientes.setText("Lista de Pacientes");
        menuListaPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuListaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListaPacientesActionPerformed(evt);
            }
        });
        menuPacientes.add(menuListaPacientes);

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

        menuListaColaboradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/lista_all.png"))); // NOI18N
        menuListaColaboradores.setText("Lista de Colaboradores");
        menuListaColaboradores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuColaboradores.add(menuListaColaboradores);

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

        menuOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/ordernar.png"))); // NOI18N
        menuOrdenar.setText("Ordenar Pacientes");
        menuOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFerramentas.add(menuOrdenar);

        jMenuBar1.add(menuFerramentas);

        menuProntuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/prontuario.png"))); // NOI18N
        menuProntuarios.setText("Prontuários     ");
        menuProntuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(menuProntuarios);

        menuOpcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/options.png"))); // NOI18N
        menuOpcao.setText("Opções");
        menuOpcao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        trocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hospital/imagens/trocar_usuario.png"))); // NOI18N
        trocarUsuario.setText("Trocar de usuário");
        trocarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarUsuarioActionPerformed(evt);
            }
        });
        menuOpcao.add(trocarUsuario);

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
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacientesActionPerformed
        // TODO add your handling code here:
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

    private void menuListaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListaPacientesActionPerformed
        // TODO add your handling code here:
        ListaPaciente listaPacientes = new ListaPaciente();
        listaPacientes.setVisible(true);
    }//GEN-LAST:event_menuListaPacientesActionPerformed

    private void menuCadastroColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroColaboradoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroColaboradoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem encerrarSistema;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCadastroColaboradores;
    private javax.swing.JMenuItem menuCadastroPacientes;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuColaboradores;
    private javax.swing.JMenuItem menuEditarColaboradores;
    private javax.swing.JMenuItem menuEditarPacientes;
    private javax.swing.JMenuItem menuExcluirColaboradores;
    private javax.swing.JMenuItem menuExcluirPacientes;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenuItem menuListaColaboradores;
    private javax.swing.JMenuItem menuListaPacientes;
    private javax.swing.JMenu menuOpcao;
    private javax.swing.JMenuItem menuOrdenar;
    private javax.swing.JMenu menuPacientes;
    private javax.swing.JMenu menuProntuarios;
    private javax.swing.JMenuItem trocarUsuario;
    // End of variables declaration//GEN-END:variables
}
