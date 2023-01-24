package iniflex;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario extends Pessoa {
	private Locale localeBR;
	private BigDecimal salario;
	private String funcao;
	
	public Funcionario(String nome, String dataNascimento, String salario, String funcao) {
		super(nome, dataNascimento);
		this.salario = new BigDecimal(salario);
		this.funcao = funcao;
		this.localeBR = new Locale("pt", "BR");
	}
	
	public String getSalario() {
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(this.localeBR);
		return dinheiro.format(this.salario);
	}
	
	public double getSalarioDouble() {
		return (this.salario).doubleValue();
	}
	
	public String getFuncao() {
		return this.funcao;
	}
	
	public void setSalario(String salario) {
		this.salario = new BigDecimal(salario);
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
