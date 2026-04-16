# CRM Azienda Immaginazione e Lavoro
- Dipendente (abstract) 
  [nome, cognome, codFisc, dataAssunzione]
-> metodo abstract: calcolaStipendio
	- Responsabile Sede
	- Responsabile Corso
	- Consulenti
	- Segreteria

- Studente (abstract) 
  [nome, cognome, email, dataRegistrazione, corsi]
-> metodo abstract: assegnaCorsiPossibili(List<Corso> corsiPossibili)
	- Studente Informatica 
	- Studente Paghe e Contributi
	- Studente Grafica