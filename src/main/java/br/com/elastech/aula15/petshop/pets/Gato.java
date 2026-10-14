package br.com.elastech.aula15.petshop.pets;

public class Gato extends Pet {

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }
}
