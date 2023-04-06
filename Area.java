import java.util.Scanner;

public class Area{

 public static void main(String[]args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("digite o comprimento ");
    int numero1 = entrada.nextInt();
    
    System.out.print("digite a largura ");
    int numero2 = entrada.nextInt();

    float area = (numero1 * numero2) /2;

    System.out.printf("a area é "+ area);
 }
}