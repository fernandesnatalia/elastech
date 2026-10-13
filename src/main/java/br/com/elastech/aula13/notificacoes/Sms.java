package br.com.elastech.aula13.notificacoes;

public class Sms implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Sms enviado: " + mensagem);
    }
}
