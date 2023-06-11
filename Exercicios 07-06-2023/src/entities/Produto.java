package entities;

public class Produto {
	
	private String descricao; // Atributo privado que armazena a descrição do produto
    private int quantidade; // Atributo privado que armazena a quantidade em estoque do produto
    private double preco; // Atributo privado que armazena o preço unitário do produto
    private double valorTotalEstoque; // Atributo privado que armazena o valor total em estoque do produto

    // Construtor da classe Produto
    public Produto(String descricao, int quantidade, double preco) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.valorTotalEstoque = quantidade * preco; // Calcula o valor total em estoque multiplicando a quantidade pelo preço
    }

    // Métodos get e set para o atributo descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos get e set para o atributo quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos get e set para o atributo preco
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método privado que atualiza o valor total em estoque
    private void atualizarValorTotalEstoque() {
        this.valorTotalEstoque = quantidade * preco; // Recalcula o valor total multiplicando a nova quantidade pelo preço
    }

    // Método para realizar uma venda do produto
    public void vender(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) { // Verifica se a quantidade solicitada está disponível em estoque
            quantidade -= quantidadeVendida; // Subtrai a quantidade vendida do estoque
            atualizarValorTotalEstoque(); // Atualiza o valor total em estoque após a venda
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    // Método para exibir os dados do produto
    public void exibirDados() {
    	atualizarValorTotalEstoque();
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Preço: R$" + preco);
        System.out.println("Valor total em estoque: R$" + valorTotalEstoque);
    }

}
