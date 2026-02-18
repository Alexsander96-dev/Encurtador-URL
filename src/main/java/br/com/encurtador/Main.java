package br.com.encurtador;
import br.com.encurtador.config.Conexao;
import br.com.encurtador.dao.LinkDAO;
import br.com.encurtador.model.Link;

import java.sql.Connection;

public class Main {
    public static  void main (String[] args){

        try (Connection conn = Conexao.conectar()) {
            System.out.println("Conectado com sucesso. ");

        }catch (Exception e){
            e.printStackTrace();
        }

        Link link = new Link("https://youtube.com/", "yt123");
        LinkDAO dao = new LinkDAO();
        dao.inserir(link);
    }
}
