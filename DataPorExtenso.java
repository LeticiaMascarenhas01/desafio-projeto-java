import java.util.Scanner;

public class DataPorExtenso {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int dia, mes, ano;
            System.out.print("Digite o dia: ");
            dia = input.nextInt();
            System.out.print("Digite o mês (em número): ");
            mes = input.nextInt();
            System.out.print("Digite o ano: ");
            ano = input.nextInt();
            String nomeMes;
            nomeMes = switch (mes) {
                case 1 -> "janeiro";
                case 2 -> "fevereiro";
                case 3 -> "março";
                case 4 -> "abril";
                case 5 -> "maio";
                case 6 -> "junho";
                case 7 -> "julho";
                case 8 -> "agosto";
                case 9 -> "setembro";
                case 10 -> "outubro";
                case 11 -> "novembro";
                case 12 -> "dezembro";
                default -> null;
            };  if (nomeMes != null) {
                System.out.printf("%d de %s de %d\n", dia, nomeMes, ano);
            } else {
                System.out.println("Mês inválido!");
            }
        }
    }
}
