Sistema de Gestão de Cadastros de Livros
Este projeto é um programa em Java que simula um sistema de gestão de cadastros de livros. Ele utiliza conceitos de Programação Orientada a Objetos (POO) e estruturas de dados como Lista Duplamente Encadeada e Fila para demonstrar a manipulação de dados.

Requisitos Técnicos
O programa usa interfaces e classes de acordo com o modelo de Tipo Abstrato de Dados (TAD).

Ele contém duas implementações de estruturas de dados: ListaDuplamenteEncadeada e Fila.

O programa mede e exibe o tempo de execução das buscas.

Estrutura do Projeto
O código está organizado nos seguintes pacotes:

iClasse: Interfaces do projeto (FilaInterface e ListaInterface).

classe: Classes de implementação (Fila, ListaDuplamenteEncadeada, Livro).

nodes: Classe para os nós da lista (NoDuplo).

teste: Classe principal com a lógica do programa (Main).

Funcionalidades
O sistema de gestão de livros executa as seguintes operações:

Inserir: Adiciona novos elementos nas estruturas de dados.

Remover: Remove elementos usando as regras FIFO (Fila) e LIFO (Pilha), ou as regras da lista.

Buscar: Procura um elemento pelo seu ID ou nome, exibindo o resultado e o tempo de execução.

Como Executar
Pré-requisito: Certifique-se de ter o JDK (Java Development Kit) instalado.

Executar:

Abra o projeto em uma IDE Java (como IntelliJ, Eclipse, ou VS Code).

Vá para a classe Main.java dentro do pacote teste.

Execute a classe Main. A saída com os resultados será exibida no console.

Saída Esperada
A execução do programa irá mostrar no console:

A lista de todos os elementos cadastrados em cada estrutura.

O resultado da busca, junto com o tempo gasto.

O estado da estrutura após a remoção de elementos.
