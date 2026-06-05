# Appunti su questo progetto
1. Caricare le varie dependecies e modificare il file application.properties
2. Creare l'Entity (questo sarà il model per JPA), il vecchio Model.
	- L'entity adesso è mappata sulla base del DB, non è un POJO classico come prima
	
3. Il repository non è più una classe concreta ma diventa un'interfaccia che estende JpaRepository