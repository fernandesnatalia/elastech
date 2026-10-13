package br.com.elastech.aula14.aluna;

import br.com.elastech.aula14.pessoa.Pessoa;

public class Aluna extends Pessoa {

    public String curso;

    public void estudar() {
        System.out.println(nome + " está estudando " + curso + ".");
    }
}
