package br.com.elastech.aula23;

public class Main {

    public static void main(String[] args) {

        Acai acaiGranola = new ComGranola(new AcaiSimples());
        Acai acaiGranolaMorango = new ComMorango(new ComGranola(new AcaiSimples()));

        System.out.println(acaiGranola.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", acaiGranola.getPreco());

        System.out.println(acaiGranolaMorango.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", acaiGranolaMorango.getPreco());
    }
}
