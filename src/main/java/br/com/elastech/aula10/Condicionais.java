package br.com.elastech.aula10;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String divisor = "-----------------------";

        // 1

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }
        System.out.println(divisor);

        // 2

        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
        System.out.println(divisor);

        // 3

        System.out.print("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
        System.out.println(divisor);

        // 4

        System.out.print("Insira uma nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }
        System.out.println(divisor);

        // 5

        while(true){
            System.out.print("Digite de 1 a 3 para descobrir o sabor do sorvete: ");
            int sabor = scanner.nextInt();

            switch (sabor) {
                case 1:
                    System.out.println("Alho");
                    break;
                case 2:
                    System.out.println("Ervilha");
                    break;
                case 3:
                    System.out.println("Coentro");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Boa sorte!\n" + divisor);
            break;
        }

        // 6

        System.out.print("Insira sua idade: ");
        idade = scanner.nextInt();

        if (idade < 12 || idade >= 60) {
            System.out.println("Valor do ingresso: R$ 10");
        } else {
            System.out.println("Valor do ingresso: R$ 25");
        }
        System.out.println(divisor);

        // Mini-desafio

        System.out.println("Vamos descobrir que tipo de triângulo é!");

        System.out.print("Insira o primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Insira o segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Insira o terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("É equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("É isósceles");
        } else {
            System.out.println("É escaleno");
        }

    }
}
