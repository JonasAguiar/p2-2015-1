package aula3.ui;

import java.util.Scanner;

import aula3.core.oo.Conta;

public class TelaDeCaixaAutomatico {

	private Scanner sc;
	
	public TelaDeCaixaAutomatico() {
		this.sc = new Scanner(System.in);
	}
	
	public String exibeMenuEscolhaDeConta() {
		System.out.println("Digite o numero da conta");
		String contaEscolhida = sc.next();
		return contaEscolhida;
	}

	public void exibeMenuDeOperacoes(Conta conta) {
		System.out.println("Digite 1 para depositar ou 2 para sacar");
		int opcao = sc.nextInt();
		System.out.println("Digite o valor");
		double valor = sc.nextDouble();
		if (opcao == 1) {
			conta.depositar(valor);
			System.out.println("Saldo atual: " + conta.getSaldo());
		} else if (opcao == 2) {
			conta.sacar(valor);
			System.out.println("Saldo atual: " + conta.getSaldo());
		} else {
			System.out.println("Op��o incorreta.");
		}
	}
	
	public void exibeMensagemDeErro() {
		System.out.println("Conta n�o encontrada");
	}
}
