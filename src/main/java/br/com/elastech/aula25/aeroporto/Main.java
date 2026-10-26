package br.com.elastech.aula25.aeroporto;

public class Main {

    public static void main(String[] args) {

        Voo voo = new Voo();
        PainelAeroporto painel = new PainelAeroporto();

        // 4
        Passageiro passageiro1 = new Passageiro();

        voo.adicionarObservador(passageiro1);
        voo.mudarStatus("Embarque iniciado");

        // 5
        Passageiro passageiro2 = new Passageiro();

        voo.adicionarObservador(passageiro2);
        voo.adicionarObservador(painel);
        voo.mudarStatus("Atrasado");
    }
}
