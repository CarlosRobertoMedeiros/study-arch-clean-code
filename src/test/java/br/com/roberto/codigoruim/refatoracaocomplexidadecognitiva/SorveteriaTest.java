package br.com.roberto.codigoruim.refatoracaocomplexidadecognitiva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorveteriaTest {

    @Test
    void precoSorvete() {
        Sorveteria sorveteria = new Sorveteria();
        int valorRetorno =  sorveteria.precoSorvete(true,true,1);
        System.out.println("valorRetorno:" +valorRetorno);
    }
}