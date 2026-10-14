package br.com.elastech.aula15.petshop.servicos;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Vacina implements Servico {

    private final Queue<String> fila = new ArrayDeque<>();

    @Override
    public void executar(String nomePet) {
        System.out.println("Vacinando " + nomePet + "...");
    }

    public void adicionarNaFila(Scanner scanner) {
        System.out.print("Nome do pet pra entrar na fila de vacina: ");
        String nome = scanner.nextLine();

        fila.add(nome);

        System.out.println(nome + " entrou na fila.");
        System.out.println("Fila de vacina agora: " + fila);
    }
}
