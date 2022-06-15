package br.com.roberto.codigoruim.refatoracao;

import java.util.List;

//Essa refatoração reflete a maneira de teste da mega sena
public class CalculadoraPremio {

    private static final int ACERTOS_SENA = 6;
    private static final int ACERTOS_QUINA = 5;
    private static final int ACERTOS_QUADRA = 4;
    private static final double FATOR_PREMIO_QUINA = 0.2;
    private static final double FATOR_PREMIO_QUADRA = 0.05;

    public double calcula(Aposta aposta, List<Integer> numerosSorteados, double premioTotal) {

        int acertos = contaAcertos(aposta.getNumeros(), numerosSorteados);

        if (acertos == ACERTOS_SENA) {
            return premioTotal; // Sena = 100%
        } else if (acertos == ACERTOS_QUINA) {
            return premioTotal * FATOR_PREMIO_QUINA; // Quina = 20%
        } else if (acertos == ACERTOS_QUADRA) {
            return premioTotal * FATOR_PREMIO_QUADRA; // Quadra = 5%
        }
        return 0.0;
    }

    private int contaAcertos(List<Integer> numerosApostados, List<Integer> numerosSorteados) {
        int acertos = 0;
        for (Integer apostado : numerosApostados) {
            if (numerosSorteados.contains(apostado)) {
                acertos++;
            }
        }
        return acertos;
    }


}




