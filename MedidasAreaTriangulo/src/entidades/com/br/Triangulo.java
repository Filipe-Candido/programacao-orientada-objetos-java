package entidades.com.br;

public class Triangulo {
	
	public double ladoA;
	public double ladoB;
	public double ladoC;

	
	public double calcularArea() {
		 double p =(ladoA + ladoB + ladoC) /2.0;
		 return (p *(p-ladoA)*(p- ladoB)*(p-ladoC));
		
	}
}
