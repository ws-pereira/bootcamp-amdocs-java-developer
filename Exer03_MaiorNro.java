// Entrada de 5 nros, e apresentando o maior entre eles

import java.util.Scanner;

public class Exer03_MaiorNro{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        
        int nro, maior = 0;
        System.out.println("Entre com 5 números");
        
        for(int x = 0; x < 5; x++){
            nro = sc.nextInt();
            if(nro > maior)
                maior = nro;
        }
        
        System.out.println("Maior número digitado: " + maior);
        sc.close();
        
    }
}