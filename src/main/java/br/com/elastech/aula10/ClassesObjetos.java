package br.com.elastech.aula10;

import br.com.elastech.aula5.Pet;
import br.com.elastech.aula5.Produto;
import br.com.elastech.aula6.Aluna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassesObjetos {

    public static void main(String[] args) {

        // 1 e 2

        Pet gato = new Pet();
        gato.nome = "Catdog";
        gato.peso = 5;
        gato.raca = "gatocão";

        Pet pinguim = new Pet();
        pinguim.nome = "Pingu";
        pinguim.peso = 2;
        pinguim.raca = "pinguim";

        System.out.println("------- FICHA -------");

        System.out.println("Nome: " + gato.nome +
                "\nRaça: " + gato.raca + "\nPeso: " + gato.peso
        );

        System.out.println("----------------------");

        System.out.println("Nome: " + pinguim.nome +
                "\nRaça: " + pinguim.raca + "\nPeso: " + pinguim.peso
        );

        // 3

        Produto produto = new Produto();
        produto.nome = "O guia definitivo do mochileiro das galáxias";
        produto.preco = 78.99;
        produto.quantidade = 42;

        System.out.println("------- ESTOQUE -------");

        System.out.println("Nome: " + produto.nome + "\nValor: R$ " +
                produto.preco + "\nQuantidade: " + produto.quantidade
        );

        // 4

        Aluna aluna = new Aluna();
        aluna.nome = "Ada Lovelace";
        aluna.nota1 = 9.8;
        aluna.nota2 = 10;

        System.out.println("------- BOLETIM -------");
        System.out.println("Nome: " + aluna.nome + "\nNotas: " + aluna.nota1 +
                " - " + aluna.nota2 + "\nMédia final: " + (aluna.nota1* aluna.nota2)/2
        );

        // Mini-desafio

        System.out.println("------- PONTUAÇÃO -------");

        Jogadora primeira = new Jogadora();
        primeira.nome = "Serena Williams";
        primeira.pontos = 23;

        Jogadora segunda = new Jogadora();
        segunda.nome = "Billie Jean King";
        segunda.pontos = 39;

        Jogadora terceira = new Jogadora();
        terceira.nome = "Sissi Imperatriz";
        terceira.pontos = 10;

        System.out.println(
                "Nome: " + primeira.nome + " - Pontos: " + primeira.pontos +
                "\nNome: " + segunda.nome + " - Pontos: " + segunda.pontos +
                "\nNome: " + terceira.nome + " - Pontos: " + terceira.pontos
        );

        ArrayList<Jogadora> jogadoras = new ArrayList<>(List.of(primeira, segunda, terceira));

        jogadoras.sort(Comparator.comparingInt(j -> j.pontos));

        Jogadora vencedora = jogadoras.get(jogadoras.size() - 1);

        System.out.println(
                "A jogadora com mais pontos é " + vencedora.nome +
                        " com " + vencedora.pontos + " pontos."
        );
    }
}
