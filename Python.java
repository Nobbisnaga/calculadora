import java.util.Scanner;

public class Python {
    
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("digite o primeiro numero ");
        int numero1 = entrada.nextInt();
        
        System.out.print("digite o segundo numero ");
        int numero2 = entrada.nextInt();
    
        int resto = numero1 % numero2;
    
        System.out.printf("O resto é %d",resto);
     }
}
