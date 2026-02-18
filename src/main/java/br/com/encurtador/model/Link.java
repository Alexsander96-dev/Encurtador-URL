package br.com.encurtador.model;

public class Link {
    private int id;
    private String urlOriginal;
    private String codigoCurto;


    // Construtor
    public Link( String urlOriginal, String codigoCurto) {
        this.codigoCurto = codigoCurto;
        this.urlOriginal = urlOriginal;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCodigoCurto() {
        return codigoCurto;
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    // setter apenas para o id (gerado pelo banco)
    public void setId(int id) {
        this.id = id;
    }

}
