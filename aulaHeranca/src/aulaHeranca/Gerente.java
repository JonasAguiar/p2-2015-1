package aulaHeranca;

public class Gerente extends FuncionarioAutenticavel {
	
	private int numeroDeProjetos;
	private final double bonusPorProjeto = 2000;
	
	public Gerente(String nome, int numeroDeProjetos) throws Exception {
		super(nome);
		this.numeroDeProjetos = numeroDeProjetos;
		this.salarioBase = 5000;
	}

	public int getNumeroDeProjetos() {
		return numeroDeProjetos;
	}

	@Override
	public double calculaSalario() {
		return salarioBase + numeroDeProjetos * bonusPorProjeto;
	}

}
