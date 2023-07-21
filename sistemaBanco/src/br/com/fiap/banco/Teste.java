package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		// Conta  corrente
		ContaCorrente cc = new ContaCorrente();
		
		cc.setAgencia(123);
		cc.setNumero(321);
		cc.setTipo("PF");
		cc.setChequeEspecial(1000);
		
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Conta 1: "+ conta1.getSaldo());
		System.out.println("Conta 2: "+ conta2.getSaldo());
		System.out.println("Conta 3: "+ conta3.getSaldo());
	}
	
}
