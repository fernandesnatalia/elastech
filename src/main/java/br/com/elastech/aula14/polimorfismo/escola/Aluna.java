package br.com.elastech.aula14.polimorfismo.escola;

import br.com.elastech.aula14.polimorfismo.Pessoa;

public class Aluna extends Pessoa {

    public String curso;

    public void estudar() {
        System.out.println(nome + " está estudando " + curso + ".");
    }
}
