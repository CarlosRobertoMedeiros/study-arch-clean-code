package br.com.roberto.codigoruim.book.visaooo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloOOTest {

    @Test
    void deve_retornar_area_do_retangulo(){
        RetanguloOO retangulo = new RetanguloOO(2.0 , 4.5);
        assertEquals(retangulo.area(),9.0);
    }
}