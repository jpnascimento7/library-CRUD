package util;

import model.Livro;

import java.io.*;
import java.util.ArrayList;

public class ArquivoUtil {

    private static final String NOME_ARQUIVO = "livros.csv";

        public void salvarLivros(ArrayList<Livro> livros) {
            try (PrintWriter escritor = new PrintWriter(new FileWriter(NOME_ARQUIVO))) {
                for (Livro livro : livros) {
                    escritor.println(livro.getId() + "," + livro.getTitulo() + ","
                            + livro.getAutor() + "," + livro.getStatusLivro());
                }
            } catch (IOException e) {
                System.out.println("Erro ao salvar arquivo: " + e.getMessage());
            }
        }
        public ArrayList<Livro> carregarLivros(){
            ArrayList<Livro> livros = new ArrayList<>();
            File arquivo = new File(NOME_ARQUIVO);

            if (!arquivo.exists()) {
                return livros;
            }

            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = leitor.readLine()) != null) {
                    if (linha.isBlank()) {
                        continue;
                    }

                    String[] partes = linha.split(",");

                    int id = Integer.parseInt(partes[0]);
                    String titulo = partes[1];
                    String autor = partes[2];
                    Livro.StatusLivro status = Livro.StatusLivro.valueOf(partes[3]);

                    Livro livro = new Livro(titulo, autor, status, id);
                    livros.add(livro);
                }
            } catch (IOException e) {
                System.out.println("Erro ao carregar arquivo: " + e.getMessage());
            }

            return livros;
        }
}
