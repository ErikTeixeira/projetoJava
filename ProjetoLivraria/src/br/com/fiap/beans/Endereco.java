package br.com.fiap.beans;

public class Endereco {
	
	/*
	 *  {
      "cep": "01001-000",
      "logradouro": "Praça da Sé",
      "complemento": "lado ímpar",
      "bairro": "Sé",
      "localidade": "São Paulo",
      "uf": "SP",
      "ibge": "3550308",
      "gia": "1004",
      "ddd": "11",
      "siafi": "7107"
    }
           
	 */
	
	private String cep;
	private String logradouro;
	private String bairro;
	private String localidade;

	
	
	public Endereco() {
		super();
	}



	public Endereco(String cep, String logradouro, String bairro, String localidade) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
	}



	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", localidade="
				+ localidade + "]";
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getLocalidade() {
		return localidade;
	}



	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	
	
	
	
}
