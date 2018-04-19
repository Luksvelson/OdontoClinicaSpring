package logicas;

import java.security.MessageDigest;
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfissionalDao;
import model.Profissional;

public class AdicionarProfissionalLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Profissional profissional = new Profissional();
		
		profissional.setNome(req.getParameter("nome"));
		profissional.setCro(Integer.parseInt(req.getParameter("cro")));
		profissional.setFuncao(req.getParameter("funcao"));
		
		MessageDigest algorithm = MessageDigest.getInstance("MD5");
		byte messageDigest[] = algorithm.digest("senha".getBytes("UTF-8"));
		
		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigest) {
		  hexString.append(String.format("%02X", 0xFF & b));
		}
		String senha = hexString.toString();
		
		profissional.setSenha(senha);
		
		Connection connection = (Connection) req.getAttribute("conexao");
		
		ProfissionalDao dao = new ProfissionalDao(connection);
		dao.adiciona(profissional);
		
		return "mvc?logica=NovoProfissionalLogica";
	}

}
