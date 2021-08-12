package br.com.aevc.pocswing.model;

public class Usuario {
	
	private String nome;
	private Integer idade;
	private String matricula;
	
	private String senha;
	
	public Usuario(String nome, Integer idade, String matricula, String senha) {
		setNome(nome);
		setIdade(idade);
		setMatricula(matricula);
		setSenha(senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if (!nome.isEmpty() && !nome.isBlank()) {
			String[] palavras = nome.split("\\s");
			StringBuilder nomeBuilder = new StringBuilder();

			for (String palavra : palavras) {
				if(palavra.length() > 0) {
					palavra = palavra.trim();
					String primeiraLetra = palavra.substring(0, 1);
					String restanteDaPalavra = palavra.substring(1);
					nomeBuilder.append(primeiraLetra.toUpperCase()).append(restanteDaPalavra.toLowerCase()).append(" ");
				}
			}

			this.nome = nomeBuilder.toString().trim();
		} else {
			this.nome = nome;
		}
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

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", matricula='" + matricula + '\'' +
				", senha='" + senha + '\'' +
				'}';
	}
}
