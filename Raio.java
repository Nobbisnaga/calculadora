import java.util.Scanner;

public class Raio {
    
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("digite o comprimento ");
        int numero1 = entrada.nextInt();
        
        System.out.print("");
        double numero2 = 3.14;
    
        double raio = (2 * numero1 * numero2);
    
        System.out.printf("a area é %.2f",raio);
     }
}
