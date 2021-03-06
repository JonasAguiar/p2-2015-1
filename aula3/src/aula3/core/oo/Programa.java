package aula3.core.oo;

import aula3.ui.TelaDeCaixaAutomatico;

public class Programa {
	
	public static void main(String[] args) {
		
		TelaDeCaixaAutomatico tela = new TelaDeCaixaAutomatico();
		Cliente cliente1 = new Cliente("Joao","4325543532");
		Conta conta1 = new Conta("1234-5","123142-1",0, cliente1);
		Cliente cliente2 = new Cliente("Maria", "423587436");
		Conta conta2 = new Conta("1987-5","198742-7",200.50,cliente2);
		
		String contaEscolhida = tela.exibeMenuEscolhaDeConta();
		if (contaEscolhida.equals(conta1.getNumero())) {
			tela.exibeMenuDeOperacoes(conta1);
		} else if (contaEscolhida.equals(conta2.getNumero())) {
			tela.exibeMenuDeOperacoes(conta2);
		} else {
			tela.exibeMensagemDeErro();
		}
	}
}
