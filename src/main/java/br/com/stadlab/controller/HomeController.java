 package br.com.stadlab.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.stadlab.bean.UsuarioBean;
import br.com.stadlab.model.Usuario;

@Controller
public class HomeController {
	
	@Autowired
	private UsuarioBean usuarioLogado;
	
    @RequestMapping("/home")
    public ModelAndView home(HttpSession session) {
		Usuario usuario = usuarioLogado.getUsuario();
		if(usuario == null) {
			return new ModelAndView("index");	
		}
		else {
        String nome = usuario.getCliente().getNome();
        return new ModelAndView("index").addObject("nomeUsuario", nome);
        }
    }
    
    @RequestMapping("/sobre")
    public ModelAndView sobre(HttpSession session) {
		Usuario usuario = usuarioLogado.getUsuario();
		if(usuario == null) {
			return new ModelAndView("sobre");	
		}
		else {
        String nome = usuario.getCliente().getNome();
        return new ModelAndView("sobre").addObject("nomeUsuario", nome);
        }
    }
    
    @RequestMapping("/")
    public String index() {
        System.out.println("Executando a lógica com Spring MVC");
        return "index";
    }

}
