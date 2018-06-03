package br.com.stadlab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import br.com.stadlab.dao.UsuarioDAO;
import br.com.stadlab.model.Usuario;

@Controller
public class LoginController {

	@Autowired
	private UsuarioDAO daoUsuario;
	
	@GetMapping("login")
    public String login() {
        System.out.println("Executando a lógica com Spring MVC");
        
        return "/login";
    }

/*	Após um post, é recomendado fazer um redirect ao invés de forward (que devolve a mesma requisição que o usuario usou para cadastrar), 
	para criar uma nova requisição, evitando que o usuario aperta F5 e cadastre 2 vezes. */
	@PostMapping("login")
	@Transactional
    public ModelAndView autenticar(RedirectAttributes attr, HttpServletRequest req) {
    	
		try {
			String email = req.getParameter("email");
			Object obj = daoUsuario.buscarPorEmail(email);
			Usuario usuarioBD = (Usuario) obj;
			String senha = req.getParameter("senha");
			String senhaBD = usuarioBD.getSenha();

			if(senhaBD.equals(senha)){
				attr.addFlashAttribute("msg", "Login realizado com Sucesso");		
			}
			
    	} catch (Exception e){
    		e.printStackTrace();
    		return new ModelAndView("login");
    	}
    	
        return new ModelAndView("redirect:/login");
    }

}
