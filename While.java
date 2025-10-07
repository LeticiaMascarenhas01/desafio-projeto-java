import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        /*ENQUANTO, determina que enquanto uma condiçao e vaida o bloco de codigos sera executado
         * estrutura da repetiçao while
         * 
         * while(expressao booleana  de validacao){
         *      //comando que sera executado ate que a expressao de validaçao seja falsa//
         * }
         * 
         * EXEMPLO: Joao tem 50 reais de mesada e foi a uma loja de doces gastar todo seu dinheiro, 
         * enquanto o valor de doces nao igualar a 50 ele vai poder adicionar doces ao carrinho
        */

        double mesada = 50.0;
        while(mesada > 0){
            double valorDoce = valorAleatorio(); 
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "Adicione no carrinho");    
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joao gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
