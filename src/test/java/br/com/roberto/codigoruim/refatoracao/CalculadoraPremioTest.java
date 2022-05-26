package br.com.roberto.codigoruim.refatoracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraPremioTest {

    private CalculadoraPremio calculadoraPremio;
    private final List<Integer> SORTEADOS = Arrays.asList(3, 14, 21, 55, 6, 8);
    private List<Integer> apostados;

    @BeforeEach
    public void setup() {
        calculadoraPremio = new CalculadoraPremio();
    }

    @Test
    public void devePagarSenaOuCemPorCento() {
        apostados = Arrays.asList(3, 14, 21, 55, 6, 8);
        double premio = calculadoraPremio.calcula(apostados, SORTEADOS, 1000.00);
        assertEquals(1000.00, premio);
    }

    @Test
    public void devePagarQuinaOuVintePorCento() {
        apostados = Arrays.asList(4, 14, 21, 55, 6, 8);
        double premio = calculadoraPremio.calcula(apostados, SORTEADOS, 1000.00);
        assertEquals(200.00, premio);
    }

    @Test
    public void devePagarQuadraOuCincoPorCento() {
        apostados = Arrays.asList(4, 7, 21, 55, 6, 8);
        double premio = calculadoraPremio.calcula(apostados, SORTEADOS, 1000.00);
        assertEquals(50.00, premio);
    }

    @Test
    public void devePagarNenhumValor() {
        List<Integer> apostados = Arrays.asList(4, 7, 22, 55, 6, 8);
        double premio = calculadoraPremio.calcula(apostados, SORTEADOS, 1000.00);
        assertEquals(0.00, premio);
    }

    @Test
    public void deveDarErroPorApostarMenosNumerosQueOMinimo() {
        List<Integer> apostados = Arrays.asList(4, 7, 22, 55, 6); // 5 numeros
        double premio = calculadoraPremio.calcula(apostados, SORTEADOS, 1000.00);
        assertEquals(0.00, premio);
    }


}