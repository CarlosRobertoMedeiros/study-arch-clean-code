package br.com.roberto.codigoruim.book.visaoprocedural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculoGeometricoTest {

    @Test
    void deve_retornar_area_do_circulo(){
        Circulo circulo = new Circulo(2.0);
        assertEquals(CalculoGeometrico.calculaArea(circulo),12.566);
    }

    @Test
    void deve_retornar_area_do_quadrado(){
        Quadrado quadrado = new Quadrado(3.0);
        assertEquals(CalculoGeometrico.calculaArea(quadrado),9.0);
    }

    @Test
    void deve_retornar_area_do_retangulo(){
        Retangulo retangulo = new Retangulo(2.0, 4.5);
        assertEquals(CalculoGeometrico.calculaArea(retangulo),9.0);
    }

}