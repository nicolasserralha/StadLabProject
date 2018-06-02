package br.com.stadlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.stadlab.dao.ClienteDAO;
import br.com.stadlab.model.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	ClienteDAO clienteDAO;

	@Transactional
	public void cadastrar(Cliente cliente) {	
		try {
			clienteDAO.cadastrar(cliente);
		} catch (Exception e) {
			System.out.println("deu erro aqui na ClienteService");
			e.printStackTrace();
		}
	}
}
