package br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaoTest {

    @Test
    void testRegraPrincipalPedraPapelTesoura() {
        assertTrue(Mao.PEDRA.vence(Mao.TESOURA));
        assertTrue(Mao.TESOURA.vence(Mao.PAPEL));
        assertTrue(Mao.PAPEL.vence(Mao.PEDRA));
    }

    @Test
    void testMaoOf(){
        assertEquals(Mao.PEDRA, Mao.of('R'));
        assertEquals(Mao.PAPEL, Mao.of('P'));
        assertEquals(Mao.TESOURA, Mao.of('S'));
        assertThrows(IllegalArgumentException.class, () ->{
            Mao.of('x');
        });
    }

}