public class ForArrays {    
    public static void main(String[] args) {
        String aluno []= {"FELIPE", "JOAO", "MARIA", "ANA"};

        for(int x=0; x<aluno.length ; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + aluno[x]);
        }
    }
    /* DE FORMA RESUMIDA 
    public static void main(String[] args) {
        String aluno []= {"FELIPE", "JOAO", "MARIA", "ANA"};
        for (String alunos : aluno) {
                System.out.println("Nome do aluno é: " + alunos);
    }*/
    
}    