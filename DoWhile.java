import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;

            do /* FAÇA */ {
                System.out.println("Digite um número: ");
                numero = sc.nextInt();
            } while /* ENQUANTO */ (numero != 0);
        }
        System.out.println("Vc acertou o numero");
    }
}
