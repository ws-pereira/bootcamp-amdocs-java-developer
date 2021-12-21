/*
  Exercicio apresentado na vido aula de Queue
*/

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class ExemploLinkedList{
    
    public static void main(String args[]){
        
        Queue<String> filaBanco = new LinkedList<>();
        
        // Adicionando elementos a fila
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Camila");  
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        
        System.out.println("Fila Principal - " + filaBanco);
        
        // Verificando que é o primeiro elemento da fila
        String atendendoCliente = filaBanco.peek();
        int tamFila = filaBanco.size();
        System.out.println("\nTamanho da Fila - " + tamFila);
        System.out.println("\nPrimeiro cliente - " + atendendoCliente);
       
        /* Movimentação com retirada do primeiro elemento da fila
        atendendoCliente = filaBanco.poll();
        System.out.println("\nCliente sendo atendeido - " + atendendoCliente);
        System.out.println("\nFila Atualizada - " + filaBanco);
        */
        
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        int count = 0;
        
        while(iteratorFilaBanco.hasNext()){
        
            System.out.println("\nTamanho da fila - " + filaBanco.size());
            System.out.println("\nPróximo cliente - " + filaBanco.peek());
            
            atendendoCliente = filaBanco.poll();
            if(filaBanco.isEmpty()){
                System.out.println("\nFila Zerada!!!");
            }
            
        }
        
        
    }
}