import java.util.Scanner;

public class CalculadoraDeIMCClinica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int continuar = 0;
        do {
            System.out.println("Por favor, informe o peso em Kg: ");
            double pesoCorporal = sc.nextDouble();
            System.out.println("Agora, informe a sua altura: ");
            double altura = sc.nextDouble();
            double calcularIMC = pesoCorporal / (altura * altura);

            System.out.printf("O valor do IMC do paciente é de %.2f%n", calcularIMC);
            if (calcularIMC < 18.5) {
                System.out.println("O paciente está abaixo do peso");
            }
            else if (calcularIMC < 25.0) {
                System.out.println("O paciente se encontra com peso normal");
            }
            else if (calcularIMC < 30.0) {
                System.out.println("O paciente se encontra em sobrepeso");
            }
            else {
                System.out.println("O paciente está em situação de obesidade");
            }

            System.out.println("Deseja calcular para outro paciente? 1 - Sim/ 2 - Não");
            continuar = sc.nextInt();

        }while (continuar == 1);
        System.out.println("Obrigado por consultar nossos serviços, senhor. O sistema está encerrado por agora.");
        sc.close();
    }
}
