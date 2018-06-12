package br.com.stadlab.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import br.com.stadlab.dao.ClienteDAO;
import br.com.stadlab.dao.UsuarioDAO;
import br.com.stadlab.model.Cliente;
import br.com.stadlab.model.Usuario;

@Controller
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteDAO dao;
	
	@Autowired
	private UsuarioDAO daoUsuario;
	
	@GetMapping("cadastrar")
    public String cadastro() {
        System.out.println("Executando a lógica com Spring MVC");
        
        return "cliente/cadastrar";
    }

/*	Após um post, é recomendado fazer um redirect ao invés de forward (que devolve a mesma requisição que o usuario usou para cadastrar), 
	para criar uma nova requisição, evitando que o usuario aperta F5 e cadastre 2 vezes. */
	@PostMapping("cadastrar")
	@Transactional
    public ModelAndView cadastrar(Cliente cliente, RedirectAttributes attr, HttpServletRequest req) {
    	
		try {
			Usuario usuario = new Usuario();
			String teste = req.getParameter("senha");
			dao.cadastrar(cliente);
			Integer idCliente = cliente.getId();
			usuario.setCliente(dao.buscar(idCliente));
			usuario.setUsuario(cliente.getEmail());
			usuario.setSenha(teste);
        	daoUsuario.cadastrar(usuario);
    	} catch (Exception e){
    		e.printStackTrace();
    		return new ModelAndView("cliente/cadastrar");
    	}
    	
    	attr.addFlashAttribute("msg", "Cadastrado com sucesso!");
    	attr.addFlashAttribute("sucesso", 1);
        return new ModelAndView("redirect:/cliente/cadastrar");
    }

}
