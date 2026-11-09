public class ClassificadorIMC {
    public static void main(String[] args) {
        double peso = 70.0;
        double altura = 1.80;
        double indiceMassaCorporal = peso / (altura * altura);

        if (indiceMassaCorporal <= 18.5) {
            System.out.println("Abaixo do peso!");
        }
        else if (indiceMassaCorporal > 18.5 && indiceMassaCorporal <= 24.9) {
            System.out.println("Peso normal!");
        }
        else if (indiceMassaCorporal >= 25 && indiceMassaCorporal <= 29.9) {
            System.out.println("Sobrepeso!");
        }
        else if (indiceMassaCorporal >= 30 && indiceMassaCorporal <= 34.9){
            System.out.println("Obesidade grau I!");
        }
        else if (indiceMassaCorporal >= 35 && indiceMassaCorporal <= 39.9) {
            System.out.println("Obesidade grau II!");
        }
        else {
            System.out.println("Obesidade grau III!");
        }
    }
}