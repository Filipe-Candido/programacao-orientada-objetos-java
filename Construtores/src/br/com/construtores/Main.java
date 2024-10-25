package br.com.construtores;



public class Main {
	
	public static void main(String[]args) {
		
		Conta cc = new Conta (1000,500,100); // pega o numero da conta e o saldo que vieram co construtor e ira jogar dirteo pro metodo
								//declarei um novo objeto de conta  "new Conta" 
                        		//que será controlado pela variavel "cc" do tipo Conta
		
		
		//atrubuiir novo numero a conta utilizando o cosntrutor padrão
		//cc.setNumero(1000, 50);// utilizando set numero para atribuir o valor
		
		
		System.out.println(cc.recuperarSaldo()); // imprimindo saldo 
		System.out.println(cc.depositar());
	}

}
