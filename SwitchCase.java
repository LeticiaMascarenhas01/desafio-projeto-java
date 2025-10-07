public class SwitchCase {
    public static void main(String[] args) {
        /*Precisamos imprimir uma medida com base em mapa de valores */
        String sigla = "M";

        switch (sigla) {
            case "P" -> System.out.println("PEQUENO");
            case "M" -> System.out.println("MEDIO");
            case "G" -> System.out.println("GRANDE");
            default -> System.out.println("INDEFINIDO");
        }
    }
}