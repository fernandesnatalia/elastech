package br.com.elastech.aula19.singleton;

public class ContadorVisitas {

    private int total = 0;
    private static ContadorVisitas instancia;
    private ContadorVisitas() {}

    public void registrarVisita() { this.total++; }

    public int getTotal() { return this.total; }

    public static ContadorVisitas getInstancia() {
        if (instancia == null) {
            instancia = new ContadorVisitas();
        }
        return instancia;
    }
}