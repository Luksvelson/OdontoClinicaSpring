package dao;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Profissional;

public class ProfissionalDao {
	
	private Connection connection;
	
	public ProfissionalDao(Connection connection) {
		this.connection = connection;
	}
	
	public void adiciona(Profissional profissional) {
		String sql = "insert into profissional (nome, cro, funcao, senha) values (?,?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, profissional.getNome());
			stmt.setInt(2, profissional.getCro());
			stmt.setString(3, profissional.getFuncao());
			stmt.setString(4, profissional.getSenha());

			stmt.execute();
			stmt.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Profissional> getListaProfissional() {
		
		List<Profissional> profissionais = new ArrayList<Profissional>();
		
		try {
			
			PreparedStatement stmt = this.connection.prepareStatement("select * from profissional");
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Profissional profissional = new Profissional();
				
				profissional.setIdProfissional(rs.getInt("id_profissional"));
				profissional.setNome(rs.getString("nome"));
				profissional.setCro(rs.getInt("cro"));
				profissional.setFuncao(rs.getString("funcao"));
				profissional.setSenha(rs.getString("senha"));
				
				profissionais.add(profissional);
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return profissionais;
	}
	
	public void altera(Profissional profissional) {
		String sql = "update profissional set nome=?, cro=?, funcao=? where id_profissional=?";
	
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, profissional.getNome());
			stmt.setInt(2, profissional.getCro());
			stmt.setString(3, profissional.getFuncao());
			
			stmt.setInt(4, profissional.getIdProfissional());

			stmt.execute();
			stmt.close();
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void alteraSenha(Profissional profissional) {
		
		String sql = "update profissional set senha=? where id_profissional=?";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, profissional.getSenha());
			stmt.setInt(2, profissional.getIdProfissional());
			
			stmt.execute();
			stmt.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void remove(Profissional profissional) {
		
		String sql = "delete from profissional where id_profissional=?";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, profissional.getIdProfissional());
			
			stmt.execute();
			stmt.close();
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public Profissional detalha(int id) {
		
		Profissional profissional = new Profissional();
		
		try {	
			
			PreparedStatement stmt = this.connection.prepareStatement("select * from profissional where id_profissional =" + id);
			
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			
			profissional.setIdProfissional(rs.getInt("id_profissional"));
			profissional.setNome(rs.getString("nome"));
			profissional.setCro(rs.getInt("cro"));
			profissional.setFuncao(rs.getString("funcao"));
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
		return profissional;
		
	}
	
	public boolean verificaLogin (String nomeInformado, String senhaInformada) {
		
		Profissional profissional = new Profissional();
		
		try {
			
			PreparedStatement stmt = this.connection.prepareStatement("select nome, senha from profissional where nome=?");
			
			stmt.setString(1, nomeInformado);
			
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			
			profissional.setNome(rs.getString("nome"));
			profissional.setSenha(rs.getString("senha"));
			
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			byte messageDigest[] = algorithm.digest(senhaInformada.getBytes("UTF-8"));
			
			StringBuilder hexString = new StringBuilder();
			for (byte b : messageDigest) {
			  hexString.append(String.format("%02X", 0xFF & b));
			}
			String senhaCriptografada = hexString.toString();

			if (profissional.getNome().equals(nomeInformado) && profissional.getSenha().equals(senhaCriptografada)) {
				return true; 
			} else {
				return false;
			}
			
		} catch(SQLException | GeneralSecurityException | UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		
	}
}
