package br.com.elastech.aula25.estoque;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(2);
        estoque.setQuantidade(12);
    }
}
