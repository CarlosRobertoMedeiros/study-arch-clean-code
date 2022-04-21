package br.com.roberto.codigoruim.funcoes.visaoprocedural;

public class RealizaPagamentoVisaoProcedural {

    public static double calculaPagamento(Colaborador colaborador){

        switch (colaborador.getTipoDeColaborador()){
            case CLT:
                return calculaPagamentoClt(colaborador);
            case HORISTA:
                return calculaPagamentoHorista(colaborador);
            case COMISSIONADO:
                return calculaPagamentoComissionado(colaborador);
            default:
                throw new IllegalArgumentException("Parâmetro Desconhecido, Favor reavaliar");
        }
    }

    private static double calculaPagamentoClt(Colaborador colaborador) {
        return 1212.00;
    }

    private static double calculaPagamentoHorista(Colaborador colaborador) {
        return 40.00;
    }

    private static double calculaPagamentoComissionado(Colaborador colaborador) {
        return 100.00;
    }
}
