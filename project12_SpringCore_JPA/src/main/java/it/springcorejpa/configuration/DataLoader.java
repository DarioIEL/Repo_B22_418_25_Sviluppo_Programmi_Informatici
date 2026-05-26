package it.springcorejpa.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.springcorejpa.entity.Libro;
import it.springcorejpa.repository.LibroRepository;

@Configuration
public class DataLoader {

	//Con questa interfaccia carico i dati iniziali. Devo però fare un controllo affinché ad ogni riavvio non carichi gli stessi
	//Il metodo save() che utilizzo è di JPARepository
	
	@Bean
	public CommandLineRunner caricaDati(LibroRepository repo) {
		return args -> {
			if (repo.count() == 0) {
				repo.save(new Libro("Il nome della Rosa", "Umberto Eco", 15.9));
				repo.save(new Libro("Il visconte dimezzato", "Italo Calvino", 9.99));	
			}else {
				System.out.println("Sono già presenti dei libri");
			}
		};
	}
}
