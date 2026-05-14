package lezione17_JDBC_v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/gestione_scuola";
	private static final String USER = "dario";
	private static final String PASS = "Dario_89";
	
	//Per potermi connettere utilizzo il pattern Singleton. Questo pattern mi assicura che, in tutto il progetto, sia presente una sola istanza della classe.
	
	private static DatabaseConnection connDB = new DatabaseConnection(); //Questa è la singola istanza che viene creata immediatamente
	
	//Costruttore privato
	private DatabaseConnection() {
		System.out.println("Connessione creata");
	}
	
	public static DatabaseConnection getInstance() {
		return connDB;
	}
	
	public Connection getConnessione() {
		try {
			Connection conn = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("Connesssione avvenuta");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void closeConnessione(Connection conn) {
		try {
			conn.close();
			System.out.println("Connessione chiusa !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void testaConnessione() {
		Connection conn = null;
		try {
			conn = getConnessione();
		}catch (Exception e) {
			System.out.println("Connessione non avvenuta");
		}finally {
			closeConnessione(conn);
		}
		
	}
}
