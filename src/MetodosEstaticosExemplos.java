public class MetodosEstaticosExemplos {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;

        double mediaFinal = calcularMedia(nota1, nota2);
        System.out.printf("A média final é: %.2f%n", mediaFinal);

        boolean aprovado = verificarAprovacao(mediaFinal);

        if (aprovado) {
            System.out.println("Status: Aluno Aprovado!");
        }
        else {
            System.out.println("Status: Aluno Reprovado!");
        }
    }
    // --- Métodos Estáticos ---

    // Este método recebe duas notas (double) e devolve um double (a média)

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;

    }
    // Este método recebe uma média e devolve um boolean true se >= 6.0, false caso contrário
    public static boolean verificarAprovacao(double media) {
        return media >= 6.0;
    }
}
