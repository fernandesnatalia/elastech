package br.com.elastech.aula21;

public class Oracle implements BancoDeDados {

    int numero;

    @Override
    public void chamarBanco(String mensagem) {
        System.out.println(mensagem + "Oracle");
    }

    @Override
    public void getNumero(int numero) {
        this.numero = numero;
        System.out.println("O número recebido é " + this.numero);
    }
}
