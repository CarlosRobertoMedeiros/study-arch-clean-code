package br.com.roberto.codigoruim.funcoes.visaonaoprocedural;

public class RealizaPagamentoVisaoPolimorfica {

    public static Colaborador create(String nome, TipoDeColaborador tipoDeColaborador){
        switch (tipoDeColaborador){
            case COMISSIONADO:
                return new ColaboradorComissionado(nome);
            case CLT:
                return new ColaboradorClt(nome);
            case HORISTA:
                return new ColaboradorHorista(nome);
            default:
                throw  new IllegalArgumentException("Argumento Inválido para ser chamado !");
        }


    }

}
