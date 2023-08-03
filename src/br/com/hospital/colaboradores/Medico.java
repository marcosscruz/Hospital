package br.com.hospital.colaboradores;

/**
 * Classe que representa um médico, que é um tipo de colaborador do hospital.
 */
public class Medico extends Colaborador {

    private String especialidade;

    /**
     * Construtor da classe Medico.
     *
     * @param especialidade A especialidade do médico.
     * @param nome O nome do médico.
     * @param cpf O CPF do médico.
     * @param profissao A profissão do médico.
     */
    public Medico(String especialidade, String nome, String cpf, String profissao) {
        // Chama o construtor da superclasse (Colaborador) para inicializar os atributos herdados
        super(nome, cpf, profissao);
        this.especialidade = especialidade;
    }

    /**
     * Construtor vazio da classe Medico.
     */
    public Medico() {
        // Construtor vazio
    }

    /**
     * Método para obter a especialidade do médico.
     *
     * @return A especialidade do médico.
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * Método para definir a especialidade do médico.
     *
     * @param especialidade A especialidade do médico a ser definida.
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * Sobrescrita do método toString para exibir informações do médico.
     *
     * @return Uma representação do médico em formato de String.
     */
    @Override
    public String toString() {
        return "\t[NOME: " + getNome() + "\tCPF: " + getCpf() + "\tPROFISSÃO: " + getProfissao() + "]";
    }
}
