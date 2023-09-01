package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDao;

public class TesteCadastrarDao {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ProdutoDao dao = new ProdutoDao();
		
		Produto objProduto = new Produto();
		
		objProduto.setCodigo(inteiro("Código"));
		objProduto.setTipo(texto("Tipo"));
		objProduto.setMarca(texto("Marca"));
		objProduto.setValorCompra(real("Valor Compra"));
		objProduto.setValorVenda(real("Valor Venda"));

		
		System.out.println(dao.inserir(objProduto));
		
	}

}
