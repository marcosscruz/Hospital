package br.com.hospital.sistema;

import br.com.hospital.colaboradores.*;
import br.com.hospital.pessoas.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static final int MAX_COLABORADORES = 100;
    private static Colaborador[] colaboradores = new Colaborador[MAX_COLABORADORES];
    private static int numColaboradores = 0;

    private static List<Paciente> pacientes = new ArrayList<>();
    private static List<Medico> medicos = new ArrayList<>();
    private static List<Enfermeiro> enfermeiros = new ArrayList<>();

    private static int contPacientePrivado = 0;
    protected static int contPacienteProtegido = 0;

    public static int getContPacientePrivado() {
        return contPacientePrivado;
    }

    //==========================================================================
    /**
     * Adiciona um colaborador a lista de colaboradores do hospital.
     *
     * @param colab O colaborador a ser adicionado.
     */
    public static void adicionarColab(Colaborador colab) {
        if (numColaboradores < colaboradores.length) {
            colaboradores[numColaboradores] = colab;
            numColaboradores++;
        } else {
            System.out.println("Limite de colaboradores atingido.");
        }
    }

    /**
     * Método para cadastrar colaboradores no sistema.
     */
    public static void cadastrarColab() {
        Scanner input = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("=============================================");
            System.out.println("Deseja cadastrar que colaborador? \n\t1. Médico \n\t2. Enfermeiro \n\t3. Voltar");
            int escolha;

            try {
                escolha = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("============================================= \nOpção inválida! Digite um número válido.");
                continue; // Reinicia o loop para solicitar uma nova entrada
            }

            switch (escolha) {
                case 1: {
                    System.out.println("=============================================");
                    System.out.println("Nome: ");
                    String nome = input.nextLine();

                    String cpf;
                    boolean cpfValido = false;
                    do {
                        System.out.println("CPF: ");
                        cpf = input.nextLine();
                        if (validarCpf(cpf) && !compararCPF(cpf, medicos)) {
                            cpfValido = true;
                        } else {
                            System.out.println("CPF Inválido ou já cadastrado! Digite novamente.".toUpperCase());
                        }
                    } while (!cpfValido);

                    String profissao = "Médico";

                    System.out.println("Especialidade: ");
                    String especialidade = input.nextLine();

                    // Criar o objeto Médico e adicioná-lo às listas
                    Colaborador colab = new Colaborador(nome, cpf, profissao);
                    adicionarColab(colab);
                    Medico medico = new Medico(especialidade, nome, cpf, profissao);
                    medicos.add(medico);
                    break;
                }
                case 2: {
                    System.out.println("=============================================");
                    System.out.println("Nome: ");
                    String nome = input.nextLine();

                    String cpf;
                    boolean cpfValido = false;
                    do {
                        System.out.println("CPF: ");
                        cpf = input.nextLine();
                        if (validarCpf(cpf) && !compararCPF(cpf, enfermeiros)) {
                            cpfValido = true;
                        } else {
                            System.out.println("CPF Inválido ou já cadastrado! Digite novamente.");
                        }
                    } while (!cpfValido);

                    System.out.println("Setor: ");
                    String setor = input.nextLine();

                    String profissao = "Enfermeiro";

                    // Criar o objeto Enfermeiro e adicioná-lo às listas
                    Colaborador colab = new Colaborador(nome, cpf, profissao);
                    adicionarColab(colab);
                    Enfermeiro enfermeiro = new Enfermeiro(setor, nome, cpf, profissao);
                    enfermeiros.add(enfermeiro);
                    break;
                }
                case 3: {
                    System.out.println("============================================= \nSalvando...");
                    sair = true;
                    break;
                }
                default:
                    System.out.println("Opção Iválida!");
            }
        }
    }

    /**
     * Método para imprimir a lista de colaboradores.
     */
    public static void imprimirColab() {
        boolean listaVazia = true;

        // Cabeçalho
        System.out.println("=============================================");
        System.out.println("\nNúmero atual de colaboradores cadastrados: ".toUpperCase() + numColaboradores);
        System.out.println("\n\nLista de Colaboradores:".toUpperCase());

        // Itera sobre a lista de colaboradores
        for (Colaborador colab : colaboradores) {
            if (colab != null) {
                System.out.println(colab.toString()); // Imprime as informações do colaborador
                listaVazia = false;
            }
        }

        // Mensagem caso a lista esteja vazia
        if (listaVazia) {
            System.out.println("A lista de colaboradores está vazia.\n".toUpperCase());
        }

        System.out.println("\n");
    }

    /**
     * Remove um colaborador do vetor de colaboradores com base no CPF
     * fornecido.
     *
     * @param cpf O CPF do colaborador a ser removido.
     */
    public static void removerColabPorCPF(String cpf) {
        int indice = -1;

        // Procurar o índice do colaborador com o CPF informado
        for (int i = 0; i < numColaboradores; i++) {
            if (colaboradores[i] != null && colaboradores[i].getCpf().equals(cpf)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            // Remover o colaborador da posição encontrada
            colaboradores[indice] = null;
            System.out.println("Colaborador removido com sucesso!");

            // Reorganizar o vetor de colaboradores
            reorganizarColaboradores();
        } else {
            System.out.println("Colaborador com CPF " + cpf + " não encontrado.");
        }
    }

    /**
     * Reorganiza o vetor de colaboradores após a remoção de um colaborador.
     * Remove eventuais espaços vazios no vetor.
     */
    private static void reorganizarColaboradores() {
        Colaborador[] novoVetor = new Colaborador[colaboradores.length];
        int novoIndice = 0;

        // Copiar os colaboradores válidos para o novo vetor
        for (int i = 0; i < numColaboradores; i++) {
            if (colaboradores[i] != null) {
                novoVetor[novoIndice] = colaboradores[i];
                novoIndice++;
            }
        }

        // Atualizar o vetor de colaboradores com o novo vetor
        colaboradores = novoVetor;
        numColaboradores = novoIndice;
    }

    //==========================================================================
    /**
     * Método para cadastrar pacientes no sistema.
     */
    public static void cadastrarPaciente() {
        Scanner input = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("=============================================");
            System.out.println("Deseja cadastrar um paciente? \n\t1. Sim \n\t2. Não");
            int escolha;

            try {
                escolha = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("============================================= \nOpção inválida! Digite um número válido.");
                continue; // Reinicia o loop para solicitar uma nova entrada
            }

            switch (escolha) {
                case 1: {
                    System.out.println("=============================================");
                    System.out.println("Nome: ");
                    String nome = input.nextLine();

                    System.out.println("Sobrenome: ");
                    String sobrenome = input.nextLine();

                    System.out.println("Idade: ");
                    int idade = input.nextInt();
                    input.nextLine();

                    String cpf;
                    boolean cpfValido = false;
                    do {
                        System.out.println("CPF: ");
                        cpf = input.nextLine();
                        if (validarCpf(cpf)) {
                            cpfValido = true;
                        } else {
                            System.out.println("CPF Inválido! Digite novamente.");
                        }
                    } while (!cpfValido);

                    System.out.println("Comorbidade: ");
                    String comorbidade = input.nextLine();

                    // Verifica se o CPF já foi cadastrado anteriormente
//                    if (compararCPF(new Paciente(comorbidade, nome, sobrenome, idade, cpf), pacientes)) {
//                        System.out.println("ERROR! paciente com esse CPF já cadastrado!".toUpperCase());
//                    } else {
//                        Paciente paciente = new Paciente(comorbidade, nome, sobrenome, idade, cpf);
//                        pacientes.add(paciente);
//
//                        contPacientePrivado++;
//                        contPacienteProtegido++;
//                    }
                    break;
                }
                case 2: {
                    System.out.println("============================================= \nSalvando...");
                    sair = true;
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Digite novamente.");
                }
            }
        }
    }

    /**
     * Método para imprimir a lista de pacientes cadastrados.
     */
    public static void imprimirPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("============================================= \n\n\nSem pacientes cadastrados.\n\n\n".toUpperCase());
        } else {
            System.out.println("============================================= "
                    + "\nNúmero atual de pacientes cadastrados: ".toUpperCase() + getContPacientePrivado()
                    + "\n\n\nPacientes cadastrados:".toUpperCase());
            pacientes.stream().forEach((paciente) -> {
                System.out.println(paciente);
            });
            System.out.println("\n");
        }
    }

    /**
     * Remove um paciente da lista de pacientes pelo seu CPF.
     *
     * @param cpf O CPF do paciente a ser removido.
     * @return true se o paciente foi removido com sucesso, false se o CPF não
     * foi encontrado na lista.
     */
    public static boolean removerPacientePorCPF(String cpf) {
        // Utiliza o método removeIf para remover o paciente cujo CPF é igual ao CPF fornecido.
        // A condição de busca é dada pela expressão lambda (paciente) -> paciente.getCpf().equals(cpf).
        // O método retorna true se algum paciente for removido, e false caso contrário.
        boolean pacienteRemovido = pacientes.removeIf(paciente -> paciente.getCpf().equals(cpf));

        if (pacienteRemovido) {
            System.out.println("Paciente removido com sucesso!");
        } else {
            System.out.println("CPF não encontrado na lista de pacientes.");
        }

        Paciente.quantidadeInstanciasPacientes--;
        return pacienteRemovido;
    }

    /**
     * Método que permite ordenar a lista de pacientes por diferentes critérios
     * (idade, comorbidade, nome e sobrenome) e exibir os pacientes ordenados.
     */
    public static void ordenaPaciente() {

        // Criação dos comparadores para ordenação.
        ComparadorPaciente comparadorIdade = new ComparadorPaciente("idade"); // Ordenar por idade
        ComparadorPaciente comparadorComorbidade = new ComparadorPaciente("comorbidade"); // Ordenar por comorbidade
        ComparadorPaciente comparadorNomeSobrenome = new ComparadorPaciente("nomeSobrenome"); // Ordenar por nome e sobrenome

        boolean sair = false;
        while (!sair) {
            Scanner input = new Scanner(System.in);
            System.out.println("============================================= \nOrdenar Pacientes por: \n\t1. Idade \n\t2. Comorbidade "
                    + "\n\t3. Nome e Sobrenome \n\t4. Voltar");
            int opcao;

            try {
                opcao = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("============================================= \nOpção inválida! Digite um número válido.");
                continue; // Reinicia o loop para solicitar uma nova entrada
            }

            switch (opcao) {
                case 1: {
                    System.out.println("============================================= \nPacientes ordenados por Idade: ");
                    Collections.sort(pacientes, comparadorIdade);
                    imprimirPacientes(); // Chama o método imprimirPacientes() para exibir os pacientes ordenados.
                    break;
                }
                case 2: {
                    System.out.println("============================================= \nPacientes ordenados por Comorbidade: ");
                    Collections.sort(pacientes, comparadorComorbidade);
                    imprimirPacientes(); // Chama o método imprimirPacientes() para exibir os pacientes ordenados.
                    break;
                }
                case 3: {
                    System.out.println("============================================= \nPacientes ordenados por Nome e Sobrenome: ");
                    Collections.sort(pacientes, comparadorNomeSobrenome);
                    imprimirPacientes(); // Chama o método imprimirPacientes() para exibir os pacientes ordenados.
                    break;
                }
                case 4: {
                    System.out.println("============================================= \nSalvando... ");
                    sair = true;
                    break;
                }
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    //==========================================================================
    /**
     * Exibe o menu principal interativo para o usuário realizar ações no
     * sistema do hospital. O menu oferece opções para acessar os submenus de
     * pacientes, colaboradores e uma terceira opção a ser definida. O usuário
     * pode finalizar o sistema escolhendo a opção 4.
     */
    public static void menu() {
        Scanner input = new Scanner(System.in);
        boolean finalizar = false;
        while (!finalizar) {
            System.out.println("============================================= "
                    + "\nO que deseja fazer? \n\t1. Pacientes \n\t2. Colaboradores \n\t3. A definir \n\t4. Finalizar");
            int opcaoS;

            try {
                opcaoS = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("============================================= \nOpção inválida! Digite um número válido.");
                continue; // Reinicia o loop para solicitar uma nova entrada
            }

            switch (opcaoS) {
                case 1: {
                    menuPacientes(); // Chama o método menuPacientes() para exibir o submenu de ações relacionadas aos pacientes.
                    break;
                }
                case 2: {
                    menuColaboradores(); // Chama o método menuColaboradores() para exibir o submenu de ações relacionadas aos colaboradores.
                    break;
                }
                case 3: {
                    // Implementar ações relacionadas à terceira opção (a definir) aqui, se necessário.
                    break;
                }
                case 4: {
                    System.out.println("============================================= \nFinalizando...");
                    finalizar = true; // Sai do loop e finaliza o sistema.
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("============================================= \nOpção inválida!");
            }
        }
    }

    /**
     * Exibe um menu interativo para realizar ações relacionadas aos pacientes.
     * O menu possui opções para cadastrar, imprimir, ordenar e remover
     * pacientes.
     */
    public static void menuPacientes() {
        Scanner input = new Scanner(System.in);
        boolean finalizar = false;
        while (!finalizar) {
            System.out.println("============================================= "
                    + "\nO que deseja fazer? \n\t1. Cadastrar Paciente \n\t2. Imprimir lista de Pacientes \n\t3. Ordenar lista de Pacientes "
                    + "\n\t4. Remover Paciente \n\t5. Voltar");
            int opcaoS;

            try {
                opcaoS = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("============================================= \nOpção inválida! Digite um número válido.");
                continue; // Reinicia o loop para solicitar uma nova entrada
            }

            switch (opcaoS) {
                case 1: {
                    cadastrarPaciente(); // Chama o método cadastrarPaciente() para cadastrar um novo paciente.
                    break;
                }
                case 2: {
                    imprimirPacientes(); // Chama o método imprimirPacientes() para exibir a lista de pacientes cadastrados.
                    break;
                }
                case 3: {
                    ordenaPaciente(); // Chama o método ordenaPaciente() para ordenar a lista de pacientes por diferentes critérios.
                    break;
                }
                case 4: {
                    System.out.println("============================================= \nInsira o CPF do Paciente a ser removido: ");
                    String cpfDel = input.nextLine();
                    removerPacientePorCPF(cpfDel); // Chama o método removerPacientePorCPF() para remover um paciente da lista pelo CPF.
                    break;
                }
                case 5: {
                    System.out.println("============================================= \nFinalizando...");
                    finalizar = true; // Sai do loop e finaliza o menu.
                    break;
                }
                default:
                    System.out.println("============================================= \nOpção inválida!");
            }
        }
    }

    /**
     * Exibe um menu de opções para interação com os colaboradores do hospital.
     * Permite cadastrar novos colaboradores, imprimir a lista de colaboradores
     * e remover colaboradores.
     */
    public static void menuColaboradores() {
        Scanner input = new Scanner(System.in);
        boolean finalizar = false;

        while (!finalizar) {
            System.out.println("============================================= "
                    + "\nO que deseja fazer? \n\t1. Cadastrar Colaborador \n\t2. Imprimir lista de Colaboradores \n\t3. Remover Colaborador "
                    + "\n\t4. Voltar");
            int opcaoS;

            try {
                opcaoS = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("============================================= \nOpção inválida! Digite um número válido.");
                continue; // Reinicia o loop para solicitar uma nova entrada
            }

            switch (opcaoS) {
                case 1: {
                    cadastrarColab();
                    break;
                }
                case 2: {
                    imprimirColab();
                    break;
                }
                case 3: {
                    System.out.println("============================================= \nInsira o CPF do Colaborador a ser removido: ");
                    String cpfDel = input.nextLine();
                    removerColabPorCPF(cpfDel); // Chama o método removerColabPorCPF() para remover um colaborador da lista pelo CPF.
                    break;
                }
                case 4: {
                    System.out.println("============================================= \nSalvando...");
                    finalizar = true; // Sai do loop e finaliza o menu.
                    break;
                }
                default:
                    System.out.println("============================================= \nOpção inválida!");
            }
        }
    }

    //==========================================================================
    /**
     * Valida o CPF informado.
     *
     * @param cpf O CPF a ser validado.
     * @return True se o CPF é válido, False caso contrário.
     */
    public static boolean validarCpf(String cpf) {
        // Remover caracteres não numéricos do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verificar se há 11 dígitos e se todos os dígitos são iguais
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método genérico para comparar o CPF de um objeto com uma lista de
     * objetos.
     *
     * @param objeto O objeto cujo CPF será comparado.
     * @param lista A lista de objetos onde será feita a comparação.
     * @return true se o CPF do objeto estiver presente em algum objeto da
     * lista, false caso contrário.
     */
    public static boolean compararCPF(Object objeto, List<?> lista) {
        for (Object item : lista) {
            // Verifica se o objeto é do tipo Colaborador e o item da lista também é do tipo Colaborador
            if (objeto instanceof Colaborador && item instanceof Colaborador) {
                Colaborador colaboradorObjeto = (Colaborador) objeto; // Faz o cast para Colaborador
                Colaborador colaboradorItem = (Colaborador) item; // Faz o cast para Colaborador
                // Compara os CPFs dos dois colaboradores
                if (colaboradorObjeto.getCpf().equals(colaboradorItem.getCpf())) {
                    return true; // Retorna true se o CPF for igual
                }
            } // Verifica se o objeto é do tipo Paciente e o item da lista também é do tipo Paciente
            else if (objeto instanceof Paciente && item instanceof Paciente) {
                Paciente pacienteObjeto = (Paciente) objeto; // Faz o cast para Paciente
                Paciente pacienteItem = (Paciente) item; // Faz o cast para Paciente
                // Compara os CPFs dos dois pacientes
                if (pacienteObjeto.getCpf().equals(pacienteItem.getCpf())) {
                    return true; // Retorna true se o CPF for igual
                }
            } // Verifica se o objeto é do tipo Pessoa e o item da lista também é do tipo Pessoa
            else if (objeto instanceof Pessoa && item instanceof Pessoa) {
                Pessoa pessoaObjeto = (Pessoa) objeto; // Faz o cast para Pessoa
                Pessoa pessoaItem = (Pessoa) item; // Faz o cast para Pessoa
                // Compara os CPFs das duas pessoas
                if (pessoaObjeto.getCpf().equals(pessoaItem.getCpf())) {
                    return true; // Retorna true se o CPF for igual
                }
            }
        }
        return false; // Retorna false se o CPF não for encontrado na lista
    }
    
}
