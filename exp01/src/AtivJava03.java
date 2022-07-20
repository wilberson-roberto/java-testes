import java.util.Scanner;

public class AtivJava03 {

    // Considerando que para um consórcio, sabe se o número total de prestações, a
    // quantidade de prestações pagas e o valor
    // atual da prestação, escreva um algoritmo que determine o total pago pelo
    // consorciado e o saldo devedor.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int totalPrestacoes = 0;
        System.out.println("Digite o total das prestações");
        totalPrestacoes = entrada.nextInt();
        int qtdPago = 12;
        double valorPrestacao = 100;

        double totalPago = valorPrestacao * qtdPago;
        double totalFalta = (totalPrestacoes - qtdPago) * valorPrestacao;

        System.out.printf("Wilberson Pagou R$ %.2f referente a %d parcelas e falta R$ %.2f em parcelas a pagar", totalPago, qtdPago, totalFalta);

        entrada.close();
    }

}
