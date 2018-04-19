package logicas;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacienteDao;
import model.Paciente;

public class RemoverPacienteLogica implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		int id = Integer.parseInt(req.getParameter("id_paciente"));
		
		Paciente paciente = new Paciente();
		paciente.setId_paciente(id);
		
		Connection connection = (Connection) req.getAttribute("conexao");
		
		PacienteDao dao = new PacienteDao(connection);
		dao.remove(paciente);
		
		System.out.println("Excluindo paciente... ");
		
		return "mvc?logica=ListarPacientesLogica";
	}
	
}
