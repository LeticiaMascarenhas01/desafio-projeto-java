public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 3;
        /* : é usado como se nao */
        String resultado = nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7) ? "Recuperacao" : "Reprovado";
        System.out.println(resultado);
    }
}