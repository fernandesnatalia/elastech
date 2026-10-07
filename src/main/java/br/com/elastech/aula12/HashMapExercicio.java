package br.com.elastech.aula12;

import java.util.HashMap;

public class HashMapExercicio {

    public static void main(String[] args) {

        // 1

        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Gandalf", 2000);
        pessoas.put("Dumbledore", 115);
        pessoas.put("Yoda", 900);

        System.out.println("--- Lista ---");
        System.out.println(pessoas);
        System.out.println("Idade de Yoda: " + pessoas.get("Yoda"));

        // 2

        HashMap<String, Double> produtos = new HashMap<>();

        System.out.println("--- Produtos ---");
        produtos.put("café", 5.00);
        System.out.println(produtos + "\nTamanho: " + produtos.size());

        produtos.put("café", 7.50);
        System.out.println(produtos + "\nTamanho: " + produtos.size());

        // 3

        HashMap<String, String> agenda = new HashMap<>();

        System.out.println("--- Agenda ---");
        agenda.put("Gandalf", "91111-1111");
        agenda.put("Dumbledore", "92222-2222");

        if (agenda.containsKey("Yoda")) {
            System.out.println("Telefone de Yoda: " + agenda.get("Yoda"));
        }  else {
            System.out.println("Yoda não está na agenda.");
        }

        if (agenda.containsKey("Gandalf")) {
            System.out.println("Telefone de Gandalf: " + agenda.get("Gandalf"));
        } else {
            System.out.println("Gandalf não está na agenda.");
        }

        // 4

        HashMap<String, Integer> estoque = new HashMap<>();

        System.out.println("--- Estoque ---");
        estoque.put("Digivice", 249);
        estoque.put("Pokebola", 205);

        System.out.println("Digivice: " + estoque.getOrDefault("Digivice", 0));
        System.out.println("Cards Yu-Gi-Oh!: " + estoque.getOrDefault("Cards Yu-Gi-Oh!", 0));
        System.out.println("Cards Yu-Gi-Oh!: " + estoque.get("Cards Yu-Gi-Oh!"));

        // 5

        HashMap<String, Double> notas = new HashMap<>();

        System.out.println("--- Notas ---");
        notas.put("Ada Lovelace", 9.8);
        notas.put("Grace Hopper", 9.9);
        notas.put("Mary Kenneth Keller", 9.7);

        System.out.println(notas);
        System.out.println("Tamanho da lista: " + notas.size());

        notas.remove("Mary Kenneth Keller");

        System.out.println(notas);
        System.out.println("Tamanho da lista após remoção: " + notas.size());

    }
}
