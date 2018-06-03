package br.com.stadlab.dao.impl;

import org.springframework.stereotype.Repository;
import br.com.stadlab.dao.ClienteDAO;
import br.com.stadlab.model.Cliente;

@Repository
public class ClienteDAOimpl extends GenericDAOimpl<Cliente, Integer> implements ClienteDAO{

}
