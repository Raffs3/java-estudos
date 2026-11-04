public class StatusDoInimigo {
    public static void main(String[] args) {
        String nomeChefe = "King K. Roll";
        short danoBase = 1;
        int vidaMaxima = 9;
        int vidaAtual = 6;
        boolean chefeDerrotado = false;
        char fraqueza = 'P';

        System.out.println("Nome do chefe final é: " + nomeChefe);
        System.out.println("Dano base do chefe: " + danoBase);
        System.out.println("Diferença de vida atual: " + (vidaMaxima - vidaAtual));
        System.out.println("Chefe derrotado? " + chefeDerrotado);
        System.out.println("Fraqueza do chefe: " + fraqueza);

    }
}