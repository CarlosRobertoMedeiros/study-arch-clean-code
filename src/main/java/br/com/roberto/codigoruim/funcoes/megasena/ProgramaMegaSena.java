package br.com.roberto.codigoruim.funcoes.megasena;

import java.util.Arrays;
import java.util.List;

public class ProgramaMegaSena {

    public static void main(String[] args) {


        List<Integer> numerosApostados = Arrays.asList(1,2,3,4,5,6);

        MegaSenaV0 megaSenaV0 = new MegaSenaV0();
        megaSenaV0.megasena(numerosApostados, 100.000);


    }
}

