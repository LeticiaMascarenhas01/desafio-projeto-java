import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Zero");
            } if (numero == 1) {
                System.out.println("Um");
            } if (numero == 2) {
                System.out.println("Dois");
            } else {
                System.out.println("Número inválido");
            }
        }
    }
}
