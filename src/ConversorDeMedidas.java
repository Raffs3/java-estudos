import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Digite um valor em Km: ");
        double km = sc.nextDouble();
        System.out.println("Digite um valor em Kg: ");
        double kg = sc.nextDouble();

        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        double milhas = converterQuilometrosParaMilhas(km);
        double libras = converterQuilosParaLibras(kg);

        System.out.printf("O resultado da conversão de Celsius para Fahrenheit é: %.2fF %n", fahrenheit);
        System.out.printf("O resultado da conversão de quilômetros para milhas é: %.2f mi %n", milhas);
        System.out.printf("O resultado da conversão de quilos para libras é: %.2f lb %n", libras);

        sc.close();
    }
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double converterQuilometrosParaMilhas (double km) {
        return km * 0.621371;
    }

    public static double converterQuilosParaLibras(double kg) {
        return kg * 2.20462;
    }
}