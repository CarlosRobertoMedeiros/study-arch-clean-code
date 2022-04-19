package br.com.roberto.codigoruim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MegaSenaV1 {

    /**
     *
     * @param numerosApostados
     * @param premioTotal
     * @return
     * @Autor Carlos Roberto
     * Descrição: Corrigido Apenas o Problema de Nomes
     */
    public double calculaPremio(List<Integer> numerosApostados, double premioTotal){


        List<Integer> numerosValidos = new ArrayList<>(); // válidos
        for (Integer apostado: numerosApostados){
            if (apostado <6 || apostado > 60){
                return 0.0; // inválido
            }
            if (numerosValidos.contains(apostado)){
                return 0.0; // repetido
            }
            numerosValidos.add(apostado);
        }

        //Testa se a Lista é >=6 e < =15
        if (numerosValidos.size() >= 6 && numerosValidos.size() <= 15) {
            List<Integer> numerosSorteados = new ArrayList<>();
            int numeroSorteado;

            //Preenche com números aleatórios até fechar 60
            while (numerosSorteados.size() < 6) {
                numeroSorteado = new Random().nextInt(59) + 1;
                if (!numerosSorteados.contains(numeroSorteado)) {
                    numerosSorteados.add(numeroSorteado);
                }
            }

            int acertos =0;
            for (Integer apostado: numerosApostados){
                if (numerosSorteados.contains(apostado)){
                    acertos++;
                }
            }
            if (acertos ==6){
                return premioTotal; // 100%
            } else if (acertos == 5){
                return premioTotal * 0.2; // 20%
            } else if (acertos == 4){
                return premioTotal * 0.05; // 5%
            }
        }
        return 0.0;
    }
}
