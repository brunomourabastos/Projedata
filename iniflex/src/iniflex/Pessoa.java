package iniflex;

public class Pessoa {
	private String nome;
	private Data dataNascimento;
	
	public Pessoa(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = new Data(dataNascimento);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Data getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
