package entities;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private String telefone;
	
	public Pessoa(String nome, Integer idade, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa Nome = " + nome + ", idade = " + idade + ", telefone = " + telefone + "\n";
	}

}
