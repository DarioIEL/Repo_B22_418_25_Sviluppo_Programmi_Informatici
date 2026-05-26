package it.springcorejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.springcorejpa.entity.Libro;

//Estendendo JpaRepository ho a disposizione una sere di metodi già wrappati per poter manipolare i dati nel DB
//findAll() -> "SELECT * from libri"
//save() -> "INSERT into libri"

public interface LibroRepository extends JpaRepository<Libro, Integer> {

	//DOPO inserirò le derived query. In autonomia "capisce" in base al nome del metodo cosa sviluppare
}
