package br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.model;

import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.ResultadoJogada;

public interface Jogada {

    ResultadoJogada jogar();

    Jogador getPrimeiroJogador();

    Jogador getSegundoJogador();
}
