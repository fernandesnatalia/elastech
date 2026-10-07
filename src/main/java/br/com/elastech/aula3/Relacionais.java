package br.com.elastech.aula3;

public class Relacionais {

    public static void main(String[] args) {

        String divisor = "-----------------------";

        // 1

        int a = 10;
        int b = 3;

        System.out.println("A primeira nota é 10 e a segunda nota é 3");
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

        System.out.println(divisor);

        a = 3;
        b = 10;

        System.out.println("A primeira nota é 3 e a segunda nota é 10");
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

        System.out.println(divisor);

        a = 5;
        b = 5;

        System.out.println("A primeira nota é 5 e a segunda nota é 5");
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

        System.out.println(divisor);

        // 2

        a = 10;
        b = 3;

        System.out.println("a == b: " + (a == b));

        // 3

        System.out.println("a != b: " + (a != b));

        // 4

        boolean chovendo = true;

        System.out.println("Está chovendo? = " + (!chovendo));
    }
}
