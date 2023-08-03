package br.com.hospital.colaboradores;

/**
 * Representa um usuário no sistema.
 */
public class Usuario {
    private String nomeUsuario;
    private String senhaUsuario;

    /**
     * Cria uma nova instância de usuário com o nome de usuário e senha
     * especificados.
     *
     * @param nomeUsuario  O nome de usuário do usuário.
     * @param senhaUsuario A senha do usuário.
     */
    public Usuario(String nomeUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    /**
     * Retorna o nome de usuário do usuário.
     *
     * @return O nome de usuário.
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * Retorna a senha do usuário.
     *
     * @return A senha do usuário.
     */
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    /**
     * Retorna uma representação em string dos detalhes do usuário.
     *
     * @return Representação em string dos detalhes do usuário.
     */
    @Override
    public String toString() {
        return "\tUSUÁRIOS: [" + "NOME USER: " + nomeUsuario + "\tSENHA USER: " + senhaUsuario + ']';
    }
}
