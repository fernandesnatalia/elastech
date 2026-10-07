package br.com.elastech.aula6;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        cadastro();
    }

    public static void cadastro() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int quantidadeAlunas = 0;
        String divisor = "\n--------------------------\n";

        while(opcao != 2) {

            System.out.println(
                    divisor +
                    "Sistema de cadastro de alunas" +
                    divisor +
                    "\nDeseja iniciar? Pressione: " +
                    "\n1 para cadastrar alunas" +
                    "\n2 para sair " +
                    "\n3 para consultar quantidade de cadastros"
            );

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    Aluna aluna = new Aluna();
                    scanner.nextLine();

                    System.out.println("Insira o nome da aluna: ");
                    aluna.nome = scanner.nextLine();

                    aluna.nota1 = getNota(scanner,"Insira a nota 1: ");

                    aluna.nota2 = getNota(scanner, "Insira a nota 2: ");

                    aluna.media = (aluna.nota1 + aluna.nota2) / 2;

                    String status;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                        status = "Aprovada.";
                    } else {
                        aluna.passou = false;
                        status = "Reprovada.";
                    }

                    quantidadeAlunas++;

                    System.out.printf(
                            divisor +
                            "Aluna cadastrada com sucesso." +
                            "\nNome: %s,\nNotas: %.1f e %.1f, " +
                            "\nMédia final: %.1f.\nStatus: %s%n",
                            aluna.nome, aluna.nota1, aluna.nota2,
                            aluna.media, status
                    );
                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                case 3:
                    System.out.println(divisor + "Quantidade de alunas cadastradas: " + quantidadeAlunas);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;

            }
        }
    }

    public static double getNota(Scanner scanner, String mensagem) {

        double nota;
        do {
            System.out.println(mensagem);
            nota = scanner.nextDouble();

            if(nota < 0 || nota > 10) {
                System.out.println("Nota inválida.");
            }
        } while(nota < 0 || nota > 10);

        return nota;
    }
}
