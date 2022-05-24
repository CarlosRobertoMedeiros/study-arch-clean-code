package br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.model;

import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.Mao;
import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.ResultadoJogada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadaTest {

    @Test
    void test(){
        Jogador roberto = new JogadorMock("Carlos Roberto", Mao.PAPEL);
        Jogador luciene = new JogadorMock("Luciene", Mao.PEDRA);
        Jogada jogada = new JogadaLegada(roberto, luciene);
        assertEquals(ResultadoJogada.PRIMEIRO_VENCE, jogada.jogar());
    }

    private class JogadorMock extends Jogador {
        private final  Mao mao;
        public JogadorMock(String nome, Mao mao) {
            super(nome);
            this.mao = mao;
        }

        @Override
        public Mao jogar() {
            return mao;
        }
    }
}