package lezione15_PatternDAO;

public class Main {
public static void main(String[] args) {
	
//PROGRAMMING TO INTERFACE: 
//	accoppiamento loose: approccio migliore nella programmazione con i DAO
	
//	SpettatoreDAO spettatoreDAO = new SpettatoreDAOImplMySql(); 
	SpettatoreDAO spettatoreDAO = new SpettatoreDAOImpl();
	
// accoppiamento tight o stretto, approccio SCONSIGLIATO con i DAO
//	SpettatoreDAOImplMySql spettMysql = new SpettatoreDAOImplMySql();
	
	Spettatore s1 = new Spettatore("DArio Mennillo", 1);
	Spettatore s2 = new Spettatore("Anna Verdi", 2);
	
	
	spettatoreDAO.addSpettatore(s1);
	spettatoreDAO.addSpettatore(s2);
	
	System.out.println(spettatoreDAO.getAllSpettatori());
	
}
}
