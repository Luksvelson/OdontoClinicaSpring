package logicas;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfissionalDao;
import model.Profissional;

public class AlterarProfissionalLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Profissional profissional = new Profissional();
		
		profissional.setIdProfissional(Integer.parseInt(req.getParameter("idProfissional")));
		profissional.setNome(req.getParameter("nome"));
		profissional.setCro(Integer.parseInt(req.getParameter("cro")));
		profissional.setFuncao(req.getParameter("funcao"));
		
		Connection connection = (Connection) req.getAttribute("conexao");
		
		ProfissionalDao dao = new ProfissionalDao(connection);
		dao.altera(profissional);
		
		return "mvc?logica=ListarProfissionaisLogica";
	}
	
}
