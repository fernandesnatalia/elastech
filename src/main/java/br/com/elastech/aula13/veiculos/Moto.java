package br.com.elastech.aula13.veiculos;

public class Moto implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Moto ligando ...");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando ...");
    }
}
