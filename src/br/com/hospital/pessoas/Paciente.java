package br.com.hospital.pessoas;

/**
 * Classe que representa um paciente no sistema do hospital.
 */
public class Paciente extends Pessoa {

    private String comorbidade;
    public static int quantidadeInstanciasPacientes = 0;

    /**
     * Construtor da classe Paciente.
     *
     * @param comorbidade A comorbidade do paciente.
     * @param nome O nome do paciente.
     * @param sobrenome O sobrenome do paciente.
     * @param idade A idade do paciente.
     * @param cpf O CPF do paciente.
     */
    public Paciente(String comorbidade, String nome, String sobrenome, int idade, String cpf) {
        // Chama o construtor da superclasse (Pessoa) para inicializar os atributos herdados
        super(nome, sobrenome, idade, cpf);
        this.comorbidade = comorbidade;
        quantidadeInstanciasPacientes++;
    }

    /**
     * Obtém a comorbidade associada ao paciente.
     *
     * @return A comorbidade atual do paciente.
     */
    public String getComorbidade() {
        return comorbidade;
    }

    /**
     * Define a comorbidade associada ao paciente.
     *
     * @param comorbidade A nova comorbidade a ser associada ao paciente.
     */
    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }

    /**
     * Sobrescrita do método toString para exibir informações do paciente.
     *
     * @return Uma representação do paciente em formato de String.
     */
    @Override
    public String toString() {
        return "\tPACIENTE: [" + "CPF: " + getCpf() + "\tNOME: " + getNome().toUpperCase() + "\tSOBRENOME: " + getSobrenome().toUpperCase() + "\tIDADE: " + getIdade() + "\tCOMORBIDADE: " + comorbidade.toUpperCase() + ']';
    }
}
