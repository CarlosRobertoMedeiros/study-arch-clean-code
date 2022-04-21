package br.com.roberto.codigoruim.funcoes.visaonaoprocedural;

public class ProgramaRealizaPagamento {

    public static void main(String[] args) {

        System.out.println(RealizaPagamentoVisaoPolimorfica.create("Luciene Alves",TipoDeColaborador.CLT));
        System.out.println(RealizaPagamentoVisaoPolimorfica.create("Carlos Roberto",TipoDeColaborador.COMISSIONADO));
        System.out.println(RealizaPagamentoVisaoPolimorfica.create("Amanda Silva",TipoDeColaborador.HORISTA));
    }
}

//TODO: Provocação Futura: A partir de agora quero colocar o plano de saúde
//TODO: Provocação Futura: A partir de agora quero colocar o vale transporte
