package br.com.stadlab.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_medicao")
public class Medicao {
	
	@Id
	@Column(name="id_medicao")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="medicao")
	@SequenceGenerator(name="medicao",sequenceName="SQ_T_MEDICAO",allocationSize=1)
	private Integer id;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_medicao")
	private Calendar dataCriacao;
	
	@JoinColumn(name="id_equipamento")
	@ManyToOne
	private Equipamento equipamento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	
	
}
