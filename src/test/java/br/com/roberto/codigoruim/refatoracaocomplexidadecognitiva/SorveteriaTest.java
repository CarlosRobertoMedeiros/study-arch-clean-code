package br.com.roberto.codigoruim.refatoracaocomplexidadecognitiva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorveteriaTest {

    private Sorveteria sorveteria;
    @BeforeEach
    void setup(){
        sorveteria = new Sorveteria();
    }

    @Test
    void validaSorveteSimplesSemCasquinhaSemCobertura() {
        Assertions.assertEquals(17,sorveteria.precoSorvete(false,false,0));
    }

    @Test
    void validaSorvetePremiumSemCasquinhaSemCobertura() {
        Assertions.assertEquals(21,sorveteria.precoSorvete(true,false,0));
    }

    @Test
    void validaSorvetePremiumComCasquinhaSemCobertura() {
        Assertions.assertEquals(23,sorveteria.precoSorvete(true,true,0));
    }

    @Test
    void validaSorvetePremiumComCasquinhaComUmaCobertura() {
        Assertions.assertEquals(23,sorveteria.precoSorvete(true,true,1));
    }

    @Test
    void validaSorvetePremiumComCasquinhaAcimaDeUmaCobertura() {
        Assertions.assertEquals(24,sorveteria.precoSorvete(true,true,2));
        Assertions.assertEquals(24,sorveteria.precoSorvete(true,true,3));
    }
}
