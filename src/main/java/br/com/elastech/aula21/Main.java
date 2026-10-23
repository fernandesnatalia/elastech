package br.com.elastech.aula21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String mensagem = "O banco conectado é o ";

        BancoDeDados bancoOracle = new Oracle();
        chamarBanco(bancoOracle, 1, mensagem);

        BancoDeDados bancoMySQL = new MySql();
        chamarBanco(bancoMySQL, 2, mensagem);

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ou 2");
        int opcao = scanner.nextInt();

        BancoDeDados factory = BancoDeDadosFactory.criar(opcao);
        factory.chamarBanco(mensagem);
    }

    public static void chamarBanco(BancoDeDados bancoDeDados, int numero, String mensagem) {
        bancoDeDados.chamarBanco(mensagem);
        bancoDeDados.getNumero(numero);
    }

}