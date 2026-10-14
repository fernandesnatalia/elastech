package br.com.elastech.aula15.petshop.servicos;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Banho implements Servico {

    private final Queue<String> fila = new ArrayDeque<>();

    @Override
    public void executar(String nomePet) {
        System.out.println("Dando banho em " + nomePet + "...");
    }

    public void adicionarNaFila(Scanner scanner) {
        System.out.print("Nome do pet pra entrar na fila de banho: ");
        String nome = scanner.nextLine();

        fila.add(nome);

        System.out.println(nome + " entrou na fila.");
        System.out.println("Fila de banho agora: " + fila);
    }

    public void atenderProximo() {
        if (fila.isEmpty()) {
            System.out.println("A fila de banho está vazia.");
            return;
        }

        String proximo = fila.poll();

        System.out.println(
                "Próximo da fila: " + proximo +
                "\nAtendendo " + proximo + "..." +
                "\nFila agora: " + fila
        );
    }
}
