package br.com.elastech.aula22;

public class Main {

    public static void main(String[] args) {

        Agendamento pet1 = new Agendamento(
                "Thor", "banho", "14h", "alérgico a shampoo",
                true, true,false, 10.0
        );

        Agendamento pet2 = new Agendamento("Luna", "tosa", "10h", "",
                false, false, false, 0
        );

        Agendamento pet3 = new Agendamento("Mel", "banho", "16h", "",
                false, false, true, 0
        );

        pet1.mostrar();
        pet2.mostrar();
        pet3.mostrar();
    }
}