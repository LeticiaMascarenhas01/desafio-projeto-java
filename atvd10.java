import java.util.Scanner;

public class atvd10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double trabalhoLab, avaliacaoSem, exameFinal;

            System.out.println("Digite a nota do trabalho de laboratório: ");
            trabalhoLab = sc.nextDouble();
            System.out.println("Digite a nota da avaliação semestral: ");
            avaliacaoSem = sc.nextDouble();
            System.out.println("Digite a nota do exame: ");
            exameFinal = sc.nextDouble();
            
            int pesoLaboratorio = 2;
            int pesoSemestral = 3;
            int pesoExame = 5;
            double notaSemestral = (avaliacaoSem * pesoSemestral) / (pesoSemestral + pesoLaboratorio + pesoExame);
            double mediaPonderada = ((trabalhoLab * pesoLaboratorio) + (notaSemestral * pesoSemestral) + (exameFinal * pesoExame)) / (pesoLaboratorio + pesoSemestral + pesoExame);

            char conceito;
            if (mediaPonderada >= 8.0 && mediaPonderada <= 10.0) {
                conceito = 'A';
            } else if (mediaPonderada >= 7.0 && mediaPonderada < 8.0) {
                conceito = 'B';
            } else if (mediaPonderada >= 6.0 && mediaPonderada < 7.0) {
                conceito = 'C';
            } else if (mediaPonderada >= 5.0 && mediaPonderada < 6.0) {
                conceito = 'D';
            } else {
                conceito = 'E';
            }

            System.out.printf("Média Ponderada: %.2f\n", mediaPonderada);
            System.out.println("Conceito: " + conceito);
        }
    }
}
