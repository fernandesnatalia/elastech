package br.com.elastech.aula10;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String divisor = "-----------------------";

        // 1

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println(divisor);

        // 2

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Fim!\n" + divisor);

        // 3

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println(divisor);

        // 4

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 5

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("Soma de 1 a 100: " + soma);
        System.out.println(divisor);

        // 6

        int i = 1;

        while (i <= 20) {
            System.out.println(i);
            i++;
        }
        System.out.println(divisor);

        // 7

        int energia = 3;

        do {
            System.out.println("Jogando...");
            energia--;
        } while (energia > 0);

        System.out.println(divisor);

        // Mini-desafio

        System.out.println("Digite sua altura: ");
        int altura = scanner.nextInt();

        for (i = 1; i <= altura; i++) {

            for (int asterisco = 1; asterisco <= i; asterisco++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();

    }
}
