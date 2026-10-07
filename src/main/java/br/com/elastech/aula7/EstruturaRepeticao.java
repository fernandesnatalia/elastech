package br.com.elastech.aula7;

public class EstruturaRepeticao {

    public static void main(String[] args) {

        String divisor = "--------------------------\n";

        // 1

        System.out.println(divisor + "Repetição com for: ");

        for(int i = 1; i <= 30; i++) {
            System.out.println(i);
        }


        // 2

        System.out.println(divisor + "Contagem regressiva com for: ");

        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");


        // 3

        System.out.println(divisor + "Repetição com while: ");

        int i = 1;
        while(i <= 30) {
            System.out.println(i);
            i++;
        }


        // 4

        System.out.println(divisor + "Tabuada com for: ");

        int numero = 3;
        i = 0;
        for(i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
