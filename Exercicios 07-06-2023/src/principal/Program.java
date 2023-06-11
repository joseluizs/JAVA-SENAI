package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {
    // Método main para testar a classe
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        // Solicitando os dados iniciais do produto
        System.out.print("Informe a descrição do produto: ");
        String descricao = sc.nextLine();

        System.out.print("Informe a quantidade em estoque: ");
        int quantidade = sc.nextInt();

        System.out.print("Informe o preço unitário do produto: ");
        double preco = sc.nextDouble();

        // Criando um objeto Produto com os valores informados
        Produto produto = new Produto(descricao, quantidade, preco);

        // Exibindo os dados iniciais do produto
        System.out.println();
        produto.exibirDados();

        // Solicitando as alterações nos dados do produto
        System.out.print("\nInforme a nova descrição do produto: ");
        sc.nextLine(); // Limpa o buffer
        descricao = sc.nextLine();

        System.out.print("Informe a nova quantidade em estoque: ");
        quantidade = sc.nextInt();

        System.out.print("Informe o novo preço unitário do produto: ");
        preco = sc.nextDouble();
        
        // Atualizando os dados do produto
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);

        // Exibindo os dados atualizados do produto
        produto.exibirDados();

        // Realizando uma venda
        System.out.print("\nInforme a quantidade a ser vendida: ");
        int quantidadeVendida = sc.nextInt();
        produto.vender(quantidadeVendida);

        // Exibindo os dados após a venda
        produto.exibirDados();

        sc.close();
	    

	}

}
