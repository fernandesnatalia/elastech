package br.com.elastech.aula14.heranca;

public class Professora extends Pessoa {

    public String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf(
                "%s lançou nota %.1f para %s%n",
                nome, nota, aluna
        );
    }

    @Override
    public void apresentar() {
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina);
    }
}
