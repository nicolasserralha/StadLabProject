package br.com.stadlab.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="equipamento")
	private Collection<Medicao> medicoes;


}
