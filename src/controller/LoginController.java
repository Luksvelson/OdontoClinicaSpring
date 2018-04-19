package controller;

import java.sql.Connection;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ConnectionFactory;
import dao.ProfissionalDao;
import model.Profissional;

@Controller
public class LoginController {
	
	@RequestMapping("login")
	public String loginSite() {
		return "login";
	}
	
	Connection connection = new ConnectionFactory().getConnection();
	
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Profissional profissional, HttpSession session) {
		if(new ProfissionalDao(connection).verificaLogin(profissional.getNome(), profissional.getSenha())) {
		session.setAttribute("usuarioLogado", profissional);
		return "redirect:pacientes/listarPacientes";
	} else {
		return "redirect:login";
	}
	}
	
}
