package br.com.roberto.codigoruim.refatoracaocomplexidadecognitiva;

public class Sorveteria {

    public int precoSorvete(boolean premium, boolean casquinha, int cobertura){
        int preco = 0;
        if(premium){
            preco = 20;
            if(casquinha){
                preco = preco + 2;
                if (cobertura > 1){
                    preco = preco + 2;
                }else{
                    preco = preco + 1;
                }
            }else{
                preco = preco + 1;
            }
        }else{
            preco = 15 + 1 +1; //copo +  1cob
        }
        return preco;
    }
}
