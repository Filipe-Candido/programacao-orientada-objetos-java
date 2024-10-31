package br.com.contabancaria;

public class Conta {
	
	int numeroDaConta; //atributos da conta 
	int agencia;
	double saldo;

	public Conta(){ // criando um construtor padrão
		
	}

	public Conta(int numeroDaConta, int agencia, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;//atribuir numero da conta refereciando com a varialvel declarada no escopo da classe
		this.agencia = agencia;// atribuir agencia
		this.saldo = saldo;//atribuir saldo
	}
	
	// craindo os metodos da Classe conta, depositar, sacar e verficar saldo
	
	public void depositar(double valor){
		
		this.saldo += valor;
		
	}
	
	public void sacar(double valor) {
		
		this.saldo -= valor;
	}
	
	public double verificarSaldo () {
		return this.saldo;
	}
	
	
}