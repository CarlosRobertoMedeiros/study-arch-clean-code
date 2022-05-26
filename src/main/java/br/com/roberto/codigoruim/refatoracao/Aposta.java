package br.com.roberto.codigoruim.refatoracao;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aposta {

    private final List<Integer> numeros;

    public Aposta(List<Integer> numeros) {
        this.numeros = Collections.unmodifiableList(numeros); //cópia defensiva
    }

    public static Aposta of(Integer... numeros) {
        return new Aposta(Arrays.asList(numeros));
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}
