package logicas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovoPacienteLogica implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return "WEB-INF/jsp/cadastrarPaciente.jsp";
	}
}
