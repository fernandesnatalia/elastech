package br.com.elastech.aula7;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercicio {

    public static void main(String[] args) {

        String divisor = "\n------------------\n";

        // 1

        String[] nomes = {"Capitão Kirk", "Spock", "Picard", "Worf", "Data"};
        System.out.println("Lista de nomes: " + Arrays.toString(nomes));
        System.out.println("Primeiro: " + nomes[0]);
        System.out.println("Terceiro: " + nomes[2]);
        System.out.println("Último: " + nomes[4]);
        System.out.println(divisor);


        // 2

        int[] notas = {8, 6, 10, 7, 9};

        System.out.println("Lista de notas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println(divisor);


        // 3

        System.out.println("Cálculo da soma das notas e a média final.");

        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = (double) soma / notas.length;

        System.out.println("Soma: " + soma + " - Média: " + media);
        System.out.println(divisor);


        // 4

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Insira 5 números.");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Os números em ordem decrescente são: ");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
