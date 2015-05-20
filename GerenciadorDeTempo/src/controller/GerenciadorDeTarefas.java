package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import core.Tarefa;
import core.Usuario;

public class GerenciadorDeTarefas {

	private List<Usuario> usuarios;
	
	public GerenciadorDeTarefas() {
		usuarios = new ArrayList<Usuario>();
	}
	public Usuario login(String nome, String senha) throws Exception {
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nome)) {
				if (usuario.getSenha().equals(senha)) {
					return usuario;
				} else {
					throw new Exception("Senha do usu�rio est� incorreta");
				}
			}
		}
		throw new Exception("Usu�rio n�o existe");
	}
	public void cadastrarUsuario(String nome, String senha) throws Exception {
		Usuario usuario = new Usuario(nome, senha);
		if (usuarios.contains(usuario))
			throw new Exception("Usu�rio j� est� cadastrado.");
		usuarios.add(usuario);
	}
	public void cadastraTarefa(Usuario usuarioAtual, String nome, int tempo) {
		Tarefa tarefa = new Tarefa(nome, tempo);
		usuarioAtual.cadastraTarefa(tarefa);
	}
	public HashMap<String,ArrayList<Tarefa>> getTarefasDe(Usuario usuario) {
		HashMap<String,ArrayList<Tarefa>> tarefasPorNome = usuario.getTarefasPorNome();
		return tarefasPorNome;
	}

}
