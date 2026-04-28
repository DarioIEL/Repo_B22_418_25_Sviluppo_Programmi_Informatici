package view;

import java.time.LocalDate;

import dao.DipendentiDAO;
import model.ResponsabileCorso;
import model.ResponsabileSede;

public class Main {

	public static void main(String[] args) {
		
		DipendentiDAO dipDAO = new DipendentiDAO();
		
		dipDAO.save(new ResponsabileCorso("Stefania", "Vipiana", "STFVPN99M9F999L", LocalDate.of(2000, 1, 10), 3));
		dipDAO.save(new ResponsabileSede("Laura", "Bianchi", "LNAIS93298CKA", LocalDate.of(2022, 4, 28), "Torino"));
		dipDAO.save(new ResponsabileCorso("Egle", "Risola", "EGLRSS98DA983DSAA", LocalDate.of(2007, 07, 8), 5));
		
		System.out.println("---DIPENDENTI---");
		dipDAO.findAll().forEach(System.out::println);
		
		dipDAO.exportCSV("dipendenti.csv");
	}

}
