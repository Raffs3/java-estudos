public class SensorDeTemperatura {
    public static void main(String[] args) {
        float celsius = 29;
        double fahrenheint = (celsius * 1.8) + 32;
        boolean sensorAtivo = true;
        byte leituraPrecisao = 39;

        System.out.println("Temperatura de Celsius é: " + celsius + "°C");
        System.out.println("Temperatura convertida para Fahrenheit é: " + fahrenheint + "°F");
        System.out.println("Sensor está ativo? " + sensorAtivo);
        System.out.println("Precisão de leitura: " + leituraPrecisao);
    }
}