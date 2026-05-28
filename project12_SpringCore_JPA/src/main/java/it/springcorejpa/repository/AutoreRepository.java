package it.springcorejpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.springcorejpa.entity.Autore;

public interface AutoreRepository extends JpaRepository<Autore, Integer> {
	
	//Costruisco un Derived Method sulla base del nome del metodo
	Optional<Autore> findByNomeAndCognome(String nome, String cognome);
	//Seguendo questo principio JPA crea una query String fatta così:
	//SELECT autore FROM autori as a
	//where a.nome = ? and a.cognome = ?
}
