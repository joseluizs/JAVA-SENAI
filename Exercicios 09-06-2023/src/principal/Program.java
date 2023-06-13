package principal;

import javax.swing.JOptionPane;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		 // Solicita os dados do livro utilizando a classe JOptionPane
        String titulo = JOptionPane.showInputDialog("Informe o título do livro:");
        String edicao = JOptionPane.showInputDialog("Informe a edição do livro:");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do livro:"));

        // Cria o objeto Livro com os dados informados
        Livro livro = new Livro(titulo, edicao, valor);

        // Exibe os dados do livro cadastrado
        livro.exibirDados();

	}

}
