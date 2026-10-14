package br.com.elastech.aula15.petshop.servicos;

public class Banho implements Servico {

    @Override
    public void executar(String nomePet) {
        System.out.println("Dando banho em " + nomePet + "...");
    }
}
