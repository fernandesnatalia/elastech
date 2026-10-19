package br.com.elastech.aula19.singleton;

public class Carrinho {

    private int quantidadeItens = 0;
    private static Carrinho instancia;
    private Carrinho() {}

    public void adicionarItem() { this.quantidadeItens++; }

    public int getQuantidadeItens() { return this.quantidadeItens; }

    public static Carrinho getInstancia() {
        if (instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }
}