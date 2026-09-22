package main;

import model.Livro;
import service.Biblioteca;
import exception.LivroNaoEncontradoException;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaB = new Biblioteca();

        try {
            minhaB.emprestarLivro(99);
            minhaB.listarLivros();
        } catch (LivroNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}