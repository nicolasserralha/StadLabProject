package br.com.stadlab.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.stadlab.dao.GenericDAO;

public class GenericDAOimpl<T,K> implements GenericDAO<T, K>{
	
	@PersistenceContext
	protected EntityManager em;
	
	private Class<T> classe;
	
	@SuppressWarnings("unchecked")
	public GenericDAOimpl() {
		classe = (Class<T>) ((ParameterizedType) getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void cadastrar(T entidade) {
		em.persist(entidade);
	}

	public void atualizar(T entidade) {
		em.merge(entidade);
	}

	public void remover (K codigo) throws Exception {
		T entidade = buscar(codigo);
		if (entidade == null){
			throw new Exception("Codigo invalido");
		}
		em.remove(entidade);
	}
	
	public List<T> listar(){
		return em.createQuery("from " + classe.getName(), classe).getResultList();
	}

	public T buscar(K codigo) {
		return em.find(classe,codigo);
	}

/*	public void commit() throws Exception {
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e){
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.printStackTrace();
			throw new Exception("Erro no commit");
		}
	}*/
		
}