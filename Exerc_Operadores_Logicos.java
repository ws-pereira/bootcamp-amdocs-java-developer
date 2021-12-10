public class Exerc_Operadores_Logicos{
    
    public static void main(String args[]){
        
        boolean b1 = true, b2 = false, b3 = true, b4 = false;
        
        System.out.println("Valores b1 = " + b1 + " - b2 = " + b2 + "\n");
        
        System.out.println("b1 && b2 - " + (b1 && b2));
        System.out.println("b1 && b3 - " + (b1 && b3));
        System.out.println("b1 || b2 - " + (b1 || b2));
        System.out.println("b1 || b3 - " + (b1 || b3));
        System.out.println("b1  ^ b2 - " + (b1  ^ b2));
        System.out.println("b1  > b3 - " + (b1 ^ b3));
        System.out.println("b1 && b2 - " + (b1 && b2));
        System.out.println("!b1  " + !b1);
        System.out.println("!b1  " + !b2);
        
    }
}