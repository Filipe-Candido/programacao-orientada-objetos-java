package notas.com.br;

public class Aluno {
	
	String nome;
	int notaTrimestre1;
	int notaTrimestre2;
	int notaTrimestre3;
	
	public double somarTrimestre() {
		return notaTrimestre1 + notaTrimestre2 + notaTrimestre3;
	}
	public double recuperarPontos() {
		return 60 - somarTrimestre()  ;
	} 

	
}  
