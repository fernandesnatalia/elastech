package br.com.elastech.aula22.factory.model;

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}