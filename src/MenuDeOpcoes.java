public class MenuDeOpcoes {
    public static void main(String[] args) {
        int atendimentoBanco = 4;

        switch (atendimentoBanco) {
            case 1:
                System.out.println("Criar conta");
                break;
            case 2:
                System.out.println("Depositar na conta");
            case 3:
                System.out.println("Sacar");
                break;
            case 4:
                System.out.println("Sair da conta");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
