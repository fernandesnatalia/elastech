package br.com.elastech.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String divisor = "-----------------------";

        // 1
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Hercule Poirot");
        nomes.add("Miss Marple");
        nomes.add("Agatha Christie");

        System.out.println("Lista de nomes: " + nomes + "\n" + divisor);

        // 2
        ArrayList<String> frutas = new ArrayList<>(List.of("Pêra", "Uva", "Maçã", "Salada Mista"));

        System.out.println("Lista de frutas: ");
        System.out.println("Primeira fruta: " + frutas.get(0));
        System.out.println("Última fruta: " + frutas.get(frutas.size() - 1));
        System.out.println("Quantidade de frutas: " + frutas.size());
        System.out.println(divisor);

        // 3
        nomes.add("Mr. Quin");

        System.out.println("Antes de alterar a lista: " + nomes);

        nomes.set(2, "Mary Westmacott");

        System.out.println("Depois de alterar a lista: " + nomes);

        System.out.println(divisor);

        // 4
        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Valfenda");
        cidades.add("Minas Ithil");
        cidades.add("Fangorn");
        cidades.add("Edoras");

        System.out.println("Lista de cidades: " + cidades);

        cidades.remove(1);

        System.out.println("Cidades restantes: " + cidades.size());
        System.out.println(divisor);

        // 5
        ArrayList<String> programadoras = new ArrayList<>();

        programadoras.add("Ada Lovelace");
        programadoras.add("Grace Hopper");
        programadoras.add("Mary Kenneth Keller");
        programadoras.add("Carol Shaw");
        programadoras.add("Jean Sammet");
        programadoras.add("Margaret Hamilton");


        for (int i = 0; i < programadoras.size(); i++) {
            System.out.println(i + ": " + programadoras.get(i));
        }

        System.out.println(divisor);

        // 6
        System.out.print("\nDigite um nome para procurar na lista: ");
        String nomeProcurado = scanner.nextLine();

        if (programadoras.contains(nomeProcurado)) {
            int posicao = programadoras.indexOf(nomeProcurado);

            System.out.println("O nome está no " + posicao + "° lugar da lista.");
        } else {
            System.out.println("O nome não consta na lista.");
        }
    }
}
