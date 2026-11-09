public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numSecreto = 4;
        int palpite = 14;

        if (numSecreto == palpite) {
            System.out.println("O palpiteiro acertou!");
        } else if (palpite > numSecreto) {
            System.out.println("Errou, palpiteiro! O numero foi muito ALTO.");
        } else {
            System.out.println("Errou, palpiteiro! O número foi muito BAIXO.");
        }
    }
}
