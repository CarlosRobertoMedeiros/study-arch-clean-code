package br.com.roberto.codigoruim.refatoracaocomplexidadeciclomatica;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContadorTest {

    @Test
    public void contar(){
        Contador contador = new Contador();
        //Retorna -1 Parâmetro que não faz contagem
        assertEquals(-1, contador.contar(null)); //null
        assertEquals(-1, contador.contar(List.class)); //Interface ou Classe Abstrata
        assertEquals(-1, contador.contar(Month.class));//Enum

        //Objeto que não tem nenhuma constante Inteira
        assertEquals(0, contador.contar(Object.class));

        //ArrayList tem 4 constantes inteiras
        assertEquals(4, contador.contar(ArrayList.class));
    }

}