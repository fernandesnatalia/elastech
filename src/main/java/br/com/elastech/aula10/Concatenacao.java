package br.com.elastech.aula10;

public class Concatenacao {

    public static void main(String[] args) {

        String divisor = "-----------------------";
        System.out.println(divisor);

        // 1

        String nome = "Ana";
        int idade = 28;

        System.out.printf("%s tem %d anos.%n", nome, idade);
        System.out.println(divisor);

        // 2

        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f%n", media);
        System.out.println(divisor);

        // 3

        double preco = 5.99;

        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println(divisor);

        // 4

        double altura = 1.62;

        System.out.printf("Nome: %s \nIdade: %d \nAltura: %.2f%n", nome, idade, altura);
        System.out.println(divisor);

        // Mini-desafio

        String produto1 = "Pêra";
        double preco1 = 9.90;

        String produto2 = "Uva";
        double preco2 = 7.50;

        String produto3 = "Maçã";
        double preco3 = 12.99;

        double total = 0;

        total += preco1;
        total += preco2;
        total += preco3;

        System.out.printf("%s - R$ %.2f%n", produto1, preco1);
        System.out.printf("%s - R$ %.2f%n", produto2, preco2);
        System.out.printf("%s - R$ %.2f%n", produto3, preco3);
        System.out.printf("Total: R$ %.2f%n", total);

    }
}
