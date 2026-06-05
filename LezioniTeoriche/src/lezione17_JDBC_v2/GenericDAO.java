package lezione17_JDBC_v2;

import java.util.List;

//Il GenericDAO sviluppa solo i metodi, non le query. La singola query sarà sviluppata dalla classe che implementa questa interfaccia
public interface GenericDAO<T> {

	//Dichiaro i metodi di base del CRUD(Create, Read, Update, Delete)
	boolean create(T entity);
	T readById(int id);
	List<T> readAll();
	boolean update(T entity);
	boolean delete(int id);
	
}
