package br.com.stadlab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_estabelecimento")
public class Estabelecimento {
	
	@Id
	@Column(name="id_estabelecimento")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="estabelecimento")
	@SequenceGenerator(name="estabelecimento",sequenceName="SQ_T_ESTABELECIMENTO",allocationSize=1)
	private Integer id;
	
	@Column(name="ds_endereco", length=100, nullable=false)
	private String endereco;
	
	@Column(name="ds_bairro", length=40, nullable=false)
	private String bairro;
	
	@Column(name="ds_cidade", length=40, nullable=false)
	private String cidade;
	
	@Column(name="ds_uf", length=40, nullable=false)
	private String uf;
	
	@Column(name="ds_cep", length=9, nullable=false)
	private String cep;
	
	@Column(name="ds_complemento", length=100, nullable=false)
	private String complemento;
	
	@JoinColumn(name = "id_tp_estabelecimento")
	@ManyToOne
	private TipoEstabelecimento tipo;
	
	@JoinColumn(name = "id_cliente")
	@ManyToOne
	private Cliente cliente;
	
	public Estabelecimento() {
		super();
	}

	public Estabelecimento(Integer id, String endereco, String bairro, String cidade, String uf, String cep,
			String complemento, TipoEstabelecimento tipo) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.complemento = complemento;
		this.tipo = tipo;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return uf;
	}

	public void setUF(String uf) {
		this.uf = uf;
	}

	public String getCEP() {
		return cep;
	}

	public void setCEP(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public TipoEstabelecimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEstabelecimento tipo) {
		this.tipo = tipo;
	}

}
 