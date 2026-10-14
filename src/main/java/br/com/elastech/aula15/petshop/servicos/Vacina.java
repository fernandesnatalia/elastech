package br.com.elastech.aula15.petshop.servicos;

public class Vacina implements Servico {

    @Override
    public void executar(String nomePet) {
        System.out.println("Vacinando " + nomePet + "...");
    }
}
