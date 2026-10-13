package br.com.elastech.aula13.notificacoes;

public class Email implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("E-mail enviado: " + mensagem);
    }

}
