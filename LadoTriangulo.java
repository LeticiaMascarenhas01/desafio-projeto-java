import java.util.Scanner;

public class LadoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o valor do lado A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor do lado B: ");
        b = sc.nextInt();
        System.out.println("Digite o valor do lado C: ");
        c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triângulo Retângulo");
        }else if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        }else if (a == b || b == c || a == c) {
            System.out.println("Triângulo Isósceles");
        }else if (a != b && b != c && a != c) {
            System.out.println("Triângulo Escaleno");
        }else{
            System.out.println("Não é um triângulo");
        }
    }    
}
