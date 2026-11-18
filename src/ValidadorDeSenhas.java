import java.util.Scanner;

public class ValidadorDeSenhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        boolean leitorSenha = validarSenhaCompleta(senha);
        if (leitorSenha) {
            System.out.println("Senha aprovada! Acesso liberado ao usuário.");
        }
        else {
            System.out.println("Senha reprovada! Acesso negado ao usuário.");
            if (!temNumero(senha)) {
                System.out.println("Senha sem número.");
            }
            if (!temTamanhoMinimo(senha)) {
                System.out.println("Sem tamanho mínimo.");
            }
        }
        sc.close();
    }
    public static boolean temTamanhoMinimo(String senha) {
        return senha.length() >= 8;
    }
    public static boolean temNumero(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (caractere >= '0' && caractere <= '9') {
                return true;
            }
        }
        return false;
    }
    public static boolean validarSenhaCompleta(String senha) {
            return temTamanhoMinimo(senha) && temNumero(senha);
        }
    }