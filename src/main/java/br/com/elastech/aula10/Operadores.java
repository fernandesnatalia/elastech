package br.com.elastech.aula10;

public class Operadores {

    public static void main(String[] args) {

        String divisor = "-----------------------";

        // 1

        int a = 15;
        int b = 4;

        System.out.println("Os valores são: " + a + " e " + b + ".");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        System.out.println(divisor);

        // 2

        int saldo = 1000;

        saldo += 250;
        saldo -= 380;

        System.out.println("Saldo final: " + saldo);
        System.out.println(divisor);

        // 3

        a = 10;
        b = 10;

        System.out.println("Os valores são: " + a + " e " + b + ".");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println(divisor);

        // 4

        int idade = 20;
        boolean temCarteira = true;

        System.out.println(idade >= 18 && temCarteira);
        System.out.println(divisor);

        // 5

        int numero = 7;
        System.out.println("Resto de " + numero + "/2: " + (numero % 2));
        System.out.println(divisor);

        // 6

        int quantidade = 3;
        double preco = 5.50;
        double total = quantidade * preco;

        System.out.println("Total da compra: R$ " + total);
        System.out.println(divisor);

        // Mini-desafio

        System.out.println((numero % 3 == 0) && (numero % 5 == 0));
    }
}
