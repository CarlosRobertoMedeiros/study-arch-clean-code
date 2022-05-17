package br.com.roberto.codigoruim.book.visaooo;

public class CirculoOO implements FiguraGeometrica{

    private final double radiano;
    public static final double PI = 3.1415;

    public CirculoOO(double radiano) {
        this.radiano = radiano;
    }

    public double getRadiano() {
        return radiano;
    }

    @Override
    public double area() {
        return PI * radiano * radiano;
    }
}
