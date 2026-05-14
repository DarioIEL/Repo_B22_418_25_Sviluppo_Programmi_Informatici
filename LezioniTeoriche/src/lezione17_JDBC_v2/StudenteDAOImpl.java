package lezione17_JDBC_v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudenteDAOImpl implements StudenteDAO {

	private DatabaseConnection dbConn = DatabaseConnection.getInstance();

//	public StudenteDAOImpl(DatabaseConnection dbConn) {
//		this.dbConn = DatabaseConnection.getInstance();
//	}

	//Metodo per mappare i resultSet
	private Studente mappaStudente(ResultSet rs) throws SQLException {
		return new Studente(
			rs.getInt("idstudenti"),
			rs.getString("nome"),
			rs.getString("cognome"),
			rs.getString("corso"),
			rs.getString("email")
				);
	}
	
	
	
//	QUESTI SOTTO SONO I METODI DI BASE DEL CRUD (arrivano da GenericDAO)
	@Override
	public boolean create(Studente studente) {
		
		Connection conn = dbConn.getConnessione();

		try {
			PreparedStatement ps = conn.prepareStatement(ADD);
			ps.setString(1, studente.getNome());
			ps.setString(2, studente.getCognome());
			ps.setString(3, studente.getCorso());
			ps.setString(4, studente.getEmail());

			int righe = ps.executeUpdate();

			return righe > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbConn.closeConnessione(conn);
		}

		return false;
	}

	@Override
	public Studente readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Studente> readAll() {
		List<Studente> studenti  = new ArrayList<>();
		Connection conn = dbConn.getConnessione();
		
		try {
			PreparedStatement ps = conn.prepareStatement(GET_ALL);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				studenti.add(mappaStudente(rs));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbConn.closeConnessione(conn);
		}
		
		return studenti;
	}

	@Override
	public boolean update(Studente entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	//QUESTI SOTTO SONO I METODI SPECIFICI (arrivano da StudenteDAO)
	@Override
	public Studente getStudenteByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Studente> getStudentiByCorso(String corso) {
		// TODO Auto-generated method stub
		return null;
	}

}
