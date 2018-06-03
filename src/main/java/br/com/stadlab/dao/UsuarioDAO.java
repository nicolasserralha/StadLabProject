package br.com.stadlab.dao;

import br.com.stadlab.model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{
	public Object buscarPorEmail(String email);
}
