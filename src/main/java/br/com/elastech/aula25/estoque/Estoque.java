package br.com.elastech.aula25.estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<ObservadorEstoque> observadores = new ArrayList<>();
    private int quantidade;

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

        for (ObservadorEstoque observador : observadores) {
            observador.atualizar(this.quantidade);
        }
    }
}
