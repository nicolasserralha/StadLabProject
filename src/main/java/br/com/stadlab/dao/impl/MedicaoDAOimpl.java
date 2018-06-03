package br.com.stadlab.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.stadlab.dao.MedicaoDAO;
import br.com.stadlab.model.Medicao;

@Repository
public class MedicaoDAOimpl extends GenericDAOimpl<Medicao, Integer> implements MedicaoDAO{

}
