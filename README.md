# 📚 Library CRUD - Sistema de Gerenciamento de Biblioteca

Projeto desenvolvido em Java puro como prática dos conceitos estudados no [roadmap.sh/java](https://roadmap.sh/java), sem uso de banco de dados ou API externa. O objetivo foi fixar fundamentos de Programação Orientada a Objetos, manipulação de arquivos e tratamento de exceções, construindo uma aplicação funcional do início ao fim — incluindo o versionamento incremental com Git.

## 🎯 Sobre o projeto

O sistema permite cadastrar, listar, emprestar e devolver livros através de uma interface gráfica simples (Java Swing / JOptionPane), com os dados persistidos localmente em um arquivo CSV.

> ⚠️ **Observação:** o sistema ainda não possui uma funcionalidade de exclusão de livros pela interface. Caso queira remover um livro, é necessário apagar a linha correspondente diretamente no arquivo `livros.csv`.

## ✅ Funcionalidades

- Cadastro de livros (com geração automática de ID)
- Listagem de todos os livros cadastrados
- Empréstimo de livros (com validação de disponibilidade)
- Devolução de livros (com validação de status)
- Persistência automática dos dados em arquivo `.csv`
- Tratamento de erros com exceção customizada (`LivroNaoEncontradoException`)
- Interface gráfica via `JOptionPane`, sem necessidade de terminal

## 🧠 Conceitos de Java praticados

- Classes, objetos, atributos e encapsulamento
- Enums (`StatusLivro`)
- Coleções (`ArrayList`) e iteração (`for-each`)
- Manipulação de arquivos (`FileWriter`, `BufferedReader`)
- Exceções customizadas (`RuntimeException`)
- Estruturas de controle (`while`, `switch`)
- Interface gráfica com Swing (`JOptionPane`)

## 🛠️ Tecnologias

- Java 21
- Maven
- IntelliJ IDEA

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/jpnascimento7/library-CRUD.git
   ```
2. Abra o projeto em uma IDE
3. Execute a classe `Main.java`.
4. Utilize o menu que será exibido em janelas (Swing) para interagir com o sistema.

