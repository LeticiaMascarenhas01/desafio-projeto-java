import java.util.Scanner;
/*refazer*/
public class atvd5 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite 4 números inteiros:");
            
            int[] numeros = new int[4];
            
            for (int i = 0; i < 4; i++) {
                numeros[i] = sc.nextInt();
            }
            
            System.out.println("Números divisíveis por 2 e 3:");
            for (int i = 0; i < 4; i++) {
                if (numeros[i] % 2 == 0 && numeros[i] % 3 == 0) {
                    System.out.println(numeros[i]);
                }
            }
        }
    }    
}
