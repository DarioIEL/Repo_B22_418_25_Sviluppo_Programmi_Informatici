package lezione16_JDBC;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAOImpl implements FilmDAO{

	private ConnessioneDB connessione;
	private Statement statement;
	private PreparedStatement ps;
	private ResultSet rs;
	

	public FilmDAOImpl() {
		this.connessione = new ConnessioneDB();
		this.connessione.connetti();
	}

	@Override
	public void addFilm(Film f) {
		try {
//			this.ps = this.connessione.getConn().prepareStatement("Insert into films(titolo, autore, anno) values(?,?,?)");
			
			this.ps = this.connessione.getConn().prepareStatement(ADD);
			
			this.ps.setString(1, f.getTitolo());
			this.ps.setString(2, f.getAutore());
			this.ps.setInt(3, f.getAnno());
			this.ps.executeUpdate();
			
			System.out.println("Inserimento avvenuto");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void updateFilm(Film f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFilm(Film f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Film getFilmById(int id) {
		Film f = null;
		
		try {
			this.ps = this.connessione.getConn().prepareStatement(GET_BY_ID);
			this.ps.setInt(1, id);
			this.rs = this.ps.executeQuery();
			
			if(this.rs.next()) {
				f = new Film();
				f.setTitolo(rs.getString("titolo"));
				f.setAutore(rs.getString("autore"));
				f.setAnno(rs.getInt("anno"));
				f.setId(rs.getInt("id"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Film non trovato");
		} finally {
			this.connessione.disconnetti();
		}
		
		return f;
	}

	@Override
	public ArrayList<Film> getFilms() {
		ArrayList<Film> films = new ArrayList<>();
		
		try {
			this.ps = this.connessione.getConn().prepareStatement(GET_ALL);
			
			this.rs = this.ps.executeQuery();
			
			while(this.rs.next()) {
				Film f = new Film();
				f.setId(rs.getInt("id"));
				f.setTitolo(rs.getString("titolo"));
				f.setAutore(rs.getString("autore"));
				f.setAnno(rs.getInt("anno"));
				
				films.add(f);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return films;
	}

	@Override
	public ArrayList<Film> getFilmByAnno(int anno) {
		
		return null;
	}

	
	
}
