import java.util.Scanner;

public class Imc {
    
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("digite o peso ");
        int numero1 = entrada.nextInt();
        
        System.out.print("digite a altura ");
        double numero2 = entrada.nextDouble();
    
        double imc = numero1 / (numero2*numero2);
    
        System.out.printf("O Imc é %.2f",imc);
     }
}
