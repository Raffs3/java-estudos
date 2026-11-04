public class CalculadoraDeTroco {
    public static void main(String[] args) {
        double valorCompra = 329.10;
        double valorPago = 400.00;
        double trocoCompra = valorPago - valorCompra;
        byte qtdParcelas = 3;
        double valorParcela = valorCompra / qtdParcelas;

        System.out.println("Troco da compra em dinheiro: R$ " + trocoCompra);
        System.out.println("\n---Opção parcelado---");
        System.out.println("Quantidade de parcelas" + qtdParcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);
    }
}
