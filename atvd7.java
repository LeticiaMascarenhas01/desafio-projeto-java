import java.util.Scanner;

public class atvd7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1, num2, num3;   

            System.out.println("Digite o primeiro número: ");
            num1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = sc.nextInt();
            System.out.println("Digite o terceiro número: ");
            num3 = sc.nextInt();

            int numMaior = num1;

            if (numMaior > num2){  //se o primeiro número for maior que o segundo, o primeiro número é o maior,
                numMaior = num2;   //como nao e o caso ele me devolve o numero 2
            } else if (num3 > numMaior){
                numMaior = num3;
            }
            System.out.println("O maior número é: " + numMaior);
        }
    }
}
