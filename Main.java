import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o saldo inicial:");
            double saldoInicial = scanner.nextDouble();
            
            System.out.println("Digite o valor da primeira transação (pode ser positivo para depósito ou negativo para saque):");
            double transacao1 = scanner.nextDouble();
            
            System.out.println("Digite o valor da segunda transação (pode ser positivo para depósito ou negativo para saque):");
            double transacao2 = scanner.nextDouble();
            
            System.out.println("Digite o valor da terceira transação (pode ser positivo para depósito ou negativo para saque):");
            double transacao3 = scanner.nextDouble();
            
            double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;
            
            System.out.println("Saldo final:");
            System.out.printf("%.2f\n", saldoFinal);
        }
    }
}
