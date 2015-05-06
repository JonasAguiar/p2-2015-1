package facebook.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Facebook {

	private ArrayList<Usuario> listaDeUsuarios;

	public Facebook() {
		listaDeUsuarios = new ArrayList<Usuario>();
	}

	/**
	 * Cadastra um usu�rio
	 * 
	 * @param nome
	 *            nome do usu�rio
	 * @param email
	 *            email do usu�rio
	 * @param senha
	 *            senha do usu�rio
	 * @return returna true se usu�rio foi cadastrado com sucesso. Caso
	 *         contr�rio, falso.
	 */
	public void cadastraUsuario(String nome, String email, String senha) throws Exception {
		Usuario usuario = new Usuario(nome, email, senha);
		if (listaDeUsuarios.contains(usuario))
			throw new Exception("Usu�rio j� cadastrado.");
		listaDeUsuarios.add(usuario);

	}

	public boolean usuarioExiste(Usuario usuario) {
		for (Usuario usuarioAtual : listaDeUsuarios) {
			if (usuarioAtual.equals(usuario))
				return true;
		}
		return false;
	}
	
	public void removeUsuario(String email) {
		Iterator<Usuario> iterator = listaDeUsuarios.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getEmail().equals(email))
				iterator.remove();
		}
	}
	
	public boolean removeUsuario(Usuario usuario) {
		return listaDeUsuarios.remove(usuario);
	}
}
