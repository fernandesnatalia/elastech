package br.com.elastech.aula24.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTest {

    private CalculadoraDesconto calculadora;

    @BeforeEach
    void criarObjeto() {
        calculadora = new CalculadoraDesconto();
    }

    @Test
    @DisplayName("Teste 1 - Compra de R$50, cliente comum sem desconto")
    void semDescontoQuandoClienteComum() {
        double resultado = calculadora.aplicarDesconto(50.0, false);
        assertEquals(50.0, resultado);
    }

    @Test
    @DisplayName("Teste 2 - Compra de R$200, cliente vip com desconto")
    void descontoAplicadoQuandoClienteVip() {
        double resultado = calculadora.aplicarDesconto(200.0, true);
        assertEquals(180.0, resultado);
    }

    @Test
    @DisplayName("Teste 3 - Exceção quando valor negativo")
    void excecaoQuandoValorNegativo() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.aplicarDesconto(-10.0, false)
        );
    }
}