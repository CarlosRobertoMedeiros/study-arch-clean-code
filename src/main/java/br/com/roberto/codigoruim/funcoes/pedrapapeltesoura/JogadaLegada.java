package br.com.roberto.codigoruim.funcoes.pedrapapeltesoura;

import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.Mao;
import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.ResultadoJogada;
import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.model.Jogada;
import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.model.Jogador;

public class JogadaLegada implements Jogada {

    private final Jogador primeiroJogador;
    private final Jogador segundoJogador;

    public JogadaLegada(Jogador primeiroJogador, Jogador segundoJogador) {
        super();
        this.primeiroJogador = primeiroJogador;
        this.segundoJogador = segundoJogador;
    }

    @Override
    public ResultadoJogada jogar() {
        Mao primeira = primeiroJogador.jogar();
        Mao segunda = segundoJogador.jogar();
        int resultInt = PedraPapelTesoura.pedraPapelTesoura(primeira.getId(),segunda.getId());
        Resultado resultadoDaPrimeira = Resultado.of(resultInt);
        return ResultadoJogada.of(resultadoDaPrimeira);
    }

    @Override
    public Jogador getPrimeiroJogador() {
        return this.primeiroJogador;
    }

    @Override
    public Jogador getSegundoJogador() {
        return this.segundoJogador;
    }
}
