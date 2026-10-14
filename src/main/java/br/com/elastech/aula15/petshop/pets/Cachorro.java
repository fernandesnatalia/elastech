package br.com.elastech.aula15.petshop.pets;

public class Cachorro extends Pet {

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }
}
