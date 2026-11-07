public class VerificadorDeDesconto {
    public static void main(String[] args) {
        String cliente = "Emanuel";
        int idadeCliente = 10;
        boolean compraAcimaValorEspecifico = false;
        boolean clienteVip = false;
        boolean regrasDesconto = (idadeCliente < 12 || clienteVip) && compraAcimaValorEspecifico;
        System.out.println("O cliente tem direito a desconto? " + regrasDesconto);
    }
}
