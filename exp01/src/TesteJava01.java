import java.util.Scanner;

public class TesteJava01 {
    /*public static void main(String[] args) {
        int idade = 20;
        double salario = 0.0;
        String nome = "Wilberson Roberto";
        float comissao = 15;
        boolean status = true;
        double salarioFuncionario = 1500;

        System.out.println(idade);
    }*/

    /*
    public static void main(String[] args) {
        double a, b, c;
        a = 10000.5055;
        b = 15000.6066;
        c = a + b;

        //System.out.println("A soma dos valores: " + c);
        System.out.printf("A soma dos valores = %.2f", c);
    } */

    /*
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    } */

    // %f = ponto flutuante
    // %d = inteiro
    // %s = texto
    // %n = quebra de linha

    /*
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        if (idade < 12) {
            System.out.println("Você é uma criança");
        } else if (idade > 12 && idade <= 18) {
            System.out.println("Você é adolescente");
        } else if (idade > 18 && idade <= 59) {
            System.out.println("Você é adulto");
        } else if (idade >= 60) {
            System.out.println("Você é idoso");
        }

        entrada.close();
    } */

    public static void main(String[] args) { // Cria uma 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        int valor = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
}
