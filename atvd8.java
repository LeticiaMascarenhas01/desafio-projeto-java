import java.util.Scanner;

public class atvd8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1, num2, num3;   

            System.out.println("Digite o primeiro número: ");
            num1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = sc.nextInt();
            System.out.println("Digite o terceiro número: ");
            num3 = sc.nextInt();

            int numMenor = num1;

            if (numMenor < num2){  
                numMenor = num1;  
            } else if (num3 < numMenor){
                numMenor = num3;
            }
            System.out.println("O maior número é: " + numMenor);
        }
    }
}
