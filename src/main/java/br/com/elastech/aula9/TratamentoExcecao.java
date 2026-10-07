package br.com.elastech.aula9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        arithmeticDivisao(scanner);
        indexOutOfBounds(scanner);
        inputMismatch(scanner);
        nullPointer();
        arithmeticResto(scanner);
        arrayIndexOutBounds(scanner);

    }

    private static void arithmeticDivisao(Scanner scanner) {

        try {
            System.out.println("------------------------------");
            System.out.println("----------- Divisão ----------");

            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            System.out.println("Resultado: " + (numero1 / numero2));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }
    }

    private static void indexOutOfBounds(Scanner scanner) {

        int[] notas = {2, 3, 4, 5, 6};

        try {
            System.out.println("------------------------------");
            System.out.println("------ Posição no array ------");

            System.out.print("Digite uma posição: ");
            int posicao = scanner.nextInt();

            System.out.println("Nota: " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe. O array só vai de 0 a 4.");
        }
    }

    private static void inputMismatch(Scanner scanner) {

        try {
            System.out.println("------------------------------");
            System.out.println("------- Input de número ------");

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Idade: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Digite uma idade usando números.");
            scanner.nextLine();
        }
    }

    private static void nullPointer() {

        String nome = null;

        try {
            System.out.println("------------------------------");
            System.out.println("--------- Tratar null --------");
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("O nome não foi preenchido.");
        }
    }

    private static void arithmeticResto(Scanner scanner) {

        try {
            System.out.println("------------------------------");
            System.out.println("----------- Resto ------------");

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            System.out.println("Resto: " + (100 % numero));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }
    }

    private static void arrayIndexOutBounds(Scanner scanner) {

        String[] nomes = {"Worf", "Spock", "Kirk"};

        try {
            System.out.println("------------------------------");
            System.out.println("------ Posição no array ------");
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
        }
        System.out.println("O programa continua funcionando.");
    }
}
