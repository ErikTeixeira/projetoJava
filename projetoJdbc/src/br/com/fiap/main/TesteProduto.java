package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecoes.Excecao;

public class TesteProduto {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
		

	public static void main(String[] args) throws Excecao {

	List<Produto> listaProdutos = new ArrayList<Produto>();
	
	Produto objProduto = null;
	
	//Entrada
	do {
		
		try {
			
			objProduto = new Produto();
			objProduto.setCodigo(inteiro("Código"));
			objProduto.setTipo(texto("Tipo"));
			objProduto.setMarca(texto("Marca"));
			objProduto.setValorCompra(real("Valor Compra"));
			objProduto.setValorVenda(real("Valor Venda"));
			
			listaProdutos.add(objProduto);
			
		} catch (Exception e) {
			
			throw new Excecao(e);
			
		} finally {
			
			System.out.println("OK");
			
		}
		
		
	} while ( JOptionPane.showConfirmDialog(null, "Adicionar Produto?", "Carrinho de Produtos",
			JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE ) == 0);
	
	//Saida   - foreach
	for (Produto produto : listaProdutos) {
		
		System.out.println("Código: "+ produto.getCodigo() +
				"\nTipo: "+ produto.getTipo() +
				"\nMarca: "+ produto.getMarca() +
				"\nValor Compra: "+ produto.getValorCompra() +
				"\nValor Venda: "+ produto.getValorVenda());
		
	}
	
	
	}

	
}
