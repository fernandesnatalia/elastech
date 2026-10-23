package br.com.elastech.aula22.factory.factory;

import br.com.elastech.aula22.factory.model.Animal;
import br.com.elastech.aula22.factory.model.Cachorro;
import br.com.elastech.aula22.factory.model.Gato;

public class AnimalFactory {

    public Animal getAnimal(String tipo) {

        if (tipo.equalsIgnoreCase("cachorro")) { return new Cachorro(); }

        if (tipo.equalsIgnoreCase("gato")) { return new Gato(); }

        throw new IllegalArgumentException("Não detectado.");
    }
}
