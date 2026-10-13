package br.com.elastech.aula13;

import br.com.elastech.aula13.animais.Animal;
import br.com.elastech.aula13.animais.Cachorro;
import br.com.elastech.aula13.animais.Gato;
import br.com.elastech.aula13.notificacoes.Email;
import br.com.elastech.aula13.notificacoes.Notificacao;
import br.com.elastech.aula13.notificacoes.Sms;
import br.com.elastech.aula13.veiculos.Carro;
import br.com.elastech.aula13.veiculos.Moto;
import br.com.elastech.aula13.veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class InterfaceExercicio {

    public static void main(String[] args) {

        String divisor = "--------------------------";

        // 2
        Cachorro coragem = new Cachorro();
        Gato garfield = new Gato();

        System.out.println("Som de animais fora do for: ");

        coragem.emitirSom();
        garfield.emitirSom();

        System.out.println(divisor);

        // 3
        ArrayList<Animal> animais = new ArrayList<>(List.of(coragem, garfield));

        System.out.println("Som de animais dentro do for: ");

        for(Animal animal : animais) {
            animal.emitirSom();
        }

        System.out.println(divisor);

        // 4
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Sms());
        notificacoes.add(new Email());

        System.out.println("Notificações: ");

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar("Sua compra foi aprovada!");
        }

        System.out.println(divisor);

        // 5
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        System.out.println("Veículos: ");

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }

    }
}
