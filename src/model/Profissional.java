package model;

public class Profissional {
	private int idProfissional;
	private String nome;
	private int cro;
	private String funcao;
	private String senha;
	
	public int getIdProfissional() {
		return idProfissional;
	}
	
	public void setIdProfissional(int idProfissional) {
		this.idProfissional = idProfissional;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCro() {
		return cro;
	}
	
	public void setCro(int cro) {
		this.cro = cro;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
