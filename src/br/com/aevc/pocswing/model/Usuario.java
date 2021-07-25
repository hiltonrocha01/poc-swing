package br.com.aevc.pocswing.model;

public class Usuario {
	
	private String nome;
	private Integer idade;
	private String matricula;
	
	protected String senha;
	
	public Usuario(String nome, Integer idade, String matricula, String senha) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.senha = senha;
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
	
	
	
}
