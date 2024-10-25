package br.com.construtores;

public class Conta {

	private int numero; // criando os atributos com modificador privado
	private double saldo;
	private double valor;
	
	public Conta() { // construtor padrão, quando criamos outro construtor ele passa a não valer mais
		
	}
	
	public Conta(int numero, double saldo, double valor){//criando um construtor com modiifcador publico com os parametros  numero e saldo da conta, nome da classe como construtor
	
		/* trabalhar com numero e saldo da conta recebidos no objeto*/
		/*this referenciado o parametro no escopo da classe*/
		
			this.numero = numero; // atribuir ao numero da conta o numero que veio de parametro
			this.saldo = saldo;// atribuir ao saldo da conta o saldo que veio de parametro
			this.valor = saldo + valor;
	}
	
	public double recuperarSaldo() { // recupera saldo
		return saldo;
	}public double depositar() { // adiciona saldo
		return valor;
		
	}public void setNumero(int numero) { // seta novo numero pra conta
		this.numero = numero; //referenciando o metodo setNumero no escopo da classe Conta
		
	}public int getNumero() { // obtem numero da conta
		return numero;
	}
	
}
