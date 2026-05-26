# Cosa sono i DTO (Data Transfer Object)
Mi permettono di "mappare" in entrata e in uscita i dati del model. 
Questo succede perché io posso esporre (in output) solo parzialmente dei dati oppure ricevere (input) dei dati parziali del mio model.

 - LibroRequest definisce cosa accetto
 - LibroResponse definisce cosa espongo
 
 ATT: potremmo anche avere solo una classe LibroDTO e basta
 
 L'uso del DTO serve a :
 1. Separare le responsabilità. Il model Libro rappresenta i dati interni non quelli che voglio per forza esporre
 2. Sicurezza
 3. Validazione