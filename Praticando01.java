/* 
    Exercitando o aprendizado da primeira aula de collections, referente ao bootcamp AMDocs - DIO
    Entrada de n nomes, e trabalhando com o conheceimento apresentado na video aula
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Praticando01 {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      List<String> names = new ArrayList<>();
      
      String name;
      
      names.clear();
      
      boolean listEmpty = names.isEmpty();
      
      System.out.println("Quantidade de nomes - ");
      int qtdNames = sc.nextInt();
      
      for(int x =1; x <= qtdNames; x++){
          name = sc.nextLine();
          names.add(name);
      }
      
      
      // Apresentado lista e o seu tamanho
      int tamList = names.size();
      System.out.println("Lista - " + names + " Tamanho - " + tamList);
      
      
      // Entrada de um nome e apresentando sua posição na lista
      System.out.println("Type name - ");
      name = sc.nextLine();
      int posName = names.indexOf(name);
      System.out.println("Name - " + name + "\nPosition name - " + (posName + 1));
      
      for(String nameEach : names){
          System.out.print(" - " + nameEach + " -\n");
      }
      
      // Engrada de um nome e o removendo da lista
      System.out.println("Remove name - ");
      name = sc.nextLine();
      names.remove(name);
      tamList = names.size();
      System.out.println("Removido - " + name );
      System.out.println("Lista - " + names + "\nTamanho - " + tamList );
      
      
      
      Iterator<String> iterator = names.iterator();
      while(iterator.hasNext()){                   // hasNext() - retorna um boolean true, sempre que existe mais um elemento na lista
            System.out.println("- " + iterator.next());
      }
      
      sc.close();
    }
}