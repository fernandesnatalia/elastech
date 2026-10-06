package br.com.elastech.aula2;

public class Desafio {

    public static void main(String[] args) {

        int segundos = 3785;
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("São " + minutos + " minutos e " + segundosRestantes + " segundos.");

    }
}
