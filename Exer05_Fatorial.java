// Fatorial de um número digitado


import java.util.Scanner;

public class Exer05_Fatorial{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        
        int fatorial = sc.nextInt();

        if(fatorial == 0 || fatorial == 1){
            System.out.println("Fatorial de " + fatorial + " é 1");
        }
        else{
            System.out.print("Fatorial de " + fatorial + "! = ");
            for(int x = fatorial; x >= 2; x--){
                fatorial *= x-1;
            }
             System.out.print(fatorial);
        }
        sc.close();
        
    }
}