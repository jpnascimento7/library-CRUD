package main;
import model.Livro;
import service.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaB = new Biblioteca();
        minhaB.adicionarLivro("Dom Casmurro", "Machado de Assis");
        minhaB.adicionarLivro("Senhor dos anéis", "J.R.R Tolkien");
        minhaB.adicionarLivro("O pequeno principe", "Antonie de Saint");

        Livro l = minhaB.emprestarLivro(2);
        minhaB.listarLivros();
    }

}