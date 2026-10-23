package br.com.elastech.aula22.adapter;

import br.com.elastech.aula22.adapter.controller.PayPalAdapter;
import br.com.elastech.aula22.adapter.model.Pagamento;
import br.com.elastech.aula22.adapter.model.PayPalAPI;

public class Main {

    public static void main(String[] args) {

        // PayPalAPI pagamento = new PayPalAPI();   // Não compila
        Pagamento pagamento = new PayPalAdapter();
        pagamento.pagar();
    }
}
