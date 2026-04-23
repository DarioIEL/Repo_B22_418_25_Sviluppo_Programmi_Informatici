package lezione11_eccezioni;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
	public static void main(String[] args) {
		
		//Questa è un'eccezione checked
		
		try {
			FileReader fr = new FileReader("./mioFile.txt");
			BufferedReader br = new BufferedReader(fr);
			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				System.out.println("riga vuota");
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("Mi spiace, non ho trovato il file");
		}
		
		
		//
		
			stampa(null);
		
	}

	//Questa è proprio una eccezione unchecked
	public static void stampa(String testo) {
		if(testo != null) {
			System.out.println("Questo è il testo: " + testo);
		}else {
			System.out.println("Non hai inserito nessun testo");
		}
	}
}
