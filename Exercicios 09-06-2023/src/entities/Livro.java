package entities;

import javax.swing.JOptionPane;

public class Livro {

	private String titulo;
	private String edicao;
	private double valor;

	public Livro(String titulo, String edicao, double valor) {
		this.titulo = titulo;
		this.edicao = edicao;
		this.valor = valor;
		if (valor > 100) {
			this.valor += this.valor * 0.3; // Adiciona 30% de imposto caso o valor seja superior a 100
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		if (valor > 100) {
			this.valor += this.valor * 0.3; // Atualiza o valor com a taxa de 30% de imposto, se necessário
		}
	}

	public void exibirDados() {
		String mensagem = "Título: " + titulo + "\n" + "Edição: " + edicao + "\n" + "Valor: R$" + valor;
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
