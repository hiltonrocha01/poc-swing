package br.com.aevc.pocswing.model;

public class Usuario {
	
	private String nome;
	private Integer idade;
	private String matricula;
	
	private String senha;
	
	public Usuario() {
	}
	
	public void autenticarse() {
		
	}
	
	public void fazerLogoff() {
		
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
