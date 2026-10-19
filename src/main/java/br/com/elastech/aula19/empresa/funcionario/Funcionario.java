package br.com.elastech.aula19.empresa.funcionario;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("O salário base não pode ser negativo.");
        }
    }

    public abstract double calcularSalario();
}