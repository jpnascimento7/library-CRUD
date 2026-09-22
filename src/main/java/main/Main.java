package main;

import model.Livro;
import service.Biblioteca;
import exception.LivroNaoEncontradoException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaB = new Biblioteca();
        boolean continuar = true;

        while (continuar) {
            String opcao = JOptionPane.showInputDialog(
                    "Sistema de Biblioteca\n\n" +
                            "1 - Adicionar livro\n" +
                            "2 - Listar livros\n" +
                            "3 - Emprestar livro\n" +
                            "4 - Devolver livro\n" +
                            "5 - Sair"
            );

            if (opcao == null) {
                break; // usuário fechou a janela (clicou no X ou Cancelar)
            }

            try {
                switch (opcao) {
                    case "1":
                        String titulo = JOptionPane.showInputDialog("Título do livro:");
                        String autor = JOptionPane.showInputDialog("Autor do livro:");
                        minhaB.adicionarLivro(titulo, autor);
                        JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
                        break;

                    case "2":
                        String textoLista = "";
                        for (Livro livro : minhaB.getLivros()) {
                            textoLista += "ID: " + livro.getId()
                                    + " | Título: " + livro.getTitulo()
                                    + " | Autor: " + livro.getAutor()
                                    + " | Status: " + livro.getStatusLivro()
                                    + "\n";
                        }
                        JOptionPane.showMessageDialog(null, textoLista);
                        break;

                    case "3":
                        String idEmprestimo = JOptionPane.showInputDialog("ID do livro para emprestar:");
                        minhaB.emprestarLivro(Integer.parseInt(idEmprestimo));
                        JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!");
                        break;

                    case "4":
                        String idDevolucao = JOptionPane.showInputDialog("ID do livro para devolver:");
                        minhaB.devolverLivro(Integer.parseInt(idDevolucao));
                        JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso!");
                        break;

                    case "5":
                        continuar = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            } catch (LivroNaoEncontradoException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número de ID válido.");
            }
        }
    }
}