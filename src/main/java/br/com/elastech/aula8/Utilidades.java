package br.com.elastech.aula8;

public class Utilidades {

    static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    static int dobro(int numero) {
        return numero * 2;
    }

    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static int somar(int a, int b, int c) {
        return a + b + c;
    }

    static double somar(double a, double b) {
        return a + b;
    }

    static String saudacao() {
        return "Olá";
    }

    static String saudacao(String nome) {
        return "Olá, " + nome;
    }
}
