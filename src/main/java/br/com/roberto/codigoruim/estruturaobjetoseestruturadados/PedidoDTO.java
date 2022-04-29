package br.com.roberto.codigoruim.estruturaobjetoseestruturadados;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

//ESTRUTURA DE DADOS
public class PedidoDTO { //imutável
    private final String numero;
    private final LocalDate data;
    private final List<ItemDTO> itens;

    public PedidoDTO(String numero, LocalDate data, List<ItemDTO> itens) {
        this.numero = numero;
        this.data = data;
        this.itens = Collections.unmodifiableList(itens); //Aqui para garantir gerando a cópia defensiva
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public List<ItemDTO> getItens() {
        return itens;
    }
}
