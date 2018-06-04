package br.com.stadlab.bean;

import javax.ejb.Stateful;

import org.springframework.stereotype.Component;
import br.com.stadlab.model.Usuario;

@Component
@Stateful
public class UsuarioBean {
	
	private Usuario usuario;
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
