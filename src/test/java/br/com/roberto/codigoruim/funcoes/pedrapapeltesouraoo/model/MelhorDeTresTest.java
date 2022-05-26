package br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.model;

import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.Mao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MelhorDeTresTest {

    @Test
    void testJogo(){
        Jogador carlos = new JogadorMock("Carlos", Mao.PAPEL);
        Jogador luciene = new JogadorMock("Luciene", Mao.PEDRA);
        Jogada jogada = new JogadaSimples(carlos,luciene);
        MelhorDeTres melhorDeTres = new MelhorDeTres(jogada, 7);

        melhorDeTres.jogar();

        assertFalse(!melhorDeTres.temVencedor());
        assertEquals(carlos, melhorDeTres.getVencedor());
        assertTrue(carlos==melhorDeTres.getVencedor());
        assertEquals(4, melhorDeTres.getResultados().size());
    }

}

class JogadorMock extends Jogador {
    private final Mao mao;
    public JogadorMock(String nome, Mao mao) {
        super(nome);
        this.mao = mao;
    }

    @Override
    public Mao jogar() {
        return mao;
    }
}