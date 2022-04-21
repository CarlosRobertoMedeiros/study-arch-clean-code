package br.com.roberto.codigoruim.funcoes.megasena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MegaSenaV2 {

    /**
     * @param numerosApostados
     * @param premioTotal
     * @return
     * @Autor Carlos Roberto
     * Descrição: Corrigido Pois a Função Está Grande e Complexa, reagrupando as funções
     */
    public double calculaPremio(List<Integer> numerosApostados, double premioTotal) {

        if (!isApostaValida(numerosApostados)) return 0.0;
        List<Integer> numerosSorteados = sorteiaSeisNumeros();
        Long qtdeAcertos = calculaAcertos(numerosApostados, numerosSorteados);

        if (qtdeAcertos == 6) {
            return premioTotal; // 100%
        } else if (qtdeAcertos == 5) {
            return premioTotal * 0.2; // 20%
        } else if (qtdeAcertos == 4) {
            return premioTotal * 0.05; // 5%
        }
        return 0.0;
    }

    private Long calculaAcertos(List<Integer> numerosApostados, List<Integer> numerosSorteados) {
        int acertos = 0;
        for (Integer apostado: numerosApostados){
            if(numerosSorteados.contains(apostado)){
                acertos++;
            }
        }
        return Long.valueOf(acertos);
    }

    private List<Integer> sorteiaSeisNumeros() {
        List<Integer> sorteados = new ArrayList<>();
        int numeroSorteado;
        while (sorteados.size() < 6) {
            numeroSorteado = new Random().nextInt(59) + 1;
            if (!sorteados.contains(numeroSorteado)) {
                sorteados.add(numeroSorteado);
            }
        }
        return sorteados;
    }

    private boolean isApostaValida(List<Integer> numerosApostados) {
        if (numerosApostados.size() < 6 || numerosApostados.size() > 15)
            return false;

        List<Integer> numerosValidos = new ArrayList<>();
        for (Integer apostado : numerosApostados) {

            if (apostado < 1 || apostado > 60) {
                return false; //inválido
            }

            if (numerosValidos.contains(apostado)) {
                return false; //repetido
            }
            numerosValidos.add(apostado);
        }
        return true;
    }
}
