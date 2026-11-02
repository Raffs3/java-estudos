public class FichaDePersonagem {
    public static void main(String[] args) {
        String nomePersonagem = "Klein Moretti";
        int idadePersonagem = 23;
        char classePersonagem = 'L';
        byte nivelAtualPersonagem = 20;
        long pontosVidaPersonagem = 10000000;
        boolean personagemVivo = true;

        System.out.println("O personagem se chama: " + nomePersonagem);
        System.out.println("Idade atual: " +idadePersonagem);
        System.out.println("Sua classe atual é: " + classePersonagem + "--> O Louco");
        System.out.println("Nível atual é: " + nivelAtualPersonagem);
        System.out.println("Seus pontos de vida atuais são: " + pontosVidaPersonagem);
        System.out.println("Com certeza o personagem está vivo, estou certo? " + personagemVivo);
    }
}