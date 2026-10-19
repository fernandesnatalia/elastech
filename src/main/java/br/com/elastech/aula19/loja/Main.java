package br.com.elastech.aula19.loja;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Sabre de luz");
        produto.setPreco(2500.00);
        produto.setQuantidade(5);

        produto.setPreco(-100.00);

        System.out.println(
                "Nome: " + produto.getNome() +
                "\nPreço: R$ " + produto.getPreco() +
                "\nQuantidade: " + produto.getQuantidade()
        );
    }
}
