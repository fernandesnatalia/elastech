package br.com.elastech.aula10;

import java.util.Scanner;

public class TratamentoExcecao {

    public static void main(String[] args) {

        //Mini-desafio

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("---- Tratamento de exceções ----");

            while(true) {
                System.out.println("1 - Divisão por zero" +
                        "\n2 - Posição inválida" +
                        "\n3 - Erro genérico" +
                        "\n Escolha uma opção: "
                );

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println(10/0);
                        break;
                    case 2:
                        int[] numeros = {10, 20, 30};
                        System.out.println(numeros[5]);
                        break;
                    case 3:
                        String nome = null;
                        System.out.println(nome.length());
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        continue;
                }
                break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro por divisão por zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro por posição inválida do array.");

        } catch (Exception e) {
            System.out.println("Erro genérico.");
        }
    }
}
