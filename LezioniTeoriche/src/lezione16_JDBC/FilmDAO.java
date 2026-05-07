package lezione16_JDBC;

import java.util.ArrayList;

public interface FilmDAO {
	
	String ADD = "insert into films (titolo, autore, anno) values (?,?,?)";
	String DELETE = "delete from films where id = ?";
	String GET_ALL = "select * from films";
	String GET_BY_ID = "select * from films where id = ?";
	String GET_BY_YEAR = "select * from films where anno = ?";

	
	void addFilm(Film f);
	void updateFilm(Film f);
	void deleteFilm(Film f);
	
	Film getFilmById(int id);
	ArrayList<Film> getFilms();
	ArrayList<Film> getFilmByAnno(int anno);
	
}
