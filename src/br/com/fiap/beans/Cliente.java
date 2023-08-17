package br.com.fiap.beans;

public class Cliente {
	
	private String nome;
	private String email;
	private int idade;
	private double renda;
	
		
	public Cliente() {
		super();
	}


	public Cliente(String nome, String email, int idade, double renda) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}


	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}


	/**
	 * @return the renda
	 */
	public double getRenda() {
		return renda;
	}


	/**
	 * @param renda the renda to set
	 */
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	

}
