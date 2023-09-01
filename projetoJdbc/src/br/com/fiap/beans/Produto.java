package br.com.fiap.beans;

public class Produto {
	
	private int codigo;
	private String tipo;
	private String marca;
	private double valorVenda;
	private double valorCompra;
	
	
	public Produto() {
		super();
	}


	public Produto(int codigo, String tipo, String marca, double valorVenda, double valorCompra) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the valorVenda
	 */
	public double getValorVenda() {
		return valorVenda;
	}


	/**
	 * @param valorVenda the valorVenda to set
	 */
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}


	/**
	 * @return the valorCompra
	 */
	public double getValorCompra() {
		return valorCompra;
	}


	/**
	 * @param valorCompra the valorCompra to set
	 */
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	
	

}
