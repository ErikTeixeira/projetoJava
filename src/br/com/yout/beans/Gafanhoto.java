package br.com.yout.beans;

public class Gafanhoto extends Pessoa{

	private String login;
	private int totAssistido;
	
	
	//Constructor
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	
	
	//Getters e Setters
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}


	@Override
	public String toString() {

		return "Gafanhoto{" + super.toString() + "\n loing=" + login + ", totAssistido=" + totAssistido + " }";
	}
	
}
