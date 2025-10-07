import java.util.Scanner;

public class atvd4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;

            System.out.println("Digite o valor de a: ");
            a = sc.nextInt();   
            System.out.println("Digite o valor de B: ");
            b = sc.nextInt();
            System.out.println("Digite o valor de C: ");
            c = sc.nextInt();

            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Os lados formam um triângulo");
            } else {
                System.out.println("Os valores informados não podem formar um triângulo");
            }
        } 
    }
}
