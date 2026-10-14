package br.com.elastech.aula15.petshop;

import br.com.elastech.aula15.petshop.pets.Pet;
import br.com.elastech.aula15.petshop.servicos.*;

import java.util.*;

public class Petshop {

    private static final Banho banho = new Banho();
    private static final Vacina vacina = new Vacina();

    private static final List<Servico> servicos = new ArrayList<>(
            List.of(banho, new Tosa(), new Consulta(), vacina)
    );

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            menu();
            System.out.print("Escolha: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        Pet.cadastrarPet(scanner);
                        break;
                    case 2:
                        Pet.listarPets();
                        break;
                    case 3:
                        Pet.buscarPet(scanner);
                        break;
                    case 4:
                        Pet.listarEspecies();
                        break;
                    case 5:
                        banho.adicionarNaFila(scanner);
                        break;
                    case 6:
                        banho.atenderProximo();
                        break;
                    case 7:
                        vacina.adicionarNaFila(scanner);
                        break;
                    case 8:
                        executarServicos(scanner);
                        break;
                    case 0:
                        System.out.println("Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                scanner.nextLine();
            }
        }
    }

    private static void menu() {
        System.out.println(
                "--------------------------" +
                "\n=== PETSHOP ===" +
                "\n1 - Cadastrar pet" +
                "\n2 - Listar pets" +
                "\n3 - Buscar pet pelo nome" +
                "\n4 - Listar espécies" +
                "\n5 - Entrar na fila de banho" +
                "\n6 - Atender próximo da fila de banho" +
                "\n7 - Entrar na fila de vacina" +
                "\n8 - Todos os serviços" +
                "\n0 - Sair" +
                "\n--------------------------"
        );
    }

    private static void executarServicos(Scanner scanner) {
        System.out.print("Nome do pet: ");
        String nomePet = scanner.nextLine();

        for (Servico servico : servicos) {
            servico.executar(nomePet);
        }
    }
}
