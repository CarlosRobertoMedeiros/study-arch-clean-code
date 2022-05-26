package br.com.roberto.codigoruim.refatoracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApostaTest {

    @Test
    public void testAposta(){
        //Aposta aposta = new Aposta(10,5,51,42,25,35);
        Aposta aposta = Aposta.of(10,5,51,42,25,35);
    }

}