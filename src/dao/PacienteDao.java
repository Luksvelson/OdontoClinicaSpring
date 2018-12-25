package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Paciente;

public class PacienteDao {
	
	// a conexão com o banco de dados
	private Connection connection;
	
	public PacienteDao(Connection connection) {
		this.connection = connection;
	}
	
	public void adiciona(Paciente paciente) {
		String sql = "insert into paciente" +
				"(nome_paciente, cpf_paciente, rg_paciente, data_nasc, sexo, estado_civil, nome_conjuge,"
				+ "endereco, bairro, cidade, cep, estado_saude, tem_alergia, alergias,"
				+ "tem_diabetes, bebe, tem_prob_resp, prob_resp, cirurgia_previa, cirurgias, fumante,"
				+ "tem_prob_circ, prob_circ, usa_medicamento, medicamentos, email)" +
				
				"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, paciente.getNome_paciente());
			stmt.setString(2, paciente.getCpf());
			stmt.setString(3, paciente.getRg());
			
			java.time.LocalDate data_nasc = paciente.getData_nasc();
			
			java.sql.Date data = java.sql.Date.valueOf(data_nasc);
			
			stmt.setDate(4, data);
		
			stmt.setString(5, paciente.getSexo());
			stmt.setString(6, paciente.getEstado_civil());
			stmt.setString(7, paciente.getNome_conjuge());
			stmt.setString(8, paciente.getEndereco());
			stmt.setString(9, paciente.getBairro());
			stmt.setString(10, paciente.getCidade());
			stmt.setString(11, paciente.getCep());
			stmt.setString(12, paciente.getEstado_saude());
			stmt.setBoolean(13, paciente.isTem_alergia());
			stmt.setString(14, paciente.getAlergias());
			stmt.setBoolean(15, paciente.isTem_diabetes());
			stmt.setBoolean(16, paciente.isBebe());
			stmt.setBoolean(17, paciente.isTem_prob_resp());
			stmt.setString(18, paciente.getProb_resp());
			stmt.setBoolean(19, paciente.isCirurgia_previa());
			stmt.setString(20, paciente.getCirurgias());
			stmt.setBoolean(21, paciente.isFuma());
			stmt.setBoolean(22, paciente.isTem_prob_circ());
			stmt.setString(23, paciente.getProb_circ());
			stmt.setBoolean(24, paciente.isUsa_medicamentos());
			stmt.setString(25, paciente.getMedicamentos());
			stmt.setString(26, paciente.getEmail());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Paciente> getLista() {
		
		List<Paciente> pacientes = new ArrayList<Paciente>();
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from paciente");
		
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Paciente paciente = new Paciente();
				paciente.setId_paciente(rs.getInt("id_paciente"));
				paciente.setNome_paciente(rs.getString("nome_paciente"));
				paciente.setEmail(rs.getString("email"));
				paciente.setCpf(rs.getString("cpf_paciente"));
				paciente.setRg(rs.getString("rg_paciente"));
				
				java.time.LocalDate date = rs.getDate("data_nasc").toLocalDate();

				paciente.setData_nasc(date);
				
				paciente.setSexo(rs.getString("sexo"));
				paciente.setEstado_civil(rs.getString("estado_civil"));
				paciente.setNome_conjuge(rs.getString("nome_conjuge"));
				paciente.setEndereco(rs.getString("endereco"));
				paciente.setBairro(rs.getString("bairro"));
				paciente.setCidade(rs.getString("cidade"));
				paciente.setCep(rs.getString("cep"));
				paciente.setEstado_saude(rs.getString("estado_saude"));
				paciente.setTem_alergia(rs.getBoolean("tem_alergia"));
				paciente.setAlergias(rs.getString("alergias"));
				paciente.setTem_diabetes(rs.getBoolean("tem_diabetes"));
				paciente.setBebe(rs.getBoolean("bebe"));
				paciente.setTem_prob_resp(rs.getBoolean("tem_prob_resp"));
				paciente.setProb_resp(rs.getString("prob_resp"));
				paciente.setCirurgia_previa(rs.getBoolean("cirurgia_previa"));
				paciente.setCirurgias(rs.getString("cirurgias"));
				paciente.setFuma(rs.getBoolean("fumante"));
				paciente.setTem_prob_circ(rs.getBoolean("tem_prob_circ"));
				paciente.setProb_circ(rs.getString("prob_circ"));
				paciente.setUsa_medicamentos(rs.getBoolean("usa_medicamento"));
				paciente.setMedicamentos(rs.getString("medicamentos"));
				
				// adicionando o objeto à lista
				pacientes.add(paciente);
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return pacientes;
	}
	
	public void altera(Paciente paciente) {
		
		String sql = "update paciente set nome_paciente=?, cpf_paciente=?, rg_paciente=?, data_nasc=?, sexo=?, estado_civil=?, nome_conjuge=?,"+ 
	"endereco=?, bairro=?, cidade=?, cep=?, estado_saude=?, tem_alergia=?, alergias=?," + 
	"tem_diabetes=?, bebe=?, tem_prob_resp=?, prob_resp=?, cirurgia_previa=?, cirurgias=?, fumante=?," + 
	"tem_prob_circ=?, prob_circ=?, usa_medicamento=?, medicamentos=?, email=? where id_paciente=?";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, paciente.getNome_paciente());
			stmt.setString(2, paciente.getCpf());
			stmt.setString(3, paciente.getRg());
			
			java.time.LocalDate data_nasc = paciente.getData_nasc();
			
			java.sql.Date data = java.sql.Date.valueOf(data_nasc);
			
			stmt.setDate(4, data);
			
			stmt.setString(5, paciente.getSexo());
			stmt.setString(6, paciente.getEstado_civil());
			stmt.setString(7, paciente.getNome_conjuge());
			stmt.setString(8, paciente.getEndereco());
			stmt.setString(9, paciente.getBairro());
			stmt.setString(10, paciente.getCidade());
			stmt.setString(11, paciente.getCep());
			stmt.setString(12, paciente.getEstado_saude());
			stmt.setBoolean(13, paciente.isTem_alergia());
			stmt.setString(14, paciente.getAlergias());
			stmt.setBoolean(15, paciente.isTem_diabetes());
			stmt.setBoolean(16, paciente.isBebe());
			stmt.setBoolean(17, paciente.isTem_prob_resp());
			stmt.setString(18, paciente.getProb_resp());
			stmt.setBoolean(19, paciente.isCirurgia_previa());
			stmt.setString(20, paciente.getCirurgias());
			stmt.setBoolean(21, paciente.isFuma());
			stmt.setBoolean(22, paciente.isTem_prob_circ());
			stmt.setString(23, paciente.getProb_circ());
			stmt.setBoolean(24, paciente.isUsa_medicamentos());
			stmt.setString(25, paciente.getMedicamentos());
			stmt.setString(26, paciente.getEmail());
			
			stmt.setInt(27, paciente.getId_paciente());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void remove(Paciente paciente) {
		
		String sql = "delete from paciente where id_paciente=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, paciente.getId_paciente());
			
			stmt.execute();
			stmt.close();
			
		}  catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Paciente detalha(int id) {
	
		Paciente paciente = new Paciente();
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from paciente where id_paciente = " + id);
			
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			
			paciente.setId_paciente(rs.getInt("id_paciente"));
			paciente.setNome_paciente(rs.getString("nome_paciente"));
			paciente.setCpf(rs.getString("cpf_paciente"));
			paciente.setRg(rs.getString("rg_paciente"));
			paciente.setEmail(rs.getString("email"));
			
			java.time.LocalDate date = rs.getDate("data_nasc").toLocalDate();

			paciente.setData_nasc(date);
			
			paciente.setSexo(rs.getString("sexo"));
			paciente.setEstado_civil(rs.getString("estado_civil"));
			paciente.setNome_conjuge(rs.getString("nome_conjuge"));
			paciente.setEndereco(rs.getString("endereco"));
			paciente.setBairro(rs.getString("bairro"));
			paciente.setCidade(rs.getString("cidade"));
			paciente.setCep(rs.getString("cep"));
			paciente.setEstado_saude(rs.getString("estado_saude"));
			paciente.setTem_alergia(rs.getBoolean("tem_alergia"));
			paciente.setAlergias(rs.getString("alergias"));
			paciente.setTem_diabetes(rs.getBoolean("tem_diabetes"));
			paciente.setBebe(rs.getBoolean("bebe"));
			paciente.setTem_prob_resp(rs.getBoolean("tem_prob_resp"));
			paciente.setProb_resp(rs.getString("prob_resp"));
			paciente.setCirurgia_previa(rs.getBoolean("cirurgia_previa"));
			paciente.setCirurgias(rs.getString("cirurgias"));
			paciente.setFuma(rs.getBoolean("fumante"));
			paciente.setTem_prob_circ(rs.getBoolean("tem_prob_circ"));
			paciente.setProb_circ(rs.getString("prob_circ"));
			paciente.setUsa_medicamentos(rs.getBoolean("usa_medicamento"));
			paciente.setMedicamentos(rs.getString("medicamentos"));
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return paciente;
	}
}
