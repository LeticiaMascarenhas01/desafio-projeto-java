import java.util.Scanner;

public class babado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Double numero, quad, cub, raiz_quad, raiz_cub;

            System.out.println("Digite um numero: ");
            numero = scanner.nextDouble();

            quad = Math.pow(numero, 2);
            System.out.println("O quadrado de " + numero + " é: " + quad);
            cub = Math.pow(numero, 3);
            System.out.println("O cubo de " + numero + " é: " + cub);
            raiz_quad = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raiz_quad);
            raiz_cub = Math.cbrt(numero);
            System.out.println("A raiz cúbica de " + numero + " é: " + raiz_cub);
        }
    }    
}
