/******************************************************************************
Exempos apresentados nas video aulas de Collection
- Set
- LinkedHashSet
- TreeSet
*******************************************************************************/
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class ExercicioCollection{

	public static void main(String[] args) {
		
		
		Set<Double> vlrSet = new HashSet<>();
		LinkedHashSet<Integer> vlrLhS = new LinkedHashSet<>();
		TreeSet<String> vlrTreeSet = new TreeSet<>();
		
		// Adição de notas Set
		vlrSet.add(5.7);
		vlrSet.add(6.8);
		vlrSet.add(10.0);
		vlrSet.add(6.5);
		vlrSet.add(5.4);
		vlrSet.add(7.3);
		vlrSet.add(3.8);
		vlrSet.add(4.0);
		
		// Adição valores com LinkHashSet
		vlrLhS.add(8);
		vlrLhS.add(1);
		vlrLhS.add(2);
		vlrLhS.add(4);
		vlrLhS.add(3);
		vlrLhS.add(7);
		vlrLhS.add(5);
		vlrLhS.add(4);
		
		// Adição valores com TreeSet
		vlrTreeSet.add("Rio de Janeiro");
		vlrTreeSet.add("Bahia");
		vlrTreeSet.add("Pernambuco");
		vlrTreeSet.add("Amazonas");
		vlrTreeSet.add("Sergipe");
		vlrTreeSet.add("Alagoas");
		
		System.out.println("SAÍDA COM Set" );
		for(Double vlrsSet: vlrSet)
		    System.out.print(vlrsSet + " ");
		    
		System.out.println("\n"); // Apensa para pular linha
	    
	    System.out.println("SAÍDA COM LinkedHashSet" );
	    for(Integer vlrsLhSet: vlrLhS)
		    System.out.print(vlrsLhSet + " ");
		    
		    
		System.out.println("\n"); // Apensa para pular linha
	    
	    System.out.println("SAÍDA COM LinkedHashSet" );
	    for(String vlrsTreeSet: vlrTreeSet)
		    System.out.print(vlrsTreeSet + " ");
	    
	}	
	
}
