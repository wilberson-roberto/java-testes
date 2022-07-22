import java.util.Scanner;

public class AtivJava05 {

// Uma operadora de telefonia cobra R 50 00 por um plano básico que dá direito a
// 100 minutos de telefone Cada minuto que exceder a franquia de 100 minutos custa
// R 2 00 Fazer um programa para ler a quantidade de minutos que uma pessoa
// consumiu, mostrar o valor a ser pago.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorPlano = 50.00;
        int minPlano = 100;
        double franquiaExtra = 2.00;
        System.out.println("Quantos minutos foram ultrapassados?");
        int minUltrapassado = entrada.nextInt();

        int totalMinutos = minPlano + minUltrapassado;
        double totalPagar = (minUltrapassado * franquiaExtra) + valorPlano;

        System.out.printf("O cliente consumiu %d minutos, ultrapassando a franquia de %d minutos, o total a ser pago será de R$ %.2f", totalMinutos, minPlano, totalPagar);

        entrada.close();
    }
}
