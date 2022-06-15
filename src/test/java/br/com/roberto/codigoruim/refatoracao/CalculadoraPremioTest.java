package br.com.roberto.codigoruim.refatoracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraPremioTest {

    private CalculadoraPremio calculadoraPremio;
    private final List<Integer> SORTEADOS = Arrays.asList(3, 14, 21, 55, 6, 8);
    private Aposta aposta;

    @BeforeEach
    public void setup() {
        calculadoraPremio = new CalculadoraPremio();
    }

    @Test
    public void devePagarSenaOuCemPorCento() {
        aposta = Aposta.of(3, 14, 21, 55, 6, 8);
        double premio = calculadoraPremio.calcula(aposta, SORTEADOS, 1000.00);
        assertEquals(1000.00, premio);
    }

    @Test
    public void devePagarQuinaOuVintePorCento() {
        aposta = Aposta.of(3, 14, 21, 55, 6, 16);
        double premio = calculadoraPremio.calcula(aposta, SORTEADOS, 1000.00);
        assertEquals(200.00, premio);
    }

    @Test
    public void devePagarQuadraOuCincoPorCento() {
        aposta = Aposta.of(4, 7, 21, 55, 6, 8);
        double premio = calculadoraPremio.calcula(aposta, SORTEADOS, 1000.00);
        assertEquals(50.00, premio);
    }

    @Test
    public void devePagarNenhumValor() {
        aposta = Aposta.of(4, 7, 22, 55, 6, 8);
        double premio = calculadoraPremio.calcula(aposta, SORTEADOS, 1000.00);
        assertEquals(0.00, premio);
    }

}