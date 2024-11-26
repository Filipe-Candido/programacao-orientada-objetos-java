package aplication;
import util.Calculadora;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o preço do dolar?");
        double preco = scan.nextDouble();

        System.out.println("Quantos dolares irá comprar?");
        double compra = scan.nextDouble();

        double calculo = Calculadora.converter(preco,compra);
        double total = preco * compra +calculo;


        System.out.printf("Valor total em Reais : %.2f",total);


        scan.close();
    }
}
