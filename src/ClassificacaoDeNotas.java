public class ClassificacaoDeNotas {
    public static void main(String[] args) {
        double nota1 = 9;
        double nota2 = 10;
        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("O aluno está aprovado!");
        }
        else if (media >= 5 && media <= 6.9) {
            System.out.println("O aluno ficará de recuperação!");
        }
        else {
            System.out.println("O aluno está reprovado!");
        }
    }
}
