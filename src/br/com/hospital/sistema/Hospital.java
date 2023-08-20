package br.com.hospital.sistema;

import br.com.hospital.telas.TelaLogin;

/**
 * Classe principal que irá executar o sistema do hospital.
 *
 * @author Marcos Vinicius Santos Cruz
 * @version 1.02.05
 */
public class Hospital {

    /**
     * Método principal que inicia a execução do sistema.
     *
     * @param args Os argumentos da linha de comando, caso necessário.
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }
}
