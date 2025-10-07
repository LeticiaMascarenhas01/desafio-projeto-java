import java.util.Scanner;

public class atvd1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            int num1, num2;
            int subitracao;

            System.out.println("Digite o primeiro numero: ");
            num1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            num2 = sc.nextInt();

            subitracao = num1 - num2;
            System.out.println("O resultado da subtracao foi: " + subitracao);

            if (num1 == num2) {
                System.out.println("Os números são iguais");
            } else{
                System.out.println("0");
            }
        }
    }
}
