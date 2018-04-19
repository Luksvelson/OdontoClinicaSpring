package controller;

import java.sql.Connection;
import java.util.List;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.PacienteDao;
import model.Paciente;
import dao.ConnectionFactory;

@Controller
@RequestMapping("pacientes/")
public class PacienteController {
	@RequestMapping("novoPaciente")
	public String novoPaciente() {
		return "pacientes/cadastrarPaciente";
	}
	
	Connection connection = new ConnectionFactory().getConnection();
	
	@RequestMapping("adicionaPaciente")
	public String adiciona(Paciente paciente) {
		
		PacienteDao dao = new PacienteDao(connection);
		dao.adiciona(paciente);
		return "redirect:listarPacientes";
	}
	
	@RequestMapping("listarPacientes")
	public ModelAndView listar() {
		PacienteDao dao = new PacienteDao(connection);
		List<Paciente> pacientes = dao.getLista();
		
		ModelAndView modelAndView = new ModelAndView("pacientes/listarPacientes");
		modelAndView.addObject("pacientes", pacientes);
		return modelAndView;
	}
	
	@RequestMapping("removerPaciente")
	public String remover(Paciente paciente) {
		PacienteDao dao = new PacienteDao(connection);
		dao.remove(paciente);
		return "redirect:listarPacientes";
	}
	
	@RequestMapping("detalharPaciente")
	public ModelAndView detalhar(int id_paciente) {
		PacienteDao dao = new PacienteDao(connection);
		Paciente paciente = dao.detalha(id_paciente);
		
		ModelAndView modelAndView = new ModelAndView("pacientes/detalharPaciente");
		modelAndView.addObject("paciente", paciente);
		return modelAndView;
	}
	
	@RequestMapping("alterarPaciente")
	public String alterar(Paciente paciente) {
		
		PacienteDao dao = new PacienteDao(connection);
		dao.altera(paciente);
		return "redirect:listarPacientes";
	}
	
}
