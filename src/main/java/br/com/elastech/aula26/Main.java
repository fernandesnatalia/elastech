package br.com.elastech.aula26;

import br.com.elastech.aula26.interfaces.*;

public class Main {

    public static void main(String[] args) {

        // testando lambdas

        //1

        Saudacao saudacao = () -> System.out.println("Saudação");
        saudacao.executar();

        //2
        Impressora impressora1 = texto -> System.out.println(texto.toLowerCase());
        Impressora impressora2 = texto -> System.out.println(texto.toUpperCase());
        impressora1.imprimir("Impressora");
        impressora2.imprimir("Impressora");

        //3
        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a,b) -> a * b;
        Calculo maior = (a, b) -> Math.max(a,b);

        System.out.println(soma.calcular(19,67));
        System.out.println(multiplicacao.calcular(19,67));
        System.out.println(maior.calcular(19,67));

        //4
        repetir(() -> System.out.println("Ação."));

        //5
        mostrarResultado(n -> n * 152, 8);
        mostrarResultado(n -> n * n, 7);
        mostrarResultado(n -> -n, 58);

        //6
        executarSe(n -> n % 2 == 0, 4, () -> System.out.println("é par!"));
        executarSe(n -> n % 2 == 0, 7, () -> System.out.println("é par!"));
    }

    static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    static void mostrarResultado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

    static void executarSe(Condicao cond, int valor, Acao acao) {
        if (cond.testar(valor)) { acao.executar(); }
    }
}
