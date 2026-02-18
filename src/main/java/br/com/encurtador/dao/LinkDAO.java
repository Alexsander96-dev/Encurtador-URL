package br.com.encurtador.dao;

import br.com.encurtador.config.Conexao;
import br.com.encurtador.model.Link;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LinkDAO {

    public void inserir(Link link){
        String sql = "INSERT INTO links (url_original, codigo_curto) VALUES (?, ?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){

            stmt.setString(1, link.getUrlOriginal());
            stmt.setString(2, link.getCodigoCurto());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                link.setId(rs.getInt(1));
            }
            System.out.println("link inserido com ID: " + link.getId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
