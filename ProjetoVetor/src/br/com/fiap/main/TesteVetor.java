package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	
	//Static
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	
	public static void main(String[] args) {

		Produto vetorProduto[] = new Produto[5];
		
		int indice = 0;
		
		do {
			//instanciar objetos
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Tipo de Produto"));
			vetorProduto[indice].setMarca(texto("Marca de Produto"));
			vetorProduto[indice].setQuantidade(inteiro("Quantidade"));
			vetorProduto[indice].setValor(real("Valor"));
			
			indice ++;
			
		} while (JOptionPane.showConfirmDialog(null, "Adicionar Produto no Carrinho?", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
 //Sempre null
 //Determina se e sim ou não, fez a pergunta e fez o titulo, fez o botão sim ou não, 0 e sim, 1 e não
	
		for(int contador = 0; contador < indice; contador++) {
			System.out.println("Tipo: "+ vetorProduto[contador].getTipo() +
					"\nMarca: "+ vetorProduto[contador].getMarca() +
					"\nQuantidade: "+ vetorProduto[contador].getQuantidade() +
					"\nValor: "+ vetorProduto[contador].getValor());
		}
	}

}
