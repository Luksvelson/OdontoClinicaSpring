package logicas;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacienteDao;
import model.Paciente;

public class ListarPacientesLogica implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Connection connection = (Connection) req.getAttribute("conexao");
		
		// Monta a lista de contatos
		List<Paciente> pacientes = new PacienteDao(connection).getLista();
		
		// Guarda a lista no request
		req.setAttribute("pacientes", pacientes);
		
		return "WEB-INF/jsp/listarPacientes.jsp";
	}
}
