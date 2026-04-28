package lezione12_Interfacce;

//Le interfacce funzionali sono interfacce con all'interno un solo metodo astratto. Le posso  utilizzare con le Lambda Function (Java8+). Non ho necessità di implementarla in nessuna classe concreta

@FunctionalInterface
public interface Operazione {
	int esegui(int a, int b);
}
