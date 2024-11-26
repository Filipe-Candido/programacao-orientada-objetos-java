package notas.com.br;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome:");
		aluno.nome =scan.nextLine();
		
		System.out.println("Nota 1º Trimestre:");
		aluno.notaTrimestre1 = scan.nextInt();
		
		System.out.println("Nota 1º Trimestre:");
		aluno.notaTrimestre2 = scan.nextInt();
		
		System.out.println("Nota 1º Trimestre:");
		aluno.notaTrimestre3 = scan.nextInt();
		
		double notaFinal = aluno.somarTrimestre();
		double notaFaltante =aluno.recuperarPontos();
		
		
		
		
		if(notaFinal >= 60) {
			
			System.out.printf("FINAL GRADE = %.2f\nPASS\n", notaFinal);

		}else {
			System.out.printf("FINAL GRADE = %.2f\nFAILED\n", notaFinal);
			System.out.printf("MISSING %.2f POINTS", notaFaltante);
			

		}
		
		scan.close();
		}
		
		

	}


