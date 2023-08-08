package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myItens = Arrays.asList(5, 2, 10);
		printList(myItens);
	
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) { //UTILIZA-SE O <?> PRA ACEITAR QUALQUER TIPO
		for(Object obj: list) {
			System.out.println(obj);
		}
	}

}
