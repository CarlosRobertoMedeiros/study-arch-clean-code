package br.com.roberto.codigoruim.book.visaooo;

public class RetanguloOO implements FiguraGeometrica {

    private final double altura; //valor imutável
    private final double largura; //valor imutável

    public RetanguloOO(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public double area() {
        return altura  * largura;
    }
}
