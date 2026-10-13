package br.com.elastech.aula14.polimorfismo;

import br.com.elastech.aula14.polimorfismo.escola.Aluna;
import br.com.elastech.aula14.polimorfismo.escola.Estagiaria;
import br.com.elastech.aula14.polimorfismo.escola.Professora;
import br.com.elastech.aula14.polimorfismo.pagamento.Boleto;
import br.com.elastech.aula14.polimorfismo.pagamento.Pix;
import br.com.elastech.aula14.polimorfismo.pagamento.interfaces.MeioDePagamento;

public class PolimorfismoExercicio {

    public static void main(String[] args) {

        String divisor = "--------------------------";

        // 1

        Calculadora calculadora = new Calculadora();

        System.out.printf(
                "Área do quadrado: %.1f%nÁrea do retângulo: %.1f%nÁrea do círculo: %.2f%n",
                calculadora.calcularArea(5.0),
                calculadora.calcularArea(4.0, 6.0),
                calculadora.calcularArea(3)
        );

        System.out.println(divisor);

        // 2

        Painel painel = new Painel();

        painel.exibir("Don't Panic!");
        painel.exibir(42);
        painel.exibir(true);
        painel.exibir(7.5);

        System.out.println(divisor);

        // 3

        Aluna aluna = new Aluna();

        aluna.nome = "Willow Rosenberg";
        aluna.idade = 17;
        aluna.curso = "Bruxaria";

        aluna.apresentar();
        aluna.estudar();

        Professora professora = new Professora();

        professora.nome = "Jenny Calendar";
        professora.idade = 56;
        professora.disciplina = "Computação";

        professora.apresentar();
        professora.lancarNota(aluna.nome, 9.5);

        System.out.println(divisor);

        // 4

        Estagiaria estagiaria = new Estagiaria();

        estagiaria.nome = "Willow Rosenberg";
        estagiaria.idade = 17;

        Pessoa pessoa = estagiaria;
        pessoa.apresentar();

        System.out.println(divisor);

        // 5

        mostrarFicha(aluna);
        mostrarFicha(professora);
        mostrarFicha(estagiaria);

        System.out.println(divisor);

        // 6

        MeioDePagamento forma;

        forma = new Pix();
        forma.pagar(150.00);

        forma = new Boleto();
        forma.pagar(150.00);

    }

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }
}
