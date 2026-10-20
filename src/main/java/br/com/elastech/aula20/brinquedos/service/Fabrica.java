package br.com.elastech.aula20.brinquedos.service;

import br.com.elastech.aula20.brinquedos.model.Brinquedo;

public class Fabrica {

    private static Fabrica instancia;

    private Fabrica() {}

    public static Fabrica getInstancia() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }

    public void verBrinquedo(Brinquedo brinquedo) {
        System.out.println("O brinquedo escolhido foi: " + brinquedo.getNome());
    }
}