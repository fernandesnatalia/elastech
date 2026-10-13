package br.com.elastech.aula14.heranca.escola;

import br.com.elastech.aula14.heranca.Pessoa;

public class Aluna extends Pessoa {

    public String curso;

    public void estudar() {
        System.out.println(nome + " está estudando " + curso + ".");
    }
}
