package br.com.elastech.aula10;

public class VariaveisTipos {

    public static void main(String[] args) {

        String divisor = "----------------------";

        // 1

        String nome = "Spock";
        int idade = 55;
        double altura = 1.85;
        boolean jaProgramou = false;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Já programou antes? " + jaProgramou);
        System.out.println(divisor);

        // 2

        String cidade = "Salvador";
        System.out.println("Eu moro em " + cidade + ".");
        System.out.println(divisor);

        // 3

        String primeiroNome = "Worf";
        String sobrenome = "son of Mogh";
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome + ".");
        System.out.println(divisor);

        // 4

        double preco = 29.90;
        System.out.printf("O preço é R$ %.2f%n", preco);
        System.out.println(divisor);

        // 5

        boolean temCarteira = true;
        System.out.println("Tem carteira? " + temCarteira);
        System.out.println(divisor);

        // Mini-desafio

        int a = 10;
        int b = 20;

        System.out.println("a = " + a + " - b = " + b);

        int novoValor = a;
        a = b;
        b = novoValor;

        System.out.println("a = " + a + " - b = " + b);
        System.out.println(divisor);

    }
}
