package funcionario.com.br;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Nome: ");
		funcionario.nome = scan.nextLine();
		System.out.println("Salario bruto: ");
		funcionario.salarioBruto = scan.nextDouble();
		System.out.println("Imposto: ");
		funcionario.imposto = scan.nextInt();
		
		System.out.println("Fuincionario: "+funcionario);
		
		
		System.out.println("Qual a porcentagem deseja aumentar do salario? ");
		double porcentagem = scan.nextDouble();
		funcionario.aumetarSalario(porcentagem);
		System.out.println("Dados atualizados: "+funcionario);
		
		scan.close();
	}
}
