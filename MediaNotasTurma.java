public class MediaNotasTurma {


   /*++

pré-incremento

++a

Incrementa a de 1, depois utiliza o novo valor de a na expressão em que reside.

++

pós-incremento

a++

Utiliza o valor de a na expressão em que reside, depois incrementa a por 1.

--

pré-decremento

--b

Decrementa b de 1, depois utiliza o novo valor de b na expressão em que reside.

--

pós-decremento

b--

Utiliza o valor de b na expressão em que reside, depois decrementa b de 1. */
    public static void main(String[] args) {

       int nro_estudantes, soma, nota, notaslidas;

       double media;

 

       System.out.print("Numero de estudantes da turma: ");

       nro_estudantes = Integer.parseInt(System.console().readLine());

 

       soma = 0;

       for(notaslidas = 0; notaslidas < nro_estudantes; notaslidas += 1){

            System.out.printf("Nota %d: ", notaslidas+1);

            nota = Integer.parseInt(System.console().readLine());

            soma += nota;

      }

 

      media = (double) soma / nro_estudantes;

      System.out.printf("Media das notas = %.1f\n", media);

   }

}