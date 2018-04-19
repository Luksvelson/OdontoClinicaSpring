package logicas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovoProfissionalLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return "WEB-INF/jsp/cadastrarProfissional.jsp";
	}

}
