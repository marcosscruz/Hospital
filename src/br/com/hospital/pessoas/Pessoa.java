package br.com.hospital.pessoas;

/**
 * Classe abstrata que representa uma pessoa no sistema do hospital.
 */
public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;

    /**
     * Construtor da classe Pessoa.
     *
     * @param nome O nome da pessoa.
     * @param sobrenome O sobrenome da pessoa.
     * @param idade A idade da pessoa
     * @param cpf O CPF da pessoa.
     */
    public Pessoa(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    /**
     * Método para obter o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da pessoa.
     *
     * @param nome O nome da pessoa a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o sobrenome da pessoa.
     *
     * @return O sobrenome da pessoa.
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Método para definir o sobrenome da pessoa.
     *
     * @param sobrenome O sobrenome da pessoa a ser definido.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    /**
     * Método para obter a idade da pessoa.
     * 
     * @return A idade da pessoa.
     */
    public int getIdade(){
        return idade;
    }
    
    /**
     * Método para definir a idade da pessoa.
     * 
     * @param idade A idade da pessoa a ser definida.
     */
    public void setIdade(int idade){
        this.idade = idade;
    }

    /**
     * Método para obter o CPF da pessoa.
     *
     * @return O CPF da pessoa.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método para definir o CPF da pessoa.
     *
     * @param cpf O CPF da pessoa a ser definido.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Sobrescrita do método toString para exibir informações da pessoa.
     *
     * @return Uma representação da pessoa em formato de String.
     */
    @Override
    public String toString() {
        return "PESSOA: [" + "NOME: " + nome + "\tSOBRENOME: " + sobrenome + "\tCPF: " + cpf + ']';
    }
}
