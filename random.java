public class random {

     public static void main(String[] args) {

         int cont, dado;

         for( cont = 1; cont <= 5; cont++ ) {
               dado = (int)(1 + Math.random() * 6);
                //O (int) força o valor a ser convertido para inteiro, truncando (cortando) a parte decimal.
                // +1 Soma 1 ao valor anterior.
                //Math.random() * 6 Multiplica o número aleatório por 6.
                // Math.random() - Gera um número aleatório do tipo double entre 0.0 (inclusive) e 1.0 (exclusivo).
               System.out.println(dado);

         }

     }

} 
