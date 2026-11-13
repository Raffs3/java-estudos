public class EstatisticasDeVendasAnuais {
    public static void main(String[] args) {
        double [] faturamentoMensal = {1001.10, 1400.10, 1398.98, 1439.90, 1899.00, 1432.99, 1754.09, 1234.22, 1990.29, 1432.29, 1678.28, 1002.24};
        double somaTotal = 0;
        double maiorVenda = faturamentoMensal[0];
        double menorVenda = faturamentoMensal[0];
        int mesPico = 1;
        int mesMenorPico = 1;

        for (int i = 0; i < faturamentoMensal.length; i++) {
            somaTotal += faturamentoMensal[i];

            if (faturamentoMensal[i] > maiorVenda) {
                maiorVenda = faturamentoMensal[i];
                mesPico = i + 1;
            }
            if (faturamentoMensal[i] < menorVenda) {
                menorVenda = faturamentoMensal[i];
                mesMenorPico = i + 1;
            }
        }
        double mediaAnual = somaTotal / faturamentoMensal.length;
        System.out.printf("Média anual de faturamento: R$ %.2f%n", mediaAnual);
        System.out.printf("Mês de pico: %d R$ %.2f%n", mesPico, maiorVenda);
        System.out.printf("Mês de menor pico: %d R$ %.2f%n", mesMenorPico, menorVenda);
    }
}