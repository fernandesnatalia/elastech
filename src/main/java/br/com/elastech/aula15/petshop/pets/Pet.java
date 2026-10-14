package br.com.elastech.aula15.petshop.pets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pet {
    public String nome;
    public String especie;
    public double peso;
    public String porte;

    private static final int CAPACIDADE = 5;
    private static int total = 0;

    private static final Pet[] pets = new Pet[CAPACIDADE];

    public static void cadastrarPet(Scanner scanner) {
        if (total == pets.length) {
            System.out.println("Cadastro cheio!");
            return;
        }

        Pet pet = criarPet(scanner);

        pets[total] = pet;
        total++;

        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
    }

    private static Pet criarPet(Scanner scanner) {
        System.out.print("Nome do pet: ");
        String nome = scanner.nextLine();

        System.out.print("Espécie: ");
        String especie = scanner.nextLine();

        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        Pet pet = definirEspecie(especie);
        pet.nome = nome;
        pet.peso = peso;
        pet.porte = pet.definirPorte();

        return pet;
    }

    public static Pet definirEspecie(String especie) {
        Pet pet;

        if (especie.equalsIgnoreCase("cachorro")) {
            pet = new Cachorro();
            pet.especie = "Cachorro";
        } else if (especie.equalsIgnoreCase("gato")) {
            pet = new Gato();
            pet.especie = "Gato";
        } else {
            pet = new Pet();
            pet.especie = especie;
        }
        return pet;
    }

    public String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som.");
    }

    public static void listarPets() {
        if (total == 0) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }

        System.out.println("--- PETS CADASTRADOS ---");

        for (int i = 0; i < total; i++) {
            Pet pet = pets[i];

            mostrarFicha(pet, "---- fica do pet ----");
            pet.emitirSom();
        }
    }

    public static void buscarPet(Scanner scanner) {
        System.out.print("Qual pet você procura? ");
        String busca = scanner.nextLine();

        for (int i = 0; i < total; i++) {
            Pet pet = pets[i];

            if (pet.nome.equalsIgnoreCase(busca)) {
                mostrarFicha(pet, "Pet encontrado!");
                return;
            }
        }

        System.out.println("Pet não encontrado!");
    }

    public static void listarEspecies() {
        if (total == 0) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }

        Set<String> especies = new HashSet<>();

        for (int i = 0; i < total; i++) {
            especies.add(pets[i].especie);
        }

        System.out.println("--- ESPÉCIES CADASTRADAS ---");

        for (String especie : especies) {
            System.out.println("- " + especie);
        }

        System.out.println("Total de espécies diferentes: " + especies.size());
    }

    public static void mostrarFicha(Pet pet, String titulo) {
        System.out.printf(
                "%s%nNome: %s%nEspécie: %s%nPeso: %.1f kg%nPorte: %s%n",
                titulo,
                pet.nome,
                pet.especie,
                pet.peso,
                pet.porte
        );
    }

    public static void mostrarFicha(Pet pet) {
        mostrarFicha(pet, "Ficha do pet");
    }
}
