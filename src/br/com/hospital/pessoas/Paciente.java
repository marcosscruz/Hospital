package br.com.hospital.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Classe que representa um paciente no sistema do hospital.
 */
public class Paciente extends Pessoa {

    private int idade;
    private String endereco;
    private String telefone;
    private String historicoMedico;
    public static int quantidadeInstanciasPacientes = 0;

    /**
     * Construtor da classe Paciente.
     *
     * @param idade A idade do paciente.
     * @param historicoMedico O histórico médico do paciente.
     * @param endereco O endereço do paciente.
     * @param telefone O telefone do paciente.
     * @param nome O nome do paciente.
     * @param sobrenome O sobrenome do paciente.
     * @param dataNascimento A data de nascimento do paciente.
     * @param cpf O CPF do paciente.
     */
    public Paciente(int idade, String historicoMedico, String endereco, String telefone, String nome, String sobrenome, String dataNascimento, String cpf) {
        // Chama o construtor da superclasse (Pessoa) para inicializar os atributos herdados
        super(nome, sobrenome, dataNascimento, cpf);
        this.historicoMedico = historicoMedico;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = calcularIdade(dataNascimento);
        quantidadeInstanciasPacientes++;
    }

    /**
     * Obtém a comorbidade associada ao paciente.
     *
     * @return A comorbidade atual do paciente.
     */
    public String getHistoricoMedico() {
        return historicoMedico;
    }

    /**
     * Define o histórico médico associada ao paciente.
     *
     * @param historicoMedico O histórico médico a ser associada ao paciente.
     */
    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    /**
     * Define a idade associada ao paciente.
     *
     * @return A idade a ser associada ao paciente.
     */
    public int getIdade() {
        return idade;
    }
    
    /**
     * Obtém o endereço associado ao paciente.
     *
     * @return O endereço atual do paciente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço associado ao paciente.
     *
     * @param endereco O endereço a ser associado ao paciente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * Define o telefone associado ao paciente.
     * 
     * @return  O telefone atual do paciente.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone associando ao paciente.
     * 
     * @param telefone  O telefone a ser associado ao paciente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Calcula a idade com base na data de nascimento fornecida.
     *
     * @param dataNascimento A data de nascimento no formato "dd/MM/yyyy".
     * @return A idade calculada.
     */
    public static int calcularIdade(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataNascimento, formatter);
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNasc, dataAtual).getYears();
    }

    /**
     * Sobrescrita do método toString para exibir informações do paciente.
     *
     * @return Uma representação do paciente em formato de String.
     */
    @Override
    public String toString() {
        return "\tPACIENTE: [" + "CPF: " + getCpf() + "\tNOME: " + getNome().toUpperCase() + "\tSOBRENOME: " + getSobrenome().toUpperCase() + "\tHITÓRICO MÉDICO: " + historicoMedico.toUpperCase() + ']';
    }
}
