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
    public Livro emprestarLivro(int id){
        Livro livro = buscarPorId(id);

        if (livro == null){
            System.out.println("Livro não encontrado");
            return null;
        }
        if (livro.getStatusLivro() != Livro.StatusLivro.DISPONIVEL){
            System.out.println("Livro não está disponível para empréstimo.");
            return null;
        }
        livro.setStatusLivro(Livro.StatusLivro.EMPRESTADO);
        return livro;
    }
    public Livro devolverLivro(int id){
        Livro livro = buscarPorId(id);
        if (livro == null){
            System.out.printf("Livro não encontrado");
            return null;
        }
        if (livro.getStatusLivro() != Livro.StatusLivro.EMPRESTADO){
            System.out.println("Não é possível devolver pois ele não foi emprestado");
            return null;
        }
        else {
            livro.setStatusLivro(Livro.StatusLivro.DISPONIVEL);
        }
        return livro;
    }

}

