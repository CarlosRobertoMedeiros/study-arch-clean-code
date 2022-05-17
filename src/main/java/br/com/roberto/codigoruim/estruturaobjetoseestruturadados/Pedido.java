package br.com.roberto.codigoruim.estruturaobjetoseestruturadados;

import java.time.LocalDate;
import java.util.List;

public class Pedido { //estado mutável
    private String numero;
    private LocalDate data;
    private List<Item> itens;

    public boolean isValido() {
        return data.plusDays(365).isBefore(LocalDate.now())
                && !itens.isEmpty();
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
//Continuar a partir de 15 min
