import java.util.Scanner;
public class SistemaDeLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "java123";
        int tentativasFeitas = 0;
        int tentativasMaximas = 3;
        boolean acessoLiberado = false;

        while (tentativasFeitas < tentativasMaximas && !acessoLiberado) {
            System.out.println("Digite a senha: ");
            String senhaDigitada = sc.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                // Usando .equals() em vez de == para comparar o conteúdo real das Strings, e não a referência de memória
                acessoLiberado = true;
                System.out.println("Acesso Liberado! Bem-vindo.");
            }
            else {
                tentativasFeitas++;
                int tentativasRestantes = tentativasMaximas - tentativasFeitas;
                System.out.println("Acesso Negado! Tentativas restantes: " + tentativasRestantes);
            }
        }
        if (!acessoLiberado) {
            System.out.println("Máximo de tentativas feitas. Conta bloqueada por segurança!");
        }
        else {
            System.out.println("Login realizado com sucesso!");
        }
        sc.close();
    }
}