package entities;

public class Secretaria extends Funcionario{
	
	public Secretaria(String nome, int idade, String sexo, String departamento, double salario) {
        super(nome, idade, sexo, departamento, salario);
    }
	
    @Override
    public void aplicarBonificacao() {
        double salarioComBonificacao = getSalario() + 150;
        setSalario(salarioComBonificacao);
    }

}
