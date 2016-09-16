import java.util.*;
public class Principal1 {

	public static void main(String[] args) {
		
		/*String [] nombres={"juan","Maria","lucas"};
		for (String nombre : nombres) {
			System.out.println(nombre);
		}*/
		TreeSet<String> nombres = new TreeSet<String>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Maria");
		Collection<String> nombress = new LinkedList<String>();
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		System.out.println("*****************************");
		
		nombres.add("Lucas");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		nombres.remove(2);
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		nombres.
	
		


	}

}
