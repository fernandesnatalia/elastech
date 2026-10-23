package br.com.elastech.aula22.agendamento;

public class Main {

    public static void main(String[] args) {

        Agendamento pet1 = Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .observacao("alérgico a shampoo")
                .perfume(true)
                .laco(true)
                .hidratacao(false)
                .desconto(10.0)
                .build();

        Agendamento pet2 = Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .perfume(false)
                .laco(false)
                .hidratacao(false)
                .desconto(0)
                .build();

        Agendamento pet3 = Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .perfume(false)
                .laco(false)
                .hidratacao(true)
                .desconto(0)
                .build();

        pet1.mostrar();
        pet2.mostrar();
        pet3.mostrar();
    }
}