package main;
import model.Livro;
import service.Biblioteca;
import util.ArquivoUtil;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaB = new Biblioteca();

        //minhaB.adicionarLivro("Dom Casmurro", "Machado de Assis");
        //minhaB.adicionarLivro("Pequeno Principe", "Antonie de Sant");
        //minhaB.adicionarLivro("Harry Poter","JK Roling");
        //minhaB.adicionarLivro("Mentalista", "Patrick Jane");



        minhaB.listarLivros();




    }

}