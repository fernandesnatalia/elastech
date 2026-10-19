package br.com.elastech.aula19.empresa;

import br.com.elastech.aula19.empresa.funcionario.Desenvolvedor;
import br.com.elastech.aula19.empresa.funcionario.Gerente;
import br.com.elastech.aula19.empresa.notificacao.NotificadorEmail;
import br.com.elastech.aula19.empresa.notificacao.NotificadorSms;
import br.com.elastech.aula19.empresa.pagamento.FolhaPagamento;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor d = new Desenvolvedor("Hercule Poirot", 5000);
        Gerente g = new Gerente("Miss Marple", 8000);

        FolhaPagamento email = new FolhaPagamento(new NotificadorEmail());
        FolhaPagamento sms = new FolhaPagamento(new NotificadorSms());

        email.pagar(d);
        sms.pagar(d);

        email.pagar(g);
        sms.pagar(g);
    }
}