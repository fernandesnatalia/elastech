package br.com.elastech.aula7;

import java.util.Scanner;

public class StringsExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String divisor = "-----------------------\n";
        String getNome = "Digite seu nome completo: ";

        // 1

        System.out.println(divisor + getNome);
        String nome = scanner.nextLine();
        System.out.println("Quantidade de caracteres: " + nome.length());

        // 2

        System.out.println(divisor + getNome);
        String nome2 = scanner.nextLine();

        System.out.println("Maiúsculo: " + nome2.toUpperCase());
        System.out.println("Minúsculo: " + nome2.toLowerCase());

        // 3

        System.out.println(divisor + getNome);
        String nome3 = scanner.nextLine();

        System.out.println("A primeira letra do seu nome é " + nome3.charAt(0));

        // 4

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Digite a palavra para localizar na frase: ");
        String palavra = scanner.nextLine();

        if(frase.contains(palavra)) {
            System.out.println("Sim, " + palavra + " aparece na frase.");
        } else {
            System.out.println("Não, " + palavra + " não aparece na frase.");
        }

        // 5

        System.out.println("Digite seu nome: ");
        String nome4 = scanner.nextLine();

        System.out.println("Digite de novo: ");
        String nome5 = scanner.nextLine();

        System.out.println("Os nomes são iguais? " + nome4.equalsIgnoreCase(nome5));

    }
}
