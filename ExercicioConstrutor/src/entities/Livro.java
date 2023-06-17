package entities;

public class Livro {
	/*
	 * Ordem sugerida a seguir na classe
	 * 1º atributos
	 * 2º construtores
	 * 3º get e set
	 * 4º demais metodos*/
	
	
	//atributos
	private String nome;
	private String edicao;
	private double valor;
	
	public Livro(String nome, String edicao, double valor) {// parametros
		super();
		this.nome = nome; //atributos this.nome = parametros nome
		this.edicao = edicao;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 100) {
			this.valor += (valor * 0.30);
		}else {
			this.valor = valor;
		}
	}
	
	@Override
	public String toString() {
		return "Nome do livro: " + nome + "\nEdição: " + edicao + "\nValor: " + valor;
	}

}
