import java.util.Scanner;

public class atvd2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;

            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            if (numero >= 1 && numero <= 9){
                System.out.println("O valor está na faixa permitida");
            } else {
                System.out.println("O valor está fora da faixa permitida");
            }
        }
    }
}
