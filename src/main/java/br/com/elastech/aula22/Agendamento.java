package br.com.elastech.aula22;

import lombok.Builder;

@Builder
public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    String observacao;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    double desconto;

    public void mostrar() {
        System.out.println(
            "----------------------" +
            "\nNome do pet: " + nomePet +
            "\nServiço: " + servico +
            "\nHorário: " + horario +
            "\nPerfume: " + (perfume ? "Sim" : "Não") +
            "\nLaço: " + (laco ? "Sim" : "Não") +
            "\nHidratação: " + (hidratacao ? "Sim" : "Não") +
            "\nObservação: " + (observacao == null || observacao.isEmpty() ? "Não" : observacao) +
            "\nDesconto: " + desconto + "%"
        );
    }
}