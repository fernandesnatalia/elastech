package br.com.elastech.aula14.polimorfismo.pagamento;

import br.com.elastech.aula14.polimorfismo.pagamento.interfaces.MeioDePagamento;

public class Pix implements MeioDePagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via Pix.%n", valor);
    }
}
