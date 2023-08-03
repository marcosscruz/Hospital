package br.com.hospital.telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicialFrame extends JFrame {

    public MenuInicialFrame() {
        setTitle("Menu Inicial");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        initComponents();
    }

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

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(submenuButton, constraints);

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
        constraints.gridy = 1;
        panel.add(encerrarButton, constraints);

        add(panel);
    }
}
