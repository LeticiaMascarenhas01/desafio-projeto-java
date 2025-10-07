import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite 10 numeros: ");
            
            int soma = 0;

            for ( int i = 1; i <= 10; i++){
                System.out.println("Numeros: " + i);
                    int numero = sc.nextInt();
                    soma += numero;
                        System.out.println("Soma igual a: " + soma);
            }
        }
    }
}
