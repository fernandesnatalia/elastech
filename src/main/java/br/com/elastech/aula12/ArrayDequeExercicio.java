package br.com.elastech.aula12;

import java.util.ArrayDeque;
import java.util.List;

public class ArrayDequeExercicio {

    public static void main(String[] args) {

        String divisor = "--------------------------";
        System.out.println(divisor + "\nSistema de Saúde Sunnydale\n" + divisor);

        // 1

        ArrayDeque<String> fila1 = new ArrayDeque<>();

        fila1.add("Buffy Summers");
        fila1.add("Willow Rosenberg");
        fila1.add("Tara Maclay");

        System.out.println("Psicologia - Fila: " + fila1);
        System.out.println("Quantidade de pessoas: " + fila1.size());
        System.out.println(divisor);

        // 2

        ArrayDeque<String> fila2 = new ArrayDeque<>();

        fila2.addAll(List.of("Anya Jenkins", "Xander Harris", "Rupert Giles"));

        System.out.println("Clínica Geral - Próxima na fila: " + fila2.peek());
        System.out.println(fila2);
        System.out.println(divisor);

        // 3

        String atendida = fila2.poll();

        System.out.println("Clínica Geral - Atendida: " + atendida);
        System.out.println(fila2);
        System.out.println(divisor);

        // 4

        ArrayDeque<String> fila3 = new ArrayDeque<>();

        fila3.add("Spike");
        fila3.add("Drusilla");
        fila3.add("Harmony");

        while (!fila3.isEmpty()) {
            System.out.println("Psiquiatria - Atendendo: " + fila3.poll());
        }

        System.out.println("Psiquiatria - Fila vazia!");
        System.out.println(divisor);

        // 5

        ArrayDeque<String> fila4 = new ArrayDeque<>();

        fila4.add("Joyce Summers");
        fila4.add("Dawn Summers");
        fila4.add("Faith Lehane");

        System.out.println("Bia está na fila? " + (fila4.contains("Bia") ? "Sim" : "Não"));
        System.out.println("Zoe está na fila? " + (fila4.contains("Zoe") ? "Sim" : "Não"));
        System.out.println(divisor);

        // 6

        ArrayDeque<String> fila5 = new ArrayDeque<>();

        if (fila5.isEmpty()) {
            System.out.println("Traumatologia - Não tem ninguém na fila.");
        } else {
            System.out.println("Traumatologia - Próxima: " + fila5.peek());
        }

        fila5.add("Riley Finn");

        if (fila5.isEmpty()) {
            System.out.println("Traumatologia - Não tem ninguém na fila.");
        } else {
            System.out.println("Traumatologia - Próxima: " + fila5.peek());
        }
    }
}
