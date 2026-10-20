package br.com.elastech.aula20.brinquedos;

import br.com.elastech.aula20.brinquedos.model.Brinquedo;
import br.com.elastech.aula20.brinquedos.service.Fabrica;

public class Main {

    public static void main(String[] args) {

        Brinquedo starTrek = new Brinquedo("USS Enterprise");
        Brinquedo starWars = new Brinquedo("Millennium Falcon");

        Fabrica fabrica = Fabrica.getInstancia();

        fabrica.verBrinquedo(starTrek);
        fabrica.verBrinquedo(starWars);
    }
}
