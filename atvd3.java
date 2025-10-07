import java.util.Scanner;

public class atvd3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o coeficiente 'a': ");
            int a = sc.nextInt();

            System.out.print("Digite o coeficiente 'b': ");
            int b = sc.nextInt();

            System.out.print("Digite o coeficiente 'c': ");
            int c = sc.nextInt();

            int delta = (b * b) - (4 * a * c);
            
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("A equação possui uma única raiz real.");
            } else {
                System.out.println("A equação possui duas raízes reais.");
            }

            sc.close();
        }
    }
}
