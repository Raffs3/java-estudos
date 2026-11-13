public class TabelaDeAmortizacaoEmprestimo {
    public static void main(String[] args) {
        double totalEmprestimoInicial = 40000;
        int mesesPagar = 12;
        double taxaJuros = 0.02;

        double saldoDevedorTotal = totalEmprestimoInicial;
        double amortizacaoMensal = saldoDevedorTotal / mesesPagar;

        for (int mes = 1; mes <= mesesPagar; mes++) {
            double jurosMes = saldoDevedorTotal * taxaJuros;
            double parcelaTotal = amortizacaoMensal + jurosMes;
            saldoDevedorTotal -= amortizacaoMensal;
            System.out.printf("Saldo total no mês %d a ser amortizado é: R$ %.2f%n", mes, saldoDevedorTotal);
        }
    }
}
