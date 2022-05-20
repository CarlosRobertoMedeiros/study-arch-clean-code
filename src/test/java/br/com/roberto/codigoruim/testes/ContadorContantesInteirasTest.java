package br.com.roberto.codigoruim.testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorContantesInteirasTest {

    private ContadorContantesInteiras contador;

    @BeforeEach
    public void setUp(){
        contador = new ContadorContantesInteiras();
    }

    @Test
    public void deveRetornarUmaConstanteEmUmaClasse(){
        // Condição
        int constantes = contador.contar(Classe1.class);
        //Assertiva
        assertEquals(1,constantes);
    }

    @Test
    public void deveRetornarTresConstanteDevidoASomaNasClassesHerdadas(){
        // Condição
        int constantes = contador.contar(Classe2.class);
        //Assertiva
        assertEquals(3,constantes);
    }

    @Test
    public void deveRetornarMenos1AoUsarClasseAbstrata(){
        // Condição
        int constantes = contador.contar(List.class);
        //Assertiva
        assertEquals(-1,constantes);
    }

    @Test
    public void deveRetornarMenos1AoUsarEnum(){
        // Condição
        int constantes = contador.contar(Month.class);
        //Assertiva
        assertEquals(-1,constantes);
    }

}

class Classe1{
    public static final int CONST1 = 1;
}

class Classe2 extends Classe1{
    public static final int CONST2 = 2;
    public static final int CONST3 = 2;
}