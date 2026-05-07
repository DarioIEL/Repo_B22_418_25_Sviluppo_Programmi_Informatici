package lezione16_JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		FilmDAOImpl film = new FilmDAOImpl(); // Att: nel costruttore c'è la connessione al DB

		ArrayList<Film> filmPresenti = new ArrayList<>();
		
		// Aggiungo un singolo film
		Film filmNuovo = new Film();
		
//		filmNuovo.setId(6); //Set inutile perché AI sul DB
		filmNuovo.setAutore("Non me lo ricordo");
		filmNuovo.setTitolo("Narnia");
		filmNuovo.setAnno(2002);
		
		film.addFilm(filmNuovo);
		
		
		filmPresenti = film.getFilms();
		for (Film f : filmPresenti) {
			System.out.println(f);
		}
		
		
		System.out.println( film.getFilmById(30) );
	}
}
