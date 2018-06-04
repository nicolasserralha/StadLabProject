package br.com.stadlab.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.stadlab.dao.UsuarioDAO;
import br.com.stadlab.model.Usuario;

@Repository
public class UsuarioDAOimpl extends GenericDAOimpl<Usuario, Integer> implements UsuarioDAO {

	public Usuario existeUsuario(String email, String senha) throws Exception {
		try {
			Object objeto = em.createQuery("select e from Usuario e " + "where e.usuario like :email")
					.setParameter("email", "%"+email+"%").getSingleResult();
			Usuario usuarioBanco = (Usuario) objeto;
			if(objeto != null) {
				if (email.equals(usuarioBanco.getUsuario()) 
						&& senha.equals(usuarioBanco.getSenha())) {
					return usuarioBanco;
				}
			}	
		}catch (Exception e) {
			throw new Exception("Problema ao recuperar usuário");
		}
		return null;
	}
}



