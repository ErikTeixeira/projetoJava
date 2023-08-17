package br.com.fiap.main;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteVetor {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double totalRenda(List<Cliente> listaCl , Cliente cl) {
		double total = 0;
		
		for (Cliente c : listaCl) {
			total += c.getRenda();
		}
		return total;
	}

	public static void main(String[] args) {
		
		Cliente[] vetCliente = new Cliente[3];
		
		int indice = 0;
		
		int continuar = 0;
		
		// Entrada (indice)
		while( continuar == 0 ) {
			vetCliente[indice] = new Cliente();
			
			vetCliente[indice].setNome(texto("Nome"));
			vetCliente[indice].setEmail(texto("Email"));
			vetCliente[indice].setIdade(inteiro("Idade"));
			vetCliente[indice].setRenda(real("Renda"));
			
			indice ++;
			
			continuar = JOptionPane.showConfirmDialog(null, "Cadastrar Cliente", "Cadastro Cliente", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
			
		}
		
		// Saida (contador)
		for ( int contador = 0; contador < indice; contador++) {
			
			System.out.println("Nome: "+ vetCliente[contador].getNome() +
					"\nEmail: "+ vetCliente[contador].getEmail() +
					"\nIdade: "+ vetCliente[contador].getIdade() +
					"\nRenda: "+ vetCliente[contador].getRenda());
			
		}
		
		System.out.println("\nRenda total: "+ totalRenda(null, null));
		
		
	}

}
