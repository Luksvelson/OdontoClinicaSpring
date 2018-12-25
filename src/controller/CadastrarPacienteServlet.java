package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.time.LocalDate;

import dao.PacienteDao;
import model.Paciente;


public class CadastrarPacienteServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Paciente paciente = new Paciente();
		
		String nome_paciente = request.getParameter("nome_paciente");
		paciente.setNome_paciente(nome_paciente);
		paciente.setCpf(request.getParameter("cpf_paciente"));
		paciente.setRg(request.getParameter("rg_paciente"));
		
		LocalDate dt = LocalDate.parse((request.getParameter("data_nasc")));
		paciente.setData_nasc(dt);
		
		paciente.setSexo(request.getParameter("sexo"));
		paciente.setEstado_civil(request.getParameter("estado_civil"));
		paciente.setNome_conjuge(request.getParameter("nome_conjuge"));
		paciente.setEndereco(request.getParameter("endereco"));
		paciente.setBairro(request.getParameter("bairro"));
		paciente.setCidade(request.getParameter("cidade"));
		paciente.setCep(request.getParameter("cep"));
		paciente.setEstado_saude(request.getParameter("estado_saude"));
		paciente.setTem_alergia(Boolean.parseBoolean(request.getParameter("tem_alergias")));
		paciente.setAlergias(request.getParameter("alergias"));
		paciente.setTem_diabetes(Boolean.parseBoolean(request.getParameter("tem_diabetes")));
		paciente.setBebe(Boolean.parseBoolean(request.getParameter("bebe")));
		paciente.setTem_prob_resp(Boolean.parseBoolean(request.getParameter("tem_prob_resp")));
		paciente.setProb_resp(request.getParameter("prob_resp"));
		paciente.setCirurgia_previa(Boolean.parseBoolean(request.getParameter("cirurgia_previa")));
		paciente.setCirurgias(request.getParameter("cirurgias"));
		paciente.setFuma(Boolean.parseBoolean(request.getParameter("fuma")));
		paciente.setTem_prob_circ(Boolean.parseBoolean(request.getParameter("tem_prob_circ")));
		paciente.setProb_circ(request.getParameter("prob_circ"));
		paciente.setUsa_medicamentos(Boolean.parseBoolean(request.getParameter("usa_medicamento")));
		paciente.setMedicamentos(request.getParameter("medicamentos"));
		
		PacienteDao dao = new PacienteDao(null);
		dao.adiciona(paciente);
		
		RequestDispatcher rd = request
				.getRequestDispatcher("/listarPacientes.jsp");
				rd.forward(request,response);
		
	}
	
}
