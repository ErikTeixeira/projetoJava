package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;


public class TesteCliente {
	
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
		
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		
		// Determinamos que o objetoCliente seja null
		Cliente objCliente = null;
		
		int continuar = 0;
		
		// Entrada
		while(continuar == 0) {
			
			objCliente = new Cliente();
			objCliente.setNome(texto("Digite o nome"));
			objCliente.setEmail(texto("Digite o email"));
			objCliente.setIdade(inteiro("Digite a idade"));
			objCliente.setRenda(real("Digite a renda"));
			
			listaCliente.add(objCliente);
			
			continuar = JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?", "Cadastro de Clientes", 
					JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE );
			
		}
		
		// Saidas  - Foreach
		for (Cliente cliente : listaCliente) {
			
			System.out.println("Nome: " + cliente.getNome() +
					"\nEmail: " + cliente.getEmail() +
					"\nIdade: "+ cliente.getIdade() +
					"\nRenda: "+ cliente.getRenda() +
					"\n");
		}
		
		System.out.println("Total Renda: "+ totalRenda(listaCliente, objCliente));
		
	}

}
