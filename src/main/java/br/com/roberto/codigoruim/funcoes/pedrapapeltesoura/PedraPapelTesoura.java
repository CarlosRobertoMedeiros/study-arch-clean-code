package br.com.roberto.codigoruim.funcoes.pedrapapeltesoura;

import java.util.Comparator;

public class PedraPapelTesoura {

    private Escolha escolha;
    private SituacaoJogo situacaoJogo;

    public SituacaoJogo jogar(Escolha escolhaJogador1, Escolha escolhaJogador2) {

        if (escolhaJogador1.equals(escolhaJogador2)) {
            return SituacaoJogo.EMPATE;
        }

        /*
        Assertions.assertEquals(SituacaoJogo.JOGADOR_1_VENCEU,pedraPapelTesoura.jogar(Escolha.PEDRA, Escolha.TESOURA));
        Assertions.assertEquals(SituacaoJogo.EMPATE,pedraPapelTesoura.jogar(Escolha.TESOURA, Escolha.PAPEL));
        Assertions.assertEquals(SituacaoJogo.EMPATE,pedraPapelTesoura.jogar(Escolha.PAPEL, Escolha.PEDRA));
        */

        if ((escolhaJogador1.equals(Escolha.PEDRA) && escolhaJogador2.equals(Escolha.TESOURA))
                || (escolhaJogador1.equals(Escolha.TESOURA) && escolhaJogador2.equals(Escolha.PAPEL))
                || (escolhaJogador1.equals(Escolha.PAPEL) && escolhaJogador2.equals(Escolha.PEDRA)))
            return SituacaoJogo.JOGADOR_1_VENCEU;
        else
            return SituacaoJogo.JOGADOR_2_VENCEU;


    }
}
