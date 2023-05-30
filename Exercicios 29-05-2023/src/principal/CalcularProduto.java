package principal;

public class CalcularProduto {

	  public static double calcularPrecoVenda(double valorDoProduto, double lucroProduto) {
	        double lucroPercentual = lucroProduto / 100; 
	        double precoVenda = valorDoProduto + (valorDoProduto * lucroPercentual);
	        return precoVenda;
	    }

	    public static void main(String[] args) {
	        double valorDoProduto = 10.00;
	        double lucroProduto = 10.00;
	        double precoVenda = calcularPrecoVenda(valorDoProduto, lucroProduto);
	        System.out.println("O preço de venda do produto é: " + precoVenda);
	    }

}
