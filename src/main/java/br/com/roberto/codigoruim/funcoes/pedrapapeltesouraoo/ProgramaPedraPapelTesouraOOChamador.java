package br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo;

import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.model.*;

public class ProgramaPedraPapelTesouraOOChamador {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Carlos Roberto");
        Jogador jogador2 = new Jogador("Luciene Alves");
        // Jogada jogada = new JogadaLegada(jogador1, jogador2); //Era assim agora vai ser conforme linha abaixo
        Jogada jogada = new JogadaSimples(jogador1, jogador2);
        MelhorDeTres melhorDeTres = new MelhorDeTres(jogada, 5);
        melhorDeTres.jogar();

        if (melhorDeTres.temVencedor()) {
            System.out.println("Vencedor: " + melhorDeTres.getVencedor().getNome());
        } else {
            System.out.println("Empate");
        }
        System.out.println("Resultados: " + melhorDeTres.getResultados());

    }
}
