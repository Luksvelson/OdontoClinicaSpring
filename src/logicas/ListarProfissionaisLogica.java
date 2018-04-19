package logicas;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfissionalDao;
import model.Profissional;

public class ListarProfissionaisLogica implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection connection = (Connection) req.getAttribute("conexao");
	
		// Monta a lista de profissionais
		List<Profissional> profissionais = new ProfissionalDao(connection).getListaProfissional();
		
		// Guarda a lista no request
		req.setAttribute("profissionais", profissionais);
		
		return "WEB-INF/jsp/listarProfissionais.jsp";
	}
}
