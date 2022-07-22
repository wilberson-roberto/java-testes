import java.util.Scanner;

// Usando o Switch case, criar um conversor de moedas de pelo menos 3 países diferentes usando como base a cotação das moedas a baixo:
// Exemplo: O usuário digita um valor em real e escolhe para qual moeda o valor deve ser convertido.
//USD 5.4082 - EUR 5.4548 - GBP 6.4125 - JPY 0.03905 - CHF 5.5402 - CAD 4.1514 - AUD 3.6732

public class AtivJava07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor para fazer conversão");
        double valor = entrada.nextDouble();

        System.out.println("Digite 1 para USD, 2 para EUR ou 3 para JPY");
        int moeda = entrada.nextInt();

        switch(moeda) {
            case 1:
                double conversorDolar = valor / 5.4082;
                System.out.printf("R$ %.2f convertido em USD é de $ %.2f", valor, conversorDolar);
            break;
            case 2:
                double conversorEur = valor / 5.4548;
                System.out.printf("R$ %.2f convertido em EUR é de € %.2f", valor, conversorEur);
            break;
            case 3:
                double conversorJpy = valor / 0.03905;
                System.out.printf("R$ %.2f convertido em JPY é de ¥ %.2f", valor, conversorJpy);
            break;
        }
        entrada.close();
    }
}
