package produto.com.br;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in); //instaciando classe Scanner
		
		//Produto produto = new Produto(); // instanciando a variavel Produto do tipo de dado Produto 
		
		System.out.println("Entre com os dados do produto:");
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		System.out.println("Preço: ");
		double preco = scan.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade = scan.nextInt();
		
		Produto produto = new Produto(nome,preco,quantidade); //informando os dados do produto no moemento da instaciação
		
		System.out.println(produto + "\n");
		
		System.out.println("Entre com a quantidade de produtos adicionados ao estoque: ");
		quantidade = scan.nextInt();
		produto.adicionarProduto(quantidade);
		System.out.println("Atualizado: "+produto+"\n");
		
		System.out.println("Entre com a quantidade de produtos removidos do estoque: ");
		quantidade = scan.nextInt();
		produto.removerProduto(quantidade);
		System.out.println("Atualizado: "+produto);
		
		
		
		scan.close();

	}

}
