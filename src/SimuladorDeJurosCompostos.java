public class SimuladorDeJurosCompostos {
    public static void main(String[] args) {
        double valorInicialInvestido = 1200;
        double taxaJuros = 0.01;
        int tempoMeses = 12;

        double saldoAtual = valorInicialInvestido;
        for (int mes = 1; mes <= tempoMeses; mes++) {
            saldoAtual = saldoAtual + (saldoAtual * taxaJuros);
            // Usei o printf com %.2f para limitar a exibição do saldo em duas casas decimais
            // e evitar as dízimas geradas pela imprecisão do tipo double
            System.out.printf("Saldo total no mês %d é: R$ %.2f%n", mes, saldoAtual);
        }
    }
}
