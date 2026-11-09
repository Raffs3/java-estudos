public class AprovacaoEmprestimo {
    public static void main(String[] args) {
        float rendaCliente = 30000;
        int idadeCliente = 37;
        float scoreCliente = 877;

        System.out.println("O cliente tem a idade acima de 18 anos?");
        if (idadeCliente >= 18) {
            System.out.println("Sim! O cliente possui ou é maior de 18 anos.");
            if (rendaCliente > 3000 || scoreCliente > 700) {
                System.out.println("O empréstimo do cliente foi aprovado! Pois sua renda é " + rendaCliente + " e o seu score é de " + scoreCliente);
            }
            else {
                System.out.println("O empréstimo do cliente foi negado!");
            }
        }
        else {
            System.out.println("Não! O cliente tem a idade abaixo dos 18 anos;");
        }
    }
}
