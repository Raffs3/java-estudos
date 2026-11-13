public class ControleFluxoExemplo {
    public static void main(String[] args) {
        // Declara uma variável do tipo float e atribui o valor 800
        float notaEnem = 800;

        // Verifica se a nota é exatamente igual a 1000
        if (notaEnem == 1000) {
            System.out.println("O aluno foi aprovado!");
        }
        // Se a condição anterior for falsa, verifica se a nota é maior ou igual a 800
        else if (notaEnem >= 800) {
            System.out.println("O conselho analisará se dará o aval ou não.");
        }
        // Se nenhuma das condições acima for verdadeira, executa este bloco (notas menores que 800)
        else {
            System.out.println("Aluno reprovado!");
        }
    }
}
