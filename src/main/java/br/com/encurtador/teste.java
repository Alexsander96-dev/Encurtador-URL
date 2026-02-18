package br.com.encurtador;
import br.com.encurtador.config.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class teste {
    public static void main(String[] args){
        try (Connection conn = Conexao.conectar()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM links");

            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("URL: " + rs.getString("url_original"));
                System.out.println("Código: " + rs.getString("codigo_curto"));
                System.out.println("----------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

