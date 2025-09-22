package teste;

import classe.Fila;
import classe.ListaDuplamenteEncadeada;
import classe.Livro;

public class Main {
    public static void main(String[] args) {

        //Criando livros para a lista
        Livro livro1 = new Livro(1, "Hobbit", "Aventura");
        Livro livro2 = new Livro(2, "Amor e morte", "Romance");
        Livro livro3 = new Livro(3, "Astro", "Drama");

        //Criando a lista
        ListaDuplamenteEncadeada<Livro> listaDeLivros = new ListaDuplamenteEncadeada<>();

        //Adicionando os livros de formas diferentes
        listaDeLivros.inserirInicio(livro1);
        listaDeLivros.inserirFim(livro3);
        listaDeLivros.inserirPosicao(1 ,livro2);

        //Removendo um livro do fim da lista
        listaDeLivros.removerFim();

        //Criando mais 2 livros
        Livro livro4 = new Livro(4, "Alice", "Comédia");
        Livro livro5 = new Livro(5, "Torto arado", "Drama");

        //Criando a fila e enfileirando os livros
        Fila<Livro> aquisicoesFuturas = new Fila();
        aquisicoesFuturas.enfileirar(livro4);
        aquisicoesFuturas.enfileirar(livro5);

        //Tirando o livro 4 e 5 da fila e colocando na lista (O livro foi adquirido pela biblioteca)
        listaDeLivros.inserirFim((Livro) aquisicoesFuturas.desenfileirar());
        listaDeLivros.inserirFim((Livro) aquisicoesFuturas.desenfileirar());


        //Buscando um livro na lista pelo ID e msotrando suas informacoes
        buscarLivro(2, listaDeLivros);
        buscarLivro(4, listaDeLivros);
        buscarLivro(1, listaDeLivros);

        //Removendo um livro do início da lista
        listaDeLivros.removerInicio();


    }

    public static void buscarLivro(int id, ListaDuplamenteEncadeada lista) {

        for (int i = 0; i < lista.tamanho() - 1; i++) {

            Livro livro = (Livro) lista.get(i);

            if (livro.getId() == id) {
                System.out.println("----- Livro -----");
                System.out.println("Id: " + livro.getId());
                System.out.println("Nome: " + livro.getNome());
                System.out.println("Categoria: " + livro.getCategoria());
                System.out.println("Tempo em nano segundos: " + System.nanoTime());
            }
        }
    }
}
