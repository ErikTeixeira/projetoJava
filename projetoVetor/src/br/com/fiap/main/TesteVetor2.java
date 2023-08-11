package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor2 {

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
		
		Produto[] vetProduto = new Produto[3];
		
		int indice = 0;
		
		int continuar = 0;
		
		while (continuar == 0) {
			
			vetProduto[indice] = new Produto();
			vetProduto[indice].setTipo(texto("Tipo"));
			vetProduto[indice].setMarca(texto("Marca"));
			vetProduto[indice].setQuantidade(inteiro("Quantidade"));
			vetProduto[indice].setValor(real("Valor"));
			
			indice++;
			
			continuar = JOptionPane.showConfirmDialog(null, "Adicionar Produto?", "Carrinho de Compras", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
		}
		
		for (int contador = 0; contador < indice; contador++) {
			
			System.out.println("Tipo: "+ vetProduto[contador].getTipo() +
					"\nMarca: "+ vetProduto[contador].getMarca() +
					"\nQuantidade: "+ vetProduto[contador].getQuantidade() +
					"\nValor: "+ vetProduto[contador].getValor());
			
		}
		
		
		System.out.println("\nValor Total: "+ valorTotal(vetProduto, continuar));
		
	}

}
