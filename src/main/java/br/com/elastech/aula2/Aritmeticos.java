package br.com.elastech.aula2;

public class Aritmeticos {

    public static void main(String[] args) {

        // 0
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        // Na primeira linha, a concatenação acontece antes da soma.
        // Na segunda linha, os parênteses fazem a soma acontecer primeiro.

        // 1
        int a = 10;
        int b = 3;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        // 2
        double decimalA = 10;
        double decimalB = 3;

        System.out.println("Soma: " + (decimalA + decimalB));
        System.out.println("Subtração: " + (decimalA - decimalB));
        System.out.println("Multiplicação: " + (decimalA * decimalB));
        System.out.println("Divisão: " + (decimalA / decimalB));
        System.out.println("Resto: " + (decimalA % decimalB));

        // 3
        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);

        // 4
        int valorA = 3;
        int valorB = 4;
        int valorC = 5;

        System.out.println("O resultado de a + b * c é: " + (valorA + valorB * valorC));

        // 5
        System.out.println("O resultado de (a + b) * c é: " + ((valorA + valorB) * valorC));

    }
}
