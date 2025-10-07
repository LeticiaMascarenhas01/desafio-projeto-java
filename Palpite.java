import java.util.Scanner;

public class Palpite{

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int numero_sorteado = sc.nextInt();
            int palpite = sc.nextInt();
            
            do /*FAÇA*/{ 
                System.out.println("Faça um palpite: ");
            if /*SE*/ (palpite > numero_sorteado) 
                System.out.println("O número sorteado é menor que " + palpite);
            else if (palpite < numero_sorteado) 
                System.out.println("O número sorteado é maior que " + palpite);
            else /*SE NAO*/
                System.out.println("Parabéns, você acertou!");
            } while /*ENQUANTO*/ (palpite != numero_sorteado);
        }
    }
}