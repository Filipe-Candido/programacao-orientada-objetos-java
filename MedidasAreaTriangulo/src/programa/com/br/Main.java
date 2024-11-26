package programa.com.br;

import java.util.Locale;
import java.util.Scanner;
import entidades.com.br.Triangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangulo trianguloX, trianguloY;
		
		trianguloX = new Triangulo();
		trianguloY = new Triangulo();
		
		System.out.println("Informe os lados do Triangulo X");
		trianguloX.ladoA = scan.nextDouble();
		trianguloX.ladoB = scan.nextDouble();
		trianguloX.ladoC = scan.nextDouble();
		
		System.out.println("Informe os lados do Triangulo Y");
		trianguloY.ladoA = scan.nextDouble();
		trianguloY.ladoB = scan.nextDouble();
		trianguloY.ladoC = scan.nextDouble();
		
		
		
		double areaX = trianguloX.calcularArea();
		
		double areaY = trianguloY.calcularArea();
		
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Area X ");
		}else {
			System.out.println("Area Y ");
		}
		scan.close();
	}
	
	


}
