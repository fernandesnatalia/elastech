package br.com.elastech.aula22.facade.facade;

import br.com.elastech.aula22.facade.model.Cafeteira;
import br.com.elastech.aula22.facade.model.Chuveiro;
import br.com.elastech.aula22.facade.model.Despertador;

public class ManhaFacade {

    private Despertador despertador;
    private Cafeteira cafeteira;
    private Chuveiro chuveiro;

    public ManhaFacade() {
        this.despertador = new Despertador();
        this.cafeteira = new Cafeteira();
        this.chuveiro = new Chuveiro();
    }

    public void acordar() {
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
