package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://192.168.1.3/odontoclinica", "admin", "00010011");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
}
}