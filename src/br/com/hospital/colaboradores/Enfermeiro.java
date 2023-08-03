package br.com.hospital.colaboradores;

/**
 * Classe que representa um enfermeiro, que é um tipo de colaborador do
 * hospital.
 */
public class Enfermeiro extends Colaborador {

    private String setor;

    /**
     * Construtor da classe Enfermeiro.
     *
     * @param setor O setor em que o enfermeiro trabalha.
     * @param nome O nome do enfermeiro.
     * @param cpf O CPF do enfermeiro.
     * @param profissao A profissão do enfermeiro.
     */
    public Enfermeiro(String setor, String nome, String cpf, String profissao) {
        // Chama o construtor da superclasse (Colaborador) para inicializar os atributos herdados
        super(nome, cpf, profissao);
        this.setor = setor;
    }

    /**
     * Construtor vazio da classe Enfermeiro.
     */
    public Enfermeiro() {
        // Construtor vazio
    }

    /**
     * Método para obter o setor em que o enfermeiro trabalha.
     *
     * @return O setor em que o enfermeiro trabalha.
     */
    public String getSetor() {
        return setor;
    }

    /**
     * Método para definir o setor em que o enfermeiro trabalha.
     *
     * @param setor O setor em que o enfermeiro trabalha a ser definido.
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * Sobrescrita do método toString para exibir informações do enfermeiro.
     *
     * @return Uma representação do enfermeiro em formato de String.
     */
    @Override
    public String toString() {
        return "\t[NOME: " + getNome() + "\tCPF: " + getCpf() + "\tPROFISSÃO: " + getProfissao() + "]";
    }
}
