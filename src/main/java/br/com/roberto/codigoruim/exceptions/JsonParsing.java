package br.com.roberto.codigoruim.exceptions;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

public class JsonParsing {

    public static Object fromJsonVO(String json, Class<?> clazz) { //Método é um delegate, delega pra frente

        Gson gson = new Gson();
        try {
            return gson.fromJson(json, clazz);
        } catch (Exception e) {
            System.out.println("Erro de Parse. Json Text:" + json);
            return null;
        }
    }

    public static Object fromJsonV1(String json, Class<?> clazz) { //Método é um delegate, delega pra frente
        if (json == null){
            throw new NullPointerException("A variável json não pode ser nula!");
        }

        Gson gson = new Gson();
        try {
            return gson.fromJson(json, clazz);
        } catch (Exception e) {
            throw  new JsonParseException("Erro ao realizar o Parse do Json "+e);
        }
    }

}
