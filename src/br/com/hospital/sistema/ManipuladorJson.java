package br.com.hospital.sistema;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ManipuladorJson {

    private JSONArray usuarios;

    public ManipuladorJson() throws ParseException {
        // carregando o arqivo JSON na inicialização do sistema
        loadUserData();
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
