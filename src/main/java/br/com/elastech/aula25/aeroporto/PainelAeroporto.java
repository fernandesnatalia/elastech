package br.com.elastech.aula25.aeroporto;

public class PainelAeroporto implements ObservadorVoo {

    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " + status);
    }
}
