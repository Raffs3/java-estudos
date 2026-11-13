import java.util.Scanner;
public class ControleDeEstoqueMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estoqueAtual = 100;
        int estoqueMinimo = 20;

        while (estoqueAtual > estoqueMinimo) {
            System.out.println("Estoque atual: " + estoqueAtual);
            System.out.println("Digite a quantidade desejada que quer retirar: ");
            int quantidadeRetirada = sc.nextInt();
            if (quantidadeRetirada <= 0) {
                System.out.println("Erro! A quantidade deve ser maior que 0.");
            } else if (quantidadeRetirada > estoqueAtual) {
                System.out.println("Não há saldo suficiente no armazém para atender a esse pedido.");
            }
            else {
                System.out.println("Sucesso!");
                estoqueAtual -= quantidadeRetirada;
                System.out.println("Baixa no estoque confirmada!");
            }
        }
        System.out.println("Alerta crítico! Estoque ficou abaixo do limite. Estoque atual: " + estoqueAtual);
        sc.close();
    }
}
