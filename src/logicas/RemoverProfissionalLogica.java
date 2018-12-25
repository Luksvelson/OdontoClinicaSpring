package logicas;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfissionalDao;
import model.Profissional;

public class RemoverProfissionalLogica implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		int id = Integer.parseInt(req.getParameter("id_profissional"));
		
		Profissional profissional = new Profissional();
		profissional.setIdProfissional(id);
		
		Connection connection = (Connection) req.getAttribute("conexao");
		
		ProfissionalDao dao = new ProfissionalDao(connection);
		dao.remove(profissional);
		
		System.out.println("Excluindo profissional... ");
		
		return "mvc?logica=ListarProfissionaisLogica";
	}
	
}
