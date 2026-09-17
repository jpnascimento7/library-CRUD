package service;

import model.Livro;
import java.util.ArrayList;

public class Biblioteca {
    final private ArrayList<Livro> livros = new ArrayList<Livro>();

    public void adicionarLivro(String titulo, String autor){
        int novoId;
        if (livros.isEmpty()){
            novoId = 1;
        }
        else {
            int posicao = livros.size() - 1;
            Livro ultimoLivro = livros.get(posicao);
            novoId = ultimoLivro.getId() + 1;
        }
        Livro novoLivro = new Livro(titulo, autor,Livro.StatusLivro.DISPONIVEL, novoId);
        livros.add(novoLivro);
    }
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("ID: " + livro.getId()
                    + " | Título: " + livro.getTitulo()
                    + " | Autor: " + livro.getAutor()
                    + " | Status: " + livro.getStatusLivro());
        }
    }
    public Livro buscarPorId(int id) {
        Livro livroEncontrado = null;
        for (Livro livro : livros){
            if (livro.getId() == id){
                livroEncontrado = livro;
            }
        }
        return livroEncontrado;
    }

}

