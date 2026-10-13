package br.com.elastech.aula14.polimorfismo;

public class Painel {

    public void exibir(String texto) {
        System.out.println("String: " + texto);
    }

    public void exibir(int numero) {
        System.out.println("Inteiro: " + numero);
    }

    public void exibir(boolean valor) {
        System.out.println("Boolean: " + valor);
    }

    public void exibir(double valor) {
        System.out.println("Double: " + valor);
    }
}
