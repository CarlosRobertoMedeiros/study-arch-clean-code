package br.com.roberto.codigoruim.funcoes.visaonaoprocedural;

public class ColaboradorComissionado extends Colaborador {

    public ColaboradorComissionado(String nome) {
        super(nome, TipoDeColaborador.COMISSIONADO);
    }

    @Override
    public Double calculaPagamento() {
        return 100.00;
    }
}
