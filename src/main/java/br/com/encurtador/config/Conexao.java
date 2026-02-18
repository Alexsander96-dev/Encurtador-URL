package br.com.encurtador.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String URL = "jdbc:postgresql://localhost:5432/encurtador_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";

    public static Connection conectar(){
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e){
            throw new RuntimeException("Erro ao conectar ao banco", e);
        }
    }
}
