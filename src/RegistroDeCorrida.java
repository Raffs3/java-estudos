public class RegistroDeCorrida {
    public static void main(String[] args) {
        float distanciaPercorridaKm = 230;
        short tempoMinutos = 30;
        boolean percursoConcluido = true;

        System.out.println("Distância percorrida em quilômetros é: " );
        System.out.println("Tempo em minutos corridos foram: " + tempoMinutos + "min");
        System.out.println("Total do pace é: " + (distanciaPercorridaKm / tempoMinutos));
        System.out.println("Percurso concluído? " + percursoConcluido);
    }
}
