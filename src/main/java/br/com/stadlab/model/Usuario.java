package br.com.stadlab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	public Usuario() {
		super();
	}

	public Usuario(Integer id, String usuario, String senha) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
	}

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuario")
	@SequenceGenerator(name="usuario",sequenceName="SQ_T_USUARIO",allocationSize=1)
	private Integer id;
	
	@Column(name="ds_usuario", length=50, nullable=false)
	private String usuario;
	
	@Column(name="ds_senha", length=50, nullable=false)
	private String senha;
	
	@OneToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}