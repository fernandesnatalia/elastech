package br.com.elastech.aula19.empresa.notificacao;

public class NotificadorSms implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}