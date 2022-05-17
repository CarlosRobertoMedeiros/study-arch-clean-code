package br.com.roberto.codigoruim.book.visaooo;

public class QuadradoOO implements FiguraGeometrica {
    private double lado; //valor mutável

    public QuadradoOO(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}

