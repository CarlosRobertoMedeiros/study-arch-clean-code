package br.com.roberto.codigoruim.refatoracaocomplexidadeciclomatica;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContadorRefatoracao1Test {

    @Test
    public void contar(){
        ContadorRefatoracao1 contadorRefatoracao1 = new ContadorRefatoracao1();
        //Retorna -1 Parâmetro que não faz contagem
        assertEquals(-1, contadorRefatoracao1.contar(null)); //null
        assertEquals(-1, contadorRefatoracao1.contar(List.class)); //Interface ou Classe Abstrata
        assertEquals(-1, contadorRefatoracao1.contar(Month.class));//Enum

        //Objeto que não tem nenhuma constante Inteira
        assertEquals(0, contadorRefatoracao1.contar(Object.class));

        //ArrayList tem 4 constantes inteiras
        assertEquals(4, contadorRefatoracao1.contar(ArrayList.class));
    }

}