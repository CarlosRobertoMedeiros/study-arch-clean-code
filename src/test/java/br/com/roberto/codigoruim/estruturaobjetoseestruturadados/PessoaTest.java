package br.com.roberto.codigoruim.estruturaobjetoseestruturadados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void deve_construir_pessoas(){

        Pessoa pessoa = new Pessoa("Carlos Roberto",40,"Brasília");
        Assertions.assertNotNull(pessoa);
    }

}
