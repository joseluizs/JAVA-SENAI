package principal;

import javax.swing.JOptionPane;

import entities.Filme;

public class Program {

	public static void main(String[] args) {
		 // Solicita os dados do livro utilizando a classe JOptionPane
        String titulo = JOptionPane.showInputDialog("Informe o t�tulo do Filme:");
        int edicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a classifica��o:"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do filme:"));

        // Cria o objeto Livro com os dados informados
        Filme filme = new Filme(titulo, edicao, valor);

        // Exibe os dados do livro cadastrado
        filme.exibirDados();

	}

}
