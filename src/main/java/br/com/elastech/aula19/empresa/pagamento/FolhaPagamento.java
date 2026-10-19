package br.com.elastech.aula19.empresa.pagamento;

import br.com.elastech.aula19.empresa.funcionario.Funcionario;
import br.com.elastech.aula19.empresa.notificacao.Notificador;

public class FolhaPagamento {

    private Notificador notificador;

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;
    }

    public void pagar(Funcionario f) {
        double salario = f.calcularSalario();

        String mensagem = "Pagamento de " + f.getNome()
                + ": R$ " + String.format("%.2f", salario);

        notificador.notificar(mensagem);
    }
}