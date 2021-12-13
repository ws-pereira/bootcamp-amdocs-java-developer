/* Realiando exercício com entrada de dados
    Apresentado saída com o ano de nascimento, após a idade digitada
*/

import java.util.Scanner;
import java.util.Calendar;

public class Exerc01_NomeIdade {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
         Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.YEAR);
        
        int ctrl; // Variável de controle do laço
        
        do{
        
            System.out.println("What's your name? ");
            String name  = sc.next();
            System.out.println("How old are you? ");
            int yearsOld = sc.nextInt();
        
            int yearBorn = month - yearsOld;
            System.out.println("Your born in " + yearBorn);
            System.out.println("Type number zero to exit - ");
            ctrl = sc.nextInt();;
        }while(ctrl != 0);
        System.out.println("Exit to loop!!");
    }
}
