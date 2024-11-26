package retangulo.com.br;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informe a altura: ");
		retangulo.altura = scan.nextDouble();
		
		System.out.println("Informe a largura:");
		retangulo.largura = scan.nextDouble();
		
		double areaRetangulo = retangulo.calcularArea();
		double perimetroRetangulo = retangulo.calcularPerimetro();
		double diagonalRetangulo = retangulo.calcularDiagonal();
		
		System.out.println("AREA = "+areaRetangulo);
		System.out.println("PERIMETRO = "+perimetroRetangulo);
		System.out.println("DIAGONAL = "+diagonalRetangulo);
		
		scan.close();
	}

}
