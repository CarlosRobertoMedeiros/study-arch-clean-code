package br.com.roberto.codigoruim.book.visaooo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CirculoOOTest {

    @Test
    void deve_retornar_area_do_circulo(){
        CirculoOO circulo = new CirculoOO(2.0);
        assertEquals(circulo.area(),12.566);
    }

}