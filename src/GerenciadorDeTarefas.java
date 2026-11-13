import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        int opcao = 0;

        do {
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Sair");

            opcao = sc.nextInt(); // Consome a quebra de linha (\n) deixada pelo nextInt() para evitar que o próximo nextLine() seja ignorado.

            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da tarefa: ");
                    String novaTarefa = sc.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Nova tarefa adicionada com sucesso!");
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Até o momento, não há nenhuma tarefa a ser feita");
                    }
                    else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1 + " - " + tarefas.get(i)));
                        }
                    }
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Até o momento, não há nenhuma tarefa a ser feita");
                    }
                    else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1 + " - " + tarefas.get(i)));
                        }
                        System.out.println("Digite o número da tarefa concluída: ");
                        int numTarefa = sc.nextInt();
                        sc.nextLine();
                        int indice = numTarefa - 1;
                        if (indice >= 0 && indice < tarefas.size()) {
                            tarefas.remove(indice);
                            System.out.println("Tarefa removida!");
                        }
                        else {
                            System.out.println("Usuário digitou número inválido. Tente novamente!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do gerenciador de tarefas em 3... 2... 1... Saiu!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
        sc.close();
    }
}