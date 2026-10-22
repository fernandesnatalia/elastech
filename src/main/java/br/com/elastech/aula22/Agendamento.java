package br.com.elastech.aula22;

public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    public Agendamento(
            String nomePet, String servico, String horario, String observacao,
            boolean perfume, boolean laco, boolean hidratacao, double desconto
    ) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar() {
        System.out.println(
                "----------------------" +
                "\nNome do pet: " + nomePet +
                "\nServiço: " + servico +
                "\nHorário: " + horario +
                "\nPerfume: " + (perfume ? "Sim" : "Não") +
                "\nLaço: " + (laco ? "Sim" : "Não") +
                "\nHidratação: " + (hidratacao ? "Sim" : "Não") +
                "\nObservação: " + (observacao.isEmpty() ? "Não" : observacao) +
                "\nDesconto: " + desconto + "%"
        );
    }
}