package facebook.core;

/**
 * Classe representa um usu�rio do facebook
 * 
 * @author Gustavo
 *
 */
public class Usuario {
	private String nome;
	private String email;
	private String senha;

	/**
	 * Construtor da classe Usuario
	 * @param nome nome do usu�rio
	 * @param email email do usu�rio 
	 * @param senha senha do usu�rio
	 * @throws Exception 
	 */
	public Usuario(String nome, String email, String senha) throws Exception {
		if (nome == null || nome.equals(""))
			throw new Exception();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public boolean equals(Object outro) {
		if (!(outro instanceof Usuario))
			return false;

		Usuario outroUsuario = (Usuario) outro;
		if (this.email.equals(outroUsuario.getEmail())) {
			return true;
		}

		return false;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public String getSenha() {
		return this.senha;
	}

}
