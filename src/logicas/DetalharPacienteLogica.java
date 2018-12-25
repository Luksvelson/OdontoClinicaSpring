package logicas;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacienteDao;
import dao.ProfissionalDao;
import model.Paciente;
import model.Profissional;

public class DetalharPacienteLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		int id = Integer.parseInt(req.getParameter("idProfissional"));
		
		Connection connection = (Connection) req.getAttribute("conexao");
		
		Profissional profissional = new ProfissionalDao(connection).detalha(id);
		
		req.setAttribute("profissional", profissional);
		
		return "WEB-INF/jsp/detalharProfissional.jsp";
	}

}
