package lezione16_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB {

	private static final String URL = "jdbc:mysql://localhost:3306/cinema";
	private static final String USER = "root";
	private static final String PASS = "root";
	
	private static Connection connection = null;
	
	public Connection getConn() {
		return connection;
	}
	
	public void connetti() {
		try {
			
			this.connection = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connessione avvenuta");
			
		} catch (SQLException e) {
			System.out.println("Connessione NON avvenuta");
			e.printStackTrace();
		}
	}
	
	public void disconnetti() {
		if(this.connection != null) {
			
			try {
				this.connection.close();
				
			} catch (SQLException e) {
				System.out.println("Si è verificato un errore");
				e.printStackTrace();
			}
		}
	}
	
	
}
