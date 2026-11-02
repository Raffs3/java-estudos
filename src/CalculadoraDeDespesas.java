public class CalculadoraDeDespesas {
    public static void main(String[] args) {
        double contaLuz = 307.6;
        double contaAgua = 298.0;
        double contaInternet = 100.0;

        double salarioMensal = 1900.0;

        double totalPagar = contaAgua + contaLuz + contaInternet;
        double sobraSalarial = salarioMensal - totalPagar;

        System.out.println("Total a pagar de luz é: " + contaLuz + "R$");
        System.out.println("Total a pagar de água é: " + contaAgua + "R$");
        System.out.println("Total a pagar de internet é: " + contaInternet + "R$");
        System.out.println("Sobra salarial total ao mês é: " + sobraSalarial + "R$");
    }
}
