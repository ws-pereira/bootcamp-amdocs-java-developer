/*
 Exercício solicitado no final da video aula
 
 Adicionar 5 nomes
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;

public class Praticando02{
    
    public static void main(String args[]){
        
        // Instânciando duas listas
        List<String> names = new ArrayList<>();
        List<String> nmnew = new ArrayList<>();
        
        // Elementos da lista01
        names.add("João");
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        
        System.out.println(names + "     - Lista Principal");
        
        // Busca pelo elemento indicado e alterando o elemento
        for(String name : names){
            if(name == "Carlos"){
                int pos = names.indexOf(name);
                names.set(pos,"Roberto");
            }
        }
        
        // Apresentando elementos da lista01, com operações de alteração e remoção do elemento na posição indicada
        System.out.println(names + "    - Lista Alterada");
        System.out.println(names + "    - Elemento da posição 1 - " + names.get(1));
        names.remove(4);
        System.out.println(names + "             - Removido o elemento da posição 4");
        names.remove("João");
        System.out.println(names + "                   - Removido o elemento João");
        System.out.println(names + "                   - Tamanho da lista - " + names.size());
       
        // Validando a existência de um elemento
        if(names.contains("Juliana")){
             System.out.println("Julina existe? Sim");
        }
        else{
             System.out.println("Julina existe? Não");
        }
        
        // Elementos da lista02
        nmnew.add("Ismael");
        nmnew.add("Rodrigo");
        
        System.out.println(nmnew + "                          - Tamanho da lista - " + nmnew.size());
        
        // Adicinando elementos da lista01 no final da lista02
        for(String finalList : names)
            nmnew.add(finalList);
            
        System.out.println(nmnew + " - Tamanho da lista - " + nmnew.size());
        
        // Ordenando os elementos na lista02 (lista final)
        Collections.sort(nmnew);
        System.out.println(nmnew + " - Tamanho da lista - " + nmnew.size());
        
        // Validando se a lista está vazia
        System.out.println("A lista está vazia? " + nmnew.isEmpty());
        
    }
    
}