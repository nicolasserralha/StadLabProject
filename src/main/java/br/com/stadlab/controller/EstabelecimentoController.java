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

import br.com.stadlab.bean.UsuarioBean;
import br.com.stadlab.dao.EstabelecimentoDAO;
import br.com.stadlab.model.Estabelecimento;
import br.com.stadlab.model.Usuario;

@Controller
@RequestMapping("estabelecimento")
public class EstabelecimentoController {
	
	@Autowired
	private EstabelecimentoDAO estabelecimentoDao;
	
	@Autowired
	private UsuarioBean usuarioLogado;
	
	@GetMapping("form")
    public String cadastro() {
        
        return "estabelecimento/form";
    }

	@PostMapping("form")
	@Transactional
    public ModelAndView cadastrar(Estabelecimento estabelecimento, RedirectAttributes attr, HttpServletRequest req) {
		Usuario usuario = usuarioLogado.getUsuario();
		try {
			if(usuario == null) {
				return new ModelAndView("index");	
			}
			else {
				
				return new ModelAndView("index").addObject("usuario", usuario);
	        }
    	} catch (Exception e){
    		e.printStackTrace();
    		return new ModelAndView("cliente/cadastrar");
    	}
    	
    }

}

