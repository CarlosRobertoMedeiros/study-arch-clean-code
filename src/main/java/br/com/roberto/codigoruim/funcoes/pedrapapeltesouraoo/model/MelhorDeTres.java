package br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.model;

import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.ResultadoJogada;

import java.util.ArrayList;
import java.util.List;

public class MelhorDeTres {

    private final Jogada jogada;
    private final int rodadas;

    private int scoreDoPrimeiroJogador;
    private int scoreDoSegundoJogador;
    private int scoreVencedor;
    private List<ResultadoJogada> resultados = new ArrayList<>();

    public MelhorDeTres(Jogada jogada) {
        this(jogada, 3);
    }

    public MelhorDeTres(Jogada jogada, int rodadas) {
        this.jogada = jogada;
        this.rodadas = rodadas;
        scoreVencedor = rodadas / 2 + 1;

    }

    public void jogar() {
        for (int i = 0; i < rodadas; i++) {
            ResultadoJogada resultadoJogada = jogada.jogar();
            resultados.add(resultadoJogada);
            if (ResultadoJogada.PRIMEIRO_VENCE.equals(resultadoJogada)) {
                scoreDoPrimeiroJogador++;
            } else if (ResultadoJogada.SEGUNDO_VENCE.equals(resultadoJogada)) {
                scoreDoSegundoJogador++;
            }
            if (jaTemVencedor()) {
                break;
            }
        }
    }

    public boolean temVencedor() {
        return scoreDoPrimeiroJogador != scoreDoSegundoJogador;
    }

    public Jogador getVencedor() {
        if (scoreDoPrimeiroJogador > scoreDoSegundoJogador) {
            return jogada.getPrimeiroJogador();
        }
        if (scoreDoSegundoJogador > scoreDoPrimeiroJogador) {
            return jogada.getSegundoJogador();
        }
        throw new IllegalStateException("Não houve vencedor. Foi empate ! ");
    }

    private boolean jaTemVencedor() {
        return scoreDoPrimeiroJogador >= scoreVencedor || scoreDoSegundoJogador >= scoreDoPrimeiroJogador;
    }

    public List<ResultadoJogada> getResultados() {
        return new ArrayList<ResultadoJogada>(resultados);
    }

    public int getScoreDoPrimeiroJogador() {
        return scoreDoPrimeiroJogador;
    }

    public int getScoreDoSegundoJogador() {
        return scoreDoSegundoJogador;
    }
}
