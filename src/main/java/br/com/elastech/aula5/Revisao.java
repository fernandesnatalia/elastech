package br.com.elastech.aula5;

import java.util.Scanner;

public class Revisao {

    public static void main(String[] args) {

        lanchonete();
        contador();
        menu();
        petshop();
        mercado();
        cadastro();
    }

    public static void lanchonete() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------ Lanchonete ------");

        System.out.print("Digite o nome do lanche: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do lanche: ");
        double valor = scanner.nextDouble();

        if (valor > 30.00) {
            valor = valor - 5.00;
        }

        System.out.printf("O lanche " + nome + " custa R$ %.2f%n", valor);
    }

    public static void contador() {

        System.out.println("\n------ Contador ------");

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é Par");
            } else {
                System.out.println(i + " é Ímpar");
            }
        }
    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n------ Menu ------");
            System.out.println("1 - Ver camisas \n2 - Ver calças\n3 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu ver camisas.");
                    break;

                case 2:
                    System.out.println("Você escolheu ver calças.");
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 3);
    }

    public static void petshop() {

        Pet ornitorrinco = new Pet();
        ornitorrinco.nome = "Perry, O Ornitorrinco";
        ornitorrinco.raca = "Ornitorrinco";
        ornitorrinco.peso = 1.7;

        Pet cao = new Pet();
        cao.nome = "Covarde, O Cão Covarde";
        cao.raca = "Cão";
        cao.peso = 6;

        System.out.println("\n------ Petshop ------");

        System.out.println("Pets cadastrados: ");

        System.out.println("Nome: " + ornitorrinco.nome +
                "\nRaça: " + ornitorrinco.raca + "\nPeso: " + ornitorrinco.peso
        );

        System.out.println("Nome: " + cao.nome +
                "\nRaça: " + cao.raca + "\nPeso: " + cao.peso
        );
    }

    public static void mercado() {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            Produto produto = new Produto();

            System.out.println("\n------ Mercado ------");

            System.out.print("Digite o nome do produto: ");
            produto.nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            produto.preco = scanner.nextDouble();

            scanner.nextLine();

            if (produto.preco > 100) {
                System.out.printf("Produto caro! - R$ %.2f%n", produto.preco);
            } else {
                System.out.printf("Produto com preço acessível! - R$ %.2f%n", produto.preco);
            }
        }
    }

    public static void cadastro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------ Cadastro ------");

        System.out.println("Insira o seu ano de nascimento: ");
        int ano = scanner.nextInt();

        System.out.println("Insira seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("O usuário " + nome + "nasceu em " + ano);
    }
}