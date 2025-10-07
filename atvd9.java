import java.util.Scanner;

public class atvd9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double salario;

            System.out.println("Digite o valor do seu salário: ");
            salario = sc.nextDouble();

            if (salario < 5000){
                salario = salario * 1.30;
                System.out.println("Salário com acrescimo: " + salario);
            }
        }
    }     
}
