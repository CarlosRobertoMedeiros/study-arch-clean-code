package br.com.roberto.codigoruim.exceptions;

import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonParsingTest {

    @Test()
    void deveria_ser_versao_nula_VO(){
        String json = "{\n" +
                "   \"nome\":\"Carlos Roberto\",\n" +
                "   \"idade\":40,\n" +
                "   \"cidade\":\"Brasília\",\n" +
                "   \"uf\":\"DF\"\n" +
                "}";
        Pessoa pessoa = (Pessoa) JsonParsing.fromJsonVO(json, Pessoa.class);
        assertEquals(pessoa.getNome(),"Carlos Roberto");
        assertEquals(pessoa.getIdade(),40);
        assertEquals(pessoa.getCidade(),"Brasília");
        assertEquals(pessoa.getUf(),"DF");

        String pauloJson = "{\"nome\": \"Paulo\", \"idade\": 42, \"cidade\": \"Belém\", \"uf\": \"DF\"";
        Pessoa pessoa2 = (Pessoa) JsonParsing.fromJsonVO(pauloJson, Pessoa.class);
        if (pessoa2 != null) { // forced by "return null"
            assertEquals(pessoa2.getNome(), null);
            assertEquals(pessoa2.getIdade(), 0);
            assertEquals(pessoa2.getCidade(), null);
        }

    }

    @Test
    void deveria_ser_versao_nula_V1(){
        String json = "{\n" +
                "   \"nome\":\"Carlos Roberto\",\n" +
                "   \"idade\":40,\n" +
                "   \"cidade\":\"Brasília\",\n" +
                "   \"uf\":\"DF\"\n" +
                "}";
        Pessoa pessoa = (Pessoa) JsonParsing.fromJsonVO(json, Pessoa.class);
        assertEquals(pessoa.getNome(),"Carlos Roberto");
        assertEquals(pessoa.getIdade(),40);
        assertEquals(pessoa.getCidade(),"Brasília");
        assertEquals(pessoa.getUf(),"DF");

        String pauloJson = "{\"nome\": \"Paulo\", \"idade\": 42, \"cidade\": \"Belém\", \"uf\": \"DF\"";

        JsonParseException jsonParseException = assertThrows(
                JsonParseException.class,
                () -> {
                    Pessoa pessoa2 = (Pessoa) JsonParsing.fromJsonV1(pauloJson, Pessoa.class);
                });

        assertEquals(null , jsonParseException.getCause());
    }


}