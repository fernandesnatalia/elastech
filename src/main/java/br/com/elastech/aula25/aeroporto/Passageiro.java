package br.com.elastech.aula25.aeroporto;

public class Passageiro implements ObservadorVoo {

    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro avisado: " + status);
    }
}