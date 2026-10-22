package br.com.elastech.aula21;

public class MySql implements BancoDeDados {

    int numero;

    @Override
    public void chamarBanco(String mensagem) {
        System.out.println(mensagem + "MySql");
    }

    @Override
    public void getNumero(int numero) {
        this.numero = numero;
        System.out.println("O número recebido é " + this.numero);
    }
}
