package principal;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do funcionário:"));
		double inss = salarioBase * 0.05;
		double ir = salarioBase * 0.11;
		double salarioLiquido = salarioBase - inss - ir;

		JOptionPane.showMessageDialog(null, "Desconto de INSS: R$ " + inss + "\nDesconto de IR: R$ " + ir
				+ "\nSalário líquido: R$ " + salarioLiquido);
	}

}
