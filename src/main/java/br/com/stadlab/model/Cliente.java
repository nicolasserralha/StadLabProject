package br.com.stadlab.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Entity
@Table(name="tb_cliente")
public class Cliente implements Serializable {
	   
	@Id
	@Column(name="id_cliente")
	private Integer id;
	
	@Column(name="nr_celular")
	private String celular;
	
	@Column(name="nr_cpf")
	private String cpf;
	
	@Column(name="ds_email")
	private String email;
	
	@Column(name="ds_nome")
	private String nome;
	
	private static final long serialVersionUID = 1L;

	public Cliente() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   
}
