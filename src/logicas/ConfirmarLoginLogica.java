package logicas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.security.MessageDigest;
import java.sql.Connection;

import dao.ProfissionalDao;

public class ConfirmarLoginLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		MessageDigest algorithm = MessageDigest.getInstance("MD5");
		byte messageDigest[] = algorithm.digest("senha".getBytes("UTF-8"));
		
		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigest) {
		  hexString.append(String.format("%02X", 0xFF & b));
		}
		
		String senha = hexString.toString();
		
		Connection connection = (Connection) req.getAttribute("conexao");
		
		ProfissionalDao dao = new ProfissionalDao(connection);
		
		if (dao.verificaLogin(req.getParameter("nome"), senha)) {
			return "mvc?logica=ListarPacientesLogica";
		} else {
			return "WEB-INF/jsp/login.jsp";
		}
		
		
	}

}
