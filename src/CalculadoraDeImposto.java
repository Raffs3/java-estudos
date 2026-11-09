public class CalculadoraDeImposto {
    public static void main(String[] args) {
        double salarioCidadao = 4000;

        if (salarioCidadao <= 2000) {
            System.out.println("0% de imposto alíquota");
        }
        else if (salarioCidadao > 2000 && salarioCidadao <= 4000) {
            System.out.println("O imposto é de 7,5%");
            double valorImposto = salarioCidadao * 0.075;
            System.out.println("Valor do desconto: " + valorImposto);
        }
        else {
            System.out.println("O imposto é de 15%");
            double valorImposto = salarioCidadao * 0.15;
            System.out.println("Valor do desconto: " + valorImposto);
        }
    }
}