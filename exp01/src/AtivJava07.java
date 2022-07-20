import java.util.Scanner;

public class AtivJava07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor para fazer conversão");
        double valor = entrada.nextDouble();

        System.out.println("Digite 1 para USD, 2 para EUR ou 3 para JPY");
        int moeda = entrada.nextInt();

        switch(moeda) {
            case 1:
                double conversorDolar = valor * 5.4082;
                System.out.printf("R$ %.2f convertido em USD é de $ %.2f", valor, conversorDolar);
            break;
            case 2:
                double conversorEur = valor * 5.4548;
                System.out.printf("R$ %.2f convertido em EUR é de € %.2f", valor, conversorEur);
            break;
            case 3:
                double conversorJpy = valor * 0.03905;
                System.out.printf("R$ %.2f convertido em EUR é de ¥ %.2f", valor, conversorJpy);
            break;
        }
    }
}
