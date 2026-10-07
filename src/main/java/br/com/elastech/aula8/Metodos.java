package br.com.elastech.aula8;

import java.util.Scanner;

import static br.com.elastech.aula8.Utilidades.somar;

public class Metodos {

    public static void main(String[] args) {

        String divisor = "----------------------";

        System.out.println(divisor);

        // 1

        mostrarBoasVindas();

        // 2

        Utilidades.saudar("Spock");
        Utilidades.saudar("Kirk");
        Utilidades.saudar("Worf");

        // 3

        System.out.println(divisor + "\nDobro de 5: ");
        int resultado = Utilidades.dobro(5);
        System.out.println(resultado);

        // 4

        Scanner scanner = new Scanner(System.in);

        System.out.println(divisor + "\nCalcular nota.");

        System.out.print("Insira a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Insira a segunda nota: ");
        double n2 = scanner.nextDouble();

        double media = Utilidades.calcularMedia(n1, n2);
        System.out.printf("Média: %.2f%n", media);
        System.out.println(divisor);

        // 5

        System.out.println("Validar idade.");

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        System.out.println(divisor);

        // 6

        System.out.println("Demonstração de método com mesmo título e parâmetros diferentes.");

        System.out.println(somar(10, 5));
        System.out.println(somar(10, 5, 3));
        System.out.println(somar(10.5, 5.5));

        System.out.println(divisor);

        // 7

        System.out.println("Demonstração de método com mesmo título, com e sem parâmetros.");

        System.out.println(Utilidades.saudacao());
        System.out.println(Utilidades.saudacao("Maria"));
    }

    public static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    }

}
