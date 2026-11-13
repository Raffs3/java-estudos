import java.util.Scanner;
import java.util.Random;
public class JogoAdivinhacaoComTentativas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numSecreto = rd.nextInt(100) + 1;
        int palpite = 0;
        int contadorTentativas = 0;

        while (palpite != numSecreto) {
            System.out.println("Jogador, dê o seu palpite: ");
            palpite = sc.nextInt();
            contadorTentativas++;
            if (palpite < numSecreto) {
                System.out.println("Número secreto é MAIOR!");
            }
            else if (palpite > numSecreto) {
                System.out.println("Número secreto é MENOR!");
            }
        }
        System.out.println("Parabéns Jogador! Você acertou a resposta.");
        System.out.println("O número secreto era: " + numSecreto);
        System.out.println("Tentativas em que conseguiu acertar foi: " + contadorTentativas);
        sc.close();
    }
}