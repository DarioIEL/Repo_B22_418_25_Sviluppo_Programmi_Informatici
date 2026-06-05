package it.springcorejpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.springcorejpa.entity.Libro;

//Estendendo JpaRepository ho a disposizione una sere di metodi già wrappati per poter manipolare i dati nel DB
//findAll() -> "SELECT * from libri"
//save() -> "INSERT into libri"

public interface LibroRepository extends JpaRepository<Libro, Integer> {

	//DOPO inserirò le derived query. In autonomia "capisce" in base al nome del metodo cosa sviluppare

	//Questa query sotto è la query della join
	List<Libro> findByAutoriCognome(String cognome);
	
//	SELECT l.* from libri l
//	JOIN libri_autori la ON l.id = la.libro_id
//	JOIN autori a ON la.autore_id = a.id
//	WHERE a.cognome = ?
	
}
