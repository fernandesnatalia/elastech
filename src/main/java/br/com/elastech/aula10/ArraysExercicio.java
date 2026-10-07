package br.com.elastech.aula10;

import java.util.Scanner;

public class ArraysExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String divisor = "-----------------------";
        System.out.println(divisor);

        // 1

        String[] nomes = {"Frodo", "Sam", "Pippin", "Gandalf", "Gollum"};

        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);
        System.out.println(divisor);

        // 2

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println(divisor);

        // 3

        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = (double) soma / notas.length;

        System.out.println("Soma: " + soma + "\nMédia: " + media);
        System.out.println(divisor);

        // 4

        int[] numeros = {42, 1701, 66, 19, 20};

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é " + maior);
        System.out.println(divisor);

        // 5

        int[] notas2 = {8, 5, 10, 4, 7};

        int quantidade = 0;

        for (int i = 0; i < notas2.length; i++) {
            if (notas2[i] >= 7) {
                quantidade++;
            }
        }

        System.out.println("Há " + quantidade + " notas maiores ou iguais a 7");
        System.out.println(divisor);

        // Mini-desafio

        System.out.println("Insira um nome para verificar se está na lista: ");
        String nomeProcurado = scanner.nextLine();

        int posicao = -1;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeProcurado)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println(nomeProcurado + " está na posição " + posicao + ".");
        } else {
            System.out.println(nomeProcurado + " não foi localizado na lista.");
        }

    }
}
