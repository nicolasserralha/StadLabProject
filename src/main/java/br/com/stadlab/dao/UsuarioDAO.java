package br.com.stadlab.dao;

import br.com.stadlab.model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{
	
	public Usuario existeUsuario(String email, String senha) throws Exception;
	
}
