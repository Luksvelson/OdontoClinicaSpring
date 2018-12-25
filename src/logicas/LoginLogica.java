package logicas;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginLogica implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		return "WEB-INF/jsp/login.jsp";
	}
}
