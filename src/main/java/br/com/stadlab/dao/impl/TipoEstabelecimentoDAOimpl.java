package br.com.stadlab.dao.impl;

import org.springframework.stereotype.Repository;
import br.com.stadlab.dao.TipoEstabelecimentoDAO;
import br.com.stadlab.model.TipoEstabelecimento;

@Repository
public class TipoEstabelecimentoDAOimpl extends GenericDAOimpl<TipoEstabelecimento, Integer> implements TipoEstabelecimentoDAO{
	@Override
	public TipoEstabelecimento buscarTexto(String tipo) {
		tipo = tipo.toUpperCase();
		return em.createQuery("SELECT c FROM TipoEstabelecimento c WHERE c.nome LIKE :custName", TipoEstabelecimento.class).setParameter("custName", tipo).getSingleResult(); 
	}
}
