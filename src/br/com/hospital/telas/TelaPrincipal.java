package br.com.hospital.telas;

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
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(900, 450));
        setResizable(false);

        menuCadastros.setText("Cadastros     ");

        menuPacientes.setText("Pacientes");

        menuListaPacientes.setText("Lista de Pacientes");
        menuPacientes.add(menuListaPacientes);

        menuCadastroPacientes.setText("Cadastrar");
        menuCadastroPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroPacientesActionPerformed(evt);
            }
        });
        menuPacientes.add(menuCadastroPacientes);

        menuEditarPacientes.setText("Editar");
        menuPacientes.add(menuEditarPacientes);

        menuExcluirPacientes.setText("Excluir");
        menuPacientes.add(menuExcluirPacientes);

        menuCadastros.add(menuPacientes);

        menuColaboradores.setText("Colaboradores");

        menuListaColaboradores.setText("Lista de Colaboradores");
        menuColaboradores.add(menuListaColaboradores);

        menuCadastroColaboradores.setText("Cadastrar");
        menuColaboradores.add(menuCadastroColaboradores);

        menuEditarColaboradores.setText("Editar");
        menuColaboradores.add(menuEditarColaboradores);

        menuExcluirColaboradores.setText("Excluir");
        menuColaboradores.add(menuExcluirColaboradores);

        menuCadastros.add(menuColaboradores);

        jMenuBar1.add(menuCadastros);

        menuFerramentas.setText("Ferramentas     ");

        menuOrdenar.setText("Ordenar Pacientes");
        menuFerramentas.add(menuOrdenar);

        jMenuBar1.add(menuFerramentas);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

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

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuCadastroPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroPacientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JMenuItem menuOrdenar;
    private javax.swing.JMenu menuPacientes;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
