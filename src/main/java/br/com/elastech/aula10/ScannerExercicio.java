package br.com.elastech.aula10;

import java.util.Scanner;

public class ScannerExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String divisor = "-----------------------";

        // 1

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "!");
        System.out.println(divisor);

        // 2

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();


        System.out.println("No próximo aniversário você fará " + (idade + 1) + " anos.");
        System.out.println(divisor);

        // 3

        System.out.print("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println(divisor);

        // 4

        System.out.print("Insira sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Insira seu peso: ");
        double peso = scanner.nextDouble();

        double alturaMetros = altura / 100.0;

        System.out.printf("Sua altura é %.2f cm e seu peso é %.1f kg.\n", alturaMetros, peso);
        System.out.println(divisor);

        // Mini-desafio

        System.out.print("Insira sua idade: ");
        int idadeFicha = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Insira seu nome: ");
        String nomeFicha = scanner.nextLine();

        System.out.print("Insira sua cidade: ");
        String cidadeFicha = scanner.nextLine();

        System.out.println("----------- FICHA -----------");
        System.out.println("Nome: " + nomeFicha);
        System.out.println("Idade: " + idadeFicha);
        System.out.println("Cidade: " + cidadeFicha);
        System.out.println(divisor);

    }
}