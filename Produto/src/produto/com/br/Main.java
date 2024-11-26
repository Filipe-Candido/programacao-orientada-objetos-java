package produto.com.br;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in); //instaciando classe Scanner
		
		Produto produto = new Produto(); // instanciando a variavel Produto do tipo de dado Produto 
		
		System.out.println("Entre com os dados do produto:");
		System.out.println("Nome: ");
		produto.nome = scan.nextLine();
		System.out.println("Preço: ");
		produto.preco = scan.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = scan.nextInt();
		
		System.out.println(produto + "\n");
		
		System.out.println("Entre com a quantidade de produtos adicionados ao estoque: ");
		int quantidade = scan.nextInt();
		produto.adicionarProduto(quantidade);
		System.out.println("Atualizado: "+produto+"\n");
		
		System.out.println("Entre com a quantidade de produtos removidos do estoque: ");
		quantidade = scan.nextInt();
		produto.removerProduto(quantidade);
		System.out.println("Atualizado: "+produto);
		
		
		
		scan.close();

	}

}
