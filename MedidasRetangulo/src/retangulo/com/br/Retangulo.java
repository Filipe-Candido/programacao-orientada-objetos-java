package retangulo.com.br;


public class Retangulo {
	
	double largura;
	double altura;
	
	public double calcularArea() {
		return largura * altura;
		
	}public double calcularPerimetro() {
		return 2*(altura+largura);
		
	}public double calcularDiagonal() { //diagonal = ½√(P² − 8 ⋅ A) 
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2)); // calcular diagonal retangulo
	}

}
