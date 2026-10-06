package br.com.elastech.aula1;

import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {

        cadastro();
    }

    public static void cadastro() {

        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome: ");
        pessoa.nome = scanner.nextLine();

        System.out.print("Insira o telefone: ");
        pessoa.telefone = scanner.nextLine();

        System.out.print("Insira a cidade: ");
        pessoa.cidade = scanner.nextLine();

        System.out.print("CEP: ");
        pessoa.cep = scanner.nextLine();

        System.out.print("Insira a profissão: ");
        pessoa.profissao = scanner.nextLine();

        System.out.print("Insira o ano de nascimento: ");
        pessoa.anoNascimento = scanner.nextInt();

        System.out.print("Insira a idade: ");
        pessoa.idade = scanner.nextInt();

        System.out.print("Insira a altura: ");
        pessoa.altura = scanner.nextDouble();

        System.out.print("Insira o peso: ");
        pessoa.peso = scanner.nextDouble();

        System.out.print("Insira a temperatura: ");
        pessoa.temperatura = scanner.nextDouble();

        System.out.print("Insira a nota: ");
        pessoa.nota = scanner.nextDouble();

        System.out.print("É fumante? (s/n): ");
        pessoa.fumante = scanner.next().equalsIgnoreCase("s");

        System.out.print("Tem habilitação? (s/n): ");
        pessoa.temHabilitacao = scanner.next().equalsIgnoreCase("s");

        System.out.println("-------------------");
        System.out.println("Informações:");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Telefone: " + pessoa.telefone);
        System.out.println("Cidade: " + pessoa.cidade);
        System.out.println("CEP: " + pessoa.cep);
        System.out.println("Profissão: " + pessoa.profissao);
        System.out.println("Ano de nascimento: " + pessoa.anoNascimento);
        System.out.println("Idade: " + pessoa.idade);
        System.out.printf("Altura: %.2f%n", pessoa.altura);
        System.out.println("Peso: " + pessoa.peso);
        System.out.println("Temperatura: " + pessoa.temperatura);
        System.out.println("Nota: " + pessoa.nota);
        System.out.println("Fumante: " + (pessoa.fumante ? "Sim" : "Não"));
        System.out.println("Tem habilitação: " + (pessoa.temHabilitacao ? "Sim" : "Não"));
    }
}
