import java.util.Scanner;

public class AtivJava03 {

    // Considerando que para um consórcio, sabe se o número total de prestações, a
    // quantidade de prestações pagas e o valor
    // atual da prestação, escreva um algoritmo que determine o total pago pelo
    // consorciado e o saldo devedor.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o nome do consorciado?");
        String consorsiado = entrada.nextLine();

        System.out.println("Qual o tipo de consorcio?");
        String tipo = entrada.nextLine();

        int totalPrestacoes = 0;
        System.out.println("Digite o total das prestações");
        totalPrestacoes = entrada.nextInt();

        int qtdPago = 12;
        double valorPrestacao = 600;

        int restante = totalPrestacoes - qtdPago;
        double totalPago = valorPrestacao * qtdPago;
        double totalFalta = (totalPrestacoes - qtdPago) * valorPrestacao;

        System.out.printf("%s fez um consorcio de um(a) %s de %d parcelas onde Pagou R$ %.2f referente a %d parcelas e falta R$ %.2f de %d parcelas a pagar", consorsiado, tipo, totalPrestacoes, totalPago, qtdPago, totalFalta, restante);

        entrada.close();
    }

}
