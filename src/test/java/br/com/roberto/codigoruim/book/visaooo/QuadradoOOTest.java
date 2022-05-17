package br.com.roberto.codigoruim.book.visaooo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoOOTest {

    @Test
    void deve_retornar_area_do_quadrado(){
        QuadradoOO quadrado = new QuadradoOO(3.0);
        assertEquals(quadrado.area(),9.0);
    }
}