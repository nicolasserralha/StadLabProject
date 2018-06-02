package br.com.stadlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.stadlab.model.Cliente;
import br.com.stadlab.service.ClienteService;

@Controller
@RequestMapping("cliente")
public class ClienteController {
	
	private ClienteService cs = new ClienteService();
	
    /*@RequestMapping(value = "cadastro", method=RequestMethod.GET)*/
	@GetMapping("cadastro")
    public String cadastro() {
        System.out.println("Executando a lógica com Spring MVC");
        return "cliente/cadastro";
    }
    
    /*@RequestMapping(value = "cadastro", method=RequestMethod.POST)*/ 
/*	Após um post, é recomendado fazer um redirect ao invés de forward (que devolve a mesma requisição que o usuario usou para cadastrar), 
	para criar uma nova requisição, evitando que o usuario aperta F5 e cadastre 2 vezes. */
	@PostMapping("cadastro")
    public ModelAndView cadastrar(Cliente cliente, RedirectAttributes attr) {
    	
		try {
    		cliente.setId(9999);
        	cs.cadastrar(cliente);
    	} catch (Exception e){
    		e.printStackTrace();
    		return new ModelAndView("cliente/cadastro");
    	}
    	
    	attr.addFlashAttribute("msg", "Cadastrado com sucesso!");
        return new ModelAndView("redirect:/cliente/cadastro");
    }

}
