public class CadastroDeProdutos {
    public static void main(String[] args) {
        String nomeProduto = "Raquete";
        long codigoBarras = 298000000L; // L indica que é um long
        double precoProduto = 109.18;
        int qtdEstoque = 200;
        boolean promocaoProduto = false;
        char categoriaInicial = 'R';

        System.out.println(nomeProduto);
        System.out.println("Código de barras do produto: " + codigoBarras);
        System.out.println("Preço: R$ " + precoProduto);
        System.out.println("O produto se encontra em promoção? Não");
        System.out.println("Categoria de busca do produto: " + categoriaInicial);
    }
}