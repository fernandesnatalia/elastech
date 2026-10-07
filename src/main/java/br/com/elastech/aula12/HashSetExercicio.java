package br.com.elastech.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExercicio {

    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();
        String divisor = "-----------------------";

        // 1

        nomes.add("Galadriel");
        nomes.add("Éowyn");
        nomes.add("Arwen Undómiel");
        nomes.add("Galadriel");

        System.out.println("Nomes: " + nomes + "\nTamanho da lista: " + nomes.size());
        System.out.println(divisor);

        // 2

        HashSet<String> cores = new HashSet<>();

        cores.addAll(List.of("vermelho", "vermelhaço", "vermelhusco", "vermelhante", "vermelhão"));

        System.out.println("Lista: " + cores);

        if (cores.contains("verde")) {
            System.out.println("A cor verde já está na lista.");
        } else {
            System.out.println("A cor verde não está na lista.");
        }
        System.out.println(divisor);

        // 3

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Galadriel");
        lista.add("Éowyn");
        lista.add("Arwen Undómiel");
        lista.add("Galadriel");
        lista.add("Éowyn");

        HashSet<String> conjunto = new HashSet<>(lista);

        System.out.println("ArrayList: " + lista);
        System.out.println("HashSet: " + conjunto);
        System.out.println(divisor);

        // 4

        HashSet<String> cpfs = new HashSet<>();

        cpfs.add("003.224.410-00");
        cpfs.add("032.244.100-00");
        cpfs.add("322.441.000-00");

        System.out.println("CPFs: " + cpfs);

        cpfs.remove("322.441.000-00");

        System.out.println("CPFs após remoção: " + cpfs);
        System.out.println(divisor);

        // 5

        HashSet<String> frutas = new HashSet<>();

        frutas.add("Pêra");
        frutas.add("Uva");
        frutas.add("Maçã");

        for (String fruta: frutas) {
            System.out.println(fruta);
        }

        System.out.println(divisor);

        // 6

        HashSet<String> vazio = new HashSet<>();
        System.out.println("A lista está vazia? " + vazio.isEmpty());
        vazio.add("Valor");
        System.out.println("A lista está vazia? " + vazio.isEmpty());

    }
}
