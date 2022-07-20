public class AtivJava02 {

// Desenvolva um código que seja atribuído a uma variável o nome de um piloto, uma distância percorrida em km e o tempo
// que o piloto levou para percorrê la (em horas) O programa deve calcular a velocidade média em km/h, e exibir a seguinte
// frase A velocidade média de XX foi YY km/h o nde XX é o nome do piloto, e YY é sua velocidade média.

    public static void main(String[] args) {
        String piloto = "Wilberson Roberto";
        int distanciaKm = 150;
        int tempo = 2;

        double velocidadeMedia = distanciaKm / tempo;

        System.out.printf("A velocidade media de %s foi %.1f km/h", piloto, velocidadeMedia);
    }

}
