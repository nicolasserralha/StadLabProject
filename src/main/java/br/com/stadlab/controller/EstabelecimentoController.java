package br.com.stadlab.controller;

import java.util.ArrayList;
import java.util.List;
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
import br.com.stadlab.dao.TipoEstabelecimentoDAO;
import br.com.stadlab.model.Cliente;
import br.com.stadlab.model.Estabelecimento;
import br.com.stadlab.model.TipoEstabelecimento;
import br.com.stadlab.model.Usuario;

@Controller
@RequestMapping("estabelecimento")
public class EstabelecimentoController {
	
	@Autowired
	private EstabelecimentoDAO estabelecimentoDao;
	
	@Autowired
	private TipoEstabelecimentoDAO tipoEstabelecimentoDao;
	
	@Autowired
	private UsuarioBean usuarioLogado;
	
	@GetMapping("form")
    public ModelAndView cadastro() {
		return new ModelAndView("estabelecimento/form");
    }

	@PostMapping("cadastrar")
	@Transactional
    public ModelAndView cadastrar(Estabelecimento estabelecimento, RedirectAttributes attr, HttpServletRequest req) {
		Usuario usuario = usuarioLogado.getUsuario();
		List<Estabelecimento> estabelecimentos = new ArrayList<Estabelecimento>();
		Cliente cliente = usuario.getCliente();
		try {
			String tpestabelecimento = req.getParameter("tipoEstabelecimento");
			TipoEstabelecimento tipoEstabelecimento = tipoEstabelecimentoDao.buscarTexto(tpestabelecimento);
			estabelecimento.setTipo(tipoEstabelecimento);

			estabelecimentoDao.cadastrar(estabelecimento);
			estabelecimentos.add(estabelecimento);
			
			cliente.setEstabelecimento(estabelecimentos);
			usuario.setCliente(cliente);
			
			usuarioLogado.setUsuario(usuario);
			
			return new ModelAndView("estabelecimento/form").addObject("usuario", usuario);

    	} catch (Exception e){
    		e.printStackTrace();
    		return new ModelAndView("cliente/cadastrar");
    	}
    	
    }

}

