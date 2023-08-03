package br.com.hospital.colaboradores;

/**
 * Classe que representa um colaborador do hospital.
 */
public class Colaborador {

    private String nome;
    private String cpf;
    private String profissao;

    /**
     * Construtor da classe Colaborador.
     *
     * @param nome O nome do colaborador.
     * @param cpf O CPF do colaborador.
     * @param profissao A profissão do colaborador.
     */
    public Colaborador(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    /**
     * Construtor vazio da classe Colaborador.
     */
    public Colaborador() {
        // Construtor vazio
    }

    /**
     * Método para obter o nome do colaborador.
     *
     * @return O nome do colaborador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do colaborador.
     *
     * @param nome O nome do colaborador a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o CPF do colaborador.
     *
     * @return O CPF do colaborador.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método para definir o CPF do colaborador.
     *
     * @param cpf O CPF do colaborador a ser definido.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método para obter a profissão do colaborador.
     *
     * @return A profissão do colaborador.
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * Método para definir a profissão do colaborador.
     *
     * @param profissao A profissão do colaborador a ser definida.
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * Sobrescrita do método toString para exibir informações do colaborador.
     *
     * @return Uma representação do colaborador em formato de String.
     */
    @Override
    public String toString() {
        return "\t[NOME: " + nome + "\tCPF: " + cpf + "\tPROFISSÃO: " + profissao + "]";
    }
}
