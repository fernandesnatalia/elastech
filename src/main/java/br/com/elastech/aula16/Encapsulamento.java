package br.com.elastech.aula16;

public class Encapsulamento {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();
        Produto produto = new Produto();

        // 1

        // System.out.println(c.titular);    // titular has private access in ContaBancaria
        // c.saldo = -5000;              // saldo has private access in ContaBancaria

        // 2

        System.out.println(
                "Titular: " + c.getTitular() +
                "Saldo: " + c.getSaldo()
        );

        // 3

        c.setTitular("");
        c.setTitular("Ana");
        System.out.println("Titular: " + c.getTitular());

        // 4

        c.depositar(500);
        System.out.println("Saldo: " + c.getSaldo());

        c.depositar(-100);
        c.sacar(2000);
        c.sacar(200);

        System.out.println("Saldo: " + c.getSaldo());

        // c.registrarLog("teste");    // registrarLog has private access in ContaBancaria

        // 5

        System.out.println(produto.nome);
        System.out.println(produto.preco);
        //System.out.println(produto.codigoInterno);   // codigoInterno has private access in Produto

        // 6

        System.out.println("Numero da conta: " + c.getNumeroConta());
        // c.setNumeroConta("999-Z");   // cannot find symbol method setNumeroConta

    }
}
