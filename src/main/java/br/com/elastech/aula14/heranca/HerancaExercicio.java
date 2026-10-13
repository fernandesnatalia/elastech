package br.com.elastech.aula14.heranca;

import br.com.elastech.aula14.heranca.empresa.Diretora;
import br.com.elastech.aula14.heranca.empresa.Gerente;

public class HerancaExercicio {

    public static void main(String[] args) {

        String divisor = "--------------------------";

        // 1

        Aluna aluna = new Aluna();
        aluna.nome = "Willow Rosenberg";
        aluna.idade = 17;
        aluna.apresentar();

        System.out.println(divisor);

        // 2

        aluna.curso = "Bruxaria";
        aluna.estudar();

        System.out.println(divisor);

        // 3 e 4

        Professora professora = new Professora();
        professora.nome = "Jenny Calendar";
        professora.idade = 56;
        professora.disciplina = "Computação";

        professora.apresentar();
        professora.lancarNota(aluna.nome, 10);

        System.out.println(divisor);

        // 5

        Diretora diretora = new Diretora();

        diretora.nome = "Rupert Giles";
        diretora.baterPonto();
        diretora.aprovarFerias("Willow Rosenberg");
        diretora.definirMeta("BOGO de velas Manari");

        System.out.println(divisor);

        // 6

        Gerente gerente = new Gerente();

        gerente.nome = "Willow Rosenberg";
        gerente.baterPonto();
        gerente.aprovarFerias("Tara Maclay");
        gerente.notificar("Férias aprovadas.");
        gerente.exportar();

    }
}
