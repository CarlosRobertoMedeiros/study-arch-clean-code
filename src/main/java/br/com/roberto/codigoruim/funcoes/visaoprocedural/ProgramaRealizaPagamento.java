package br.com.roberto.codigoruim.funcoes.visaoprocedural;

public class ProgramaRealizaPagamento {

    public static void main(String[] args){
        Colaborador primeiroColaborador = new Colaborador("Luciene Alves", TipoDeColaborador.CLT);
        Colaborador segundoColaborador  = new Colaborador("Carlos Roberto", TipoDeColaborador.COMISSIONADO);
        Colaborador terceiroColaborador = new Colaborador("Amanda Silva", TipoDeColaborador.HORISTA);

        System.out.println(RealizaPagamentoVisaoProcedural.calculaPagamento(primeiroColaborador));
        System.out.println(RealizaPagamentoVisaoProcedural.calculaPagamento(segundoColaborador));
        System.out.println(RealizaPagamentoVisaoProcedural.calculaPagamento(terceiroColaborador));
    }

}

//TODO: Provocação Futura: A partir de agora quero colocar o plano de saúde
//TODO: Provocação Futura: A partir de agora quero colocar o vale transporte

