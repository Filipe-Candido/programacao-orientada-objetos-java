package util;

public class Calculadora {

    public static final double IOF = 0.06; //final indica uma constante não pode ser alterado

    public static  double converter(double preco, double compra){
            return preco * compra * IOF;
    }

}
