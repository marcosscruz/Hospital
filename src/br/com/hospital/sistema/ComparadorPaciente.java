package br.com.hospital.sistema;

import br.com.hospital.pessoas.Paciente;
import java.util.Comparator;

/**
 * Classe que implementa a interface Comparator para realizar comparações entre
 * objetos do tipo Paciente.
 */
public class ComparadorPaciente implements Comparator<Paciente> {

    private String atributoComparacao;

    /**
     * Construtor da classe ComparadorPaciente.
     *
     * @param atributoComparacao O atributo de comparação que será usado para
     * ordenar os pacientes. Pode ser "idade", "comorbidade" ou "nomeSobrenome".
     */
    public ComparadorPaciente(String atributoComparacao) {
        this.atributoComparacao = atributoComparacao;
    }

    /**
     * Método de comparação que permite ordenar os pacientes com base no
     * atributo especificado.
     *
     * @param p1 O primeiro paciente a ser comparado.
     * @param p2 O segundo paciente a ser comparado.
     * @return Um valor inteiro que indica a ordem dos pacientes após a
     * comparação. - Se a comparação resultar em valor negativo, o primeiro
     * paciente é "menor" que o segundo. - Se a comparação resultar em valor
     * positivo, o primeiro paciente é "maior" que o segundo. - Se a comparação
     * resultar em zero, os pacientes são considerados iguais.
     * @throws IllegalArgumentException Se o atributo de comparação não for
     * válido.
     */
    @Override
    public int compare(Paciente p1, Paciente p2) {
        switch (atributoComparacao) {
            case "idade":
                return Integer.compare(p1.getIdade(), p2.getIdade());
            case "comorbidade":
                return p1.getComorbidade().compareTo(p2.getComorbidade());
            case "nomeSobrenome":
                int resultadoNome = p1.getNome().compareTo(p2.getNome());
                if (resultadoNome != 0) {
                    return resultadoNome;
                } else {
                    return p1.getSobrenome().compareTo(p2.getSobrenome());
                }
            default:
                throw new IllegalArgumentException("Atributo de comparação inválido.");
        }
    }
}
