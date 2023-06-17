package entities;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String sexo;
	private String departamento;
	private double salario;

	public Funcionario(String nome, int idade, String sexo, String departamento, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public void aplicarBonificacao() { }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return  "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Sexo: " + sexo + "\n" +
                "Departamento: " + departamento + "\n" +
                "Salário: R$" + salario + "\n";
	}

}
