# CRM Azienda Immaginazione e Lavoro MVC
- Dipendente (abstract) 
  [nome, cognome, codFisc, dataAssunzione]
-> metodo abstract: calcolaStipendio
	- Responsabile Sede
	- Responsabile Corso
	- Consulenti
	- Segreteria

- Studente (abstract) 
  [nome, cognome, email, dataRegistrazione, corsi]
-> metodo abstract: assegnaCorsi (List<Corso> corsi)

	- Studente Informatica 
	- Studente Paghe e Contributi
	- Studente Grafica
	
	
Al termine crea un file con l'elenco di dipendenti (opzionale) formato csv leggibile


Model -> DAO -> Controller - View