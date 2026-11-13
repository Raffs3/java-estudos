import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoInicial = 1000.00;
        int opcaoMenu = 0;

        do {
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.printf("Saldo Atual: R$ %.2f%n", saldoInicial);
                    break;
                case 2:
                    System.out.println("Valor a ser depositado: ");
                    double depositoValor = sc.nextDouble();
                    if (depositoValor > 0) {
                        saldoInicial += depositoValor;
                    }
                    else {
                        System.out.println("Valor Inválido!");
                    }
                    System.out.println("Saldo atual: " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Valor que vai ser sacado: " );
                    double saqueValor = sc.nextDouble();
                    if (saqueValor > 0 && saqueValor <= saldoInicial) {
                        saldoInicial -= saqueValor;
                        System.out.println("Saldo atual: " + saldoInicial);
                    }
                    else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando a sessão!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcaoMenu != 4);
        sc.close();
    }
}