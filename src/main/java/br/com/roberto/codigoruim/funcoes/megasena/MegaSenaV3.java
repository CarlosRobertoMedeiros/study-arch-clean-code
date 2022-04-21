package br.com.roberto.codigoruim.funcoes.megasena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MegaSenaV3 {

    /**
     * @param numerosApostados
     * @param premioTotal
     * @return
     * @Autor Carlos Roberto
     * Descrição: Modificando o método isApostaValida utilizando Streams API
     */
    public double calculaPremio(List<Integer> numerosApostados, double premioTotal) {

        if (!isApostaValida(numerosApostados)) return 0.0; //Lançar Exceção
        List<Integer> numerosSorteados = sorteiaSeisNumeros();
        Long qtdeAcertos = calculaAcertos(numerosApostados, numerosSorteados);

        if (qtdeAcertos == 6) { //O seis seria uma Constante
            return premioTotal; // Sena 100%  Enum de Prêmio
        } else if (qtdeAcertos == 5) {
            return premioTotal * 0.2; // Quina 20%
        } else if (qtdeAcertos == 4) {
            return premioTotal * 0.05; // Quadra 5%
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

    //Método Fora do Contexto, deveria estar em outra classe
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
       return numerosApostados.size()>=6 && numerosApostados.size()<=15 &&
               numerosApostados.stream()
                       .distinct()
                       .filter(n -> n >=1 && n <= 60)
                       .count() == numerosApostados.size();
    }
}
