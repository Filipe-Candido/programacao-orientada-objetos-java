package br.com.contabancaria;

public class Teste {
	
	public static void main(String[]args) {
		
		Conta contaCorrente = new Conta();
		
		contaCorrente.saldo = 50.00;
		contaCorrente.numeroDaConta = 5699;
		contaCorrente.agencia = 1422;
		
		contaCorrente.depositar(2500);
		
		System.out.println("Agência: "+contaCorrente.agencia);
		System.out.println("Conta Corrente: "+contaCorrente.numeroDaConta);
		System.out.printf("Saldo:R$%.2f\n",contaCorrente.verificarSaldo());
		
		Conta poupanca = new Conta(5698, 1422, 1000 );
		poupanca.sacar(200);
		
		System.out.println("\nAgência:"+poupanca.agencia);
		System.out.println("Conta Poupança: "+poupanca.numeroDaConta);
		System.out.printf("Saldo:R$%.2f",poupanca.verificarSaldo());
		
	}

}
