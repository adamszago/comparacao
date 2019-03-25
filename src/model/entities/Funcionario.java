package model.entities;

public class Funcionario implements Comparable<Funcionario>{

	private String nome;
	private Double salario;
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario o) {
		return this.nome.compareTo(o.getNome());
	}

	@Override
	public String toString() {
		return "Nome: "+ this.nome + " salário: " + this.salario;
	}
	
	
	
	
}
