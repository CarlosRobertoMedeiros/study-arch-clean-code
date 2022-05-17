package br.com.roberto.codigoruim.book.visaoprocedural;

public class CalculoGeometrico {

    public static final double PI = 3.1415;

    public static double calculaArea(Object figuraGeometrica){
        if (figuraGeometrica instanceof Quadrado){
            Quadrado quadrado = (Quadrado) figuraGeometrica;
            return quadrado.getLado() * quadrado.getLado();
        }else if (figuraGeometrica instanceof Retangulo){
            Retangulo retangulo = (Retangulo) figuraGeometrica;
            return retangulo.getAltura() * retangulo.getLargura();
        }else if (figuraGeometrica instanceof Circulo) {
            Circulo circulo = (Circulo) figuraGeometrica;
            return PI * circulo.getRadiano() * circulo.getRadiano();
        }
        throw new IllegalArgumentException("Figura Geométrica Desconhecida !" + figuraGeometrica.getClass());
    }

}
