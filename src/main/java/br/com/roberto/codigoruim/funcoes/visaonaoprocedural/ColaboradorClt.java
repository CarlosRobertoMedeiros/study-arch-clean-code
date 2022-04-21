package br.com.roberto.codigoruim.funcoes.visaonaoprocedural;

public class ColaboradorClt extends Colaborador {

    public ColaboradorClt(String nome) {
        super(nome, TipoDeColaborador.CLT);
    }

    @Override
    public Double calculaPagamento() {
        return 1212.00;
    }
}
