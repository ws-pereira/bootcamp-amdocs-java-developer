// Validando números pares e ímpares

import java.util.Scanner;

public class Exer04_ParImpar{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int nro, qtdpar = 0, qtdimpar = 0;
       
        
        System.out.println("Quantos números deseja ler? ");
        int nros = sc.nextInt();
        int ctrl = 0;
      
        do{
            nro = sc.nextInt();
            
            if(nro % 2 == 0){
                System.out.println("Número - " + nro + " é Par");
                qtdpar++;
            }
            else{
                System.out.println("Número - " + nro + " é Ímpar");
                qtdimpar++;
            }
            ctrl++;
        }while(ctrl < nros);
        
        System.out.println("Qtd par " + qtdpar + "\nQtd impar " + qtdimpar);
        System.out.println("End system!");
        
        
    }
}