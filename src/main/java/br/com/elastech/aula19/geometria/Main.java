package br.com.elastech.aula19.geometria;

public class Main {

    public static void main(String[] args) {

        Retangulo r = new Retangulo("Retângulo", 5, 3);

        r.exibirNome();

        System.out.println("Área: " + r.calcularArea());

        // Forma f = new Forma("teste");   // Forma is abstract; cannot be instantiated

    }
}
