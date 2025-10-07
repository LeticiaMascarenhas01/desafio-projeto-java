import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            
            switch(numero) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("Um");
                case 2 -> System.out.println("Dois");
                default -> System.out.println("Número inválido");
            }
        }
    }   
}    
