package br.com.elastech.aula2;

public class Concatenacao {

    public static void main(String[] args) {

        // 1
        String nome = "Maria";
        String cidade = "São Paulo";
        int idade = 28;

        System.out.println("Meu nome é " + nome + ", moro em " +
                cidade + " e tenho " + idade + " anos."
        );

        // 2
        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        System.out.println("Comprei " + quantidade + " unidades de " + produto
                + " por R$ " + preco + " cada. Total: R$ " + (preco * quantidade)
        );

        // 3
        int numero1 = 15;
        int numero2 = 5;

        System.out.println("A soma de " + numero1 + " e "
                + numero2 + " é igual a " + (numero1 + numero2) + "."
        );

    }
}
