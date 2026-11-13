public class LacosDeRepeticaoExemplo {
    public static void main(String[] args) {
        // Inicialização; Condição; Incremento
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número da volta: " + i);
        }
        int contador = 1;

        // Enquanto o contador for menor ou igual a 3, repete
        while (contador <= 3) {
            System.out.println("Contador no while: " + contador);
            contador++; // Incremento crucial para evitar loop infinito!
        }
        int opcao = 0;

        do {
            System.out.println("A executar a ação do menu pelo menos uma vez...");
            opcao = 5; // Digamos que a opção mudou para 5 (sair)
        } while (opcao != 5); // Só repete se a opção for diferente de 5

        System.out.println("Saiu do loop!");
    }
}