package br.com.contabancaria;

/**
 * Classe que abstrai conta bancaria
 * @author Filipe Cândido Rodrigues
 * @version 1.0
 */

public class Conta {
	
	int numeroDaConta; //atributos da conta 
	int agencia;
	double saldo;

	public Conta(){ // criando um construtor padrão
		
	}
	
	/**
	 * Realiza um deposito na conta corrente
	 * @param numeroDaConta
	 * @param agencia numero da agengia
	 * @param saldo retorna valor depositado
	 * @return numero de protocolo de confirmação
	 */

	public Conta(int numeroDaConta, int agencia, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;//atribuir numero da conta refereciando com a varialvel declarada no escopo da classe
		this.agencia = agencia;// atribuir agencia
		this.saldo = saldo;//atribuir saldo
	}
	
	/**
	 * Acrescenta saldo na conta
	 * @param valor depositado na conta
	 */
	
	// craindo os metodos da Classe conta, depositar, sacar e verficar saldo
	
	public void depositar(double valor){
		
		this.saldo += valor;
		
	}
	
	/**
	 * Saque de valores
	 * @param valor retirado da conta
	 * @see depositar
	 */
	
	public void sacar(double valor) {
		
		this.saldo -= valor;
	}
	
	/**
	 * Verifica saldo na conta
	 * @return retorna valor de saldo na conta
	 */
	
	public double verificarSaldo () {
		return this.saldo;
	}
	
	
}