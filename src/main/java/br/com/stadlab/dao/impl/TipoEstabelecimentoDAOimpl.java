package br.com.stadlab.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.stadlab.dao.TipoEstabelecimentoDAO;
import br.com.stadlab.model.TipoEstabelecimento;

@Repository
public class TipoEstabelecimentoDAOimpl extends GenericDAOimpl<TipoEstabelecimento, Integer> implements TipoEstabelecimentoDAO{
	@Override
	public TipoEstabelecimento buscarTexto(String tipo) {
		return em.createQuery("FROM TipoEstabelecimento WHERE nome like '%"+tipo.toUpperCase()+"%'",TipoEstabelecimento.class).getSingleResult();
	}
}
