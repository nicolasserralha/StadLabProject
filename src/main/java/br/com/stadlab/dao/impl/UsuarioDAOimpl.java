package br.com.stadlab.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.stadlab.dao.UsuarioDAO;
import br.com.stadlab.model.Usuario;

@Repository
public class UsuarioDAOimpl extends GenericDAOimpl<Usuario, Integer> implements UsuarioDAO {

	public Object buscarPorEmail(String email) {
		return em.createQuery("select e from Usuario e " + "where e.usuario like :email").setParameter("email", "%"+email+"%").getSingleResult();
	}
}



