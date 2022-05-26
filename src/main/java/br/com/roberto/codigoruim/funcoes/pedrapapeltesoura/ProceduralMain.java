package br.com.roberto.codigoruim.funcoes.pedrapapeltesoura;

import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.Mao;
import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.ResultadoJogada;

import java.util.ArrayList;
import java.util.List;

public class ProceduralMain {
    public static void main(String[] args) {

        int rodadas = 5;
        int scoreJogador1 = 0;
        int scoreJogador2 = 0;

        List<ResultadoJogada> resultados = new ArrayList<>();
        Resultado resultadoDoPrimeiro;
        ResultadoJogada resultadoJogada;

        char charJogador1;
        char charJogador2;

        for(int i=0; i<rodadas; i++){
            charJogador1 = Mao.aleatoria().getId();
            charJogador2 = Mao.aleatoria().getId();
            resultadoDoPrimeiro = Resultado.of(PedraPapelTesoura.pedraPapelTesoura(charJogador1,charJogador2));
            resultadoJogada = ResultadoJogada.of(resultadoDoPrimeiro);
            if (ResultadoJogada.PRIMEIRO_VENCE.equals(resultadoJogada)){
                scoreJogador1++;
            }else if(ResultadoJogada.SEGUNDO_VENCE.equals(resultadoJogada)){
                scoreJogador2++;
            }
            resultados.add(resultadoJogada);
        }

        if (scoreJogador1 > scoreJogador2){
            System.out.println("Vencedor Jogador 1");
        }else if( scoreJogador2 >  scoreJogador2){
            System.out.println("Vencedor Jogador 2");
        }else{
            System.out.println("Empate");
        }

        System.out.println("Resultados: "+resultados);
    }
}

//Problemas
//Um método faz tudo
//Vários conceitos juntos("Jogador","Match", "Resultados")
//Rodadas constantes
// Nomes Hard Coded
//Não para em vitórias antecipadas


