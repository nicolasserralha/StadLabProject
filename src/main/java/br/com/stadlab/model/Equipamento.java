package br.com.stadlab.model;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_equipamento")
public class Equipamento {

	@Id
	@Column(name="id_equipamento")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="equipamento")
	@SequenceGenerator(name="equipamento",sequenceName="SQ_T_EQUIPAMENTO",allocationSize=1)
	private Integer id;
	
	@Column(name="ds_nome", length=50, nullable=false)
	private String nome;
	
	@Column(name="ds_descricao", length=100, nullable=true)
	private String descricao;
	
	@JoinColumn(name = "id_estabelecimento")
	@OneToOne
	private Estabelecimento estabelecimento;
	
	@OneToMany(mappedBy="equipamento")
	private Collection<Medicao> medicoes;
	

	public Equipamento() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Collection<Medicao> getMedicoes() {
		return medicoes;
	}

	public void setMedicoes(Collection<Medicao> medicoes) {
		this.medicoes = medicoes;
	}

	
}
