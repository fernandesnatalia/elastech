package br.com.elastech.aula22.adapter.controller;

import br.com.elastech.aula22.adapter.model.Pagamento;
import br.com.elastech.aula22.adapter.model.PayPalAPI;

public class PayPalAdapter implements Pagamento {

    private PayPalAPI payPalAPI;

    public PayPalAdapter() {
        this.payPalAPI = new PayPalAPI();
    }

    @Override
    public void pagar() {
        payPalAPI.sendPayment();
    }
}