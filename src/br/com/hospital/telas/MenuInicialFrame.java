package br.com.hospital.telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Representa a tela do menu inicial da aplicação.
 */
public class MenuInicialFrame extends JFrame {

    /**
     * Cria uma nova instância da tela do menu inicial.
     */
    public MenuInicialFrame() {
        setTitle("Menu Inicial");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        initComponents();
    }

    /**
     * Inicializa e configura os componentes da janela do menu inicial.
     */
    private void initComponents() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        // Botão para acessar um submenu 
        JButton submenuButton = new JButton("Abrir Menu");
        submenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // Aqui voce pode abrir o submenu desejado, por exemplo, uma nova janela com outras ações
                JOptionPane.showMessageDialog(MenuInicialFrame.this, "Abrindo submenu...");
            }
        });

        JButton menuPacienteButton = new JButton("Pacientes");
        menuPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // Aqui voce pode abrir o submenu desejado, por exemplo, uma nova janela com outras ações
                JOptionPane.showMessageDialog(MenuInicialFrame.this, "Abrindo submenu...");
            }
        });

        JButton menuColaboradoresButton = new JButton("Colaboradores");
        menuColaboradoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // Aqui voce pode abrir o submenu desejado, por exemplo, uma nova janela com outras ações
                JOptionPane.showMessageDialog(MenuInicialFrame.this, "Abrindo submenu...");
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(submenuButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(menuPacienteButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(menuColaboradoresButton, constraints);

        // Botão que encerra o sistema
        JButton encerrarButton = new JButton("Encerrar Sistema");
        encerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // Aqui pode implementar a lógica para encerrar o sistema
                JOptionPane.showMessageDialog(MenuInicialFrame.this, "Encerrando...");
                System.exit(0);
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(encerrarButton, constraints);

        add(panel);
    }

    /**
     * Sobrescrita do método toString para a tela do menu inicial.
     *
     * @return Uma representação da tela do menu inicial em formato de String.
     */
    @Override
    public String toString() {
        return "MenuInicialFrame";
    }
}
