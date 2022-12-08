package Meu;

abstract class Pessoa { 
	
	protected String nome;
	protected String cpf;
	protected double numero;
	
	
	//MÉTODOS GET E SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	


}
