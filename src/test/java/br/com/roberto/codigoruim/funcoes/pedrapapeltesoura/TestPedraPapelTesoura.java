package br.com.roberto.codigoruim.funcoes.pedrapapeltesoura;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestPedraPapelTesoura {


//    @Mock
//    private PedraPapelTesoura pedraPapelTesoura;
//
//    @Mock
//    private SituacaoJogo situacaoJogo;

//    @BeforeAll
//    public static void setup(){
//
//
//    }

    @Test
    void deveSerEmpate(){
        PedraPapelTesoura pedraPapelTesoura = new PedraPapelTesoura();
        Assertions.assertEquals(SituacaoJogo.EMPATE,pedraPapelTesoura.jogar(Escolha.TESOURA, Escolha.TESOURA));
        Assertions.assertEquals(SituacaoJogo.EMPATE,pedraPapelTesoura.jogar(Escolha.PAPEL, Escolha.PAPEL));
        Assertions.assertEquals(SituacaoJogo.EMPATE,pedraPapelTesoura.jogar(Escolha.PEDRA, Escolha.PEDRA));
    }

    @Test
    void jogador1DeveSerVencedor(){
        PedraPapelTesoura pedraPapelTesoura = new PedraPapelTesoura();
        Assertions.assertEquals(SituacaoJogo.JOGADOR_1_VENCEU,pedraPapelTesoura.jogar(Escolha.PEDRA, Escolha.TESOURA));
        Assertions.assertEquals(SituacaoJogo.JOGADOR_1_VENCEU,pedraPapelTesoura.jogar(Escolha.TESOURA, Escolha.PAPEL));
        Assertions.assertEquals(SituacaoJogo.JOGADOR_1_VENCEU,pedraPapelTesoura.jogar(Escolha.PAPEL, Escolha.PEDRA));
    }

    @Test
    void jogador2DeveSerVencedor(){
        PedraPapelTesoura pedraPapelTesoura = new PedraPapelTesoura();
        Assertions.assertEquals(SituacaoJogo.JOGADOR_2_VENCEU,pedraPapelTesoura.jogar(Escolha.TESOURA, Escolha.PEDRA));
        Assertions.assertEquals(SituacaoJogo.JOGADOR_2_VENCEU,pedraPapelTesoura.jogar(Escolha.PAPEL, Escolha.TESOURA));
        Assertions.assertEquals(SituacaoJogo.JOGADOR_2_VENCEU,pedraPapelTesoura.jogar(Escolha.PEDRA, Escolha.PAPEL));
    }
}
