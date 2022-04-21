package br.com.roberto.codigoruim.funcoes.visaoprocedural;

public class Colaborador {
    private String nome;
    private TipoDeColaborador tipoDeColaborador;

    public Colaborador(String nome, TipoDeColaborador tipoDeColaborador) {
        this.nome = nome;
        this.tipoDeColaborador = tipoDeColaborador;
    }

    public String getNome() {
        return nome;
    }

    public TipoDeColaborador getTipoDeColaborador() {
        return tipoDeColaborador;
    }
}
