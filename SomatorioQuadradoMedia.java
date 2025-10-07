import java.util.Scanner;

public class SomatorioQuadradoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo (n): ");
        int n = scanner.nextInt();

        int somatorio = 0;
        int somaDosQuadrados = 0;

        for (int i = 1; i <= n; i++) {
            somatorio += i;              // Soma simples
            somaDosQuadrados += i * i;   // Soma dos quadrados
        }

        double media = (double) somatorio / n;

        System.out.println("Somatório: " + somatorio);
        System.out.println("Soma dos quadrados: " + somaDosQuadrados);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
