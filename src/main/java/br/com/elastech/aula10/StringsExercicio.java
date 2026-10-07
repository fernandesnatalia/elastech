package br.com.elastech.aula10;

import java.util.Scanner;

public class StringsExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String divisor = "-----------------------";

        // 1

        System.out.print("Insira seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println(nome + " tem " + nome.length() + " caracteres.");
        System.out.println(divisor);

        // 2

        System.out.print("Insira seu nome: ");
        String nome2 = scanner.nextLine();

        System.out.println("Maiúsculo: " + nome2.toUpperCase());
        System.out.println("Minúsculo: " + nome2.toLowerCase());
        System.out.println(divisor);

        // 3

        System.out.print("Insira seu nome: ");
        String nome3 = scanner.nextLine();

        System.out.println("A primeira letra é " + nome3.charAt(0));
        System.out.println(divisor);

        // 4

        System.out.print("Insira uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Insira uma palavra: ");
        String palavra = scanner.nextLine();

        if (frase.contains(palavra)) {
            System.out.println(palavra + " aparece na frase.");
        } else {
            System.out.println(palavra + " não aparece na frase.");
        }
        System.out.println(divisor);

        // 5

        System.out.print("Insira um nome: ");
        String nome4 = scanner.nextLine();

        System.out.print("Insira novamente um nome: ");
        String nome5 = scanner.nextLine();

        if (nome4.equalsIgnoreCase(nome5)) {
            System.out.println("Os nomes são iguais.");
        } else {
            System.out.println("Os nomes são diferentes.");
        }
        System.out.println(divisor);

        // 6

        System.out.print("Insira um nome: ");
        String nome6 = scanner.nextLine();

        System.out.println(nome6.trim().toUpperCase());
        System.out.println(divisor);

        // Mini-desafio

        System.out.print("Insira uma palavra: ");
        String palavra2 = scanner.nextLine();

        palavra2 = palavra2.toLowerCase();

        char primeiraLetra = palavra2.charAt(0);
        char ultimaLetra = palavra2.charAt(palavra2.length() - 1);

        if (primeiraLetra == ultimaLetra) {
            System.out.println(palavra2 + " começa e termina com a mesma letra.");
        } else {
            System.out.println(palavra2 + " não começa e termina com a mesma letra.");
        }
    }
}
