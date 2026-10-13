package br.com.elastech.aula13;

import java.util.ArrayList;
import java.util.List;

public class ForEachExercicio {

    public static void main(String[] args) {

        String divisor = "--------------------------";

        // 1

        System.out.println("Lista de autores: ");
        String[] nomes = {"Agatha Christie", "George Orwell", "Aldous Huxley", "Edgar Allan Poe"};

        int i = 1;
        for (String nome : nomes) {
            System.out.println(i + " - " + nome);
            i++;
        }

        System.out.println(divisor);

        // 2

        System.out.println("Lista de notas: ");
        ArrayList<Double> notas = new ArrayList<>(List.of(8.0, 6.0, 10.0, 7.0, 9.0));

        i = 1;

        for (Double nota : notas) {
            System.out.println(i + " - " + nota);
            i++;
        }

        System.out.println(divisor);

        // 3

        int[] notasLista = {8, 6, 10, 7};
        int soma = 0;

        for (int nota : notasLista) {
            soma += nota;
        }

        double media = (double) soma / 4;

        System.out.println("Boletim de Elliot Alderson: ");
        System.out.printf("Soma das notas: " + soma + "\nMédia das notas: %.2f%n", media);
        System.out.println(divisor);

        // 4

        i = 0;

        for (String nome : nomes) {
            if (nome.length() > 5) {
                i++;
            }
        }

        System.out.println("Há " + i + " autores com mais de 5 letras no nome.\n" + divisor);

        // 5

        System.out.println("Lista de autores: ");

        for (i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }
    }
}
