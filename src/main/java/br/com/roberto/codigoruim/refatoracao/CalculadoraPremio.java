package br.com.roberto.codigoruim.refatoracao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Essa refatoração reflete a maneira de teste da mega sena
public class CalculadoraPremio {

    private static final int ACERTOS_SENA = 6;
    private static final int ACERTOS_QUINA = 5;
    private static final int ACERTOS_QUADRA = 4;
    private static final double FATOR_PREMIO_QUINA = 0.2;
    private static final double FATOR_PREMIO_QUADRA = 0.05;

    public double calcula(List<Integer> numerosApostados, List<Integer> numerosSorteados, double premioTotal) {

        List<Integer> numerosValidos = validarAposta(numerosApostados);

        int acertos = contaAcertos(numerosApostados, numerosSorteados);

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

    List<Integer> validarAposta(List<Integer> numerosApostados) {

        if (numerosApostados.size() < 6) {
            throw new IllegalArgumentException("a aposta mínima é de 6 números");
        }

        if (numerosApostados.size() > 15) {
            throw new IllegalArgumentException("a aposta máxima é de 15 números");
        }

        List<Integer> numerosValidos = new ArrayList<>();
        for (Integer apostado : numerosApostados) {
            if (apostado < 1 || apostado > 60) {
                throw new IllegalArgumentException("Os números apostados devem estar entre 1 e 60");
            }
            if (numerosValidos.contains(apostado)) {
                throw new IllegalArgumentException("Número duplicado: " + apostado);
            }
            numerosValidos.add(apostado);
        }
        return numerosValidos;
    }
}




