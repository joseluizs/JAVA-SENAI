package entities;

public class Gerente extends Funcionario{
	
	
	
	public Gerente(String nome, int idade, String sexo, String departamento, double salario) {
        super(nome, idade, sexo, departamento, salario);
    }

    @Override
    public void aplicarBonificacao() {
        double salarioComBonificacao = getSalario() + 500;
        setSalario(salarioComBonificacao);
    }
	
}
