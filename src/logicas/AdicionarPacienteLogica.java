package logicas;

import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.LocalDate;

import dao.PacienteDao;
import model.Paciente;

public class AdicionarPacienteLogica implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Paciente paciente = new Paciente();
		
		paciente.setNome_paciente(req.getParameter("nome_paciente"));
		paciente.setCpf(req.getParameter("cpf_paciente"));
		paciente.setRg(req.getParameter("rg_paciente"));
		
		LocalDate dt = LocalDate.parse((req.getParameter("data_nasc")));
		paciente.setData_nasc(dt);
		
		paciente.setSexo(req.getParameter("sexo"));
		paciente.setEstado_civil(req.getParameter("estado_civil"));
		paciente.setNome_conjuge(req.getParameter("nome_conjuge"));
		paciente.setEndereco(req.getParameter("endereco"));
		paciente.setBairro(req.getParameter("bairro"));
		paciente.setCidade(req.getParameter("cidade"));
		paciente.setCep(req.getParameter("cep"));
		paciente.setEstado_saude(req.getParameter("estado_saude"));
		paciente.setTem_alergia(Boolean.parseBoolean(req.getParameter("tem_alergias")));
		paciente.setAlergias(req.getParameter("alergias"));
		paciente.setTem_diabetes(Boolean.parseBoolean(req.getParameter("tem_diabetes")));
		paciente.setBebe(Boolean.parseBoolean(req.getParameter("bebe")));
		paciente.setTem_prob_resp(Boolean.parseBoolean(req.getParameter("tem_prob_resp")));
		paciente.setProb_resp(req.getParameter("prob_resp"));
		paciente.setCirurgia_previa(Boolean.parseBoolean(req.getParameter("cirurgia_previa")));
		paciente.setCirurgias(req.getParameter("cirurgias"));
		paciente.setFuma(Boolean.parseBoolean(req.getParameter("fuma")));
		paciente.setTem_prob_circ(Boolean.parseBoolean(req.getParameter("tem_prob_circ")));
		paciente.setProb_circ(req.getParameter("prob_circ"));
		paciente.setUsa_medicamentos(Boolean.parseBoolean(req.getParameter("usa_medicamento")));
		paciente.setMedicamentos(req.getParameter("medicamentos"));
		paciente.setEmail(req.getParameter("email"));
		
		Connection connection = (Connection) req.getAttribute("conexao");
		
		PacienteDao dao = new PacienteDao(connection);
		dao.adiciona(paciente);
		
		return "mvc?logica=NovoPacienteLogica";
	}
	
}
