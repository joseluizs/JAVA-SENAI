package entities;

import javax.swing.JOptionPane;

public class Filme {

	private String tituloFilme;
	private int classificacao;
	private double valor;

	public Filme(String tituloFilme, int classificacao, double valor) {
		this.tituloFilme = tituloFilme;
		this.classificacao = classificacao;
		this.valor = valor;
		if (valor > 100) {
			this.valor += this.valor * 0.2; // Adiciona 30% de imposto caso o valor seja superior a 100
		}
	}

	public String getTitulo() {
		return tituloFilme;
	}

	public void setTitulo(String tituloFilme) {
		this.tituloFilme = tituloFilme;
	}

	public int getEdicao() {
		return classificacao;
	}

	public void setEdicao(int classificacao) {
		this.classificacao = classificacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		if (valor > 100) {
			this.valor += this.valor * 0.2; // Atualiza o valor com a taxa de 30% de imposto, se necessário
		}
	}

	public void exibirDados() {
		String mensagem = "Título do Filme: " + tituloFilme + "\n" + "Classificação: " + classificacao + "\n" + "Valor filme: R$" + valor;
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
