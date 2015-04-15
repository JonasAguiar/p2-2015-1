package aula3.core.oo;

public class Conta {

	private Cliente titular;
	private String agencia;
	private String numero;
	private double saldo;

	public Conta(String ag, String numero, double saldo, Cliente titular) {
		this.agencia = ag;
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
}
