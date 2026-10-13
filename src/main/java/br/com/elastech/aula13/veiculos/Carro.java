package br.com.elastech.aula13.veiculos;

public class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Carro ligando ...");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando ...");
    }
}
