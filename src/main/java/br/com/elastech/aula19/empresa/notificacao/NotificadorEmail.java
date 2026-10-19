package br.com.elastech.aula19.empresa.notificacao;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }
}