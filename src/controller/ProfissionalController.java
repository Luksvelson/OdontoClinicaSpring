package controller;

import java.sql.Connection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.ConnectionFactory;
import dao.ProfissionalDao;
import model.Profissional;

@Controller
@RequestMapping("profissionais/")
public class ProfissionalController {
	
	@RequestMapping("novoProfissional")
	public String novoProfissional() {
		return "profissionais/cadastrarProfissional";
	}
	
	Connection connection = new ConnectionFactory().getConnection();
	
	@RequestMapping("adicionaProfissional")
	public String adiciona(Profissional profissional) {
		
		ProfissionalDao dao = new ProfissionalDao(connection);
		dao.adiciona(profissional);
		return "redirect:listarProfissionais";
	}
	
	@RequestMapping("listarProfissionais")
	public ModelAndView listar() {
		ProfissionalDao dao = new ProfissionalDao(connection);
		List<Profissional> profissionais = dao.getListaProfissional();
		
		ModelAndView modelAndView = new ModelAndView("profissionais/listarProfissionais");
		modelAndView.addObject("profissionais", profissionais);
		return modelAndView;
	}
	
	@RequestMapping("removerProfissional")
	public String remover(Profissional profissional) {
		ProfissionalDao dao = new ProfissionalDao(connection);
		dao.remove(profissional);
		return "redirect:listarProfissionais";
	}
	
	@RequestMapping("detalharProfissional")
	public ModelAndView detalhar(int idProfissional) {
		ProfissionalDao dao = new ProfissionalDao(connection);
		Profissional profissional = dao.detalha(idProfissional);
		
		ModelAndView modelAndView = new ModelAndView("profissionais/detalharProfissional");
		modelAndView.addObject("profissional", profissional);
		return modelAndView;
	}
	
	@RequestMapping("alterarProfissional")
	public String alterar(Profissional profissional) {
		
		ProfissionalDao dao = new ProfissionalDao(connection);
		dao.altera(profissional);
		return "redirect:listarProfissionais";
	}
	
	

}
