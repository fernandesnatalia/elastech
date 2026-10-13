package br.com.elastech.aula14.empresa;

import br.com.elastech.aula14.empresa.interfaces.Exportavel;
import br.com.elastech.aula14.empresa.interfaces.Notificavel;

public class Gerente extends Funcionario implements Notificavel, Exportavel {

    public void aprovarFerias(String quem) {

        System.out.println(nome + " aprovou as férias de " + quem + ".");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }

    @Override
    public void exportar() {
        System.out.println("Dados exportados.");
    }
}
