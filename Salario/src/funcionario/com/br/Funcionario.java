package funcionario.com.br;

public class Funcionario {
	
	String nome;  // atributos classe funcionario
	double salarioBruto;
	double imposto;
	
	
	public double calcularSalarioliquido() {
		return salarioBruto - imposto;
	}
	public void aumetarSalario(double porcentagem) {
		 salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", calcularSalarioliquido());
		}
}
