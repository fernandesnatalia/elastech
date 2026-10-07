package br.com.elastech.aula7;

import java.util.Scanner;

public class ScannerExercicio {

    public static void main(String[] args) {

        String escape = "\n-----------------------\n";

        Scanner scanner = new Scanner(System.in);

        // 1

        System.out.print(escape + "Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println(
                "Oi " + nome + ", você tem " + idade + " anos e vai fazer "
                + (idade + 1) + " no proximo aniversário."
        );


        // 2

        System.out.println(escape + "Calculando ...");

        System.out.print("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite mais um número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        System.out.println("Divisão: " + (numero1 / numero2));
        System.out.println("Resto: " + (numero1 % numero2));


        // 3

        System.out.print(escape + "Insira a nota da aluna: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovada.");
        } else if (nota >= 5 && nota >= 5.9) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovada.");
        }


        // 4

        System.out.println(escape + "Tabuada");

        System.out.print("Insira um número para descobrir a tabuada: ");
        int numero = scanner.nextInt();

        for(int i = 1; i<= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
