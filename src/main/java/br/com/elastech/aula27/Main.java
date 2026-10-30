package br.com.elastech.aula27;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ;
        // Lambdas

        //1
        Runnable tarefa1 = () -> System.out.println("Executando tarefa");
        tarefa1.run();

        Runnable tarefa2 = () -> System.out.println("Segunda tarefa executada");

        tarefa1.run();
        tarefa2.run();

        //2
        Consumer<String> saudacao = nome -> System.out.println("Olá, " + nome);
        saudacao.accept("Fulana");

        Consumer<String> maiusculo = nome -> System.out.println(nome.toUpperCase());
        maiusculo.accept("Fulana");

        //3
        Supplier<String> aviso = () -> "Aviso: O sistema está online!";
        System.out.println(aviso.get());

        Supplier<Integer> numeroAleatorio = () -> new Random().nextInt(100);

        System.out.println("Primeira chamada: " + numeroAleatorio.get());
        System.out.println("Segunda chamada: " + numeroAleatorio.get());

        //4
        Predicate<Integer> maiorQueDez = numero -> numero > 10;
        System.out.println("O número 5 é maior que 10? " + maiorQueDez.test(5));
        System.out.println("O número 15 é maior que 10? " + maiorQueDez.test(15));

        Predicate<String> textoVazio = texto -> texto.isEmpty();
        System.out.println("A string \"\" está vazia? " + textoVazio.test(""));
        System.out.println("A string \"Java\" está vazia? " + textoVazio.test("Java"));

        //5
        Function<Integer, String> notaFiscal = numero -> "Nota fiscal nº: " + numero;
        System.out.println(notaFiscal.apply(1542));

        Function<String, Integer> quantidadeLetras = palavra -> palavra.length();
        System.out.println("A palavra \"Professor\" tem " + quantidadeLetras.apply("Professor") + " letras.");

        // Streams

        //1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares);

        //2
        List<String> frutas = Arrays.asList("pêra", "uva", "maçã", "salada mista");

        frutas.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //3
        List<String> cidades = Arrays.asList(
                "Edoras", "Isengard", "Osgiliath",
                "Hobbiton", "Minas Morgul", "Valfenda"
        );

        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("V"))
                .count();

        System.out.println("Quantidade de cidades que começam com \"V\": " + quantidade);

    }
}
