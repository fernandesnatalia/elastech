package br.com.elastech.aula14.polimorfismo.escola;

import br.com.elastech.aula14.polimorfismo.Pessoa;

public class Professora extends Pessoa {

    public String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf(
                "%s lançou nota %.1f para %s%n",
                nome, nota, aluna
        );
    }

    void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }
}
