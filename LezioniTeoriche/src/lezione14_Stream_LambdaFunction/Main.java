package lezione14_Stream_LambdaFunction;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> numeri = List.of(2,5,6,8,9,0,10);
	
		//Prendo solo i numeri pari e gli sommo 40
		List<Integer> risultati = numeri.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n + 40)
				.collect(Collectors.toList());
	
		numeri.stream()
		.filter(n -> n % 3 == 0)
		.forEach(System.out::println);
	}

}
