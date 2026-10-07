package br.com.elastech.aula10.desafioFinal;

import java.util.Scanner;

public class Catalogo {

    public static String classificar(double nota) {
        if (nota >= 8) {
            return "Ótimo";
        } else if (nota >= 5) {
            return "Bom";
        } else {
            return "Ruim";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Filme[] filmes = new Filme[5];

        int total = 0;
        int opcao = 0;

        while (opcao != 5) {
            System.out.print("====================" +
                    "\n=== MEU CATÁLOGO ===" +
                    "\n1 - Cadastrar filme" +
                    "\n2 - Listar filmes" +
                    "\n3 - Buscar por título" +
                    "\n4 - Estatísticas" +
                    "\n5 - Sair" +
                    "\nEscolha: "
            );

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        if (total >= filmes.length) {
                            System.out.println("Catálogo cheio!");
                            break;
                        }

                        Filme filme = new Filme();

                        System.out.print("Título: ");
                        filme.titulo = scanner.nextLine();

                        System.out.print("Gênero: ");
                        filme.genero = scanner.nextLine().toUpperCase();

                        int nota;

                        do {
                            System.out.print("Digite a nota do filme (0 a 10): ");
                            nota = scanner.nextInt();

                            if (nota < 0 || nota > 10) {
                                System.out.println("Nota inválida.");
                            }

                        } while (nota < 0 || nota > 10);

                        scanner.nextLine();
                        filme.classificacao = classificar(filme.nota);

                        filmes[total] = filme;
                        total++;

                        System.out.println("Filme cadastrado!");
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum filme cadastrado ainda.");
                            break;
                        }

                        for (int i = 0; i < total; i++) {

                            System.out.printf(
                                    "%s [%s] - Nota %.1f - %s%n",
                                    filmes[i].titulo,
                                    filmes[i].genero,
                                    filmes[i].nota,
                                    filmes[i].classificacao
                            );
                        }
                        break;

                    case 3:
                        System.out.print("Digite o título: ");
                        String busca = scanner.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < total; i++) {

                            if (filmes[i].titulo.equalsIgnoreCase(busca)) {

                                System.out.printf(
                                        "%s [%s] - Nota %.1f - %s%n",
                                        filmes[i].titulo,
                                        filmes[i].genero,
                                        filmes[i].nota,
                                        filmes[i].classificacao
                                );

                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Filme não encontrado.");
                        }
                        break;

                    case 4:
                        if (total == 0) {
                            System.out.println("Nenhum filme cadastrado ainda.");
                            break;
                        }

                        double soma = 0;
                        int melhorPosicao = 0;
                        int otimos = 0;

                        for (int i = 0; i < total; i++) {

                            soma += filmes[i].nota;

                            if (filmes[i].nota > filmes[melhorPosicao].nota) {
                                melhorPosicao = i;
                            }

                            if (filmes[i].classificacao.equals("Ótimo")) {
                                otimos++;
                            }
                        }

                        double media = soma / total;

                        System.out.println("Total de filmes: " + total);
                        System.out.printf("Média das notas: %.2f%n", media);
                        System.out.println(
                                "Melhor filme: " + filmes[melhorPosicao].titulo
                        );
                        System.out.println(
                                "Filmes ótimos: " + otimos + " de " + total
                        );
                        break;
                    case 5:
                        System.out.println("Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } catch (java.util.InputMismatchException e) {

                System.out.println("Digite apenas números!");
                scanner.nextLine();
            }

        }

    }
}
