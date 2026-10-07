package br.com.elastech.aula4;

public class EstruturasDecisao {

    public static void main(String[] args) {
        idade();
        saldo();
        cafeteria();
        autorizacao();
        desafio();
    }

    public static void idade() {

        int idade = 25;

        if (idade < 13) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }

    public static void saldo() {

        double saldo = 500.00;
        double valorCompra = 320.00;

        if (saldo >= valorCompra) {
            System.out.println("Compra aprovada! Saldo restante: " + (saldo-valorCompra));
        } else {
            System.out.println("Saldo insuficiente: " + (valorCompra - saldo));
        }
    }

    public static void cafeteria() {

        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Chocolate quente");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static void autorizacao() {

        int idade = 17;
        boolean temAutorizacao = true;

        if (idade < 18 || !temAutorizacao) {
            System.out.println("Proibida a entrada.");
        } else if (idade >= 18 && temAutorizacao) {
            System.out.println("Permitida a entrada.");
        }
    }

    private static void desafio() {

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Aprovada. Média: %.2f\n", media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Recuperação. Média: %.2f\n", media);
        } else {
            System.out.printf("Reprovada. Média: %.2f\n", media);
        }
    }
}
