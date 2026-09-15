package model;

public class Livro {
    private String titulo;
    private String autor;
    private int id;
    public enum StatusLivro {
        DISPONIVEL,
        EMPRESTADO,
        FALTANDO
    }
    private StatusLivro statusLivro;
    public Livro (String titulo,String autor, StatusLivro statusLivro, int id ){
        this.titulo = titulo;
        this.autor = autor;
        this.statusLivro = statusLivro;
        this.id = id;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }

    public StatusLivro getStatusLivro() {
        return statusLivro;
    }
}
