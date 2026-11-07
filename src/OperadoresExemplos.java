public class OperadoresExemplos {
    public static void main(String[] args) {
        // Operadores Aritméticos //
        int nota1 = 5;
        int nota2 = 7;
        int somaNotas = nota2 + nota2;
        int mediaNotas = somaNotas / 2;

        System.out.println("Soma das notas equivalem: " + somaNotas);
        System.out.println("Média das notas equivalem: " + mediaNotas);

        int estoqueBananas = 12;
        int bananasCompradas = 5;
        int qtdBananasAtuais = estoqueBananas - bananasCompradas;

        System.out.println("Quantidade atual de bananas no estoque: " + qtdBananasAtuais);

        int restoDivisao = 10 % 3;  // 10 dividido por 3 dá 3, e sobra 1
        System.out.println("Resto da divisão é igual: " + restoDivisao);

        // Operadores Relacionais //
        int idadeMinima = 18;
        int idadeUsuario = 20;

        boolean maiorDeIdade = idadeUsuario >= idadeMinima;
        System.out.println("O usuário é maior de idade? " + maiorDeIdade);

        boolean temDesconto = idadeUsuario == 25;
        System.out.println("A idade é exatamente 25? " + temDesconto);
    }
}
