package br.com.elastech.aula15.petshop.servicos;

public class Tosa implements Servico {

    @Override
    public void executar(String nomePet) {
        System.out.println("Tosando " + nomePet + "...");
    }
}
