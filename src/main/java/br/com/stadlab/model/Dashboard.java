package br.com.stadlab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_dashboard")
public class Dashboard {

	@Id
	@Column(name="id_dashboard")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="dashboard")
	@SequenceGenerator(name="dashboard",sequenceName="SQ_T_DASHBOARD",allocationSize=1)
	private Integer id;
	
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@Column(name="id_equipamento")
	private Integer idEquipamento;
	
	@Column(name="id_estabelecimento")
	private Integer idEstabelecimento;
	
	@Column(name="id_Medicao")
	private Integer idMedicao;
	
	public Dashboard() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Integer idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public Integer getIdEstabelecimento() {
		return idEstabelecimento;
	}

	public void setIdEstabelecimento(Integer idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public Integer getIdMedicao() {
		return idMedicao;
	}

	public void setIdMedicao(Integer idMedicao) {
		this.idMedicao = idMedicao;
	}

}
