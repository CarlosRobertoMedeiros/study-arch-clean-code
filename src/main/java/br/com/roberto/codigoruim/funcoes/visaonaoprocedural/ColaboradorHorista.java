package br.com.roberto.codigoruim.funcoes.visaonaoprocedural;

public class ColaboradorHorista extends Colaborador {

    public ColaboradorHorista(String nome) {
        super(nome, TipoDeColaborador.HORISTA);
    }

    @Override
    public Double calculaPagamento() {
        return 40.00;
    }
}
