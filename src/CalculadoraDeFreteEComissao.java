import java.util.Scanner;

public class CalculadoraDeFreteEComissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da venda: ");
        double valorVenda = sc.nextDouble();

        System.out.println("Digite o valor do peso em Kg: ");
        double pesoKg = sc.nextDouble();
        sc.nextLine();

        System.out.println("Insira o nome da região: ");
        String regiao = sc.nextLine();

        System.out.println("É um funcionário do mês? ");
        boolean funcionarioMes = sc.nextBoolean();

        double valorFrete = calcularFrete(pesoKg, regiao);
        double valorComissao = calcularComissaoVendedor(valorVenda, funcionarioMes);

        System.out.println("--- RESUMO FINANCEIRO DA VENDA ---");
        System.out.printf("Valor do produto: R$ %.2f%n", valorVenda);
        System.out.printf("Frete (%s): R$ %.2f%n", regiao, valorFrete);
        System.out.printf("Total final para o cliente: R$ %.2f%n", (valorVenda + valorFrete));
        System.out.printf("Comissão do vendedor: R$ %.2f%n", valorComissao);

        sc.close();
    }
    public static double calcularFrete(double pesoKg, String regiao) {
        if (regiao.equalsIgnoreCase("Sudeste")) {
            return pesoKg * 5.0;
        } else if (regiao.equalsIgnoreCase("Norte")) {
            return pesoKg * 12.0;
        } else {
            return pesoKg * 8.0;
        }
    }
    public static double calcularComissaoVendedor(double valorVenda, boolean funcionarioMes) {
        if (funcionarioMes) {
            return valorVenda * 0.08;
        }
        else {
            return valorVenda * 0.05;
        }
    }
}