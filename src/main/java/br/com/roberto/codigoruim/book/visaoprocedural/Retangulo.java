package br.com.roberto.codigoruim.book.visaoprocedural;

public class Retangulo {

    private final double altura; //imutável
    private final double largura; //imutável

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }
}
