package produto.com.br;

public class Produto {  //Criando a Classe produto
	/*atributos da classe produto*/
	String nome;
	double preco;
	int quantidade;
	
	public Produto (String nome, double preco, int quantidade) { //criando o Construtor
		 /*Referenciado os atributos com o this e o nome do metodo*/
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		
	}
	
	
	/*metodo classe produto*/
	
	public double calcularEstoque() {// metodo calcular estoque
		return preco * quantidade;
	}
	public void adicionarProduto(int quantidade) { //metodo adicionar produtos ao estoque
		this.quantidade += quantidade; // acessar o atirbuto da classe e adicionar +1 no parametro do metodo
	/*this referencia o atributos e metodos da classe*/
	}
	public void removerProduto(int quantidade) { //metodo remover produtos do estoque
		this.quantidade -= quantidade;
	}public String toString() { // fazer com que meu objeto produto apareça em forma de String
		return nome
				+" $ "
				+String.format("%.2f", preco)
				+", "
				+quantidade
				+" unidades, Total: $ "
				+String.format("%.2f", calcularEstoque());
	}
		
	}                                         
