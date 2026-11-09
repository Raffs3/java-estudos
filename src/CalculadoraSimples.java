public class CalculadoraSimples {
    public static void main(String[] args) {
        double numero = 50;
        double numero2 = 40;

        char resultado = '+';

        switch (resultado) {
            case '+':
                System.out.println("+: " + (numero + numero2));
                break;
            case '-':
                System.out.println("-: " + (numero - numero2));
                break;
            case '/':
                System.out.println("/: " + (numero / numero2));
                break;
            case '*':
                System.out.println("*: " + (numero * numero2));
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}