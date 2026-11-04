public class FichaDeAtleta {
    public static void main(String[] args) {
        String nomeAtleta = "Cristiano Ronaldo";
        double peso = 83;
        double altura = 1.85;
        double imc = peso / (altura * altura);
        byte numeroCamisa = 7;
        boolean aptoJogo = true;

        System.out.println("Nome do atleta: " + nomeAtleta);
        System.out.println("Peso do atleta: " + peso);
        System.out.println("Altura do atleta: " + altura);
        System.out.println("Índice de Massa Corporal do atleta: " + imc);
        System.out.println("Número da camisa do atleta: " + numeroCamisa);
        System.out.println("Apto para jogo? " + aptoJogo);
    }
}