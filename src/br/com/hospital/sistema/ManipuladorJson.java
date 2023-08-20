package br.com.hospital.sistema;

import br.com.hospital.pessoas.Paciente;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipuladorJson {

    private JSONArray usuarios;

    public ManipuladorJson() throws ParseException {
        // carregando o arqivo JSON na inicialização do sistema
        loadUserData();
    }

    public static void writerPacienteToJson(Paciente paciente) throws IOException {
        JSONObject json = new JSONObject();

        json.put("nome", paciente.getNome());
        json.put("sobrenome", paciente.getSobrenome());
        json.put("cpf", paciente.getCpf());
        json.put("dataNascimento", paciente.getDataNascimento());
        json.put("endereco", paciente.getEndereco());
        json.put("telefone", paciente.getTelefone());
        json.put("idade", Paciente.calcularIdade(paciente.getDataNascimento()));
        json.put("historicoMedico", paciente.getHistoricoMedico());

        try (FileWriter file = new FileWriter("src\\br\\com\\hospital\\database\\Pacientes.json")) {
            file.write(json.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Paciente readJsonToPaciente() {
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader("src\\br\\com\\hospital\\database\\Pacientes.json");
            JSONObject json = (JSONObject) parser.parse(reader);

            String nome = (String) json.get("nome");
            String sobrenome = (String) json.get("sobrenome");
            String cpf = (String) json.get("cpf");
            String dataNascimento = (String) json.get("dataNascimento");
            String endereco = (String) json.get("endereco");
            String telefone = (String) json.get("telefone");
            long idadeLong = (Long) json.get("idade"); // Usando Long
            int idade = Math.toIntExact(idadeLong); // Convertendo Long para int de forma segura
            String historicoMedico = (String) json.get("historicoMedico");

            Paciente paciente = new Paciente(idade, historicoMedico, endereco, telefone, nome, sobrenome, dataNascimento, cpf);

            return paciente;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void loadUserData() throws ParseException {
        try {
            JSONParser parser = new JSONParser();
            try (FileReader reader = new FileReader("src\\br\\com\\hospital\\database\\Usuarios.json")) {
                usuarios = (JSONArray) parser.parse(reader);
            }
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
    }

    public boolean verificarCredenciais(String userName, String password) {
        for (Object userObject : usuarios) {
            JSONObject usuario = (JSONObject) userObject;
            if (usuario.get("nomeUsuario").equals(userName) && usuario.get("senhaUsuario").equals(password)) {
                return true;
            }
        }
        return false;
    }
}
