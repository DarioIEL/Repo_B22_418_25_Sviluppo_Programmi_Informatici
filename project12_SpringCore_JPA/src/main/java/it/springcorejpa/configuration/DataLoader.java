package it.springcorejpa.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.springcorejpa.entity.Autore;
import it.springcorejpa.entity.Libro;
import it.springcorejpa.repository.AutoreRepository;
import it.springcorejpa.repository.LibroRepository;

@Configuration
public class DataLoader {

	//Con questa interfaccia carico i dati iniziali. Devo però fare un controllo affinché ad ogni riavvio non carichi gli stessi
	//Il metodo save() che utilizzo è di JPARepository
	
	@Bean
	public CommandLineRunner caricaDati(LibroRepository repoLibri, AutoreRepository repoAutori) {
		return args -> {
			if (repoLibri.count() == 0) {

				//Devo prima di tutto salvare gli autori nel DB 
				Autore eco = repoAutori.save(new Autore("Umberto", "Eco"));
				Autore calvino = repoAutori.save(new Autore("Italo", "Calvino"));
				Autore deSilva = repoAutori.save(new Autore ("Amleto", "De Silva"));
				
				
				Libro nomeRosa = repoLibri.save(new Libro("Il nome della rosa", 12.50));
				nomeRosa.aggiungiAutore(eco);
				
				Libro visconte = repoLibri.save(new Libro("Il visconte Dimezzato", 9.90));
				visconte.aggiungiAutore(calvino);

				Libro statti = repoLibri.save(new Libro("Statti attento da me", 10.50));
				statti.aggiungiAutore(deSilva);
				
				
				Autore dario = repoAutori.save(new Autore("Dario","Mennillo"));
				Autore oscar = repoAutori.save(new Autore("Oscar", "Vecchione"));
				Libro javaL = new Libro("Java 101", 25.30);
				javaL.aggiungiAutore(dario);
				javaL.aggiungiAutore(oscar);
				
				repoLibri.save(javaL);
			
				//Hibernate salva sulla tabella ponte libri_autori
				repoLibri.save(nomeRosa);
				repoLibri.save(visconte);
				repoLibri.save(statti);
				
				
			
			}else {
				System.out.println("Sono già presenti dei libri");
			}
		};
	}
}
