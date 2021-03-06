package aula3;

import static org.junit.Assert.*;

import org.junit.Test;

import aula3.core.oo.Cliente;
import aula3.core.oo.Conta;

public class ContaTest {

	@Test
	public void testDepositar() throws Exception {
		double valorDepositado = 100;
		
		Conta conta = new Conta("1234", "123456", 0, new Cliente("L�lian", "123553452"));
		conta.depositar(valorDepositado);
		assertEquals(valorDepositado, conta.getSaldo(),1);
	}

	@Test(expected = Exception.class)
	public void testDepositarValorNegativo() throws Exception {
		double valorDepositado = -100;
		Conta conta = new Conta("1234", "123456", 0, new Cliente("L�lian", "123553452"));
		conta.depositar(valorDepositado);
	}
	
	@Test
	public void testSacar() throws Exception {
		double valor= 100;
		Conta conta = new Conta("1234", "123456", 200, new Cliente("L�lian", "123553452"));
		conta.sacar(valor);
		assertEquals(100, conta.getSaldo(),1);
	}
	
	@Test(expected = Exception.class)
	public void testSacarSaldoInsuficiente() throws Exception {
		double valor= 100;
		Conta conta = new Conta("1234", "123456", 0, new Cliente("L�lian", "123553452"));
		conta.sacar(valor);
	}

}
