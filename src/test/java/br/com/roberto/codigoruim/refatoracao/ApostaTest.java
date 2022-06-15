package br.com.roberto.codigoruim.refatoracao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ApostaTest {

    @Test
    public void testAposta() {
        //Aposta aposta = new Aposta(10,5,51,42,25,35);
        Aposta aposta = Aposta.of(10, 5, 51, 42, 25, 35);
        assertEquals(Arrays.asList(10, 5, 51, 42, 25, 35), aposta.getNumeros());
    }

    @Test
    public void deveDarErroPorApostarMenosNumerosQueOMinimo() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Aposta.of(4, 7, 22, 55, 6); //5 números
        });
    }

    @Test
    public void deveDarErroPorApostarMaisNumerosQueOMaximo() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Aposta.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16); // 16 numeros
        });
    }

    @Test
    public void deveDarErroPorApostarNumerosForaDaFaixa() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Aposta.of(4, 7, 22, 61, 6, 56);  // 61 fora da faixa Deixar de usar o IllegalArgumentException e implementar
        });
    }

    @Test
    public void deveDarErroPorApostarNumerosDuplicados() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Aposta.of(4, 6, 22, 27, 6, 56); // 6 número duplicado
        });
    }


}