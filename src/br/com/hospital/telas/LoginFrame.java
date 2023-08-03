package br.com.hospital.telas;

import javax.swing.*;
import br.com.hospital.colaboradores.Usuario;
import br.com.hospital.sistema.Hospital;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Representa a tela de login da aplicação.
 */
public class LoginFrame extends JFrame {

    private JTextField nomeUsuario;
    private JPasswordField senhaUsuario;

    private ArrayList<Usuario> usuarioDataBase;

    /**
     * Cria uma nova instância da tela de login.
     */
    public LoginFrame() {
        // Configurações iniciais da janela de login
        setTitle("Tela de Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(false);
        setLocationRelativeTo(null);

        // Inicializa o banco de dados de usuários com um usuário de exemplo
        usuarioDataBase = new ArrayList<>();
        usuarioDataBase.add(new Usuario("login", "senha"));

        // Inicializa os componentes da janela de login
        initComponents();
    }

    /**
     * Inicializa e configura os componentes da janela de login.
     */
    private void initComponents() {
        // Cria um painel para posicionar os componentes graficamente
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Adiciona os rótulos e campos de texto para o nome de usuário e senha
        JLabel userNameJLabel = new JLabel("Usuário: ");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(userNameJLabel, constraints);

        nomeUsuario = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(nomeUsuario, constraints);

        JLabel userSenhaJLabel = new JLabel("Senha: ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(userSenhaJLabel, constraints);

        senhaUsuario = new JPasswordField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(senhaUsuario, constraints);

        // Adiciona o botão de login e configura o ActionListener para verificar as credenciais
        JButton loginButton = new JButton("Login");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // Obtém o nome de usuário e a senha informados pelo usuário
                String nomeUser = nomeUsuario.getText();
                char[] senha = senhaUsuario.getPassword();

                // Verifica se os campos de nome de usuário e senha estão preenchidos
                if (nomeUser.isEmpty() || senha.length == 0) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Preencha todos os campos!");
                    return;
                }

                // Verifica as credenciais com os usuários no banco de dados
                boolean autenticado = false;
                for (Usuario usuario : usuarioDataBase) {
                    if (usuario.getNomeUsuario().equals(nomeUser)
                            && usuario.getSenhaUsuario().equals(new String(senha))) {
                        autenticado = true;
                        break;
                    }
                }

                if (autenticado) {
                    // Cria uma nova instância da classe MenuInicialFrame e torna-a visível.
                    MenuInicialFrame menuFrame = new MenuInicialFrame();
                    menuFrame.setVisible(true);

                    // Tela Login fica invisível
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Usuário ou Senha incorretos!");
                }
            }
        });
        panel.add(loginButton, constraints);
        add(panel); // Adiciona o painel à janela de login
    }

    /**
     * Sobrescrita do método toString para a tela de login.
     *
     * @return Uma representação da tela de login em formato de String.
     */
    @Override
    public String toString() {
        return "LoginFrame";
    }
}
