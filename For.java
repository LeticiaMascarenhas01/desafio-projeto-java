public class For {
    public static void main(String[] args) {
        /* FOR (PARA) permite que uma variavel contadora seja testada e incrementada a cada interaçao ou loop*/

        /*O contador for recebe como entrada uma variavel contadora, a condicao e o valor de incrementaca */

        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }

        /*FOR EM ARRAYS */
        String alunos[] = {"Sam", "Mara", "Joao", "Pedro"};
        
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }   
}