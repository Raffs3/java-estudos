public class ControleFluxoExemplo {
    public static void main(String[] args) {
        float notaEnem = 800;

        if (notaEnem == 1000) {
            System.out.println("O aluno foi aprovado!");
        } else if (notaEnem >= 800) {
            System.out.println("O conselho analisará se dará o aval ou não.");
        }
        else {
            System.out.println("Aluno reprovado!");
        }
    }
}
