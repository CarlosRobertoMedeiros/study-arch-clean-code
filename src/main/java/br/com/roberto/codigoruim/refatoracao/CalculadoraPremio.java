package br.com.roberto.codigoruim.refatoracao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Essa refatoração reflete a maneira de teste da mega sena
public class CalculadoraPremio {

    public double calcula(List<Integer> numerosApostados, List<Integer> numerosSorteados, double premioTotal) {
        List<Integer> numerosValidos = new ArrayList<>();
        for (Integer apostado : numerosApostados) {
            if (apostado < 1 || apostado > 60) {
                return 0.0; // inválido
            }
            if (numerosValidos.contains(apostado)) {
                return 0.0; // repetido
            }
            numerosValidos.add(apostado);
        }

        if (numerosValidos.size() >= 6 && numerosValidos.size() <= 15) {
            int acertos = 0;
            for (Integer apostado : numerosApostados) {
                if (numerosSorteados.contains(apostado)) {
                    acertos++;
                }
            }

            if (acertos == 6) {
                return premioTotal; // Sena = 100%
            } else if (acertos == 5) {
                return premioTotal * 0.2; // Quina = 20%
            } else if (acertos == 4) {
                return premioTotal * 0.05; // Quadra = 5%
            }
        }
        return 0.0;
    }
}




