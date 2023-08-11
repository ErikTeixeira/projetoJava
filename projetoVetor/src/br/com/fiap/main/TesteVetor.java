package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {

	//metodo static
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	//static para calculo
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		
		for(int cont = 0; cont < i; cont++) {
			total += p[cont].getValor() * p[cont].getQuantidade();
		}
		
		return total;
	}
	
		
	public static void main(String[] args) {
		
		Produto[] vetorProduto = new Produto[3];
		
		int indice = 0;
		
		//Entrada
		do {
			
			vetorProduto[indice] = new Produto();
			
			vetorProduto[indice].setTipo(texto("Tipo de produto"));
			vetorProduto[indice].setMarca(texto("Marca"));
			vetorProduto[indice].setQuantidade(inteiro("Quantidade"));
			vetorProduto[indice].setValor(real("Valor"));
		
			indice ++;
			
		} while (JOptionPane.showConfirmDialog(null, "Adicionar Produto?", "Carrinho de Compras", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
	
		
		//Saida
		for (int contador = 0; contador < indice; contador++) {
			
			System.out.println("Tipo: " + vetorProduto[contador].getTipo() +
					"\nMarca: "+ vetorProduto[contador].getMarca() +
					"\nQuantidade: "+ vetorProduto[contador].getQuantidade() +
					"\nValor: "+ vetorProduto[contador].getValor());
		}
		
		
		//saida static conta
		System.out.println("\nValor total: "+ valorTotal(vetorProduto, indice));
		
	}

}
